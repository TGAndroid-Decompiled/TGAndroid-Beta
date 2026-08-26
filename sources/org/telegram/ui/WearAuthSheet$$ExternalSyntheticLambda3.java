package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.android.billingclient.api.AccountIdentifiers;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationCenter$$ExternalSyntheticLambda2;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.EphemeralMessagesHelper;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.DeleteMessagesBottomSheet;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView.SegmentedObject;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda10;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda18;

public final class WearAuthSheet$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public WearAuthSheet$$ExternalSyntheticLambda3(int i, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.$r8$classId = 17;
        this.f$1 = i;
        this.f$0 = chat;
        this.f$2 = arrayList;
        this.f$3 = arrayList2;
        this.f$4 = arrayList3;
    }

    private final void run$org$telegram$ui$bots$SetupEmojiStatusSheet$$ExternalSyntheticLambda13() {
        boolean z = ((TLObject) this.f$0) instanceof TLRPC.TL_boolTrue;
        boolean[] zArr = (boolean[]) this.f$2;
        Utilities.Callback callback = (Utilities.Callback) this.f$3;
        if (!z) {
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            callback.run("SERVER_ERROR");
            return;
        }
        int i = this.f$1;
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        if (currentUser != null) {
            currentUser.emoji_status = ((TL_account.updateEmojiStatus) this.f$4).emoji_status;
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
            MessagesController.getInstance(i).updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
        }
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        callback.run(null);
    }

    @Override
    public final void run() {
        long j;
        int i;
        final long j2;
        int i2;
        String lowerCase;
        BaseFragment lastFragment;
        int i3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        boolean z;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLRPC.Updates updates;
        int i4 = 8;
        long j3 = 0;
        int i5 = 14;
        int i6 = 3;
        int i7 = 11;
        int i8 = 2;
        StickerMakerView.SegmentedObject segmentedObject = null;
        int i9 = 0;
        boolean z2 = true;
        z2 = true;
        switch (this.$r8$classId) {
            case 0:
                ((int[]) this.f$0)[0] = this.f$1;
                int i10 = UserConfig.selectedAccount;
                AvatarDrawable avatarDrawable = (AvatarDrawable) this.f$2;
                TLRPC.User user = (TLRPC.User) this.f$3;
                avatarDrawable.setInfo(i10, user);
                BackupImageView backupImageView = (BackupImageView) this.f$4;
                backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                backupImageView.onNewImageSet();
                break;
            case 1:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f$0, (Location) this.f$2, this.f$1, (Locale) this.f$3, (LocationController.LocationFetchCallback) this.f$4);
                break;
            case 2:
                ((MediaDataController) this.f$2).lambda$removeMultipleStickerSets$110((boolean[]) this.f$3, (ArrayList) this.f$4, this.f$1, (int[]) this.f$0);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$processUpdateArray$403((EphemeralMessagesHelper.EphemeralUpdates.StructBuilder) this.f$2, (ConcurrentHashMap) this.f$3, (ConcurrentHashMap) this.f$4, this.f$1);
                break;
            case 4:
                ((MessagesStorage) this.f$0).lambda$getSentFile$164((String) this.f$2, this.f$1, (Object[]) this.f$3, (CountDownLatch) this.f$4);
                break;
            case 5:
                ((MessagesStorage) this.f$0).lambda$putSentFile$170((String) this.f$2, (TLObject) this.f$3, this.f$1, (String) this.f$4);
                break;
            case 6:
                ((NotificationCenter) this.f$0).lambda$listen$5((View) this.f$2, (View.OnAttachStateChangeListener) this.f$3, (NotificationCenter$$ExternalSyntheticLambda2) this.f$4, this.f$1);
                break;
            case 7:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$33((TLObject) this.f$2, this.f$1, (String) this.f$3, (TLRPC.TL_error) this.f$4);
                break;
            case 8:
                final DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) this.f$0;
                dialogsSearchAdapter.waitingResponseCount--;
                int i11 = dialogsSearchAdapter.lastSearchId;
                int i12 = this.f$1;
                if (i12 == i11) {
                    dialogsSearchAdapter.lastLocalSearchId = i12;
                    int i13 = dialogsSearchAdapter.lastGlobalSearchId;
                    DialogsSearchAdapter.AnonymousClass1 anonymousClass1 = dialogsSearchAdapter.searchAdapterHelper;
                    if (i13 != i12) {
                        anonymousClass1.clear();
                    }
                    if (dialogsSearchAdapter.lastMessagesSearchId != i12) {
                        dialogsSearchAdapter.searchResultMessages.clear();
                    }
                    dialogsSearchAdapter.searchWas = true;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList3 = (ArrayList) this.f$2;
                        if (i14 >= arrayList3.size()) {
                            ArrayList arrayList4 = dialogsSearchAdapter.filtered2RecentSearchObjects;
                            int size = arrayList4.size();
                            int i15 = 0;
                            while (true) {
                                int size2 = arrayList3.size();
                                ArrayList arrayList5 = (ArrayList) this.f$3;
                                int i16 = dialogsSearchAdapter.currentAccount;
                                if (i15 >= size2) {
                                    MessagesController.getInstance(i16).putUsers((ArrayList) this.f$4, true);
                                    dialogsSearchAdapter.searchResult = arrayList3;
                                    dialogsSearchAdapter.searchResultNames = arrayList5;
                                    anonymousClass1.mergeResults(arrayList3, arrayList4);
                                    dialogsSearchAdapter.notifyDataSetChanged();
                                    DialogsActivity.AnonymousClass48 anonymousClass48 = dialogsSearchAdapter.delegate;
                                    if (anonymousClass48 != null) {
                                        anonymousClass48.searchStateChanged(dialogsSearchAdapter.waitingResponseCount > 0, true);
                                        dialogsSearchAdapter.delegate.runResultsEnterAnimation();
                                    }
                                } else {
                                    final Object obj = arrayList3.get(i15);
                                    if (obj instanceof TLRPC.User) {
                                        TLRPC.User user2 = (TLRPC.User) obj;
                                        j = j3;
                                        MessagesController.getInstance(i16).putUser(user2, true);
                                        i = i15;
                                        j2 = user2.id;
                                    } else {
                                        j = j3;
                                        i = i15;
                                        if (obj instanceof TLRPC.Chat) {
                                            TLRPC.Chat chat = (TLRPC.Chat) obj;
                                            MessagesController.getInstance(i16).putChat(chat, true);
                                            j2 = -chat.id;
                                        } else {
                                            if (obj instanceof TLRPC.EncryptedChat) {
                                                MessagesController.getInstance(i16).putEncryptedChat((TLRPC.EncryptedChat) obj, true);
                                            }
                                            j2 = j;
                                        }
                                    }
                                    if (j2 != j && ((TLRPC.Dialog) MessagesController.getInstance(i16).dialogs_dict.get(j2)) == null) {
                                        MessagesStorage.getInstance(i16).getDialogFolderId(j2, new MessagesStorage.IntCallback() {
                                            @Override
                                            public final void run(int i17) {
                                                DialogsSearchAdapter dialogsSearchAdapter2 = dialogsSearchAdapter;
                                                dialogsSearchAdapter2.getClass();
                                                if (i17 != -1) {
                                                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                                    long j4 = j2;
                                                    tL_dialog.id = j4;
                                                    if (i17 != 0) {
                                                        tL_dialog.folder_id = i17;
                                                    }
                                                    Object obj2 = obj;
                                                    if (obj2 instanceof TLRPC.Chat) {
                                                        tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj2) ? 1 : 0;
                                                    }
                                                    int i18 = dialogsSearchAdapter2.currentAccount;
                                                    MessagesController.getInstance(i18).dialogs_dict.put(tL_dialog, j4);
                                                    MessagesController.getInstance(i18).getAllDialogs().add(tL_dialog);
                                                    MessagesController.getInstance(i18).sortDialogs(null);
                                                }
                                            }
                                        });
                                    }
                                    int i17 = dialogsSearchAdapter.dialogsType;
                                    if (i17 == 2 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 1 || i17 == 11 || i17 == 15 || (obj instanceof TLRPC.EncryptedChat)) {
                                        i2 = i;
                                    } else {
                                        DialogsActivity.AnonymousClass48 anonymousClass49 = dialogsSearchAdapter.delegate;
                                        boolean z3 = anonymousClass49 != null && anonymousClass49.getSearchForumDialogId() == j2;
                                        for (int i18 = 0; !z3 && i18 < size; i18++) {
                                            DialogsSearchAdapter.RecentSearchObject recentSearchObject = (DialogsSearchAdapter.RecentSearchObject) arrayList4.get(i18);
                                            z3 = (recentSearchObject == null || recentSearchObject.did != j2) ? z3 : true;
                                        }
                                        i = i;
                                        if (z3) {
                                            arrayList3.remove(i);
                                            arrayList5.remove(i);
                                            i2 = i - 1;
                                        } else {
                                            i2 = i;
                                        }
                                    }
                                    i15 = i2 + 1;
                                    j3 = j;
                                }
                            }
                        } else {
                            if (!dialogsSearchAdapter.filter(arrayList3.get(i14))) {
                                arrayList3.remove(i14);
                                i14--;
                            }
                            i14++;
                        }
                        break;
                    }
                }
                break;
            case 9:
                SearchAdapter searchAdapter = (SearchAdapter) this.f$0;
                if (this.f$1 == searchAdapter.searchReqId) {
                    ArrayList arrayList6 = (ArrayList) this.f$2;
                    searchAdapter.searchResult = arrayList6;
                    searchAdapter.searchResultNames = (ArrayList) this.f$3;
                    searchAdapter.unregistredContacts = (ArrayList) this.f$4;
                    searchAdapter.searchAdapterHelper.mergeResults(arrayList6, null);
                    searchAdapter.searchInProgress = false;
                    searchAdapter.mObservable.notifyChanged();
                    ContactsActivity.AnonymousClass3 anonymousClass3 = (ContactsActivity.AnonymousClass3) searchAdapter;
                    if (!anonymousClass3.searchInProgress && !anonymousClass3.searchAdapterHelper.isSearchInProgress() && anonymousClass3.getItemCount() == 0) {
                        ContactsActivity.this.emptyView.showProgress(false, true);
                        break;
                    }
                }
                break;
            case 10:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                articleViewer.getClass();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = (ArrayList) this.f$2;
                int size3 = arrayList8.size();
                int i19 = 0;
                while (true) {
                    String str = (String) this.f$4;
                    if (i19 >= size3) {
                        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(articleViewer, this.f$1, arrayList7, str, 6));
                    } else {
                        Object obj2 = arrayList8.get(i19);
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) ((HashMap) this.f$3).get(obj2);
                        if (obj2 instanceof TL_iv.RichText) {
                            TL_iv.RichText richText = (TL_iv.RichText) obj2;
                            CharSequence text = ArticleViewer.getText(articleViewer, articleViewer.pages[0].adapter.currentPage, null, richText, richText, pageBlock, 1000);
                            if (TextUtils.isEmpty(text)) {
                                lowerCase = null;
                            } else {
                                lowerCase = text.toString().toLowerCase();
                            }
                        } else if (obj2 instanceof String) {
                            lowerCase = ((String) obj2).toLowerCase();
                        } else {
                            lowerCase = null;
                        }
                        if (lowerCase != null) {
                            int i20 = 0;
                            while (true) {
                                int iIndexOf = lowerCase.indexOf(str, i20);
                                if (iIndexOf >= 0) {
                                    int length = str.length() + iIndexOf;
                                    if (iIndexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(iIndexOf - 1))) {
                                        ArticleViewer.SearchResult searchResult = new ArticleViewer.SearchResult();
                                        searchResult.index = iIndexOf;
                                        searchResult.block = pageBlock;
                                        searchResult.text = obj2;
                                        arrayList7.add(searchResult);
                                    }
                                    i20 = length;
                                }
                            }
                        }
                        i19++;
                    }
                    break;
                }
                break;
            case 11:
                TLObject tLObject = (TLObject) this.f$0;
                boolean z4 = tLObject instanceof TLRPC.Updates;
                HashSet hashSet = (HashSet) this.f$2;
                int i21 = this.f$1;
                if (z4) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i21).putUsers(updates2.users, false);
                    MessagesController.getInstance(i21).putChats(updates2.chats, false);
                    ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates2, TL_update.TL_updateGroupCall.class);
                    int size4 = arrayListFindUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i9 < size4) {
                        Object obj3 = arrayListFindUpdatesAndRemove.get(i9);
                        i9++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj3).call;
                    }
                    if (LaunchActivity.instance != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        VoIPHelper.joinConference(LaunchActivity.instance, i21, tL_inputGroupCall, false, groupCall, hashSet);
                    }
                    break;
                } else if (!(tLObject instanceof TL_phone.groupCall)) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$3;
                    if (tL_error != null) {
                        BulletinFactory.of((BaseFragment) this.f$4).showForError(false, tL_error);
                    }
                    break;
                } else {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i21).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i21).putChats(groupcall.chats, false);
                    if (LaunchActivity.instance != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        VoIPHelper.joinConference(LaunchActivity.instance, i21, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                }
                break;
            case 12:
                ((ChatActivity) this.f$0).lambda$searchLinks$136(this.f$1, (Boolean) this.f$2, (TLRPC.WebPage) this.f$3, (TL_account.getWebPagePreview) this.f$4);
                break;
            case 13:
                final ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                MessagesController messagesController = ChatActivity.this.getMessagesController();
                long j4 = -((TLRPC.Chat) this.f$3).id;
                final ChatActivity.AnonymousClass128 anonymousClass128 = (ChatActivity.AnonymousClass128) this.f$2;
                final ChatActivity chatActivity = (ChatActivity) this.f$4;
                anonymousClass128.onCancelListener = messagesController.ensureMessagesLoaded(j4, this.f$1, new MessagesController.MessagesLoadedCallback() {
                    @Override
                    public final void onError() {
                        anonymousClass128.end(false);
                        ChatActivity.this.presentFragment(chatActivity);
                    }

                    @Override
                    public final void onMessagesLoaded(boolean z5) {
                        anonymousClass128.end(false);
                        ChatActivity.this.presentFragment(chatActivity);
                    }
                });
                break;
            case 14:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate2 = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                chatMessageCellDelegate2.getClass();
                MessageObject messageObject = (MessageObject) this.f$2;
                int id = messageObject.getId();
                long dialogId = messageObject.getDialogId();
                ChatActivity chatActivity2 = ChatActivity.this;
                chatActivity2.scrollToMessageId(this.f$1, id, true, dialogId == chatActivity2.mergeDialogId ? 1 : 0, true, 0, (Integer) this.f$3, (byte[]) this.f$4, new ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda1(chatMessageCellDelegate2, messageObject, 1));
                break;
            case 15:
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.f$2;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener(new LaunchActivity$$ExternalSyntheticLambda85((int[]) this.f$0, this.f$1, (ChatActivity$$ExternalSyntheticLambda5) this.f$3));
                    ((BaseFragment) this.f$4).showDialog(alertDialogArr[0]);
                    break;
                }
                break;
            case 16:
                AlertDialog alertDialog2 = (AlertDialog) this.f$3;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f$0).edit();
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.f$2;
                editorEdit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                editorEdit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                editorEdit.commit();
                serializedData.cleanup();
                try {
                    alertDialog2.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(tL_help_support.user);
                int i22 = this.f$1;
                MessagesStorage.getInstance(i22).putUsersAndChats(arrayList9, null, true, true);
                MessagesController.getInstance(i22).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                ((BaseFragment) this.f$4).presentFragment(new ChatActivity(bundle));
                break;
            case 17:
                if (LaunchActivity.isActive && (lastFragment = LaunchActivity.getLastFragment()) != null && lastFragment.getParentActivity() != null) {
                    LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(11, this.f$1, lastFragment.getParentActivity(), lastFragment, null);
                    limitReachedBottomSheet.setRestrictedUsers((TLRPC.Chat) this.f$0, (ArrayList) this.f$2, (ArrayList) this.f$3, (ArrayList) this.f$4, null);
                    limitReachedBottomSheet.show();
                }
                break;
            case 18:
                DeleteMessagesBottomSheet deleteMessagesBottomSheet = (DeleteMessagesBottomSheet) this.f$2;
                deleteMessagesBottomSheet.getClass();
                TLObject tLObject2 = (TLObject) this.f$3;
                if (tLObject2 instanceof TLRPC.TL_messages_channelMessages) {
                    deleteMessagesBottomSheet.participantMessageCounts[this.f$1] = ((TLRPC.TL_messages_channelMessages) tLObject2).count - ((int) Collection.EL.stream(deleteMessagesBottomSheet.messages).filter(new ChatActivity$$ExternalSyntheticLambda263((TLRPC.InputPeer) this.f$4, 1)).count());
                }
                int[] iArr = (int[]) this.f$0;
                int i23 = iArr[0] - 1;
                iArr[0] = i23;
                if (i23 == 0) {
                    deleteMessagesBottomSheet.participantMessageCountsLoading = false;
                    deleteMessagesBottomSheet.participantMessageCountsLoaded = true;
                    deleteMessagesBottomSheet.updateTitleAnimated();
                }
                break;
            case 19:
                StickerMakerView stickerMakerView = (StickerMakerView) this.f$0;
                int i24 = this.f$1;
                List list = (List) this.f$2;
                ArrayList arrayList10 = (ArrayList) this.f$3;
                PhotoViewer$$ExternalSyntheticLambda26 photoViewer$$ExternalSyntheticLambda26 = (PhotoViewer$$ExternalSyntheticLambda26) this.f$4;
                if (stickerMakerView.sourceBitmap != null && !stickerMakerView.segmentingLoaded) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / stickerMakerView.sourceBitmap.getWidth(), 1.0f / stickerMakerView.sourceBitmap.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i24);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i24 / 90) % 2 != 0) {
                        matrix.postScale(stickerMakerView.sourceBitmap.getHeight(), stickerMakerView.sourceBitmap.getWidth());
                    } else {
                        matrix.postScale(stickerMakerView.sourceBitmap.getWidth(), stickerMakerView.sourceBitmap.getHeight());
                    }
                    if (list.isEmpty()) {
                        StickerMakerView.SegmentedObject segmentedObject2 = stickerMakerView.new SegmentedObject();
                        segmentedObject2.bounds.set(0.0f, 0.0f, stickerMakerView.sourceBitmap.getWidth(), stickerMakerView.sourceBitmap.getHeight());
                        segmentedObject2.rotatedBounds.set(segmentedObject2.bounds);
                        matrix.mapRect(segmentedObject2.rotatedBounds);
                        segmentedObject2.orientation = i24;
                        Bitmap bitmapCreateSmoothEdgesSegmentedImage = stickerMakerView.createSmoothEdgesSegmentedImage(stickerMakerView.sourceBitmap, 0, 0, false);
                        segmentedObject2.image = bitmapCreateSmoothEdgesSegmentedImage;
                        if (bitmapCreateSmoothEdgesSegmentedImage == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                        } else {
                            segmentedObject2.darkMaskImage = segmentedObject2.makeDarkMaskImage();
                            StickerMakerView.createSegmentImagePath(segmentedObject2, stickerMakerView.containerWidth, stickerMakerView.containerHeight);
                            stickerMakerView.segmentBorderImageWidth = segmentedObject2.borderImageWidth;
                            stickerMakerView.segmentBorderImageHeight = segmentedObject2.borderImageHeight;
                            arrayList10.add(segmentedObject2);
                            AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(stickerMakerView, arrayList10, photoViewer$$ExternalSyntheticLambda26, segmentedObject2, 17));
                            stickerMakerView.selectedObject = segmentedObject2;
                            stickerMakerView.segmentingLoaded = true;
                            stickerMakerView.segmentingLoading = false;
                        }
                    } else {
                        int i25 = 0;
                        while (i25 < list.size()) {
                            StickerMakerView.SubjectMock subjectMock = (StickerMakerView.SubjectMock) list.get(i25);
                            StickerMakerView.SegmentedObject segmentedObject3 = stickerMakerView.new SegmentedObject();
                            RectF rectF = segmentedObject3.bounds;
                            int i26 = subjectMock.startX;
                            int i27 = subjectMock.startY;
                            rectF.set(i26, i27, i26 + subjectMock.width, i27 + subjectMock.height);
                            segmentedObject3.rotatedBounds.set(segmentedObject3.bounds);
                            matrix.mapRect(segmentedObject3.rotatedBounds);
                            segmentedObject3.orientation = i24;
                            Bitmap bitmapCreateSmoothEdgesSegmentedImage2 = stickerMakerView.createSmoothEdgesSegmentedImage(subjectMock.bitmap, subjectMock.startX, subjectMock.startY, false);
                            segmentedObject3.image = bitmapCreateSmoothEdgesSegmentedImage2;
                            if (bitmapCreateSmoothEdgesSegmentedImage2 != null) {
                                segmentedObject3.darkMaskImage = segmentedObject3.makeDarkMaskImage();
                                StickerMakerView.createSegmentImagePath(segmentedObject3, stickerMakerView.containerWidth, stickerMakerView.containerHeight);
                                stickerMakerView.segmentBorderImageWidth = segmentedObject3.borderImageWidth;
                                stickerMakerView.segmentBorderImageHeight = segmentedObject3.borderImageHeight;
                                arrayList10.add(segmentedObject3);
                            }
                            i25++;
                            segmentedObject = null;
                        }
                        stickerMakerView.selectedObject = segmentedObject;
                        stickerMakerView.segmentingLoaded = true;
                        stickerMakerView.segmentingLoading = false;
                        AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(15, stickerMakerView, arrayList10));
                    }
                    break;
                }
                break;
            case 20:
                SlotsDrawable slotsDrawable = (SlotsDrawable) this.f$0;
                if (slotsDrawable.destroyAfterLoading) {
                    AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda2(slotsDrawable, i8));
                } else {
                    int i28 = 0;
                    boolean z5 = false;
                    while (true) {
                        RLottieNative[] rLottieNativeArr = slotsDrawable.lottieNatives;
                        int length2 = rLottieNativeArr.length;
                        int i29 = this.f$1;
                        ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$4;
                        if (i28 < length2) {
                            if (rLottieNativeArr[i28] == null) {
                                if (i28 == 0) {
                                    i3 = 1;
                                } else if (i28 == 1) {
                                    i3 = 8;
                                } else if (i28 == 2) {
                                    i3 = 14;
                                } else {
                                    i3 = i28 == 3 ? 20 : 2;
                                }
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f$2;
                                if (i3 < tL_messages_stickerSet.documents.size()) {
                                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i3);
                                    String res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                    if (TextUtils.isEmpty(res)) {
                                        AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda3(document, i29, (MessageObject) this.f$3, chatMessageCell, tL_messages_stickerSet, 1));
                                        z5 = true;
                                    } else {
                                        int[] iArr2 = slotsDrawable.metaData;
                                        rLottieNativeArr[i28] = RLottieNative.createFromRawJson(res, "dice", iArr2, null, null);
                                        slotsDrawable.frameCounts[i28] = iArr2[0];
                                    }
                                }
                            }
                            i28++;
                        } else if (z5) {
                            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda2(slotsDrawable, i6));
                        } else {
                            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(slotsDrawable, i29, chatMessageCell, i4));
                        }
                    }
                }
                break;
            case 21:
                final GiftSheet giftSheet = (GiftSheet) this.f$0;
                giftSheet.getClass();
                final GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10 = new GiftSheet$$ExternalSyntheticLambda10(giftSheet, (Utilities.Callback) this.f$4, 2);
                final TL_stars.StarGift starGift = (TL_stars.StarGift) this.f$3;
                boolean z6 = starGift.limited;
                final boolean z7 = z6 && (disallowedGiftsSettings2 = giftSheet.userSettings) != null && disallowedGiftsSettings2.disallow_limited_stargifts;
                final boolean z8 = z6 && (disallowedGiftsSettings = giftSheet.userSettings) != null && disallowedGiftsSettings.disallow_unique_stargifts;
                final Context context = (Context) this.f$2;
                final int i30 = this.f$1;
                final long j5 = giftSheet.dialogId;
                new SendGiftSheet(context, i30, starGift, j5, giftSheet$$ExternalSyntheticLambda10, z7, z8) {
                    public AnonymousClass10(final Context context2, final int i31, final TL_stars.StarGift starGift2, final long j6, final GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda11, final boolean z9, final boolean z10) {
                        super(context2, i31, starGift2, null, j6, giftSheet$$ExternalSyntheticLambda11, z9, z10);
                    }

                    @Override
                    public final BulletinFactory getParentBulletinFactory() {
                        GiftSheet giftSheet2 = GiftSheet.this;
                        return new BulletinFactory(giftSheet2.container, giftSheet2.resourcesProvider);
                    }
                }.show();
                break;
            case 22:
                AlertDialog alertDialog3 = (AlertDialog) this.f$4;
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                if (!launchActivity.isFinishing()) {
                    TLObject tLObject3 = (TLObject) this.f$2;
                    if (tLObject3 == null || launchActivity.actionBarLayout == null) {
                        if (launchActivity.documentsUrisArray == null) {
                            launchActivity.documentsUrisArray = new ArrayList();
                        }
                        launchActivity.documentsUrisArray.add(0, launchActivity.exportingChatUri);
                        launchActivity.exportingChatUri = null;
                        launchActivity.openDialogsToSend(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle bundleM = zzkw.m("onlySelect", true);
                        bundleM.putString("importTitle", tL_messages_historyImportParsed.title);
                        bundleM.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            bundleM.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            bundleM.putInt("dialogsType", 11);
                        } else {
                            String string = ((Uri) this.f$3).toString();
                            int i31 = this.f$1;
                            Iterator<String> it = MessagesController.getInstance(i31).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                } else if (string.contains(it.next())) {
                                    bundleM.putInt("dialogsType", 12);
                                    z = true;
                                }
                            }
                            if (!z) {
                                Iterator<String> it2 = MessagesController.getInstance(i31).exportGroupUri.iterator();
                                while (it2.hasNext()) {
                                    if (string.contains(it2.next())) {
                                        bundleM.putInt("dialogsType", 11);
                                        z = true;
                                        if (!z) {
                                            bundleM.putInt("dialogsType", 13);
                                        }
                                    }
                                }
                                if (!z) {
                                    bundleM.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible) {
                            SecretMediaViewer.getInstance().closePhoto(false, false);
                        } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
                            PhotoViewer.getInstance().closePhoto(false, true);
                        } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible) {
                            ArticleViewer.getInstance().close(false, true);
                        }
                        StoryRecorder.destroyInstance();
                        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                        if (groupCallActivity != null) {
                            groupCallActivity.lambda$showGiftOfferSheet$15();
                        }
                        if (AndroidUtilities.isTablet()) {
                            ActionBarLayout actionBarLayout = launchActivity.actionBarLayout;
                            actionBarLayout.getClass();
                            actionBarLayout.rebuildAllFragmentViews(true, true);
                            ActionBarLayout actionBarLayout2 = launchActivity.rightActionBarLayout;
                            actionBarLayout2.getClass();
                            actionBarLayout2.rebuildAllFragmentViews(true, true);
                        }
                        DialogsActivity dialogsActivity = new DialogsActivity(bundleM);
                        dialogsActivity.delegate = launchActivity;
                        if (!AndroidUtilities.isTablet() ? launchActivity.actionBarLayout.getFragmentStack().size() <= 1 || !(ArticleViewer.IBlock.CC.m(launchActivity.actionBarLayout, 1, launchActivity.actionBarLayout.getFragmentStack()) instanceof MainTabsActivity) : launchActivity.layersActionBarLayout.getFragmentStack().isEmpty() || !(ArticleViewer.IBlock.CC.m(launchActivity.layersActionBarLayout, 1, launchActivity.layersActionBarLayout.getFragmentStack()) instanceof MainTabsActivity)) {
                            z2 = false;
                        }
                        ((ActionBarLayout) launchActivity.getActionBarLayout()).presentFragment$1(dialogsActivity, z2, false);
                    }
                    try {
                        alertDialog3.dismiss();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                }
                break;
            case 23:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = (LaunchActivity$$ExternalSyntheticLambda13) this.f$4;
                BaseFragment baseFragment = (BaseFragment) zziq.m(1, ((LaunchActivity) this.f$0).mainFragmentsStack);
                TLObject tLObject4 = (TLObject) this.f$2;
                if (tLObject4 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                    TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject4;
                    boolean z9 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                    if (z9) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        arrayList2 = tL_chatlists_chatlistInvite.chats;
                        arrayList = tL_chatlists_chatlistInvite.users;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        arrayList2 = tL_chatlists_chatlistInviteAlready.chats;
                        arrayList = tL_chatlists_chatlistInviteAlready.users;
                    } else {
                        arrayList = null;
                        arrayList2 = null;
                    }
                    int i32 = this.f$1;
                    MessagesController.getInstance(i32).putChats(arrayList2, false);
                    MessagesController.getInstance(i32).putUsers(arrayList, false);
                    if (z9 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.NoFolderFound, BulletinFactory.of(baseFragment), null);
                    } else {
                        baseFragment.showDialog(new FolderBottomSheet(baseFragment, (String) this.f$3, chatlist_chatlistinvite));
                    }
                } else {
                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.NoFolderFound, BulletinFactory.of(baseFragment), null);
                }
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
                break;
            case 24:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = (LaunchActivity$$ExternalSyntheticLambda13) this.f$2;
                LaunchActivity launchActivity2 = (LaunchActivity) this.f$0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        launchActivity$$ExternalSyntheticLambda14.run();
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$3;
                    if (tL_error2 != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(launchActivity2, 0, null);
                        String string2 = LocaleController.getString(R.string.AppName);
                        AlertDialog alertDialog4 = builder.alertDialog;
                        alertDialog4.title = string2;
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            alertDialog4.message = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            alertDialog4.message = LocaleController.getString(R.string.JoinToGroupErrorFull);
                        } else {
                            alertDialog4.message = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        launchActivity2.showAlertDialog(builder);
                        break;
                    } else if (launchActivity2.actionBarLayout != null && (updates = (TLRPC.Updates) this.f$4) != null && !updates.chats.isEmpty()) {
                        TLRPC.Chat chat2 = updates.chats.get(0);
                        chat2.left = false;
                        chat2.kicked = false;
                        int i33 = this.f$1;
                        MessagesController.getInstance(i33).putUsers(updates.users, false);
                        MessagesController.getInstance(i33).putChats(updates.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat2.id);
                        ArrayList arrayList11 = launchActivity2.mainFragmentsStack;
                        if (arrayList11.isEmpty() || MessagesController.getInstance(i33).checkCanOpenChat(bundle2, (BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList11))) {
                            ChatActivity chatActivity3 = new ChatActivity(bundle2);
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity2.getActionBarLayout()).presentFragment$1(chatActivity3, false, true);
                        }
                        break;
                    }
                }
                break;
            case 25:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
                loginPayView.getClass();
                ArrayList arrayList12 = new ArrayList();
                AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                accountIdentifiers.zzb = "inapp";
                String str2 = (String) this.f$2;
                accountIdentifiers.zza = str2;
                arrayList12.add(accountIdentifiers.build());
                FileLog.d("LoginBilling querying \"" + str2 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList12, new PassportActivity$$ExternalSyntheticLambda66(loginPayView, str2, (String) this.f$3, (String) this.f$4, this.f$1));
                break;
            case 26:
                ((ButtonWithCounterView) this.f$0).setLoading(false);
                BottomSheet bottomSheet = ((BottomSheet[]) this.f$2)[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                }
                StarsController.getInstance(this.f$1, false).invalidateSubscriptions();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BulletinFactory.of(safeLastFragment).createUsersBulletin(Collections.singletonList((TLObject) this.f$3), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, (String) this.f$4)), null).show(false);
                }
                break;
            case 27:
                long[] jArr = (long[]) this.f$0;
                long j6 = jArr[0];
                int i34 = this.f$1;
                BackupImageView backupImageView2 = (BackupImageView) this.f$4;
                if (j6 >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i34).getUser(Long.valueOf(jArr[0]));
                    AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                    avatarDrawable2.setInfo(UserConfig.selectedAccount, user3);
                    backupImageView2.imageReceiver.setForUserOrChat(user3, avatarDrawable2);
                    backupImageView2.onNewImageSet();
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i34).getChat(Long.valueOf(-jArr[0]));
                    AvatarDrawable avatarDrawable3 = new AvatarDrawable((Theme.ResourcesProvider) null);
                    avatarDrawable3.setInfo(UserConfig.selectedAccount, chat3);
                    backupImageView2.imageReceiver.setForUserOrChat(chat3, avatarDrawable3);
                    backupImageView2.onNewImageSet();
                }
                long j7 = jArr[0];
                BackupImageView backupImageView3 = (BackupImageView) this.f$2;
                TextView textView = (TextView) this.f$3;
                if (j7 >= 0) {
                    TLRPC.User user4 = MessagesController.getInstance(i34).getUser(Long.valueOf(jArr[0]));
                    if (backupImageView3 != null) {
                        AvatarDrawable avatarDrawable4 = new AvatarDrawable((Theme.ResourcesProvider) null);
                        avatarDrawable4.setInfo(UserConfig.selectedAccount, user4);
                        backupImageView3.imageReceiver.setForUserOrChat(user4, avatarDrawable4);
                        backupImageView3.onNewImageSet();
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user4));
                    }
                } else {
                    TLRPC.Chat chat4 = MessagesController.getInstance(i34).getChat(Long.valueOf(-jArr[0]));
                    if (backupImageView3 != null) {
                        AvatarDrawable avatarDrawable5 = new AvatarDrawable((Theme.ResourcesProvider) null);
                        avatarDrawable5.setInfo(UserConfig.selectedAccount, chat4);
                        backupImageView3.imageReceiver.setForUserOrChat(chat4, avatarDrawable5);
                        backupImageView3.onNewImageSet();
                    }
                    if (textView != null) {
                        textView.setText(chat4 == null ? "" : chat4.title);
                    }
                }
                break;
            case 28:
                run$org$telegram$ui$bots$SetupEmojiStatusSheet$$ExternalSyntheticLambda13();
                break;
            default:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                boolean z10 = ((TLObject) this.f$2) instanceof TLRPC.TL_boolTrue;
                int i35 = this.f$1;
                BotWebViewContainer.MyWebView myWebView = (BotWebViewContainer.MyWebView) this.f$3;
                if (!z10) {
                    TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f$4;
                    if (tL_error3 != null) {
                        botWebViewContainer.unknownError(tL_error3.text);
                    } else {
                        String[] strArr = {"cancelled"};
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(botWebViewContainer.getContext(), 0, null);
                        String string3 = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                        AlertDialog alertDialog5 = builder2.alertDialog;
                        alertDialog5.title = string3;
                        alertDialog5.message = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                        builder2.setPositiveButton(LocaleController.getString(R.string.BotWebViewRequestAllow), new TodoItemMenu$$ExternalSyntheticLambda19(i5, botWebViewContainer, strArr));
                        builder2.setNegativeButton(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new TopicsFragment$$ExternalSyntheticLambda25(i7));
                        botWebViewContainer.showDialog(new BotWebViewContainer$$ExternalSyntheticLambda18(strArr, i35, myWebView, z2 ? 1 : 0), alertDialog5, 3);
                    }
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        BotWebViewContainer.notifyEvent(i35, myWebView, "write_access_requested", jSONObject);
                    } catch (Exception e5) {
                        FileLog.e(e5);
                        return;
                    }
                }
                break;
        }
    }

    public WearAuthSheet$$ExternalSyntheticLambda3(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public WearAuthSheet$$ExternalSyntheticLambda3(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public WearAuthSheet$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = i;
        this.f$4 = obj4;
    }

    public WearAuthSheet$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, int i, int[] iArr, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$4 = obj3;
        this.f$1 = i;
        this.f$0 = iArr;
    }

    public WearAuthSheet$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$1 = i;
    }

    public WearAuthSheet$$ExternalSyntheticLambda3(long[] jArr, int i, BackupImageView backupImageView, BackupImageView backupImageView2, TextView textView) {
        this.$r8$classId = 27;
        this.f$0 = jArr;
        this.f$1 = i;
        this.f$4 = backupImageView;
        this.f$2 = backupImageView2;
        this.f$3 = textView;
    }

    public WearAuthSheet$$ExternalSyntheticLambda3(AlertDialog[] alertDialogArr, int[] iArr, int i, ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda5, BaseFragment baseFragment) {
        this.$r8$classId = 15;
        this.f$2 = alertDialogArr;
        this.f$0 = iArr;
        this.f$1 = i;
        this.f$3 = chatActivity$$ExternalSyntheticLambda5;
        this.f$4 = baseFragment;
    }
}
