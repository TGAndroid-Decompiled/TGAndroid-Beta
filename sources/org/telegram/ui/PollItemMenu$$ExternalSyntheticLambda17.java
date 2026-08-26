package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.mlkit_language_id_common.zzjw;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.google.zxing.Result;
import com.stripe.android.model.Card;
import com.stripe.android.net.TokenParser;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BlockingUpdateView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.Components.TranscribeButton;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView;
import org.telegram.ui.Stars.StarsController;

public final class PollItemMenu$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public PollItemMenu$$ExternalSyntheticLambda17(int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$2 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.messages_EmojiGroups messages_emojigroupsTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        int i;
        String str;
        int i2 = 2;
        UndoView undoView = null;
        str = null;
        String str2 = null;
        UndoView undoView2 = null;
        SQLiteCursor sQLiteCursor = null;
        SQLiteCursor sQLiteCursor2 = 0;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                PollItemMenu pollItemMenu = (PollItemMenu) this.f$0;
                int i4 = this.f$2;
                ((ChatActivity$$ExternalSyntheticLambda48) this.f$1).run(Integer.valueOf(i4));
                pollItemMenu.dismiss(i4 == 1 || i4 == 13);
                return;
            case 1:
                ((SharedMediaLayout) this.f$0).lambda$onItemLongClick$59(this.f$2, (TL_stories.StoryItem) this.f$1);
                return;
            case 2:
                ((SharedMediaLayout) this.f$0).startAlbumsReorder(this.f$2);
                ((ItemOptions) this.f$1).dismiss();
                return;
            case 3:
                int i5 = this.f$2;
                RecyclerListView recyclerListView = (RecyclerListView) this.f$1;
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.f$0;
                sharedMediaLayout.findPeriodAndJumpToDate(i5, recyclerListView, false);
                sharedMediaLayout.jumpToRunnable = null;
                return;
            case 4:
                SharedMediaLayout.this.showMediaCalendar(this.f$2, false);
                ((ItemOptions) this.f$1).dismiss();
                return;
            case 5:
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                if (baseFragment instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) baseFragment;
                    chatActivity.createUndoView();
                    undoView = chatActivity.undoView;
                } else if (baseFragment instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) baseFragment).undoView;
                }
                UndoView undoView3 = undoView;
                if (undoView3 != null) {
                    LongSparseArray longSparseArray = (LongSparseArray) this.f$1;
                    int size = longSparseArray.size();
                    int i6 = this.f$2;
                    if (size == 1) {
                        undoView3.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 53, Integer.valueOf(i6), (Object) null, (Runnable) null, (Runnable) null);
                        return;
                    } else {
                        undoView3.showWithAction(0L, 53, Integer.valueOf(i6), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                        return;
                    }
                }
                return;
            case 6:
                SharedMediaLayout.SavedMessagesSearchAdapter savedMessagesSearchAdapter = (SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0;
                int i7 = savedMessagesSearchAdapter.lastSearchId;
                int i8 = this.f$2;
                if (i8 != i7) {
                    return;
                }
                savedMessagesSearchAdapter.reqId = ConnectionsManager.getInstance(savedMessagesSearchAdapter.currentAccount).sendRequest((TLRPC.TL_messages_search) this.f$1, new LaunchActivity$$ExternalSyntheticLambda63(savedMessagesSearchAdapter, i8, i2));
                return;
            case 7:
                SharedMediaLayout.SavedMessagesSearchAdapter savedMessagesSearchAdapter2 = (SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0;
                savedMessagesSearchAdapter2.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                if (!(tLObject instanceof TLRPC.messages_Messages) || this.f$2 != savedMessagesSearchAdapter2.lastSearchId) {
                    return;
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i9 = savedMessagesSearchAdapter2.currentAccount;
                MessagesController.getInstance(i9).putUsers(messages_messages.users, false);
                MessagesController.getInstance(i9).putChats(messages_messages.chats, false);
                MessagesStorage.getInstance(i9).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                int i10 = 0;
                while (true) {
                    int size2 = messages_messages.messages.size();
                    ArrayList arrayList = savedMessagesSearchAdapter2.loadedMessages;
                    if (i10 >= size2) {
                        savedMessagesSearchAdapter2.count = messages_messages.count;
                        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            savedMessagesSearchAdapter2.endReached = arrayList.size() >= messages_messages.count;
                        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                            savedMessagesSearchAdapter2.endReached = true;
                        }
                        savedMessagesSearchAdapter2.updateMessages(false);
                        savedMessagesSearchAdapter2.loading = false;
                        savedMessagesSearchAdapter2.reqId = -1;
                        return;
                    }
                    MessageObject messageObject = new MessageObject(i9, messages_messages.messages.get(i10), false, true);
                    if (messageObject.hasValidGroupId()) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(savedMessagesSearchAdapter2.lastQuery);
                    arrayList.add(messageObject);
                    i10++;
                }
                break;
            case 8:
                SlotsDrawable slotsDrawable = (SlotsDrawable) this.f$0;
                int i11 = this.f$2;
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$1;
                slotsDrawable.loadingInBackground = false;
                if (!slotsDrawable.secondLoadingInBackground && slotsDrawable.destroyAfterLoading) {
                    slotsDrawable.recycle(true);
                    return;
                }
                slotsDrawable.nativePtr = slotsDrawable.lottieNatives[0];
                slotsDrawable.checkChoreographer$1();
                DownloadController.getInstance(i11).removeLoadingFileObserver(chatMessageCell);
                slotsDrawable.scheduleNextGetFrame();
                slotsDrawable.invalidateInternal();
                return;
            case 9:
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(this.f$2).getDatabase();
                    if (database != null) {
                        TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.f$0;
                        Integer num = (Integer) this.f$1;
                        if (tL_messages_emojiGroups == null) {
                            database.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            sQLitePreparedStatementExecuteFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatementExecuteFast.bindInteger(1, num.intValue());
                            sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                            sQLitePreparedStatementExecuteFast.step();
                            nativeByteBuffer.reuse();
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 10:
                int i12 = this.f$2;
                Integer num2 = (Integer) this.f$0;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$1;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i12).getDatabase();
                        if (database2 != null) {
                            sQLiteCursorQueryFinalized = database2.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num2);
                            try {
                                if (!sQLiteCursorQueryFinalized.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                                    messages_emojigroupsTLdeserialize = null;
                                } else {
                                    messages_emojigroupsTLdeserialize = TLRPC.messages_EmojiGroups.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true);
                                    nativeByteBufferByteBufferValue.reuse();
                                }
                                if (messages_emojigroupsTLdeserialize instanceof TLRPC.TL_messages_emojiGroups) {
                                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups2 = (TLRPC.TL_messages_emojiGroups) messages_emojigroupsTLdeserialize;
                                    callback2.run(Long.valueOf(tL_messages_emojiGroups2.hash), tL_messages_emojiGroups2);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                            } catch (Exception e2) {
                                e = e2;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursorQueryFinalized != null) {
                                    sQLiteCursorQueryFinalized.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor2 = num2;
                        if (sQLiteCursor2 != 0) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursorQueryFinalized = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor2 != 0) {
                        sQLiteCursor2.dispose();
                    }
                    throw th;
                }
                break;
            case 11:
                BaseFragment baseFragment2 = StickersAlert.this.parentFragment;
                if (baseFragment2 instanceof ChatActivity) {
                    ChatActivity chatActivity2 = (ChatActivity) baseFragment2;
                    chatActivity2.createUndoView();
                    undoView2 = chatActivity2.undoView;
                } else if (baseFragment2 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) baseFragment2).undoView;
                }
                UndoView undoView4 = undoView2;
                if (undoView4 != null) {
                    LongSparseArray longSparseArray2 = (LongSparseArray) this.f$1;
                    int size3 = longSparseArray2.size();
                    int i13 = this.f$2;
                    if (size3 == 1) {
                        undoView4.showWithAction(((TLRPC.Dialog) longSparseArray2.valueAt(0)).id, 53, Integer.valueOf(i13), (Object) null, (Runnable) null, (Runnable) null);
                        return;
                    } else {
                        undoView4.showWithAction(0L, 53, Integer.valueOf(i13), Integer.valueOf(longSparseArray2.size()), (Runnable) null, (Runnable) null);
                        return;
                    }
                }
                return;
            case 12:
                SuggestEmojiView suggestEmojiView = (SuggestEmojiView) this.f$0;
                suggestEmojiView.getClass();
                ArrayList<MediaDataController.KeywordResult> arrayList2 = new ArrayList<>(1);
                String str3 = (String) this.f$1;
                arrayList2.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(suggestEmojiView.currentAccount).fillWithAnimatedEmoji(arrayList2, 15, false, false, false, new ArticleViewer$$ExternalSyntheticLambda71(suggestEmojiView, this.f$2, str3, arrayList2, 28));
                return;
            case 13:
                String str4 = (String) this.f$1;
                int i14 = this.f$2;
                ThemeEditorView.EditorAlert.SearchAdapter searchAdapter = (ThemeEditorView.EditorAlert.SearchAdapter) this.f$0;
                ThemeEditorView.EditorAlert editorAlert = ThemeEditorView.EditorAlert.this;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        searchAdapter.lastSearchId = -1;
                        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(searchAdapter, searchAdapter.lastSearchId, new ArrayList(), new ArrayList(), 29));
                        return;
                    }
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str2 = translitString;
                    }
                    int i15 = (str2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i15];
                    strArr[0] = lowerCase;
                    if (str2 != null) {
                        strArr[1] = str2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int size4 = ((ArrayList) editorAlert.listAdapter.this$0).size();
                    int i16 = 0;
                    while (i16 < size4) {
                        ArrayList arrayList5 = (ArrayList) ((ArrayList) editorAlert.listAdapter.this$0).get(i16);
                        int i17 = ((ThemeDescription) arrayList5.get(i3)).currentKey;
                        if (OKLCH.colorKeysMap == null) {
                            OKLCH.colorKeysMap = OKLCH.createColorKeysMap();
                        }
                        String str5 = (String) OKLCH.colorKeysMap.get(i17);
                        String lowerCase2 = str5.toLowerCase();
                        for (int i18 = 0; i18 < i15; i18++) {
                            String str6 = strArr[i18];
                            if (lowerCase2.contains(str6)) {
                                arrayList3.add(arrayList5);
                                arrayList4.add(ThemeEditorView.EditorAlert.SearchAdapter.generateSearchName(str5, str6));
                            }
                            break;
                        }
                        i16++;
                        i3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(searchAdapter, i14, arrayList3, arrayList4, 29));
                    return;
                } catch (Exception e4) {
                    FileLog.e(e4);
                    return;
                }
            case 14:
                ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.f$0;
                themeSmallPreviewView.getClass();
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda2(themeSmallPreviewView, (ChatThemeBottomSheet.ChatThemeItem) this.f$1, this.f$2, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 1));
                return;
            case 15:
                HashMap map = TranscribeButton.transcribeOperationsByDialogPosition;
                MessageObject messageObject2 = (MessageObject) this.f$0;
                if (map != null) {
                    map.remove(Integer.valueOf(TranscribeButton.reqInfoHash(messageObject2)));
                }
                ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate = (ChatMessageCell.ChatMessageCellDelegate) this.f$1;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.needShowPremiumBulletin(3);
                }
                int i19 = this.f$2;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2);
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
                return;
            case 16:
                FoundEmojiPacksRecyclerView foundEmojiPacksRecyclerView = (FoundEmojiPacksRecyclerView) this.f$0;
                foundEmojiPacksRecyclerView.getClass();
                ((View) this.f$1).postOnAnimation(new OAuthSheet$$ExternalSyntheticLambda17(foundEmojiPacksRecyclerView, this.f$2, 12));
                return;
            case 17:
                DialogsActivity dialogsActivity = ((DialogsActivity.AnonymousClass37) this.f$0).this$0;
                ArrayList arrayList6 = dialogsActivity.frozenDialogsList;
                if (arrayList6 == null || (i = this.f$2) < 0 || i >= arrayList6.size()) {
                    return;
                }
                dialogsActivity.frozenDialogsList.add(i, (TLRPC.Dialog) this.f$1);
                dialogsActivity.viewPages[0].updateList(true);
                return;
            case 18:
                DialogsActivity.SwipeController swipeController = (DialogsActivity.SwipeController) this.f$0;
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                dialogsActivity2.dialogsListFrozen = true;
                MessagesController messagesController = dialogsActivity2.getMessagesController();
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.f$1;
                messagesController.addDialogToFolder(dialog.id, 0, this.f$2, 0L);
                dialogsActivity2.dialogsListFrozen = false;
                ArrayList<TLRPC.Dialog> dialogs = dialogsActivity2.getMessagesController().getDialogs(0);
                int iIndexOf = dialogs.indexOf(dialog);
                DialogsActivity.ViewPage viewPage = swipeController.parentPage;
                if (iIndexOf < 0) {
                    viewPage.updateList(false);
                    return;
                }
                ArrayList<TLRPC.Dialog> dialogs2 = dialogsActivity2.getMessagesController().getDialogs(1);
                if (!dialogs2.isEmpty() || iIndexOf != 1) {
                    dialogsActivity2.setDialogsListFrozen(true, true);
                    viewPage.dialogsItemAnimator.prepareForRemove();
                    viewPage.updateList(true);
                    dialogsActivity2.checkAnimationFinished();
                }
                if (dialogs2.isEmpty()) {
                    dialogs.remove(0);
                    if (iIndexOf == 1) {
                        dialogsActivity2.setDialogsListFrozen(true, true);
                        viewPage.updateList(true);
                        dialogsActivity2.checkAnimationFinished();
                        return;
                    } else {
                        if (!dialogsActivity2.frozenDialogsList.isEmpty()) {
                            dialogsActivity2.frozenDialogsList.remove(0);
                        }
                        viewPage.dialogsItemAnimator.prepareForRemove();
                        viewPage.updateList(true);
                        return;
                    }
                }
                return;
            case 19:
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = (SharedMediaLayout.AnonymousClass13) this.f$0;
                int i20 = this.f$2;
                if (i20 != -1) {
                    int i21 = ((TL_stars.TL_starGiftCollection) this.f$1).collection_id;
                    StarsController.GiftsCollections giftsCollections = anonymousClass13.collections;
                    int iIndexOf2 = giftsCollections.indexOf(i21);
                    if (iIndexOf2 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) giftsCollections.collections.remove(iIndexOf2);
                        giftsCollections.gifts.remove(Integer.valueOf(tL_starGiftCollection.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        int i22 = giftsCollections.currentAccount;
                        deletestargiftcollection.peer = MessagesController.getInstance(i22).getInputPeer(giftsCollections.dialogId);
                        deletestargiftcollection.collection_id = tL_starGiftCollection.collection_id;
                        ConnectionsManager.getInstance(i22).sendRequest(deletestargiftcollection, null);
                    }
                    anonymousClass13.fillTabs(true);
                    if (i20 < giftsCollections.getCollections().size()) {
                        i20++;
                    }
                    anonymousClass13.tabsView.scrollToTab(-1, i20);
                    anonymousClass13.updateTabsShown();
                    return;
                }
                return;
            case 20:
                GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
                groupCallActivity.getClass();
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.f$1;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog == null) {
                    return;
                }
                alertDialog.setOnCancelListener(new ChatEditActivity$$ExternalSyntheticLambda52(groupCallActivity, this.f$2, 5));
                alertDialogArr[0].show();
                return;
            case 21:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                TLRPC.TL_help_appUpdate tL_help_appUpdate = SharedConfig.pendingAppUpdate;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = (TLRPC.TL_help_appUpdate) this.f$1;
                if ((tL_help_appUpdate == null || !tL_help_appUpdate.version.equals(tL_help_appUpdate2.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate2)) {
                    boolean z = tL_help_appUpdate2.can_not_skip;
                    int i23 = this.f$2;
                    if (z) {
                        if (launchActivity.blockingUpdateView == null) {
                            BlockingUpdateView blockingUpdateView = new BlockingUpdateView(launchActivity);
                            launchActivity.blockingUpdateView = blockingUpdateView;
                            launchActivity.drawerLayoutContainer.addView(blockingUpdateView, LayoutHelper.createFrame(-1.0f, -1));
                        }
                        launchActivity.blockingUpdateView.show(i23, tL_help_appUpdate2, false);
                    } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                        ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate2, i23);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    return;
                }
                return;
            case 22:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                ConnectionsManager.getInstance(this.f$2).cancelRequest(((int[]) this.f$0)[0], true);
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = (LaunchActivity$$ExternalSyntheticLambda13) this.f$1;
                if (launchActivity$$ExternalSyntheticLambda13 != null) {
                    launchActivity$$ExternalSyntheticLambda13.run();
                    return;
                }
                return;
            case 23:
                MessageAuthorView messageAuthorView = (MessageAuthorView) this.f$0;
                messageAuthorView.getClass();
                TLObject tLObject2 = (TLObject) this.f$1;
                if (tLObject2 instanceof TLRPC.User) {
                    messageAuthorView.user = (TLRPC.User) tLObject2;
                    MessagesController.getInstance(this.f$2).putUser(messageAuthorView.user, false);
                }
                messageAuthorView.setEnabled(messageAuthorView.user != null);
                TLRPC.User user = messageAuthorView.user;
                LinkSpanDrawable.LinksTextView linksTextView = messageAuthorView.titleView;
                if (user != null) {
                    linksTextView.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new LinkManager$3$$ExternalSyntheticLambda0(messageAuthorView, user.id, 17)));
                }
                linksTextView.animate().alpha(1.0f).setDuration(220L).start();
                FlickerLoadingView flickerLoadingView = messageAuthorView.flickerLoadingView;
                flickerLoadingView.animate().alpha(0.0f).setDuration(220L).setListener(new ChatActivity.AnonymousClass77(flickerLoadingView)).start();
                return;
            case 24:
                ((PassportActivity) this.f$0).lambda$processSelectedFiles$70((SecureDocument) this.f$1, this.f$2);
                return;
            case 25:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                int i24 = this.f$2;
                Intent intent = (Intent) this.f$1;
                if (i24 == -1) {
                    Parcelable.Creator<PaymentData> creator = PaymentData.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    PaymentData paymentData = (PaymentData) (byteArrayExtra != null ? zzjw.deserializeFromBytes(byteArrayExtra, creator) : null);
                    if (paymentData == null || (str = paymentData.zzg) == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                        jSONObject2.getString("type");
                        String string = jSONObject2.getString("token");
                        if (paymentFormActivity.googlePayPublicKey == null && paymentFormActivity.googlePayParameters == null) {
                            Result token = TokenParser.parseToken(string);
                            paymentFormActivity.paymentJson = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) token.resultPoints, (String) token.text);
                            Card card = (Card) token.resultMetadata;
                            paymentFormActivity.cardName = card.getBrand() + " *" + card.getLast4();
                        } else {
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            paymentFormActivity.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            paymentFormActivity.googlePayCredentials.payment_token.data = jSONObject2.toString();
                            String strOptString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(strOptString)) {
                                paymentFormActivity.cardName = "Android Pay";
                            } else {
                                paymentFormActivity.cardName = strOptString;
                            }
                        }
                        paymentFormActivity.goToNextStep();
                    } catch (JSONException e5) {
                        FileLog.e(e5);
                    }
                    break;
                } else if (i24 == 1) {
                    int i25 = AutoResolveHelper.$r8$clinit;
                    Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                    StringBuilder sb = new StringBuilder("android pay error ");
                    sb.append(status != null ? status.zzc : "");
                    FileLog.e(sb.toString());
                }
                paymentFormActivity.showEditDoneProgress$3(true, false);
                paymentFormActivity.setDonePressed(false);
                FrameLayout frameLayout = paymentFormActivity.googlePayButton;
                if (frameLayout != null) {
                    frameLayout.setClickable(true);
                    return;
                }
                return;
            case 26:
                Uri uri = (Uri) this.f$1;
                int i26 = this.f$2;
                PhotoViewer.FirstFrameView firstFrameView = (PhotoViewer.FirstFrameView) this.f$0;
                firstFrameView.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i27 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(file, true, 0L, 0, null, null, null, 0L, i27, false, point.x, point.y, null, 0, true);
                    Bitmap frameAtTime = animatedFileDrawable.getFrameAtTime(0L, false);
                    animatedFileDrawable.recycle();
                    AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(firstFrameView, i26, frameAtTime, 27));
                    return;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda21(firstFrameView, 22));
                    return;
                }
            case 27:
                PhotoViewer.FirstFrameView firstFrameView2 = (PhotoViewer.FirstFrameView) this.f$0;
                if (this.f$2 == firstFrameView2.gettingFrameIndex) {
                    firstFrameView2.setImageBitmap((Bitmap) this.f$1);
                    firstFrameView2.hasFrame = true;
                    firstFrameView2.gettingFrame = false;
                    return;
                }
                return;
            case 28:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                AndroidUtilities.addToClipboard((String) this.f$1);
                if (this.f$2 == profileActivity.bioRow) {
                    zzkn.m(R.string.BioCopied, BulletinFactory.of(profileActivity));
                    return;
                } else {
                    zzkn.m(R.string.TextCopied, BulletinFactory.of(profileActivity));
                    return;
                }
            default:
                ProfileActivity.ListAdapter listAdapter = (ProfileActivity.ListAdapter) this.f$0;
                listAdapter.getClass();
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.f$1;
                int adapterPosition = viewHolder.getAdapterPosition();
                int i28 = this.f$2;
                if (adapterPosition == i28 && ProfileActivity.this.birthdayRow == i28 && viewHolder.mItemViewType == 2) {
                    listAdapter.onBindViewHolder(viewHolder, i28);
                    return;
                }
                return;
        }
    }

    public PollItemMenu$$ExternalSyntheticLambda17(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    public PollItemMenu$$ExternalSyntheticLambda17(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
