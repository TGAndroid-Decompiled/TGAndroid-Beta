package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class p0 extends Drawable {
    public final int f41297a;
    public final Bitmap f41298b;
    public final Paint f41299c;

    public p0(Bitmap bitmap, Paint paint, int i9) {
        this.f41297a = i9;
        this.f41298b = bitmap;
        this.f41299c = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f41297a) {
            case 0:
                Bitmap bitmap = this.f41298b;
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    canvas.scale(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f41299c);
                    canvas.restore();
                    return;
                }
                return;
            default:
                Bitmap bitmap2 = this.f41298b;
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    canvas.scale(getBounds().width() / bitmap2.getWidth(), getBounds().height() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.f41299c);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f41297a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f41297a) {
            case 0:
                return AndroidUtilities.dp(24.0f);
            default:
                return AndroidUtilities.dp(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f41297a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        int i10 = this.f41297a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.f41297a;
    }

    private final void a(int i9) {
    }

    private final void b(int i9) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
