package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.utils.FrameTickScheduler;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Stars.StarsReactionsSheet;

public class ProfilePremiumCell extends TextCell {
    private final int colorKey;
    private final Runnable invalidateRunnable;
    private final StarsReactionsSheet.Particles particles;

    public ProfilePremiumCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.particles = new StarsReactionsSheet.Particles(1, 15);
        this.invalidateRunnable = new Runnable() {
            @Override
            public final void run() {
                ProfilePremiumCell.this.invalidate();
            }
        };
        this.colorKey = i == 1 ? Theme.key_starsGradient1 : Theme.key_premiumGradient2;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float x = this.imageView.getX() + (this.imageView.getWidth() / 2.0f);
        float paddingTop = ((this.imageView.getPaddingTop() + this.imageView.getY()) + (this.imageView.getHeight() / 2.0f)) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(x - AndroidUtilities.dp(16.0f), paddingTop - AndroidUtilities.dp(16.0f), x + AndroidUtilities.dp(16.0f), paddingTop + AndroidUtilities.dp(16.0f));
        this.particles.setBounds(rectF);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (LiteMode.isEnabled(131072)) {
            this.particles.process();
            this.particles.draw(canvas, Theme.getColor(this.colorKey));
            FrameTickScheduler.subscribe(this.invalidateRunnable, 15);
        } else {
            FrameTickScheduler.unsubscribe(this.invalidateRunnable);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FrameTickScheduler.unsubscribe(this.invalidateRunnable);
    }
}
