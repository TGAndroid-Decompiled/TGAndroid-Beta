package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Stars.StarsReactionsSheet;

public final class ProfilePremiumCell extends TextCell {
    public final int colorKey;
    public final PremiumButtonView$$ExternalSyntheticLambda1 invalidateRunnable;
    public final StarsReactionsSheet.Particles particles;

    public ProfilePremiumCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(23, context, resourcesProvider, false, false);
        this.particles = new StarsReactionsSheet.Particles(1, 15);
        this.invalidateRunnable = new PremiumButtonView$$ExternalSyntheticLambda1(this, 4);
        this.colorKey = i == 1 ? Theme.key_starsGradient1 : Theme.key_premiumGradient2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean zIsEnabled = LiteMode.isEnabled(131072);
        PremiumButtonView$$ExternalSyntheticLambda1 premiumButtonView$$ExternalSyntheticLambda1 = this.invalidateRunnable;
        if (zIsEnabled) {
            StarsReactionsSheet.Particles particles = this.particles;
            particles.process();
            particles.draw(canvas, Theme.getColor(null, this.colorKey, false), 1.0f);
            Choreographer60FpsContent.getInstance().addFrameCallback(15, premiumButtonView$$ExternalSyntheticLambda1);
        } else {
            Choreographer60FpsContent.getInstance().removeFrameCallback(premiumButtonView$$ExternalSyntheticLambda1);
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
        float width = (this.imageView.getWidth() / 2.0f) + this.imageView.getX();
        float height = ((this.imageView.getHeight() / 2.0f) + (this.imageView.getY() + this.imageView.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        StarsReactionsSheet.Particles particles = this.particles;
        particles.bounds.set(rectF);
        particles.removeParticlesOutside();
    }
}
