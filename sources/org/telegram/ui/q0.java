package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class q0 extends Drawable {

    public final int f41468a;

    public final Bitmap f41469b;

    public final Paint f41470c;

    public q0(Bitmap bitmap, Paint paint, int i10) {
        this.f41468a = i10;
        this.f41469b = bitmap;
        this.f41470c = paint;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f41468a) {
            case 0:
                Bitmap bitmap = this.f41469b;
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    canvas.scale(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f41470c);
                    canvas.restore();
                }
                break;
            default:
                Bitmap bitmap2 = this.f41469b;
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    canvas.scale(getBounds().width() / bitmap2.getWidth(), getBounds().height() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.f41470c);
                    canvas.restore();
                }
                break;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f41468a) {
            case 0:
                break;
        }
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f41468a) {
            case 0:
                break;
        }
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        switch (this.f41468a) {
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f41468a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f41468a;
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
