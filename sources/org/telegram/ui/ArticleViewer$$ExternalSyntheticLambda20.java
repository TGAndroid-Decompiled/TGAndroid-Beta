package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import com.android.billingclient.api.BillingResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.StickersDialogs;
import org.telegram.ui.Gifts.ProfileGiftsContainer;

public final class ArticleViewer$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public ArticleViewer$$ExternalSyntheticLambda20(int i, BillingResult billingResult, String str, String str2, String str3, List list, LoginActivity.LoginPayView loginPayView) {
        this.$r8$classId = 12;
        this.f$0 = loginPayView;
        this.f$4 = str;
        this.f$2 = billingResult;
        this.f$3 = list;
        this.f$5 = str2;
        this.f$6 = str3;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) this.f$0).lambda$openWebpageUrlInternal$11(this.f$1, (Browser.Progress) this.f$2, (TLObject) this.f$3, (String) this.f$4, (Utilities.Callback0Return) this.f$5, (TLRPC.TL_messages_getWebPage) this.f$6);
                break;
            case 1:
                MediaController.lambda$broadcastNewPhotos$58(this.f$1, (ArrayList) this.f$0, (ArrayList) this.f$2, (Integer) this.f$3, (MediaController.AlbumEntry) this.f$4, (MediaController.AlbumEntry) this.f$5, (MediaController.AlbumEntry) this.f$6);
                break;
            case 2:
                ((SendMessagesHelper) this.f$0).lambda$performSendDelayedMessage$53((TLObject) this.f$3, (TLRPC.InputFile) this.f$2, (TLRPC.InputMedia) this.f$5, (SendMessagesHelper.DelayedMessage) this.f$6, this.f$1, (String) this.f$4);
                break;
            case 3:
                MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                if (mentionsAdapter.channelReqId != 0) {
                    if (this.f$1 == mentionsAdapter.channelLastReqId && mentionsAdapter.searchResultUsernamesMap != null && mentionsAdapter.searchResultUsernames != null) {
                        mentionsAdapter.showUsersResult((LongSparseArray) this.f$4, (ArrayList) this.f$2, false);
                        if (((TLRPC.TL_error) this.f$5) == null) {
                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) ((TLObject) this.f$3);
                            ArrayList<TLRPC.User> arrayList = tL_channels_channelParticipants.users;
                            MessagesController messagesController = (MessagesController) this.f$6;
                            messagesController.putUsers(arrayList, false);
                            messagesController.putChats(tL_channels_channelParticipants.chats, false);
                            mentionsAdapter.searchResultUsernames.isEmpty();
                            if (!tL_channels_channelParticipants.participants.isEmpty()) {
                                long clientUserId = UserConfig.getInstance(mentionsAdapter.currentAccount).getClientUserId();
                                for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
                                    long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i).peer);
                                    if (mentionsAdapter.searchResultUsernamesMap.indexOfKey(peerId) < 0 && ((peerId != 0 || mentionsAdapter.searchResultUsernamesMap.indexOfKey(clientUserId) < 0) && (mentionsAdapter.isSearchingMentions || (peerId != clientUserId && peerId != 0)))) {
                                        if (peerId >= 0) {
                                            TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                                            if (user != null) {
                                                mentionsAdapter.searchResultUsernames.add(user);
                                            }
                                        } else {
                                            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                                            if (chat != null) {
                                                mentionsAdapter.searchResultUsernames.add(chat);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                        mentionsAdapter.notifyDataSetChanged();
                        mentionsAdapter.delegate.needChangePanelVisibility(!mentionsAdapter.searchResultUsernames.isEmpty());
                    }
                }
                mentionsAdapter.channelReqId = 0;
                break;
            case 4:
                CallLogActivity.lambda$showCallLinkSheet$31((TLRPC.InputGroupCall) this.f$0, this.f$1, (String[]) this.f$2, (FrameLayout) this.f$3, (LinkSpanDrawable.LinksTextView) this.f$4, (BottomSheet) this.f$5, (Theme.ResourcesProvider) this.f$6);
                break;
            case 5:
                CallLogActivity.lambda$createCallLink$37((TLObject) this.f$3, (AlertDialog) this.f$0, (Context) this.f$2, this.f$1, (TL_phone.exportGroupCallInvite) this.f$4, (Theme.ResourcesProvider) this.f$5, (Runnable) this.f$6);
                break;
            case 6:
                ChatUsersActivity.lambda$loadChatParticipants$32((TLRPC.TL_error) this.f$0, (TLObject) this.f$3, (ArrayList) this.f$2, this.f$1, (AtomicInteger) this.f$4, (ArrayList) this.f$5, (Runnable) this.f$6);
                break;
            case 7:
                StickersDialogs.lambda$openStickerPickerDialog$9((AlertDialog) this.f$0, (TLObject) this.f$3, this.f$1, (TLRPC.Document) this.f$2, (TLRPC.TL_error) this.f$4, this.f$5, (TLRPC.TL_stickers_addStickerToSet) this.f$6);
                break;
            case 8:
                ((ProfileGiftsContainer) this.f$0).lambda$new$2(this.f$1, (String) this.f$4, (TL_stars.TL_starGiftCollection) this.f$2, (Context) this.f$3, (Theme.ResourcesProvider) this.f$5, (BaseFragment) this.f$6);
                break;
            case 9:
                ((LaunchActivity) this.f$0).lambda$processAttachMenuBot$128((TLObject) this.f$3, this.f$1, (DialogsActivity) this.f$2, (BaseFragment) this.f$5, (TLRPC.User) this.f$6, (String) this.f$4);
                break;
            case 10:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$86((TLRPC.TL_error) this.f$2, (TLObject) this.f$3, this.f$1, (AlertDialog) this.f$5, (Runnable) this.f$6, (String) this.f$4);
                break;
            case 11:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$58((TLRPC.TL_error) this.f$2, (TLObject) this.f$3, (TLRPC.TL_inputInvoiceSlug) this.f$5, (Runnable) this.f$6, this.f$1, (String) this.f$4);
                break;
            case 12:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$28((String) this.f$4, (BillingResult) this.f$2, (List) this.f$3, (String) this.f$5, (String) this.f$6, this.f$1);
                break;
            default:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$81((View) this.f$2, (String) this.f$4, this.f$1, (boolean[]) this.f$3, (String[]) this.f$5, (String) this.f$6);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda20(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.$r8$classId = 1;
        this.f$1 = i;
        this.f$0 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = num;
        this.f$4 = albumEntry;
        this.f$5 = albumEntry2;
        this.f$6 = albumEntry3;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
        this.f$6 = obj6;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i, String str) {
        this.$r8$classId = 2;
        this.f$0 = sendMessagesHelper;
        this.f$3 = tLObject;
        this.f$2 = inputFile;
        this.f$5 = inputMedia;
        this.f$6 = delayedMessage;
        this.f$1 = i;
        this.f$4 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(TLObject tLObject, AlertDialog alertDialog, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        this.$r8$classId = 5;
        this.f$3 = tLObject;
        this.f$0 = alertDialog;
        this.f$2 = context;
        this.f$1 = i;
        this.f$4 = exportgroupcallinvite;
        this.f$5 = resourcesProvider;
        this.f$6 = runnable;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, Runnable runnable) {
        this.$r8$classId = 6;
        this.f$0 = tL_error;
        this.f$3 = tLObject;
        this.f$2 = arrayList;
        this.f$1 = i;
        this.f$4 = atomicInteger;
        this.f$5 = arrayList2;
        this.f$6 = runnable;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(AlertDialog alertDialog, int i, TLRPC.Document document, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = 7;
        this.f$0 = alertDialog;
        this.f$3 = tLObject;
        this.f$1 = i;
        this.f$2 = document;
        this.f$4 = tL_error;
        this.f$5 = obj;
        this.f$6 = tL_stickers_addStickerToSet;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(MentionsAdapter.AnonymousClass7 anonymousClass7, int i, ArrayList arrayList, LongSparseArray longSparseArray, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController) {
        this.$r8$classId = 3;
        this.f$0 = anonymousClass7;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$4 = longSparseArray;
        this.f$5 = tL_error;
        this.f$3 = tLObject;
        this.f$6 = messagesController;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(ProfileGiftsContainer profileGiftsContainer, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment) {
        this.$r8$classId = 8;
        this.f$0 = profileGiftsContainer;
        this.f$1 = i;
        this.f$4 = str;
        this.f$2 = tL_starGiftCollection;
        this.f$3 = context;
        this.f$5 = resourcesProvider;
        this.f$6 = baseFragment;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(LaunchActivity launchActivity, TLObject tLObject, int i, DialogsActivity dialogsActivity, BaseFragment baseFragment, TLRPC.User user, String str) {
        this.$r8$classId = 9;
        this.f$0 = launchActivity;
        this.f$3 = tLObject;
        this.f$1 = i;
        this.f$2 = dialogsActivity;
        this.f$5 = baseFragment;
        this.f$6 = user;
        this.f$4 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, AlertDialog alertDialog, Runnable runnable, String str) {
        this.$r8$classId = 10;
        this.f$0 = launchActivity;
        this.f$2 = tL_error;
        this.f$3 = tLObject;
        this.f$1 = i;
        this.f$5 = alertDialog;
        this.f$6 = runnable;
        this.f$4 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, Runnable runnable, int i, String str) {
        this.$r8$classId = 11;
        this.f$0 = launchActivity;
        this.f$2 = tL_error;
        this.f$3 = tLObject;
        this.f$5 = tL_inputInvoiceSlug;
        this.f$6 = runnable;
        this.f$1 = i;
        this.f$4 = str;
    }

    public ArticleViewer$$ExternalSyntheticLambda20(ProfileActivity profileActivity, View view, String str, int i, boolean[] zArr, String[] strArr, String str2) {
        this.$r8$classId = 13;
        this.f$0 = profileActivity;
        this.f$2 = view;
        this.f$4 = str;
        this.f$1 = i;
        this.f$3 = zArr;
        this.f$5 = strArr;
        this.f$6 = str2;
    }
}
