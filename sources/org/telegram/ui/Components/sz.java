package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class sz extends Drawable {
    public final int f38204a;
    public final Drawable f38205b;
    public final Paint f38206c;
    public final Paint d;
    public boolean f38207e;
    public final Object f38208f;

    public sz(Context context) {
        this.f38204a = 1;
        Paint paint = new Paint(1);
        this.f38206c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f38208f = new u5(new gp(this, 29), 200L, xq.f40453g, 0);
        this.f38205b = k2.p1.g(context, 2131231171);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.566f));
        paint.setColor(-1);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(4.5f));
        paint2.setColor(-65536);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
    }

    public int b(float f10) {
        return org.telegram.messenger.g0.W1(f10, getBounds().left, getBounds().right);
    }

    public int c(float f10) {
        return org.telegram.messenger.g0.W1(f10, getBounds().top, getBounds().bottom);
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38204a) {
            case 0:
                Path path = (Path) this.f38208f;
                Drawable drawable = this.f38205b;
                if (path != null) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255);
                    drawable.setBounds(getBounds());
                    drawable.draw(canvas);
                    boolean z10 = this.f38207e;
                    Paint paint = this.f38206c;
                    if (z10) {
                        path.rewind();
                        path.moveTo(b(0.4871f), c(0.6025f));
                        path.lineTo(b(0.8974f), c(0.6025f));
                        path.lineTo(b(1.0f), c(0.7564f));
                        path.lineTo(b(0.8974f), c(0.9102f));
                        path.lineTo(b(0.4871f), c(0.9102f));
                        path.close();
                        this.f38207e = false;
                        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
                    }
                    canvas.drawPath(path, paint);
                    canvas.drawPath(path, this.d);
                    canvas.restore();
                    return;
                }
                drawable.setBounds(getBounds());
                drawable.draw(canvas);
                return;
            default:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                Drawable drawable2 = this.f38205b;
                drawable2.setBounds(bounds);
                drawable2.draw(canvas);
                float d = ((u5) this.f38208f).d(this.f38207e);
                if (d > 0.0f) {
                    float N = org.telegram.messenger.g0.N(0.783f);
                    float centerX = (bounds.centerX() - org.telegram.messenger.g0.L(9.0f)) + N;
                    float centerY = (bounds.centerY() - org.telegram.messenger.g0.L(9.0f)) + N;
                    float L = (org.telegram.messenger.g0.L(9.0f) + bounds.centerX()) - N;
                    float L2 = (org.telegram.messenger.g0.L(9.0f) + bounds.centerY()) - N;
                    if (this.f38207e) {
                        centerX = org.telegram.messenger.g0.T1(L, centerX, d);
                        centerY = org.telegram.messenger.g0.T1(L2, centerY, d);
                    } else {
                        L = org.telegram.messenger.g0.T1(centerX, L, d);
                        L2 = org.telegram.messenger.g0.T1(centerY, L2, d);
                    }
                    float f10 = centerX;
                    float f11 = centerY;
                    float f12 = L2;
                    float f13 = L;
                    canvas.drawLine(f10, f11, f13, f12, this.d);
                    Paint paint2 = this.f38206c;
                    paint2.setAlpha((int) (Math.min(1.0f, d * 10.0f) * 255.0f));
                    canvas.drawLine(f10, f11, f13, f12, paint2);
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f38204a) {
            case 0:
                return this.f38205b.getIntrinsicHeight();
            default:
                return org.telegram.messenger.g0.L(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f38204a) {
            case 0:
                return this.f38205b.getIntrinsicWidth();
            default:
                return org.telegram.messenger.g0.L(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f38204a) {
            case 0:
                return this.f38205b.getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f38204a) {
            case 0:
                this.f38205b.setAlpha(i3);
                return;
            default:
                this.f38205b.setAlpha(i3);
                return;
        }
    }

    @Override
    public void setBounds(int i3, int i10, int i11, int i12) {
        switch (this.f38204a) {
            case 0:
                super.setBounds(i3, i10, i11, i12);
                this.f38207e = true;
                return;
            default:
                super.setBounds(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f38204a) {
            case 0:
                this.f38205b.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public sz(Context context, int i3, int i10) {
        this.f38204a = 0;
        this.f38207e = true;
        this.f38205b = context.getResources().getDrawable(i3);
        if (i10 >= 0) {
            this.f38208f = new Path();
            Paint paint = new Paint(1);
            this.f38206c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.0f)));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL);
            int[] iArr = org.telegram.ui.ActionBar.k6.f28142r8;
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, iArr[i10 % iArr.length], false));
            paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(1.0f)));
            return;
        }
        this.f38208f = null;
        this.f38206c = null;
        this.d = null;
    }

    private final void a(ColorFilter colorFilter) {
    }
}
