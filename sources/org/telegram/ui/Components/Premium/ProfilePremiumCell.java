package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Stars.StarsReactionsSheet;

public final class ProfilePremiumCell extends TextCell {
    public final int colorKey;
    public final PasscodeView$9$$ExternalSyntheticLambda0 invalidateRunnable;
    public final StarsReactionsSheet.Particles particles;

    public ProfilePremiumCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(23, context, resourcesProvider, false, false);
        this.particles = new StarsReactionsSheet.Particles(1, 15);
        this.invalidateRunnable = new PasscodeView$9$$ExternalSyntheticLambda0(this, 17);
        this.colorKey = i == 1 ? Theme.key_starsGradient1 : Theme.key_premiumGradient2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean zIsEnabled = LiteMode.isEnabled(131072);
        PasscodeView$9$$ExternalSyntheticLambda0 passcodeView$9$$ExternalSyntheticLambda0 = this.invalidateRunnable;
        if (zIsEnabled) {
            StarsReactionsSheet.Particles particles = this.particles;
            particles.process();
            particles.draw(canvas, Theme.getColor(null, this.colorKey, false), 1.0f);
            Choreographer60FpsContent.getInstance().addFrameCallback(15, passcodeView$9$$ExternalSyntheticLambda0);
        } else {
            Choreographer60FpsContent.getInstance().removeFrameCallback(passcodeView$9$$ExternalSyntheticLambda0);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Choreographer60FpsContent.getInstance().removeFrameCallback(this.invalidateRunnable);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RLottieImageView rLottieImageView = this.imageView;
        float width = (rLottieImageView.getWidth() / 2.0f) + rLottieImageView.getX();
        float height = ((rLottieImageView.getHeight() / 2.0f) + (rLottieImageView.getY() + rLottieImageView.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        StarsReactionsSheet.Particles particles = this.particles;
        particles.bounds.set(rectF);
        particles.removeParticlesOutside();
    }
}
