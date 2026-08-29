package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class q0 extends Drawable {
    public final int f41496a;
    public final Bitmap f41497b;
    public final Paint f41498c;

    public q0(Bitmap bitmap, Paint paint, int i10) {
        this.f41496a = i10;
        this.f41497b = bitmap;
        this.f41498c = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f41496a) {
            case 0:
                Bitmap bitmap = this.f41497b;
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    canvas.scale(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f41498c);
                    canvas.restore();
                    return;
                }
                return;
            default:
                Bitmap bitmap2 = this.f41497b;
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    canvas.scale(getBounds().width() / bitmap2.getWidth(), getBounds().height() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.f41498c);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f41496a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f41496a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f41496a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f41496a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f41496a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
