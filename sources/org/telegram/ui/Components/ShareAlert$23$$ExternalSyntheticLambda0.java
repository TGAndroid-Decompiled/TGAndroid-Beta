package org.telegram.ui.Components;

import android.app.Dialog;
import android.widget.EditText;
import androidx.dynamicanimation.animation.SpringAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ShareAlert$23$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public ShareAlert$23$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ShareAlert.AnonymousClass23) this.f$0).lambda$afterTextChanged$0();
                break;
            case 1:
                ((SharedMediaLayout.AnonymousClass12) this.f$0).lambda$unselect$0();
                break;
            case 2:
                ((SharedMediaLayout.AnonymousClass4) this.f$0).lambda$onTextChanged$0();
                break;
            case 3:
                ((SharedMediaLayout.ChannelRecommendationsAdapter) this.f$0).lambda$onCreateViewHolder$0();
                break;
            case 4:
                ((SharedMediaLayout.SavedDialogsAdapter) this.f$0).lambda$new$0();
                break;
            case 5:
                ((SharedMediaLayout.SavedMessagesSearchAdapter) this.f$0).sendRequest();
                break;
            case 6:
                ((StickerCategoriesListView.CategoryButton) this.f$0).lambda$set$1();
                break;
            case 7:
                ((ThanosEffect.DrawingThread.Animation) this.f$0).lambda$new$1();
                break;
            case 8:
                ((TopicsTabsView.AnonymousClass5) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 9:
                TranslateAlert2.AnonymousClass5.lambda$run$2((Utilities.Callback2) this.f$0);
                break;
            case 10:
                ((ActionBarPopupWindow) this.f$0).dismiss();
                break;
            case 11:
                ((TrendingStickersAlert.AlertContainerView) this.f$0).requestLayout();
                break;
            case 12:
                ((VideoPlayer.VisualizerBufferSink) this.f$0).lambda$handleBuffer$0();
                break;
            case 13:
                ((WebPlayerView.AnonymousClass2.AnonymousClass1) this.f$0).lambda$onPreDraw$0();
                break;
            case 14:
                ((WebPlayerView.ControlsView) this.f$0).lambda$new$0();
                break;
            case 15:
                AIEditorAlert.lambda$showStylesLimitToast$21((BulletinFactory) this.f$0);
                break;
            case 16:
                AndroidUtilities.showKeyboard((EditText) this.f$0);
                break;
            case 17:
                AndroidUtilities.removeFromParent((HintView2) this.f$0);
                break;
            case 18:
                ((AnimatedEmojiDrawable.EmojiDocumentFetcher) this.f$0).lambda$fetchDocument$0();
                break;
            case 19:
                ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) this.f$0).invalidate();
                break;
            case 20:
                ((SpringAnimation) this.f$0).start();
                break;
            case 21:
                ((AnimatedTextView) this.f$0).lambda$new$0();
                break;
            case 22:
                ((AutoDeletePopupWrapper) this.f$0).lambda$allowExtendedHint$8();
                break;
            case 23:
                ((BlurBehindDrawable.BlurBackgroundTask) this.f$0).lambda$run$0();
                break;
            case 24:
                ((BlurringShader) this.f$0).lambda$new$0();
                break;
            case 25:
                ((BlurringShader.BlurManager) this.f$0).invalidateFallbackBlur();
                break;
            case 26:
                ((CapsuleBlobDrawable) this.f$0).lambda$new$1();
                break;
            case 27:
                ((CaptionPhotoViewer) this.f$0).lambda$new$5();
                break;
            case 28:
                ((Dialog) this.f$0).dismiss();
                break;
            default:
                ((ChatActivityEnterView.ControlsView) this.f$0).lambda$onTouchEvent$4();
                break;
        }
    }
}
