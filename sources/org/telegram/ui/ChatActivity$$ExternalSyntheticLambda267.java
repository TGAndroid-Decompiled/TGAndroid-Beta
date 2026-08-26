package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.AudioPlayerCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.Reactions.BackSpaceButtonView;
import org.telegram.ui.Components.chat.layouts.ChatActivityActionsButtonsLayout;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Gifts.AuctionWearingSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.bots.BotAdView;

public final class ChatActivity$$ExternalSyntheticLambda267 implements View.OnClickListener {
    public final int $r8$classId;

    public ChatActivity$$ExternalSyntheticLambda267(int i) {
        this.$r8$classId = i;
    }

    private final void onClick$org$telegram$ui$MainTabsActivity$$ExternalSyntheticLambda5(View view) {
    }

    private final void onClick$org$telegram$ui$iv$RichEditorToolbar$$ExternalSyntheticLambda0(View view) {
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    lastFragment.presentFragment(new PremiumPreviewFragment(0, "contact"));
                }
                break;
            case 1:
                int i = AudioPlayerCell.$r8$clinit;
                break;
            case 2:
                if (!MediaController.getInstance().isDownloadingCurrentMessage()) {
                    if (!MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                    } else {
                        MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                    }
                    break;
                }
                break;
            case 3:
                int i2 = ColorPicker.$r8$clinit;
                break;
            case 4:
                int i3 = CustomPhoneKeyboardView.$r8$clinit;
                break;
            case 5:
                MediaController.getInstance().updateSilent(false);
                break;
            case 6:
                PhotoViewer.getInstance().animateTo(1.0f, 0.0f, 0.0f, false);
                break;
            case 7:
                PipVideoOverlay pipVideoOverlay = PipVideoOverlay.instance;
                EmbedBottomSheet embedBottomSheet = pipVideoOverlay.parentSheet;
                if (embedBottomSheet != null) {
                    embedBottomSheet.destroy();
                } else {
                    PhotoViewer photoViewer = pipVideoOverlay.photoViewer;
                    if (photoViewer != null) {
                        photoViewer.destroyPhotoViewer();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                PipVideoOverlay.dismiss();
                break;
            case 8:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 9:
                int i4 = BackSpaceButtonView.$r8$clinit;
                break;
            case 10:
                int i5 = ChatActivityActionsButtonsLayout.$r8$clinit;
                break;
            case 11:
                RTMPStreamPipOverlay.instance.dismissInternal$1();
                break;
            case 12:
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
                break;
            case 13:
                UserSelectorBottomSheet.open(0, null);
                break;
            case 14:
                ExternalActionActivity.lambda$onCreate$1(view);
                break;
            case 15:
                int i6 = AuctionBidSheet.$r8$clinit;
                break;
            case 16:
                ButtonSpan.TextViewButtons[] textViewButtonsArr = AuctionJoinSheet.ref;
                break;
            case 17:
                int i7 = AuctionWearingSheet.$r8$clinit;
                break;
            case 18:
                LaunchActivity.lambda$setupActionBarLayout$4(view);
                break;
            case 20:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                } catch (ActivityNotFoundException e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 21:
                int i8 = StarGiftPreviewSheet.$r8$clinit;
                break;
            case 22:
                LiveStoryPipOverlay.instance.dismissInternal$1(true);
                break;
            case 23:
                int i9 = LivePlayerView.EmptyView.$r8$clinit;
                break;
            case 24:
                PhotoViewer.getInstance().animateTo(1.0f, 0.0f, 0.0f, false);
                break;
            case 25:
                int i10 = BotAdView.$r8$clinit;
                break;
        }
    }
}
