package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class f5 extends Drawable {

    public final int f22939a;

    public Paint f22940b;

    public f5(int i10) {
        this.f22939a = i10;
        switch (i10) {
            case 1:
                this.f22940b = new Paint(1);
                break;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f22939a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - AndroidUtilities.dp(1.0f), (getBounds().width() - AndroidUtilities.dp(8.0f)) / 2.0f, this.f22940b);
                break;
            default:
                Paint paint = this.f22940b;
                paint.setColor(g6.w0(null, g6.hl, false));
                canvas.drawRoundRect(getBounds().left, getBounds().exactCenterY() - AndroidUtilities.dp(14.0f), getBounds().right, AndroidUtilities.dp(14.0f) + getBounds().exactCenterY(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                break;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f22939a) {
        }
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f22939a) {
            case 0:
                this.f22940b.setAlpha(i10);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f22939a;
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
