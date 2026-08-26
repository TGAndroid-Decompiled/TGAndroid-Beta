package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

public final class HintView2$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public HintView2$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((HintView2) this.f$0).lambda$bounceShow$0(valueAnimator);
                break;
            case 1:
                ((CaptionContainerView) this.f$0).lambda$updateShowKeyboard$3(valueAnimator);
                break;
            case 2:
                CollageLayoutButton.CollageLayoutListView collageLayoutListView = (CollageLayoutButton.CollageLayoutListView) this.f$0;
                collageLayoutListView.getClass();
                collageLayoutListView.visibleProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                collageLayoutListView.listView.invalidate();
                break;
            case 3:
                FlashViews flashViews = (FlashViews) this.f$0;
                flashViews.getClass();
                flashViews.invert = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                flashViews.update();
                break;
            case 4:
                GallerySheet gallerySheet = (GallerySheet) this.f$0;
                gallerySheet.getClass();
                gallerySheet.listView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ((MultipleStoriesSelector) this.f$0).invalidate();
                break;
            case 6:
                PreviewButtons previewButtons = (PreviewButtons) this.f$0;
                previewButtons.getClass();
                previewButtons.appearT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                previewButtons.updateAppearT();
                break;
            case 7:
                PreviewButtons.ShareButtonView shareButtonView = (PreviewButtons.ShareButtonView) this.f$0;
                shareButtonView.getClass();
                shareButtonView.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                shareButtonView.invalidate();
                break;
            case 8:
                RoundVideoRecorder roundVideoRecorder = (RoundVideoRecorder) this.f$0;
                roundVideoRecorder.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                roundVideoRecorder.destroyT = fFloatValue;
                RoundVideoRecorder.AnonymousClass1 anonymousClass1 = roundVideoRecorder.cameraView;
                anonymousClass1.setScaleX(1.0f - fFloatValue);
                anonymousClass1.setScaleY(1.0f - roundVideoRecorder.destroyT);
                roundVideoRecorder.invalidate();
                break;
            case 9:
                StoryModeTabs storyModeTabs = (StoryModeTabs) this.f$0;
                storyModeTabs.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyModeTabs.mode = fFloatValue2;
                Utilities.Callback callback = storyModeTabs.onSwitchingModeListener;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(fFloatValue2, 1.0f, -1.0f)));
                }
                storyModeTabs.layout.invalidate();
                break;
            case 10:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                page.getClass();
                page.searchField.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                StoryPrivacyBottomSheet.SearchUsersCell searchUsersCell = (StoryPrivacyBottomSheet.SearchUsersCell) this.f$0;
                searchUsersCell.getClass();
                searchUsersCell.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
