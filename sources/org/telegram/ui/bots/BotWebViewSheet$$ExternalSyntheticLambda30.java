package org.telegram.ui.bots;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ArticleViewer;

public final class BotWebViewSheet$$ExternalSyntheticLambda30 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final BotWebViewSheet f$0;
    public final int f$1;
    public final int f$2;

    public BotWebViewSheet$$ExternalSyntheticLambda30(BotWebViewSheet botWebViewSheet, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = botWebViewSheet;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewSheet botWebViewSheet = this.f$0;
                Paint paint = botWebViewSheet.backgroundPaint;
                paint.setColor(ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f$1, this.f$2));
                botWebViewSheet.updateActionBarColors();
                botWebViewSheet.windowView.invalidate();
                ArticleViewer.ErrorContainer errorContainer = botWebViewSheet.errorContainer;
                if (errorContainer != null) {
                    errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f, false);
                    botWebViewSheet.errorContainer.setBackgroundColor(paint.getColor());
                }
                botWebViewSheet.updateWebViewBackgroundColor();
                break;
            default:
                BotWebViewSheet botWebViewSheet2 = this.f$0;
                botWebViewSheet2.getClass();
                botWebViewSheet2.navBarColor = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f$1, this.f$2);
                botWebViewSheet2.checkNavBarColor();
                break;
        }
    }
}
