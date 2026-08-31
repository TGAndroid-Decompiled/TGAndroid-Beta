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
public final class e10 extends Drawable {
    public final Drawable f26366a;
    public final Path f26367b;
    public boolean f26368c = true;
    public final Paint d;
    public final Paint f26369e;

    public e10(Context context, int i10, int i11) {
        this.f26366a = context.getResources().getDrawable(i10);
        if (i11 >= 0) {
            this.f26367b = new Path();
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint paint2 = new Paint(1);
            this.f26369e = paint2;
            paint2.setStyle(Paint.Style.FILL);
            int[] iArr = org.telegram.ui.ActionBar.k6.f21914r8;
            paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, iArr[i11 % iArr.length], false));
            paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
            return;
        }
        this.f26367b = null;
        this.d = null;
        this.f26369e = null;
    }

    public final int a(float f10) {
        return AndroidUtilities.lerp(getBounds().left, getBounds().right, f10);
    }

    public final int b(float f10) {
        return AndroidUtilities.lerp(getBounds().top, getBounds().bottom, f10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f26366a;
        Path path = this.f26367b;
        if (path != null) {
            canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255);
            drawable.setBounds(getBounds());
            drawable.draw(canvas);
            boolean z4 = this.f26368c;
            Paint paint = this.d;
            if (z4) {
                path.rewind();
                path.moveTo(a(0.4871f), b(0.6025f));
                path.lineTo(a(0.8974f), b(0.6025f));
                path.lineTo(a(1.0f), b(0.7564f));
                path.lineTo(a(0.8974f), b(0.9102f));
                path.lineTo(a(0.4871f), b(0.9102f));
                path.close();
                this.f26368c = false;
                paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
            canvas.drawPath(path, paint);
            canvas.drawPath(path, this.f26369e);
            canvas.restore();
            return;
        }
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f26366a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26366a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f26366a.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26366a.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f26368c = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26366a.setColorFilter(colorFilter);
    }
}
