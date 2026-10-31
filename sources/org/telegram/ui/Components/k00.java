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
public final class k00 extends Drawable {
    public final int f27588a;
    public final Drawable f27589b;
    public final Paint f27590c;
    public final Paint d;
    public boolean e;
    public final Object f27591f;

    public k00(Context context) {
        this.f27588a = 1;
        Paint paint = new Paint(1);
        this.f27590c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f27591f = new t5(new eb0(this, 2), 200L, gr.f26496g, 0);
        this.f27589b = i0.a.f(context, 2131231171);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.566f));
        paint.setColor(-1);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(4.5f));
        paint2.setColor(-65536);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
    }

    public int b(float f7) {
        return org.telegram.messenger.i0.W1(f7, getBounds().left, getBounds().right);
    }

    public int c(float f7) {
        return org.telegram.messenger.i0.W1(f7, getBounds().top, getBounds().bottom);
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f27588a) {
            case 0:
                Path path = (Path) this.f27591f;
                Drawable drawable = this.f27589b;
                if (path != null) {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255);
                    drawable.setBounds(getBounds());
                    drawable.draw(canvas);
                    boolean z10 = this.e;
                    Paint paint = this.f27590c;
                    if (z10) {
                        path.rewind();
                        path.moveTo(b(0.4871f), c(0.6025f));
                        path.lineTo(b(0.8974f), c(0.6025f));
                        path.lineTo(b(1.0f), c(0.7564f));
                        path.lineTo(b(0.8974f), c(0.9102f));
                        path.lineTo(b(0.4871f), c(0.9102f));
                        path.close();
                        this.e = false;
                        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
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
                Drawable drawable2 = this.f27589b;
                drawable2.setBounds(bounds);
                drawable2.draw(canvas);
                float d = ((t5) this.f27591f).d(this.e);
                if (d > 0.0f) {
                    float N = org.telegram.messenger.i0.N(0.783f);
                    float centerX = (bounds.centerX() - org.telegram.messenger.i0.L(9.0f)) + N;
                    float centerY = (bounds.centerY() - org.telegram.messenger.i0.L(9.0f)) + N;
                    float L = (org.telegram.messenger.i0.L(9.0f) + bounds.centerX()) - N;
                    float L2 = (org.telegram.messenger.i0.L(9.0f) + bounds.centerY()) - N;
                    if (this.e) {
                        centerX = org.telegram.messenger.i0.T1(L, centerX, d);
                        centerY = org.telegram.messenger.i0.T1(L2, centerY, d);
                    } else {
                        L = org.telegram.messenger.i0.T1(centerX, L, d);
                        L2 = org.telegram.messenger.i0.T1(centerY, L2, d);
                    }
                    float f7 = centerX;
                    float f10 = centerY;
                    float f11 = L2;
                    float f12 = L;
                    canvas.drawLine(f7, f10, f12, f11, this.d);
                    Paint paint2 = this.f27590c;
                    paint2.setAlpha((int) (Math.min(1.0f, d * 10.0f) * 255.0f));
                    canvas.drawLine(f7, f10, f12, f11, paint2);
                }
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f27588a) {
            case 0:
                return this.f27589b.getIntrinsicHeight();
            default:
                return org.telegram.messenger.i0.L(24.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f27588a) {
            case 0:
                return this.f27589b.getIntrinsicWidth();
            default:
                return org.telegram.messenger.i0.L(24.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f27588a) {
            case 0:
                return this.f27589b.getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f27588a) {
            case 0:
                this.f27589b.setAlpha(i10);
                return;
            default:
                this.f27589b.setAlpha(i10);
                return;
        }
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f27588a) {
            case 0:
                super.setBounds(i10, i11, i12, i13);
                this.e = true;
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f27588a) {
            case 0:
                this.f27589b.setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public k00(Context context, int i10, int i11) {
        this.f27588a = 0;
        this.e = true;
        this.f27589b = context.getResources().getDrawable(i10);
        if (i11 >= 0) {
            this.f27591f = new Path();
            Paint paint = new Paint(1);
            this.f27590c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(1.0f)));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint paint2 = new Paint(1);
            this.d = paint2;
            paint2.setStyle(Paint.Style.FILL);
            int[] iArr = org.telegram.ui.ActionBar.t6.f21188r8;
            paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, iArr[i11 % iArr.length], false));
            paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(1.0f)));
            return;
        }
        this.f27591f = null;
        this.f27590c = null;
        this.d = null;
    }

    private final void a(ColorFilter colorFilter) {
    }
}
