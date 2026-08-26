package org.telegram.ui.Stories;

import android.text.TextUtils;
import androidx.collection.ArraySetKt;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.audio.AacUtil;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda17;

public final class StoriesStorage {
    public final int currentAccount;
    public final MessagesStorage storage;

    public StoriesStorage(int i) {
        this.currentAccount = i;
        this.storage = MessagesStorage.getInstance(i);
    }

    public static void applyStory(int i, long j, MessageObject messageObject, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = checkExpiredStateLocal(i, j, storyItem);
        }
        int i2 = messageObject.type;
        if (i2 == 23 || i2 == 24) {
            MessageMediaStoryFull messageMediaStoryFull = new MessageMediaStoryFull();
            messageMediaStoryFull.user_id = DialogObject.getPeerDialogId(messageObject.messageOwner.media.peer);
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            messageMediaStoryFull.peer = messageMedia.peer;
            messageMediaStoryFull.id = messageMedia.id;
            messageMediaStoryFull.storyItem = checkExpiredStateLocal(i, j, storyItem);
            TLRPC.Message message2 = messageObject.messageOwner;
            messageMediaStoryFull.via_mention = message2.media.via_mention;
            message2.media = messageMediaStoryFull;
        }
        TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i3 = 0; i3 < messageObject.messageOwner.media.webpage.attributes.size(); i3++) {
            TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i3);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.id == storyItem.id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = checkExpiredStateLocal(i, j, storyItem);
                }
            }
        }
    }

    public static TL_stories.StoryItem checkExpiredStateLocal(int i, long j, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        int i2 = storyItem.expire_date;
        boolean z = i2 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i2;
        if (storyItem.pinned || !z || j == 0 || j == UserConfig.getInstance(i).clientUserId) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.id = storyItem.id;
        return tL_storyItemDeleted;
    }

    public static int getStoryId(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        int i = messageObject.type;
        if (i == 23 || i == 24) {
            return messageObject.messageOwner.media.id;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i2 = 0; i2 < messageObject.messageOwner.media.webpage.attributes.size(); i2++) {
                TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i2);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                }
            }
        }
        return messageObject.messageOwner.reply_to.story_id;
    }

    public final void fillMessagesWithStories(LongSparseArray longSparseArray, Runnable runnable, int i, boolean z, Timer timer) {
        int i2;
        StoriesStorage storiesStorage = this;
        Timer timer2 = timer;
        if (longSparseArray == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Timer.Task taskStart = Timer.start(timer2, "fillMessagesWithStories: applying stories for existing array");
        int i3 = 0;
        while (true) {
            int size = longSparseArray.size();
            i2 = storiesStorage.currentAccount;
            if (i3 >= size) {
                break;
            }
            long jKeyAt = longSparseArray.keyAt(i3);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i3);
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(i4);
                TL_stories.StoryItem storyInternal = storiesStorage.getStoryInternal(getStoryId(messageObject), jKeyAt);
                if (storyInternal != null && !(storyInternal instanceof TL_stories.TL_storyItemSkipped)) {
                    applyStory(i2, jKeyAt, messageObject, storyInternal);
                    arrayList.add(messageObject);
                    arrayList2.remove(i4);
                    i4--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = longSparseArray.values;
                        Object obj = objArr[i3];
                        Object obj2 = ArraySetKt.DELETED;
                        if (obj != obj2) {
                            objArr[i3] = obj2;
                            longSparseArray.garbage = true;
                        }
                        i3--;
                    }
                }
                i4++;
            }
            i3++;
        }
        Timer.done(taskStart);
        if (z) {
            storiesStorage.updateMessagesWithStories(arrayList);
        }
        if (longSparseArray.isEmpty()) {
            runnable.run();
            return;
        }
        int[] iArr = {longSparseArray.size()};
        int i5 = 0;
        while (i5 < longSparseArray.size()) {
            long jKeyAt2 = longSparseArray.keyAt(i5);
            ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i5);
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i2).getInputPeer(jKeyAt2);
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                tL_stories_getStoriesByID.id.add(Integer.valueOf(getStoryId((MessageObject) arrayList3.get(i6))));
            }
            StringBuilder sbM = AacUtil.m(jKeyAt2, "fillMessagesWithStories: getStoriesByID did=", " ids=");
            sbM.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
            int iSendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new StoriesStorage$$ExternalSyntheticLambda3(storiesStorage, Timer.start(timer2, sbM.toString()), arrayList3, jKeyAt2, z, timer2, iArr, runnable));
            if (i != 0) {
                ConnectionsManager.getInstance(i2).bindRequestToGuid(iSendRequest, i);
            }
            i5++;
            storiesStorage = this;
            timer2 = timer;
        }
    }

    public final TL_stories.StoryItem getStoryInternal(int i, long j) {
        SQLiteDatabase database = this.storage.getDatabase();
        TL_stories.StoryItem storyItemTLdeserialize = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j + " AND story_id = " + i, new Object[0]);
            if (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(1);
                if (nativeByteBufferByteBufferValue != null) {
                    storyItemTLdeserialize = TL_stories.StoryItem.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                    storyItemTLdeserialize.dialogId = j;
                    nativeByteBufferByteBufferValue.reuse();
                }
                if (storyItemTLdeserialize != null) {
                    StoryCustomParamsHelper.readLocalParams(storyItemTLdeserialize, nativeByteBufferByteBufferValue2);
                }
                if (nativeByteBufferByteBufferValue2 != null) {
                    nativeByteBufferByteBufferValue2.reuse();
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            return storyItemTLdeserialize;
        } catch (SQLiteException e) {
            FileLog.e(e);
            return storyItemTLdeserialize;
        }
    }

    public final void putStoriesInternal(long j, TL_stories.PeerStories peerStories) {
        SQLiteDatabase database = this.storage.getDatabase();
        try {
            ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            for (int i = 0; i < arrayList.size(); i++) {
                sQLitePreparedStatementExecuteFast.requery();
                TL_stories.StoryItem storyItem = arrayList.get(i);
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    FileLog.e("try write deleted story");
                } else {
                    sQLitePreparedStatementExecuteFast.bindLong(1, j);
                    sQLitePreparedStatementExecuteFast.bindLong(2, storyItem.id);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                    storyItem.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                    NativeByteBuffer nativeByteBufferWriteLocalParams = StoryCustomParamsHelper.writeLocalParams(storyItem);
                    if (nativeByteBufferWriteLocalParams != null) {
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBufferWriteLocalParams);
                    } else {
                        sQLitePreparedStatementExecuteFast.bindNull(4);
                    }
                    if (nativeByteBufferWriteLocalParams != null) {
                        nativeByteBufferWriteLocalParams.reuse();
                    }
                    sQLitePreparedStatementExecuteFast.step();
                    nativeByteBuffer.reuse();
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
            Locale locale = Locale.US;
            database.executeFast("REPLACE INTO stories_counter VALUES(" + j + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void putStoryInternal(long j, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.storage.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                FileLog.e("putStoryInternal: try write deleted story");
                return;
            }
            sQLitePreparedStatementExecuteFast.bindLong(1, j);
            sQLitePreparedStatementExecuteFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer nativeByteBufferWriteLocalParams = StoryCustomParamsHelper.writeLocalParams(storyItem);
            if (nativeByteBufferWriteLocalParams != null) {
                sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBufferWriteLocalParams);
            } else {
                sQLitePreparedStatementExecuteFast.bindNull(4);
            }
            if (nativeByteBufferWriteLocalParams != null) {
                nativeByteBufferWriteLocalParams.reuse();
            }
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void updateMaxReadId(int i, long j) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i2 = this.currentAccount;
        MessagesStorage messagesStorage = this.storage;
        if (j > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i2).getUserFull(j);
            if (userFull != null && (peerStories2 = userFull.stories) != null) {
                peerStories2.max_read_id = i;
                messagesStorage.updateUserInfo(userFull, false);
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i2).getChatFull(-j);
            if (chatFull != null && (peerStories = chatFull.stories) != null) {
                peerStories.max_read_id = i;
                messagesStorage.updateChatInfo(chatFull, false);
            }
        }
        messagesStorage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda9(this, j, i, 0));
    }

    public final void updateMessagesWithStories(ArrayList arrayList) {
        MessagesStorage messagesStorage = this.storage;
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            if (arrayList.isEmpty()) {
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = database.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast4 = database.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i);
                int i2 = 0;
                while (i2 < 2) {
                    if (messageObject.messageOwner.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement = i2 == 0 ? sQLitePreparedStatementExecuteFast : sQLitePreparedStatementExecuteFast2;
                        if (sQLitePreparedStatement != null) {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.replyStory.getObjectSize());
                            messageObject.messageOwner.replyStory.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, messageObject.getId());
                            sQLitePreparedStatement.bindLong(3, messageObject.getDialogId());
                            sQLitePreparedStatement.step();
                        }
                    } else {
                        SQLitePreparedStatement sQLitePreparedStatement2 = i2 == 0 ? sQLitePreparedStatementExecuteFast3 : sQLitePreparedStatementExecuteFast4;
                        if (sQLitePreparedStatement2 != null) {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
                            messageObject.messageOwner.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement2.bindInteger(2, messageObject.getId());
                            sQLitePreparedStatement2.bindLong(3, messageObject.getDialogId());
                            sQLitePreparedStatement2.step();
                        }
                    }
                    i2++;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
            sQLitePreparedStatementExecuteFast2.dispose();
            sQLitePreparedStatementExecuteFast3.dispose();
            sQLitePreparedStatementExecuteFast4.dispose();
        } catch (Throwable th) {
            messagesStorage.checkSQLException(th);
        }
    }

    public final void updateStoryItem(long j, TL_stories.StoryItem storyItem) {
        if (j == 0) {
            return;
        }
        this.storage.getStorageQueue().postRunnable(new GiftSheet$$ExternalSyntheticLambda17(this, j, storyItem, 14));
    }

    public final void updateStoryItemInternal(long j, TL_stories.StoryItem storyItem) {
        if (j == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            FileLog.e("StoriesStorage: try write deleted story");
        }
        if (StoriesUtilities.isExpired(this.currentAccount, storyItem)) {
            FileLog.e("StoriesStorage: try write expired story");
        }
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.storage.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, j);
            sQLitePreparedStatementExecuteFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer nativeByteBufferWriteLocalParams = StoryCustomParamsHelper.writeLocalParams(storyItem);
            if (nativeByteBufferWriteLocalParams != null) {
                sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBufferWriteLocalParams);
            } else {
                sQLitePreparedStatementExecuteFast.bindNull(4);
            }
            if (nativeByteBufferWriteLocalParams != null) {
                nativeByteBufferWriteLocalParams.reuse();
            }
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
