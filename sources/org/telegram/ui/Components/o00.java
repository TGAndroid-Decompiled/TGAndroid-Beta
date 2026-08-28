package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class o00 extends Drawable {
    public final Drawable f31244a;
    public final Path f31245b;
    public boolean f31246c = true;
    public final Paint d;
    public final Paint f31247e;

    public o00(Context context, int i9, int i10) {
        this.f31244a = context.getResources().getDrawable(i9);
        if (i10 >= 0) {
            this.f31245b = new Path();
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint paint2 = new Paint(1);
            this.f31247e = paint2;
            paint2.setStyle(Paint.Style.FILL);
            int[] iArr = org.telegram.ui.ActionBar.f6.f23250r8;
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, iArr[i10 % iArr.length], false));
            paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
            return;
        }
        this.f31245b = null;
        this.d = null;
        this.f31247e = null;
    }

    public final int a(float f10) {
        return AndroidUtilities.lerp(getBounds().left, getBounds().right, f10);
    }

    public final int b(float f10) {
        return AndroidUtilities.lerp(getBounds().top, getBounds().bottom, f10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f31244a;
        Path path = this.f31245b;
        if (path != null) {
            canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255);
            drawable.setBounds(getBounds());
            drawable.draw(canvas);
            boolean z10 = this.f31246c;
            Paint paint = this.d;
            if (z10) {
                path.rewind();
                path.moveTo(a(0.4871f), b(0.6025f));
                path.lineTo(a(0.8974f), b(0.6025f));
                path.lineTo(a(1.0f), b(0.7564f));
                path.lineTo(a(0.8974f), b(0.9102f));
                path.lineTo(a(0.4871f), b(0.9102f));
                path.close();
                this.f31246c = false;
                paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            canvas.drawPath(path, paint);
            canvas.drawPath(path, this.f31247e);
            canvas.restore();
            return;
        }
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f31244a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f31244a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f31244a.getOpacity();
    }

    @Override
    public final void setAlpha(int i9) {
        this.f31244a.setAlpha(i9);
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        this.f31246c = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31244a.setColorFilter(colorFilter);
    }
}
