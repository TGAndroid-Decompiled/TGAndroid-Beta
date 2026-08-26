package org.telegram.ui;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.util.LongSparseArray;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.billingclient.api.zzcl;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController$$ExternalSyntheticLambda21;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda17;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.ChannelAdminLogActivity.AnonymousClass20;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.SuggestBirthdayActionLayout;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Storage.CacheModel;

public final class ChatActivity$$ExternalSyntheticLambda218 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda218(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void run() {
        String str;
        Object obj;
        int i = 4;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        char c = 0;
        c = 0;
        char c2 = 0;
        int i2 = 0;
        Object obj2 = this.f$4;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        Object obj6 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj5;
                chatActivity.getClass();
                boolean[] zArr = (boolean[]) obj6;
                if (!zArr[0]) {
                    zArr[0] = true;
                    long[] jArr = {-1};
                    boolean[] zArr2 = (boolean[]) obj4;
                    ChatActivity$$ExternalSyntheticLambda271 chatActivity$$ExternalSyntheticLambda271 = new ChatActivity$$ExternalSyntheticLambda271(jArr, zArr2, (ImageView) obj3, (ImageView) obj2, 25);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = chatActivity.selectedObject.getId();
                    tL_messages_rateTranscribedAudio.peer = chatActivity.getMessagesController().getInputPeer(chatActivity.selectedObject.messageOwner.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = chatActivity.selectedObject.messageOwner.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr2[0];
                    chatActivity.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new BoostsActivity$$ExternalSyntheticLambda7(chatActivity, chatActivity$$ExternalSyntheticLambda271, jArr, 11));
                    AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda271, 150L);
                    break;
                }
                break;
            case 1:
                ((CameraController) obj5).lambda$open$10((CameraSession) obj6, (Runnable) obj4, (SurfaceTexture) obj3, (Runnable) obj2);
                break;
            case 2:
                StickersSearchAdapter.AnonymousClass1 anonymousClass1 = (StickersSearchAdapter.AnonymousClass1) obj5;
                anonymousClass1.getClass();
                String str2 = ((TLRPC.TL_messages_getStickers) obj6).emoticon;
                StickersSearchAdapter stickersSearchAdapter = StickersSearchAdapter.this;
                if (str2.equals(stickersSearchAdapter.searchQuery)) {
                    stickersSearchAdapter.reqId2 = 0;
                    TLObject tLObject = (TLObject) obj4;
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        ArrayList arrayList = (ArrayList) obj3;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        while (c < size2) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(c);
                            if (((LongSparseArray) obj2).indexOfKey(document.id) < 0) {
                                arrayList.add(document);
                            }
                            c++;
                        }
                        if (size != arrayList.size()) {
                            stickersSearchAdapter.emojiStickers.put(arrayList, stickersSearchAdapter.searchQuery);
                            if (size == 0) {
                                stickersSearchAdapter.emojiArrays.add(arrayList);
                            }
                            stickersSearchAdapter.notifyDataSetChanged();
                        }
                        break;
                    }
                }
                break;
            case 3:
                QuickRepliesController quickRepliesController = (QuickRepliesController) obj5;
                quickRepliesController.loading = false;
                int i3 = quickRepliesController.currentAccount;
                MessagesController.getInstance(i3).putUsers((ArrayList) obj6, true);
                MessagesController.getInstance(i3).putChats((ArrayList) obj4, true);
                ArrayList arrayList2 = quickRepliesController.replies;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj3);
                Runnable runnable = (Runnable) obj2;
                if (runnable != null) {
                    runnable.run();
                } else {
                    quickRepliesController.load(null, false);
                }
                NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 4:
                QuickRepliesController quickRepliesController2 = (QuickRepliesController) obj5;
                int i4 = quickRepliesController2.currentAccount;
                MessagesController.getInstance(i4).putUsers((ArrayList) obj6, true);
                MessagesController.getInstance(i4).putChats((ArrayList) obj4, true);
                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                quickReply.topMessage = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(quickReply.name, quickReply.id);
                }
                quickRepliesController2.saveToCache();
                NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 5:
                QuickRepliesController quickRepliesController3 = (QuickRepliesController) obj5;
                quickRepliesController3.getClass();
                TLObject tLObject2 = (TLObject) obj6;
                if (tLObject2 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList3 = ((TLRPC.TL_messages_messages) tLObject2).messages;
                    ArrayList<Integer> arrayList4 = (ArrayList) obj4;
                    arrayList4.clear();
                    int size3 = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        TLRPC.Message message = arrayList3.get(i5);
                        i5++;
                        arrayList4.add(Integer.valueOf(message.id));
                    }
                    TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj3;
                    tL_messages_sendQuickReplyMessages.id = arrayList4;
                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(quickRepliesController3.currentAccount).sendRequest(tL_messages_sendQuickReplyMessages, null);
                } else {
                    FileLog.e("received " + tLObject2 + " " + ((TLRPC.TL_error) obj2) + " on getQuickReplyMessages when trying to send quick reply");
                }
                break;
            case 6:
                CachedMediaLayout cachedMediaLayout = (CachedMediaLayout) obj5;
                cachedMediaLayout.getClass();
                CacheModel.FileInfo fileInfo = (CacheModel.FileInfo) obj6;
                fileInfo.metadata.isOpen = false;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj4;
                tL_documentAttributeAudio.title = (String) obj3;
                tL_documentAttributeAudio.performer = (String) obj2;
                int i7 = 0;
                while (true) {
                    ViewPagerFixed viewPagerFixed = cachedMediaLayout.viewPagerFixed;
                    if (i7 < viewPagerFixed.getViewPages().length) {
                        RecyclerListView recyclerListView = (RecyclerListView) viewPagerFixed.getViewPages()[i7];
                        if (recyclerListView != null && ((CachedMediaLayout.BaseAdapter) recyclerListView.getAdapter()).type == 3) {
                            CachedMediaLayout.BaseAdapter baseAdapter = (CachedMediaLayout.BaseAdapter) recyclerListView.getAdapter();
                            for (int i8 = 0; i8 < baseAdapter.itemInners.size(); i8++) {
                                if (((CachedMediaLayout.ItemInner) baseAdapter.itemInners.get(i8)).file == fileInfo) {
                                    baseAdapter.notifyItemChanged(i8);
                                }
                                break;
                            }
                        }
                        i7++;
                    }
                    break;
                }
                break;
            case 7:
                ChangeUsernameActivity changeUsernameActivity = (ChangeUsernameActivity) obj5;
                changeUsernameActivity.checkReqId = 0;
                String str3 = changeUsernameActivity.lastCheckName;
                if (str3 != null) {
                    String str4 = (String) obj6;
                    if (str3.equals(str4)) {
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                        if (tL_error == null && (((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                            CheckBoxCell.AnonymousClass2 anonymousClass2 = changeUsernameActivity.statusTextView;
                            if (anonymousClass2 != null) {
                                anonymousClass2.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str4));
                                CheckBoxCell.AnonymousClass2 anonymousClass3 = changeUsernameActivity.statusTextView;
                                int i9 = Theme.key_windowBackgroundWhiteGreenText;
                                anonymousClass3.setTag(Integer.valueOf(i9));
                                changeUsernameActivity.statusTextView.setTextColor(Theme.getColor(null, i9, false));
                                ChangeUsernameActivity.UsernameHelpCell usernameHelpCell = changeUsernameActivity.helpCell;
                                if (usernameHelpCell != null) {
                                    int i10 = ChangeUsernameActivity.UsernameHelpCell.$r8$clinit;
                                    usernameHelpCell.update();
                                }
                            }
                        } else if (changeUsernameActivity.statusTextView != null) {
                            TL_account.checkUsername checkusername = (TL_account.checkUsername) obj2;
                            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && checkusername.username.length() == 4) {
                                changeUsernameActivity.statusTextView.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                                CheckBoxCell.AnonymousClass2 anonymousClass4 = changeUsernameActivity.statusTextView;
                                int i11 = Theme.key_text_RedRegular;
                                anonymousClass4.setTag(Integer.valueOf(i11));
                                changeUsernameActivity.statusTextView.setTextColor(Theme.getColor(null, i11, false));
                            } else if (tL_error == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                                changeUsernameActivity.statusTextView.setText(LocaleController.getString(R.string.UsernameInUse));
                                CheckBoxCell.AnonymousClass2 anonymousClass5 = changeUsernameActivity.statusTextView;
                                int i12 = Theme.key_text_RedRegular;
                                anonymousClass5.setTag(Integer.valueOf(i12));
                                changeUsernameActivity.statusTextView.setTextColor(Theme.getColor(null, i12, false));
                            } else {
                                if (checkusername.username.length() == 4) {
                                    changeUsernameActivity.statusTextView.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                                } else {
                                    changeUsernameActivity.statusTextView.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                                }
                                CheckBoxCell.AnonymousClass2 anonymousClass6 = changeUsernameActivity.statusTextView;
                                int i13 = Theme.key_windowBackgroundWhiteGrayText8;
                                anonymousClass6.setTag(Integer.valueOf(i13));
                                changeUsernameActivity.statusTextView.setTextColor(Theme.getColor(null, i13, false));
                            }
                            ChangeUsernameActivity.UsernameHelpCell usernameHelpCell2 = changeUsernameActivity.helpCell;
                            if (usernameHelpCell2 != null) {
                                int i14 = ChangeUsernameActivity.UsernameHelpCell.$r8$clinit;
                                usernameHelpCell2.update();
                            }
                        }
                    }
                }
                break;
            case 8:
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                channelAdminLogActivity.linviteLoading = false;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) obj3;
                channelAdminLogActivity.invitesCache.put(((TLRPC.TL_chatInviteExported) obj4).link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!((boolean[]) obj6)[0]) {
                    ((AlertDialog) obj2).dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        HashMap map = channelAdminLogActivity.usersMap;
                        MessagesController messagesController = channelAdminLogActivity.getMessagesController();
                        TLRPC.Chat chat = channelAdminLogActivity.currentChat;
                        TLRPC.ChatFull chatFull = messagesController.getChatFull(chat.id);
                        InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(channelAdminLogActivity.contentView.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, map, channelAdminLogActivity, chatFull.id, false, ChatObject.isChannel(chat));
                        inviteLinkBottomSheet.inviteDelegate = channelAdminLogActivity.new AnonymousClass20();
                        inviteLinkBottomSheet.show();
                    } else {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkHashExpired, BulletinFactory.of(channelAdminLogActivity), R.raw.linkbroken, 36);
                    }
                    break;
                }
                break;
            case 9:
                ChannelColorActivity channelColorActivity = (ChannelColorActivity) obj5;
                channelColorActivity.getClass();
                boolean[] zArr3 = (boolean[]) obj6;
                if (!zArr3[0]) {
                    int[] iArr = (int[]) obj4;
                    int i15 = iArr[0];
                    int[] iArr2 = (int[]) obj3;
                    if (i15 < iArr2[0]) {
                        TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                        if (tL_error2 != null) {
                            zArr3[0] = true;
                            if ("BOOSTS_REQUIRED".equals(tL_error2.text)) {
                                channelColorActivity.getMessagesController().getBoostsController().userCanBoostChannel(channelColorActivity.dialogId, channelColorActivity.boostsStatus, new ChannelColorActivity$$ExternalSyntheticLambda0(channelColorActivity, 1));
                            } else {
                                channelColorActivity.button.setLoading(false);
                                zzks.m(R.string.UnknownErrorCode, new Object[]{tL_error2.text}, BulletinFactory.of(channelColorActivity), R.raw.error);
                            }
                        } else {
                            int i16 = i15 + 1;
                            iArr[0] = i16;
                            if (i16 == iArr2[0]) {
                                channelColorActivity.finishFragment();
                                BaseFragment baseFragment = channelColorActivity.bulletinFragment;
                                if (baseFragment != null) {
                                    if (baseFragment instanceof ChatEditActivity) {
                                        ((ChatEditActivity) baseFragment).updateColorCell();
                                    }
                                    FactCheckController$$ExternalSyntheticOutline0.m(channelColorActivity.isGroup ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, BulletinFactory.of(channelColorActivity.bulletinFragment), R.raw.contact_check, 36);
                                    channelColorActivity.bulletinFragment = null;
                                }
                                channelColorActivity.button.setLoading(false);
                            }
                        }
                        break;
                    }
                }
                break;
            case 10:
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) obj5;
                channelCreateActivity.checkReqId = 0;
                String str5 = channelCreateActivity.lastCheckName;
                if (str5 != null) {
                    String str6 = (String) obj6;
                    if (str5.equals(str6)) {
                        TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                        if (tL_error3 == null && (((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                            channelCreateActivity.checkTextView.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str6));
                            CheckBoxCell.AnonymousClass2 anonymousClass7 = channelCreateActivity.checkTextView;
                            int i17 = Theme.key_windowBackgroundWhiteGreenText;
                            anonymousClass7.setTag(Integer.valueOf(i17));
                            channelCreateActivity.checkTextView.setTextColor(Theme.getColor(null, i17, false));
                            channelCreateActivity.lastNameAvailable = true;
                        } else {
                            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) obj2;
                            if (tL_error3 != null && "USERNAME_INVALID".equals(tL_error3.text) && tL_channels_checkUsername.username.length() == 4) {
                                channelCreateActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                                channelCreateActivity.checkTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                            } else if (tL_error3 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error3.text)) {
                                if (tL_channels_checkUsername.username.length() == 4) {
                                    channelCreateActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                                } else {
                                    channelCreateActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                                }
                                channelCreateActivity.checkTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText8, false));
                            } else if (tL_error3 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error3.text)) {
                                channelCreateActivity.checkTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                                channelCreateActivity.checkTextView.setText(LocaleController.getString(R.string.LinkInUse));
                            } else {
                                channelCreateActivity.checkTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                                channelCreateActivity.canCreatePublic = false;
                                channelCreateActivity.showPremiumIncreaseLimitDialog();
                            }
                            channelCreateActivity.lastNameAvailable = false;
                        }
                    }
                }
                break;
            case 11:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) obj5;
                chatMessageCellDelegate.getClass();
                int i18 = ((TLRPC.Message) obj6).suggested_post.schedule_date;
                MessageObject messageObject2 = (MessageObject) obj3;
                ChatActivity chatActivity2 = ChatActivity.this;
                if (i18 == 0) {
                    ((AlertDialog[]) obj4)[0].setOnDismissListener(null);
                    Activity parentActivity = chatActivity2.getParentActivity();
                    ChatActivity$$ExternalSyntheticLambda189 chatActivity$$ExternalSyntheticLambda189 = new ChatActivity$$ExternalSyntheticLambda189(i, chatMessageCellDelegate, messageObject2);
                    Theme.ResourcesProvider resourceProvider = chatActivity2.getResourceProvider();
                    Pattern pattern = AlertsCreator.URL_PATTERN;
                    BottomSheet.Builder builderCreateSuggestedMessageDatePickerDialog = AlertsCreator.createSuggestedMessageDatePickerDialog(parentActivity, 0L, chatActivity$$ExternalSyntheticLambda189, new AlertsCreator.ScheduleDatePickerColors(null), resourceProvider, 1);
                    builderCreateSuggestedMessageDatePickerDialog.bottomSheet.show();
                    builderCreateSuggestedMessageDatePickerDialog.bottomSheet.setOnDismissListener((OAuthSheet$$ExternalSyntheticLambda11) obj2);
                } else {
                    chatActivity2.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject2.messageOwner.peer_id), messageObject2.messageOwner.id, 0);
                }
                break;
            case 12:
                ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) obj5;
                chatEditTypeActivity.checkReqId = 0;
                String str7 = chatEditTypeActivity.lastCheckName;
                if (str7 != null) {
                    String str8 = (String) obj6;
                    if (str7.equals(str8)) {
                        TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                        if (tL_error4 == null && (((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                            chatEditTypeActivity.checkTextView.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str8));
                            chatEditTypeActivity.checkTextView.setTextColorByKey(Theme.key_windowBackgroundWhiteGreenText);
                            chatEditTypeActivity.lastNameAvailable = true;
                        } else {
                            TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) obj2;
                            if (tL_error4 != null && "USERNAME_INVALID".equals(tL_error4.text) && tL_channels_checkUsername2.username.length() == 4) {
                                chatEditTypeActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                                chatEditTypeActivity.checkTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                            } else if (tL_error4 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                                if (tL_channels_checkUsername2.username.length() == 4) {
                                    chatEditTypeActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                                } else {
                                    chatEditTypeActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                                }
                                chatEditTypeActivity.checkTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText8, false));
                            } else if (tL_error4 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error4.text)) {
                                chatEditTypeActivity.checkTextView.setText(LocaleController.getString(R.string.LinkInUse));
                                chatEditTypeActivity.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
                            } else {
                                chatEditTypeActivity.canCreatePublic = false;
                                chatEditTypeActivity.showPremiumIncreaseLimitDialog$1();
                            }
                            chatEditTypeActivity.lastNameAvailable = false;
                        }
                    }
                }
                break;
            case 13:
                ((ChatRightsEditActivity) obj5).lambda$initTransfer$19((TLRPC.TL_error) obj6, (TLRPC.TL_inputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2);
                break;
            case 14:
                ChatUsersActivity.SearchAdapter searchAdapter = (ChatUsersActivity.SearchAdapter) obj5;
                ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                if (chatUsersActivity.searching) {
                    searchAdapter.searchInProgress = false;
                    ArrayList arrayList5 = (ArrayList) obj6;
                    searchAdapter.searchResult = arrayList5;
                    searchAdapter.searchResultMap = (androidx.collection.LongSparseArray) obj4;
                    searchAdapter.searchResultNames = (ArrayList) obj3;
                    SearchAdapterHelper searchAdapterHelper = searchAdapter.searchAdapterHelper;
                    searchAdapterHelper.mergeResults(arrayList5, null);
                    if (!ChatObject.isChannel(chatUsersActivity.currentChat)) {
                        ArrayList arrayList6 = searchAdapterHelper.groupSearch;
                        arrayList6.clear();
                        arrayList6.addAll((ArrayList) obj2);
                    }
                    int i19 = searchAdapter.totalCount;
                    searchAdapter.notifyDataSetChanged();
                    if (searchAdapter.totalCount > i19) {
                        chatUsersActivity.showItemsAnimated(i19);
                    }
                    if (!searchAdapterHelper.isSearchInProgress() && searchAdapter.totalCount == 0) {
                        chatUsersActivity.emptyView.showProgress(false, true);
                        break;
                    }
                }
                break;
            case 15:
                View view = (View) obj5;
                view.setVisibility(8);
                View view2 = (View) obj6;
                view2.setVisibility(8);
                WindowManager windowManager = (WindowManager) obj4;
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((FrameLayout) obj3);
                windowManager.removeView((View) obj2);
                break;
            case 16:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                if (tL_error5 != null) {
                    ((Utilities.Callback) obj6).run(tL_error5);
                } else {
                    TLObject tLObject3 = (TLObject) obj4;
                    if (tLObject3 instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject3;
                        MessagesController messagesController2 = (MessagesController) obj3;
                        messagesController2.putUsers(tL_premium_myBoosts.users, false);
                        messagesController2.putChats(tL_premium_myBoosts.chats, false);
                        ((Utilities.Callback) obj2).run(tL_premium_myBoosts);
                    }
                }
                break;
            case 17:
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj5;
                if (tL_error6 != null) {
                    ((SendMessagesHelper$$ExternalSyntheticLambda17) obj6).run(tL_error6);
                } else {
                    TLObject tLObject4 = (TLObject) obj4;
                    if (tLObject4 instanceof TL_stories.TL_premium_myBoosts) {
                        TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject4;
                        MessagesController messagesController3 = (MessagesController) obj3;
                        messagesController3.putUsers(tL_premium_myBoosts2.users, false);
                        messagesController3.putChats(tL_premium_myBoosts2.chats, false);
                        ((FileRefController$$ExternalSyntheticLambda21) obj2).run(tL_premium_myBoosts2);
                    }
                }
                break;
            case 18:
                TLObject tLObject5 = (TLObject) obj5;
                if (tLObject5 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject5;
                    MessagesController messagesController4 = (MessagesController) obj6;
                    messagesController4.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController4.putUsers(tL_payments_checkedGiftCode.users, false);
                    ((GiftSheet$$ExternalSyntheticLambda23) obj4).run(tL_payments_checkedGiftCode);
                }
                ((BoostDialogs$$ExternalSyntheticLambda13) obj3).run((TLRPC.TL_error) obj2);
                break;
            case 19:
                ((UserSelectorBottomSheet) obj5).lambda$openBirthdaySetup$26((TLObject) obj6, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj3, (TLRPC.TL_error) obj2);
                break;
            case 20:
                StickersAlert stickersAlert = (StickersAlert) obj5;
                stickersAlert.checkReqId = 0;
                String str9 = stickersAlert.lastCheckName;
                if (str9 != null && str9.equals((String) obj6)) {
                    TextView textView = (TextView) obj2;
                    if (((TLRPC.TL_error) obj4) == null && (((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(stickersAlert.getThemedColor(Theme.key_windowBackgroundWhiteGreenText));
                        stickersAlert.lastNameAvailable = true;
                    } else {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                        textView.setTextColor(stickersAlert.getThemedColor(Theme.key_text_RedRegular));
                        stickersAlert.lastNameAvailable = false;
                    }
                    break;
                }
                break;
            case 21:
                SuggestBirthdayActionLayout suggestBirthdayActionLayout = (SuggestBirthdayActionLayout) obj5;
                suggestBirthdayActionLayout.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    if (((TLObject) obj6) instanceof TLRPC.TL_boolTrue) {
                        Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(safeLastFragment).createSimpleBulletin(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        bulletinCreateSimpleBulletin.duration = 5000;
                        bulletinCreateSimpleBulletin.show();
                    } else {
                        TLRPC.UserFull userFull = (TLRPC.UserFull) obj4;
                        if (userFull != null) {
                            TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj3;
                            if (tL_birthday == null) {
                                userFull.flags2 &= -33;
                            } else {
                                userFull.flags2 |= 32;
                            }
                            userFull.birthday = tL_birthday;
                            MessagesStorage.getInstance(suggestBirthdayActionLayout.currentAccount).updateUserInfo(userFull, false);
                        }
                        TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                        if (tL_error7 == null || (str = tL_error7.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                            FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(safeLastFragment), R.raw.error, 36);
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(suggestBirthdayActionLayout.view.getContext(), 0, null);
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            alertDialog.message = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
                        }
                    }
                    break;
                }
                break;
            case 22:
                TopicsTabsView topicsTabsView = (TopicsTabsView) obj5;
                topicsTabsView.getClass();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj4;
                ItemOptions itemOptions = (ItemOptions) obj3;
                if (((MessagesController) obj6).isDialogMuted(topicsTabsView.dialogId, tL_forumTopic.id)) {
                    itemOptions.dismiss();
                    NotificationsController.getInstance(topicsTabsView.currentAccount).muteDialog(topicsTabsView.dialogId, tL_forumTopic.id, false);
                    ChatActivity chatActivity3 = topicsTabsView.fragment;
                    if (BulletinFactory.canShowBulletin(chatActivity3)) {
                        BulletinFactory.createMuteBulletin(chatActivity3, 4, 0, topicsTabsView.resourcesProvider).show();
                    }
                } else {
                    itemOptions.openSwipeback((ItemOptions) obj2);
                }
                break;
            case 23:
                ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) obj5;
                contentPreviewViewer.getClass();
                if (((TLRPC.TL_error) obj6) == null) {
                    TLObject tLObject6 = (TLObject) obj4;
                    if (tLObject6 instanceof TLRPC.TL_messages_myStickers) {
                        TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject6;
                        ArrayList<TLRPC.StickerSetCovered> arrayList7 = tL_messages_myStickers.sets;
                        int size4 = arrayList7.size();
                        while (true) {
                            ArrayList arrayList8 = (ArrayList) obj3;
                            if (i2 >= size4) {
                                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj2;
                                if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                                    tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) zziq.m(1, tL_messages_myStickers.sets)).set.id;
                                    ConnectionsManager.getInstance(contentPreviewViewer.currentAccount).sendRequest(tL_messages_getMyStickers, new BoostsActivity$$ExternalSyntheticLambda7(contentPreviewViewer, arrayList8, tL_messages_getMyStickers, 25));
                                }
                                break;
                            } else {
                                TLRPC.StickerSetCovered stickerSetCovered = arrayList7.get(i2);
                                i2++;
                                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                                TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                                if (!stickerSet.emojis && !stickerSet.masks) {
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(contentPreviewViewer.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                                    if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                        arrayList8.add(stickerSetCovered2);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 24:
                ((DialogsActivity) obj5).lambda$updateDialogsHint$46((TLObject) obj6, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj3, (TLRPC.TL_error) obj2);
                break;
            case 25:
                SendGiftSheet sendGiftSheet = (SendGiftSheet) obj5;
                sendGiftSheet.getClass();
                boolean z = ((TLObject) obj6) instanceof TLRPC.TL_boolTrue;
                int i20 = sendGiftSheet.currentAccount;
                BaseFragment baseFragment2 = sendGiftSheet.baseFragment;
                if (z) {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity2 = baseFragment2.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i20);
                    zzcl zzclVar = new zzcl(c, 16);
                    zzclVar.setProductDetails(sendGiftSheet.premiumTier.googlePlayProductDetails);
                    billingController.launchBillingFlow(parentActivity2, accountInstance, (TLRPC.TL_inputStorePaymentGiftPremium) obj4, Collections.singletonList(zzclVar.build()));
                } else {
                    TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                    if (tL_error8 != null) {
                        AlertsCreator.processError(i20, tL_error8, baseFragment2, (TLRPC.TL_payments_canPurchaseStore) obj2, new Object[0]);
                    }
                }
                break;
            case 26:
                ((GroupCallActivity) obj5).lambda$openShareConferenceLink$81((AlertDialog) obj6, (TLObject) obj4, (TL_phone.exportGroupCallInvite) obj3, (TLRPC.TL_error) obj2);
                break;
            case 27:
                ((GroupCallActivity) obj5).lambda$new$18((ArrayList) obj6, (ArrayList) obj4, (ArrayList) obj3, (String) obj2);
                break;
            case 28:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                launchActivity.getClass();
                TLObject tLObject7 = (TLObject) obj6;
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = (LaunchActivity$$ExternalSyntheticLambda13) obj3;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject7;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    AlertDialog alertDialog2 = (AlertDialog) obj4;
                    if (themeSettings != null) {
                        Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) Theme.themesDict.get(Theme.getBaseThemeKey(themeSettings));
                        if (themeInfo != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity.currentAccount).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity.loadingThemeProgressDialog = alertDialog2;
                                    launchActivity.loadingThemeAccent = true;
                                    launchActivity.loadingThemeInfo = themeInfo;
                                    launchActivity.loadingTheme = tL_theme;
                                    launchActivity.loadingThemeWallpaper = tL_wallPaper;
                                    launchActivity.loadingThemeWallpaperName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity.currentAccount).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                }
                            }
                            try {
                                launchActivity$$ExternalSyntheticLambda13.run();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            int i21 = themeInfo.lastAccentId;
                            Theme.ThemeAccent themeAccentCreateNewAccent = themeInfo.createNewAccent(tL_theme, launchActivity.currentAccount, 0);
                            themeInfo.prevAccentId = themeInfo.currentAccentId;
                            themeInfo.setCurrentAccentId(themeAccentCreateNewAccent.id);
                            themeAccentCreateNewAccent.pattern = tL_wallPaper;
                            launchActivity.presentFragment(new ThemePreviewActivity(themeInfo, i21 != themeInfo.lastAccentId, 0, false, false));
                        } else {
                            c2 = 1;
                        }
                        break;
                    } else {
                        TLRPC.Document document2 = tL_theme.document;
                        if (document2 != null) {
                            launchActivity.loadingThemeAccent = false;
                            launchActivity.loadingTheme = tL_theme;
                            launchActivity.loadingThemeFileName = FileLoader.getAttachFileName(document2);
                            launchActivity.loadingThemeProgressDialog = alertDialog2;
                            FileLoader.getInstance(launchActivity.currentAccount).loadFile(launchActivity.loadingTheme.document, tL_theme, 1, 1);
                        } else {
                            c2 = 1;
                        }
                    }
                } else {
                    TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                    if (tL_error9 == null || !"THEME_FORMAT_INVALID".equals(tL_error9.text)) {
                        c2 = 2;
                    } else {
                        c2 = 1;
                    }
                }
                if (c2 != 0) {
                    try {
                        launchActivity$$ExternalSyntheticLambda13.run();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (c2 == 1) {
                        launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                    } else {
                        launchActivity.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                    }
                }
                break;
            default:
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = (LaunchActivity$$ExternalSyntheticLambda13) obj6;
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                launchActivity2.getClass();
                try {
                    launchActivity$$ExternalSyntheticLambda14.run();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                TLObject tLObject8 = (TLObject) obj4;
                if (tLObject8 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tLObject8;
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) obj3;
                    if (tL_wallPaper2.pattern) {
                        obj = tL_wallPaper2;
                        String str10 = tL_wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper3.settings;
                        int i22 = wallPaperSettings.background_color;
                        int i23 = wallPaperSettings.second_background_color;
                        int i24 = wallPaperSettings.third_background_color;
                        int i25 = wallPaperSettings.fourth_background_color;
                        int wallpaperRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper3.settings;
                        WallpapersListActivity.ColorWallpaper colorWallpaper = new WallpapersListActivity.ColorWallpaper(str10, i22, i23, i24, i25, wallpaperRotation, wallPaperSettings2.intensity / 100.0f, wallPaperSettings2.motion, null);
                        colorWallpaper.pattern = tL_wallPaper2;
                        obj = colorWallpaper;
                    }
                    obj = tL_wallPaper2;
                    ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(true, obj, null);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper3.settings;
                    boolean z2 = wallPaperSettings3.blur;
                    boolean z3 = wallPaperSettings3.motion;
                    float f = wallPaperSettings3.intensity;
                    themePreviewActivity.isBlurred = z2;
                    themePreviewActivity.isMotion = z3;
                    themePreviewActivity.dimAmount = f;
                    launchActivity2.presentFragment(themePreviewActivity);
                } else {
                    StringBuilder sb = new StringBuilder();
                    zzlf.m(R.string.ErrorOccurred, "\n", sb);
                    sb.append(((TLRPC.TL_error) obj2).text);
                    launchActivity2.showAlertDialog(AlertsCreator.createSimpleAlert(launchActivity2, null, sb.toString()));
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda218(ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass3 anonymousClass3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, AlertDialog alertDialog) {
        this.$r8$classId = 8;
        this.f$0 = anonymousClass3;
        this.f$2 = tL_chatInviteExported;
        this.f$3 = tL_messages_exportedChatInvite;
        this.f$1 = zArr;
        this.f$4 = alertDialog;
    }
}
