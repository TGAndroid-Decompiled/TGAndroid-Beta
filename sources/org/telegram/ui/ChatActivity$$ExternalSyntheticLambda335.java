package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class ChatActivity$$ExternalSyntheticLambda335 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActivity$$ExternalSyntheticLambda335(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).approved = true;
                ((ChatActivity$$ExternalSyntheticLambda7) this.f$1).run();
                break;
            case 1:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ChannelColorActivity channelColorActivity = (ChannelColorActivity) this.f$0;
                channelColorActivity.boostsStatus = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i = tL_premium_boostsStatus.level;
                    channelColorActivity.currentLevel = i;
                    TLRPC.Chat chat = (TLRPC.Chat) this.f$1;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i;
                    }
                }
                channelColorActivity.updateButton(true);
                ButtonWithCounterView buttonWithCounterView = channelColorActivity.button;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setLoading(false);
                }
                break;
            case 2:
                View view = (View) obj;
                ChannelColorActivity.PeerColorPicker peerColorPicker = (ChannelColorActivity.PeerColorPicker) this.f$0;
                peerColorPicker.getClass();
                if (view instanceof ChannelColorActivity.PeerColorPicker.ColorCell) {
                    ChannelColorActivity.PeerColorPicker.ColorCell colorCell = (ChannelColorActivity.PeerColorPicker.ColorCell) view;
                    colorCell.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, peerColorPicker.resourcesProvider));
                    peerColorPicker.listView.getClass();
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                    MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f$1;
                    if (peerColors != null && childAdapterPosition >= 0 && childAdapterPosition < peerColors.colors.size()) {
                        colorCell.set(peerColors.colors.get(childAdapterPosition));
                        break;
                    }
                }
                break;
            case 3:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$0;
                channelMonetizationLayout.getClass();
                LimitReachedBottomSheet limitReachedBottomSheet = (LimitReachedBottomSheet) this.f$1;
                limitReachedBottomSheet.canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                limitReachedBottomSheet.updateButton$2();
                limitReachedBottomSheet.updatePremiumButtonText();
                channelMonetizationLayout.fragment.showDialog(limitReachedBottomSheet);
                break;
            case 4:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                chatAttachAlert.getClass();
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i2 = chatAttachAlert.currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i2);
                ChatAttachAlert.AttachBotButton attachBotButton = (ChatAttachAlert.AttachBotButton) this.f$1;
                tL_messages_toggleBotInAttachMenu.bot = messagesController.getInputUser(attachBotButton.attachMenuBot.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new ChatActivity$$ExternalSyntheticLambda208(25, chatAttachAlert, attachBotButton), 66);
                break;
            case 5:
                Long l = (Long) obj;
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = (ChatAttachAlertAudioLayout) this.f$0;
                chatAttachAlertAudioLayout.resolvingGlobalAudioBot = false;
                TLRPC.User user = l == null ? null : ((MessagesController) this.f$1).getUser(l);
                chatAttachAlertAudioLayout.globalAudioBot = user;
                chatAttachAlertAudioLayout.failedToResolveGlobalAudioBot = user == null;
                if (user != null) {
                    chatAttachAlertAudioLayout.searchGlobal();
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                ((AlertDialog) this.f$1).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    StoryRecorder storyRecorder = StoryRecorder.getInstance(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long dialogId = profileActivity.getDialogId();
                    storyRecorder.selectedDialogId = dialogId;
                    StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
                    if (anonymousClass8 != null) {
                        anonymousClass8.setDialogId(dialogId);
                    }
                    storyRecorder.open(null);
                }
                break;
            case 7:
                ((SettingsActivity) this.f$0).lambda$onClick$15((TLRPC.TL_attachMenuBot) this.f$1);
                break;
            default:
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                peerStoriesView.canApplyBoost = canApplyBoost;
                LimitReachedBottomSheet.openBoostsForRemoveRestrictions(new SendGiftSheet.AnonymousClass8(peerStoriesView, 8), (TL_stories.TL_premium_boostsStatus) this.f$1, canApplyBoost, peerStoriesView.dialogId, true);
                StoryViewer storyViewer = peerStoriesView.storyViewer;
                if (storyViewer != null) {
                    storyViewer.isOverlayVisible = false;
                    storyViewer.updatePlayingMode();
                }
                break;
        }
    }
}
