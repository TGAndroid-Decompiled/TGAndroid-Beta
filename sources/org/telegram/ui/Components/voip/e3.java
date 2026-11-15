package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ch0;
public final class e3 extends View {
    public ValueAnimator E;
    public final m1 F;
    public ValueAnimator G;
    public float H;
    public float I;
    public float J;
    public ch0 f40592a;
    public ch0 f40593b;
    public ch0 f40594c;
    public final Paint d;
    public final Paint f40595e;
    public final Paint f40596f;
    public final Path h;
    public final int f40597n;
    public int f40598r;
    public int f40599s;
    public boolean f40600w;
    public int f40601x;
    public d3 f40602y;

    public e3(Context context, m1 m1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f40595e = paint2;
        Paint paint3 = new Paint(1);
        this.f40596f = paint3;
        this.h = new Path();
        int L = org.telegram.messenger.g0.L(26.0f);
        this.f40597n = L;
        this.f40598r = L;
        this.f40599s = 0;
        this.f40600w = false;
        this.f40601x = 0;
        this.H = 1.0f;
        this.F = m1Var;
        m1Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.H;
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 0));
        this.G.setDuration(150L);
        this.G.start();
    }

    public final void a(int i7, boolean z10, boolean z11) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.E.removeAllUpdateListeners();
            this.E.cancel();
            z11 = false;
        }
        int i10 = this.f40597n;
        if (z11) {
            if (this.f40594c != null) {
                ValueAnimator valueAnimator2 = this.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.E.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.E = ofInt;
                ofInt.addUpdateListener(new b3(this, 1));
                this.E.setDuration(200L);
                this.E.start();
                if (i7 == 2) {
                    this.f40594c.N(0, false, false);
                    this.f40594c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.E;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.E.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i10);
                this.E = ofInt2;
                if (z10) {
                    this.f40598r = i10;
                    ofInt2.addUpdateListener(new b3(this, 2));
                    this.E.addListener(new c3(this, 0));
                    this.E.setDuration(200L);
                    this.E.start();
                    this.f40593b.N(0, false, false);
                    this.f40593b.start();
                } else {
                    this.f40599s = i10;
                    ofInt2.addUpdateListener(new b3(this, 3));
                    this.E.setDuration(200L);
                    this.E.addListener(new c3(this, 1));
                    this.E.start();
                }
            }
        } else if (z10) {
            this.f40599s = i10;
            this.f40598r = 0;
            this.f40601x = 100;
            if (i7 == 3 || i7 == 1) {
                ch0 ch0Var = this.f40593b;
                ch0Var.N(ch0Var.f33579e[0] - 1, false, false);
            }
        } else {
            this.f40599s = 0;
            this.f40598r = i10;
            this.f40601x = 20;
        }
        this.f40600w = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        int i7;
        Path path;
        int i10;
        canvas.save();
        float f10 = this.H;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        m1 m1Var = this.F;
        int i11 = m1Var.f40783g;
        Paint paint = m1Var.f40785j;
        b8 b8Var = m1Var.f40778a;
        float f11 = m1Var.f40783g;
        float f12 = 1.12f * f11;
        float f13 = -x10;
        float f14 = -y10;
        b8Var.m(f13 - ((f12 - m1Var.f40782f) / 2.0f), f14 - ((f12 - f11) / 2.0f), (i11 * 1.12f) / ((Bitmap) b8Var.f343c).getHeight(), m1Var.h);
        m1Var.f40780c.k(f13, f14, m1Var.f40782f - x10, m1Var.f40783g - y10);
        ch0 ch0Var = this.f40594c;
        Paint paint2 = this.f40595e;
        Paint paint3 = this.d;
        int i12 = this.f40597n;
        if (ch0Var != null) {
            if (this.f40601x > 20) {
                Paint paint4 = this.f40596f;
                paint4.setAlpha((int) ((i10 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f40601x * 255) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.f40594c.q(canvas, paint3, false, 0L, 0);
                this.f40594c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f15 = i12;
            if (!m1Var.f40784i) {
                paint = (Paint) b8Var.f341a;
            }
            canvas.drawCircle(width, height, f15, paint);
            if (m1Var.f40781e) {
                canvas.drawCircle(width, height, f15, (Paint) m1Var.f40780c.f341a);
            }
            this.f40594c.draw(canvas);
        } else if (this.f40593b != null && this.f40592a != null) {
            int i13 = this.f40598r;
            if (i13 == i12 && this.f40599s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = this.f40599s;
            if (i14 == i12 && i13 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i14 == i12 && i13 > 0 && i13 != i12) {
                canvas.drawCircle(width, height, i14, paint2);
                canvas.drawCircle(width, height, this.f40598r, paint3);
                this.f40593b.setAlpha(255);
                i7 = i12;
                this.f40593b.q(canvas, paint3, false, 0L, 0);
                this.f40593b.setAlpha(35);
                this.f40593b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f40598r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f40598r, paint3);
            } else {
                i7 = i12;
                path = path2;
            }
            if (z10 || this.f40598r > 0) {
                float f16 = this.f40598r;
                if (!m1Var.f40784i) {
                    paint = (Paint) b8Var.f341a;
                }
                canvas.drawCircle(width, height, f16, paint);
                if (m1Var.f40781e) {
                    canvas.drawCircle(width, height, this.f40598r, (Paint) m1Var.f40780c.f341a);
                }
                this.f40592a.draw(canvas);
            }
            if (z11 || (this.f40599s > 0 && this.f40598r == i7)) {
                path.reset();
                path.addCircle(width, height, this.f40599s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f40599s, paint2);
                this.f40593b.setAlpha(255);
                this.f40593b.q(canvas, paint3, false, 0L, 0);
                this.f40593b.setAlpha(35);
                this.f40593b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        d3 d3Var;
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z11 = false;
            if (action != 1) {
                if (action == 3) {
                    setPressedBtn(false);
                    return true;
                }
            } else {
                setPressedBtn(false);
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f10 = this.I;
                float f11 = this.J;
                float abs = Math.abs(f10 - x10);
                float abs2 = Math.abs(f11 - y10);
                if (abs <= org.telegram.messenger.g0.L(48.0f) && abs2 <= org.telegram.messenger.g0.L(48.0f)) {
                    int i7 = this.f40598r;
                    int i10 = this.f40597n;
                    if (i7 == i10 && this.f40599s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f40599s == i10 && i7 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (d3Var = this.f40602y) != null) {
                        d3Var.d(this);
                    }
                }
            }
            return true;
        }
        setPressedBtn(true);
        this.I = motionEvent.getX();
        this.J = motionEvent.getY();
        return true;
    }

    public void setOnBtnClickedListener(d3 d3Var) {
        this.f40602y = d3Var;
    }
}
