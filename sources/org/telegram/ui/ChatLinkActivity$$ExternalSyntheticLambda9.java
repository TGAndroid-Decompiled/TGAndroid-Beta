package org.telegram.ui;

import android.text.TextUtils;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.BlockingUpdateView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Bulletin$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CaptionPhotoViewer;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterView$$ExternalSyntheticLambda90;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.JoinToSendSettingsView$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.JoinToSendSettingsView$$ExternalSyntheticLambda5;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ChatLinkActivity$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatLinkActivity$$ExternalSyntheticLambda9(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        int i = 2;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatLinkActivity chatLinkActivity = (ChatLinkActivity) obj2;
                chatLinkActivity.getClass();
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    chatLinkActivity.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    chatLinkActivity.chats = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                chatLinkActivity.loadingChats = false;
                chatLinkActivity.chatsLoaded = true;
                chatLinkActivity.updateRows$3();
                break;
            case 1:
                ChatActivity chatActivity = ChatActivity.this;
                int i2 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                ChatActionCell chatActionCell = (ChatActionCell) obj;
                chatActionCell.getMessageObject().flickerLoading = false;
                chatActionCell.invalidate();
                break;
            case 2:
                ChatActivity chatActivity2 = ChatActivity.this;
                HintView2 hintView2 = (HintView2) obj;
                chatActivity2.contentView.removeView(hintView2);
                if (hintView2 == chatActivity2.factCheckHint) {
                    chatActivity2.factCheckHint = null;
                }
                break;
            case 3:
                ChatActivity.ChatMessageCellDelegate.AnonymousClass1 anonymousClass1 = (ChatActivity.ChatMessageCellDelegate.AnonymousClass1) obj2;
                anonymousClass1.getClass();
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = ChatActivity.ChatMessageCellDelegate.this;
                String str = (jLongValue >= 0 || (chat = ChatActivity.this.getMessagesController().getChat(Long.valueOf(-l.longValue()))) == null) ? "" : chat.title;
                BulletinFactory.of(ChatActivity.this).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).show();
                break;
            case 4:
                ChatEditActivity chatEditActivity = (ChatEditActivity) obj2;
                chatEditActivity.getClass();
                chatEditActivity.presentFragment(StatisticActivity.create((TLRPC.Chat) obj, true));
                break;
            case 5:
                ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) obj2;
                chatEditTypeActivity.getClass();
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                String str2 = (String) obj;
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = chatEditTypeActivity.getMessagesController().getInputChannel(chatEditTypeActivity.chatId);
                chatEditTypeActivity.checkReqId = chatEditTypeActivity.getConnectionsManager().sendRequest(tL_channels_checkUsername, new BoostsActivity$$ExternalSyntheticLambda7(chatEditTypeActivity, str2, tL_channels_checkUsername, 13), 2);
                break;
            case 6:
                ChatEditTypeActivity chatEditTypeActivity2 = (ChatEditTypeActivity) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                boolean z = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                chatEditTypeActivity2.canCreatePublic = z;
                if (!z && chatEditTypeActivity2.getUserConfig().isPremium() && !chatEditTypeActivity2.loadingAdminedChannels && chatEditTypeActivity2.adminnedChannelsLayout != null) {
                    chatEditTypeActivity2.loadingAdminedChannels = true;
                    chatEditTypeActivity2.updatePrivatePublic$1();
                    chatEditTypeActivity2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ChatEditTypeActivity$$ExternalSyntheticLambda0(chatEditTypeActivity2, i));
                    break;
                }
                break;
            case 7:
                ((ChatLinkActivity) obj2).lambda$createView$1((AlertDialog[]) obj);
                break;
            case 8:
                ChatLinkActivity.this.joinRequestProgress = false;
                ((JoinToSendSettingsView$$ExternalSyntheticLambda4) obj).run();
                break;
            case 9:
                ChatLinkActivity.this.joinToSendProgress = false;
                ((JoinToSendSettingsView$$ExternalSyntheticLambda5) obj).run();
                break;
            case 10:
                ChatLinkActivity chatLinkActivity2 = ChatLinkActivity.this;
                chatLinkActivity2.joinToSendProgress = false;
                chatLinkActivity2.joinRequestProgress = false;
                ((Runnable) obj).run();
                break;
            case 11:
                ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass2 = (ChatLinkActivity.ListAdapter.AnonymousClass1) obj2;
                anonymousClass2.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                anonymousClass2.isJoinRequest = true;
                anonymousClass2.joinRequestCell.setChecked(true);
                break;
            case 12:
                ChatUsersActivity chatUsersActivity = (ChatUsersActivity) obj2;
                chatUsersActivity.getClass();
                chatUsersActivity.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 13:
                ChatUsersActivity chatUsersActivity2 = ChatUsersActivity.this;
                if (BulletinFactory.canShowBulletin(chatUsersActivity2)) {
                    BulletinFactory.createPromoteToAdminBulletin(chatUsersActivity2, ((TLRPC.User) obj).first_name).show();
                }
                break;
            case 14:
                ((AIEditorAlert) obj2).tonesController.unsave((TL_aicompose.TL_aiComposeTone) obj);
                break;
            case 15:
                AIEditorAlert.AiStyleAlert aiStyleAlert = (AIEditorAlert.AiStyleAlert) obj2;
                aiStyleAlert.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ProfileActivity.of(((TL_aicompose.TL_aiComposeTone) obj).author_id));
                    aiStyleAlert.lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
            case 16:
                if (((boolean[]) obj2)[0]) {
                    ((PhotoViewer$$ExternalSyntheticLambda21) obj).run();
                }
                break;
            case 17:
                BlockingUpdateView blockingUpdateView = (BlockingUpdateView) obj2;
                blockingUpdateView.getClass();
                TLObject tLObject2 = (TLObject) obj;
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    blockingUpdateView.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 18:
                Bulletin bulletin = (Bulletin) obj2;
                bulletin.loaded = true;
                ViewParent viewParent = bulletin.layout;
                if (viewParent instanceof Bulletin.LoadingLayout) {
                    Bulletin.LoadingLottieLayout loadingLottieLayout = (Bulletin.LoadingLottieLayout) ((Bulletin.LoadingLayout) viewParent);
                    loadingLottieLayout.textView.setText((CharSequence) obj);
                    AndroidUtilities.updateViewShow(loadingLottieLayout.textLoadingView, false, false, true);
                    AndroidUtilities.updateViewShow(loadingLottieLayout.textView, true, false, true);
                }
                bulletin.setCanHide(true);
                break;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((PollItemMenu$$ExternalSyntheticLambda12) obj).run();
                }
                break;
            case 20:
                ((CaptionPhotoViewer) obj2).removeView((HintView2) obj);
                break;
            case 21:
                ((ChatActivityEnterView) obj2).removeView((HintView2) obj);
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                chatActivityEnterView.setFieldText((CharSequence) obj);
                chatActivityEnterView.setTextFieldRunnable = null;
                break;
            case 23:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.getClass();
                ((ChatActivityEnterView$$ExternalSyntheticLambda90) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.currentAccount, chatActivityEnterView2.dialog_id, true);
                break;
            case 24:
                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                chatActivityEnterView3.millisecondsRecorded = chatActivityEnterView3.audioTimelineView.getAudioRightMs() - chatActivityEnterView3.audioTimelineView.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.audioTimelineView.getAudioLeftMs(), chatActivityEnterView3.audioTimelineView.getAudioRightMs(), (Bulletin$2$$ExternalSyntheticLambda1) obj);
                break;
            case 25:
                ((ChatAttachAlert) obj2).lambda$showMotionHint$64((HintView2) obj);
                break;
            case 26:
                ((ChatAttachAlert) obj2).dismiss(true);
                BaseFragment baseFragment = (BaseFragment) obj;
                if (baseFragment != null) {
                    baseFragment.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                }
                break;
            case 27:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) obj2;
                chatAttachAlert.getClass();
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ChatAttachAlert.AttachBotButton) obj).attachMenuBot;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                chatAttachAlert.showBotLayout(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(chatAttachAlert.currentAccount).updateAttachMenuBotsInCache();
                break;
            case 28:
                ChatAttachAlert chatAttachAlert2 = (ChatAttachAlert) obj2;
                MediaDataController.getInstance(chatAttachAlert2.currentAccount).loadAttachMenuBots(false, true);
                if (chatAttachAlert2.currentAttachLayout == chatAttachAlert2.botAttachLayouts.get(((TLRPC.TL_attachMenuBot) obj).bot_id)) {
                    chatAttachAlert2.showLayout(chatAttachAlert2.photoLayout);
                }
                break;
            default:
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = (ChatAttachAlertAudioLayout) obj2;
                chatAttachAlertAudioLayout.loadingAudio = false;
                chatAttachAlertAudioLayout.audioEntries = (ArrayList) obj;
                ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 chatAttachAlertAudioLayout$$ExternalSyntheticLambda2 = chatAttachAlertAudioLayout.updateWithSavingScrollRunnable;
                AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                break;
        }
    }
}
