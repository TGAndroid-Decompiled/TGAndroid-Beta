package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class h5 extends Drawable {
    public final int f20488a;
    public Paint f20489b;

    public h5(int i10) {
        this.f20488a = i10;
        switch (i10) {
            case 1:
                this.f20489b = new Paint(1);
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f20488a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - AndroidUtilities.dp(1.0f), (getBounds().width() - AndroidUtilities.dp(8.0f)) / 2.0f, this.f20489b);
                return;
            default:
                Paint paint = this.f20489b;
                paint.setColor(j6.w0(null, j6.hl, false));
                canvas.drawRoundRect(getBounds().left, getBounds().exactCenterY() - AndroidUtilities.dp(14.0f), getBounds().right, AndroidUtilities.dp(14.0f) + getBounds().exactCenterY(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f20488a) {
            case 0:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f20488a) {
            case 0:
                this.f20489b.setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f20488a;
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
