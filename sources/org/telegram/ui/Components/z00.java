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
public final class z00 extends Drawable {
    public final Drawable f35166a;
    public final Path f35167b;
    public boolean f35168c = true;
    public final Paint d;
    public final Paint f35169e;

    public z00(Context context, int i10, int i11) {
        this.f35166a = context.getResources().getDrawable(i10);
        if (i11 >= 0) {
            this.f35167b = new Path();
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint paint2 = new Paint(1);
            this.f35169e = paint2;
            paint2.setStyle(Paint.Style.FILL);
            int[] iArr = org.telegram.ui.ActionBar.g6.f23312r8;
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, iArr[i11 % iArr.length], false));
            paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
            return;
        }
        this.f35167b = null;
        this.d = null;
        this.f35169e = null;
    }

    public final int a(float f9) {
        return AndroidUtilities.lerp(getBounds().left, getBounds().right, f9);
    }

    public final int b(float f9) {
        return AndroidUtilities.lerp(getBounds().top, getBounds().bottom, f9);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f35166a;
        Path path = this.f35167b;
        if (path != null) {
            canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255);
            drawable.setBounds(getBounds());
            drawable.draw(canvas);
            boolean z10 = this.f35168c;
            Paint paint = this.d;
            if (z10) {
                path.rewind();
                path.moveTo(a(0.4871f), b(0.6025f));
                path.lineTo(a(0.8974f), b(0.6025f));
                path.lineTo(a(1.0f), b(0.7564f));
                path.lineTo(a(0.8974f), b(0.9102f));
                path.lineTo(a(0.4871f), b(0.9102f));
                path.close();
                this.f35168c = false;
                paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            canvas.drawPath(path, paint);
            canvas.drawPath(path, this.f35169e);
            canvas.restore();
            return;
        }
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f35166a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f35166a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f35166a.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f35166a.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f35168c = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35166a.setColorFilter(colorFilter);
    }
}
