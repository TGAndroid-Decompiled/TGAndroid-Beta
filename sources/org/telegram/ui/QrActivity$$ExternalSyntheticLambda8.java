package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.CrossfadeDrawable;

public final class QrActivity$$ExternalSyntheticLambda8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public QrActivity$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((QrActivity) this.f$0).lambda$onPatternLoaded$8(valueAnimator);
                break;
            case 1:
                ((ChannelCreateActivity) this.f$0).lambda$updateDoneProgress$4(valueAnimator);
                break;
            case 2:
                ChatActivity.lambda$createMenu$271((CrossfadeDrawable) this.f$0, valueAnimator);
                break;
            case 3:
                ((ChatEditTypeActivity) this.f$0).lambda$updateDoneProgress$7(valueAnimator);
                break;
            case 4:
                ((DialogsActivity.DialogsRecyclerView) this.f$0).lambda$onTouchEvent$0(valueAnimator);
                break;
            case 5:
                ((FilterChatlistActivity) this.f$0).lambda$updateDoneProgress$8(valueAnimator);
                break;
            case 6:
                ((FilterChatlistActivity.InviteLinkCell) this.f$0).lambda$setLink$6(valueAnimator);
                break;
            case 7:
                ((FiltersSetupActivity.FilterCell) this.f$0).lambda$setFilter$2(valueAnimator);
                break;
            case 8:
                ((GroupCallActivity) this.f$0).lambda$new$41(valueAnimator);
                break;
            case 9:
                ((KeyboardHideHelper) this.f$0).lambda$onTouch$0(valueAnimator);
                break;
            case 10:
                ((PasscodeActivity) this.f$0).lambda$setCustomKeyboardVisible$13(valueAnimator);
                break;
            case 11:
                PhotoViewer.lambda$switchToPip$94((ImageReceiver) this.f$0, valueAnimator);
                break;
            case 12:
                ((PinchToZoomHelper) this.f$0).lambda$finishZoom$0(valueAnimator);
                break;
            case 13:
                ((ProfileStoriesCollectionTabs) this.f$0).lambda$setVisibility$5(valueAnimator);
                break;
            case 14:
                ((ProxySettingsActivity) this.f$0).lambda$setShareDoneEnabled$5(valueAnimator);
                break;
            case 15:
                ((SecretVoicePlayer) this.f$0).lambda$animateOpenTo$10(valueAnimator);
                break;
            case 16:
                ((SelectAnimatedEmojiDialog.SearchBox) this.f$0).lambda$showInputBoxGradient$6(valueAnimator);
                break;
            case 17:
                ((SettingsActivity) this.f$0).lambda$updateActionBarVisible$5(valueAnimator);
                break;
            case 18:
                ((StatisticActivity.BaseChartCell) this.f$0).lambda$updateData$5(valueAnimator);
                break;
            case 19:
                ((ThemePreviewActivity) this.f$0).lambda$toggleTheme$35(valueAnimator);
                break;
            case 20:
                ((TooManyCommunitiesActivity) this.f$0).lambda$loadInactiveChannels$3(valueAnimator);
                break;
            case 21:
                ((TopicsFragment) this.f$0).lambda$animateToSearchView$20(valueAnimator);
                break;
            case 22:
                ((TopicsFragment.TopicDialogCell) this.f$0).lambda$updateHidden$0(valueAnimator);
                break;
            default:
                ((VoIPFragment) this.f$0).lambda$new$0(valueAnimator);
                break;
        }
    }
}
