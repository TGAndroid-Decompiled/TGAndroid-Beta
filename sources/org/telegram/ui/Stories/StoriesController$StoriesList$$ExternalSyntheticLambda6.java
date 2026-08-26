package org.telegram.ui.Stories;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda24;

public final class StoriesController$StoriesList$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final StoriesController.StoriesList f$0;
    public final MessagesStorage f$1;

    public StoriesController$StoriesList$$ExternalSyntheticLambda6(StoriesController.StoriesList storiesList, MessagesStorage messagesStorage, int i) {
        this.$r8$classId = i;
        this.f$0 = storiesList;
        this.f$1 = messagesStorage;
    }

    @Override
    public final void run() {
        StoriesController.StoriesList storiesList;
        long j;
        TLRPC.Peer peer;
        int i = this.$r8$classId;
        MessagesStorage messagesStorage = this.f$1;
        switch (i) {
            case 0:
                StoriesController.StoriesList storiesList2 = this.f$0;
                long j2 = storiesList2.dialogId;
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet<Long> hashSet2 = new HashSet<>();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList4 = new ArrayList<>();
                SQLiteCursor sQLiteCursorCreateLoadStoriesCursor = null;
                try {
                    messagesStorage.getDatabase();
                    sQLiteCursorCreateLoadStoriesCursor = messagesStorage.createLoadStoriesCursor(j2, storiesList2.albumId, storiesList2.type);
                    while (sQLiteCursorCreateLoadStoriesCursor.next()) {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorCreateLoadStoriesCursor.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            TL_stories.StoryItem storyItemTLdeserialize = TL_stories.StoryItem.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                            storyItemTLdeserialize.dialogId = j2;
                            storyItemTLdeserialize.messageId = storyItemTLdeserialize.id;
                            MessageObject messageObject = new MessageObject(storiesList2.currentAccount, storyItemTLdeserialize);
                            ArrayList<TLRPC.PrivacyRule> arrayList5 = storyItemTLdeserialize.privacy;
                            storiesList = storiesList2;
                            try {
                                int size = arrayList5.size();
                                long j3 = j2;
                                int i2 = 0;
                                while (i2 < size) {
                                    TLRPC.PrivacyRule privacyRule = arrayList5.get(i2);
                                    i2++;
                                    TLRPC.PrivacyRule privacyRule2 = privacyRule;
                                    ArrayList<TLRPC.PrivacyRule> arrayList6 = arrayList5;
                                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                                    }
                                    arrayList5 = arrayList6;
                                }
                                TL_stories.StoryFwdHeader storyFwdHeader = storyItemTLdeserialize.fwd_from;
                                if (storyFwdHeader == null || (peer = storyFwdHeader.from) == null) {
                                    j = 0;
                                } else {
                                    j = 0;
                                    long peerDialogId = DialogObject.getPeerDialogId(peer);
                                    if (peerDialogId >= 0) {
                                        hashSet2.add(Long.valueOf(peerDialogId));
                                    } else {
                                        hashSet3.add(Long.valueOf(-peerDialogId));
                                    }
                                }
                                for (int i3 = 0; i3 < storyItemTLdeserialize.media_areas.size(); i3++) {
                                    if (storyItemTLdeserialize.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) storyItemTLdeserialize.media_areas.get(i3)).channel_id));
                                    }
                                }
                                TLRPC.Peer peer2 = storyItemTLdeserialize.from_id;
                                if (peer2 != null) {
                                    long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                                    if (peerDialogId2 >= j) {
                                        hashSet2.add(Long.valueOf(peerDialogId2));
                                    } else {
                                        hashSet3.add(Long.valueOf(-peerDialogId2));
                                    }
                                }
                                messageObject.generateThumbs(false);
                                arrayList2.add(messageObject);
                                nativeByteBufferByteBufferValue.reuse();
                                if (sQLiteCursorCreateLoadStoriesCursor.intValue(1) == 1) {
                                    hashSet.add(Integer.valueOf(storyItemTLdeserialize.id));
                                }
                                int iIntValue = sQLiteCursorCreateLoadStoriesCursor.intValue(2);
                                if (iIntValue > 0) {
                                    arrayList.add(Utilities.clamp(iIntValue, arrayList.size() - 1, 0), Integer.valueOf(storyItemTLdeserialize.id));
                                }
                                storiesList2 = storiesList;
                                j2 = j3;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    if (sQLiteCursorCreateLoadStoriesCursor != null) {
                                        sQLiteCursorCreateLoadStoriesCursor.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24(storiesList, arrayList2, arrayList, arrayList3, arrayList4, hashSet, 12));
                                    return;
                                } catch (Throwable th2) {
                                    if (sQLiteCursorCreateLoadStoriesCursor != null) {
                                        sQLiteCursorCreateLoadStoriesCursor.dispose();
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }
                    storiesList = storiesList2;
                    sQLiteCursorCreateLoadStoriesCursor.dispose();
                    if (!hashSet2.isEmpty()) {
                        messagesStorage.getUsersInternal(hashSet2, arrayList3);
                    }
                    if (!hashSet3.isEmpty()) {
                        messagesStorage.getChatsInternal(TextUtils.join(",", hashSet3), arrayList4);
                    }
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    storiesList = storiesList2;
                }
                sQLiteCursorCreateLoadStoriesCursor.dispose();
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24(storiesList, arrayList2, arrayList, arrayList3, arrayList4, hashSet, 12));
                return;
            default:
                StoriesController.StoriesList storiesList3 = this.f$0;
                storiesList3.getClass();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM profile_stories WHERE dialog_id = " + storiesList3.dialogId + " AND type = " + storiesList3.type).stepThis().dispose();
                    break;
                } catch (Throwable th4) {
                    messagesStorage.checkSQLException(th4);
                }
                AndroidUtilities.runOnUIThread(new StoriesController$StoriesList$$ExternalSyntheticLambda1(storiesList3, 3));
                return;
        }
    }
}
