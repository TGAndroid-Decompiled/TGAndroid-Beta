package org.telegram.ui.Components.voip;

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
import org.telegram.ui.Components.ci0;
public final class r2 extends View {
    public ValueAnimator D;
    public final y0 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public ci0 f31702a;
    public ci0 f31703b;
    public ci0 f31704c;
    public final Paint d;
    public final Paint e;
    public final Paint f31705f;
    public final Path h;
    public final int f31706n;
    public int f31707r;
    public int f31708s;
    public boolean f31709w;
    public int f31710x;
    public q2 f31711y;

    public r2(Context context, y0 y0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f31705f = paint3;
        this.h = new Path();
        int L = org.telegram.messenger.i0.L(26.0f);
        this.f31706n = L;
        this.f31707r = L;
        this.f31708s = 0;
        this.f31709w = false;
        this.f31710x = 0;
        this.G = 1.0f;
        this.E = y0Var;
        y0Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.G;
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new o2(this, 0));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void a(int i10, boolean z10, boolean z11) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.D.removeAllUpdateListeners();
            this.D.cancel();
            z11 = false;
        }
        int i11 = this.f31706n;
        if (z11) {
            if (this.f31704c != null) {
                ValueAnimator valueAnimator2 = this.D;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.D.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.D = ofInt;
                ofInt.addUpdateListener(new o2(this, 1));
                this.D.setDuration(200L);
                this.D.start();
                if (i10 == 2) {
                    this.f31704c.N(0, false, false);
                    this.f31704c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.D;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.D.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.D = ofInt2;
                if (z10) {
                    this.f31707r = i11;
                    ofInt2.addUpdateListener(new o2(this, 2));
                    this.D.addListener(new p2(this, 0));
                    this.D.setDuration(200L);
                    this.D.start();
                    this.f31703b.N(0, false, false);
                    this.f31703b.start();
                } else {
                    this.f31708s = i11;
                    ofInt2.addUpdateListener(new o2(this, 3));
                    this.D.setDuration(200L);
                    this.D.addListener(new p2(this, 1));
                    this.D.start();
                }
            }
        } else if (z10) {
            this.f31708s = i11;
            this.f31707r = 0;
            this.f31710x = 100;
            if (i10 == 3 || i10 == 1) {
                ci0 ci0Var = this.f31703b;
                ci0Var.N(ci0Var.e[0] - 1, false, false);
            }
        } else {
            this.f31708s = 0;
            this.f31707r = i11;
            this.f31710x = 20;
        }
        this.f31709w = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        int i10;
        Path path;
        int i11;
        canvas.save();
        float f7 = this.G;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) ((View) getParent()).getParent()).getY() + getY();
        y0 y0Var = this.E;
        int i12 = y0Var.f31837g;
        Paint paint = y0Var.f31839j;
        j2.f fVar = y0Var.f31833a;
        float f10 = y0Var.f31837g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        fVar.z(f12 - ((f11 - y0Var.f31836f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) fVar.f9350c).getHeight(), y0Var.h);
        y0Var.f31835c.x(f12, f13, y0Var.f31836f - x10, y0Var.f31837g - y3);
        ci0 ci0Var = this.f31704c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f31706n;
        if (ci0Var != null) {
            if (this.f31710x > 20) {
                Paint paint4 = this.f31705f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f31710x * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f31704c.q(canvas, paint3, false, 0L, 0);
                this.f31704c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!y0Var.f31838i) {
                paint = (Paint) fVar.f9348a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (y0Var.e) {
                canvas.drawCircle(width, height, f14, (Paint) y0Var.f31835c.f9348a);
            }
            this.f31704c.draw(canvas);
        } else if (this.f31703b != null && this.f31702a != null) {
            int i14 = this.f31707r;
            if (i14 == i13 && this.f31708s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f31708s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f31707r, paint3);
                this.f31703b.setAlpha(255);
                i10 = i13;
                this.f31703b.q(canvas, paint3, false, 0L, 0);
                this.f31703b.setAlpha(35);
                this.f31703b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f31707r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31707r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f31707r > 0) {
                float f15 = this.f31707r;
                if (!y0Var.f31838i) {
                    paint = (Paint) fVar.f9348a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (y0Var.e) {
                    canvas.drawCircle(width, height, this.f31707r, (Paint) y0Var.f31835c.f9348a);
                }
                this.f31702a.draw(canvas);
            }
            if (z11 || (this.f31708s > 0 && this.f31707r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f31708s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31708s, paint2);
                this.f31703b.setAlpha(255);
                this.f31703b.q(canvas, paint3, false, 0L, 0);
                this.f31703b.setAlpha(35);
                this.f31703b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        q2 q2Var;
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
                float y3 = motionEvent.getY();
                float f7 = this.H;
                float f10 = this.I;
                float abs = Math.abs(f7 - x10);
                float abs2 = Math.abs(f10 - y3);
                if (abs <= org.telegram.messenger.i0.L(48.0f) && abs2 <= org.telegram.messenger.i0.L(48.0f)) {
                    int i10 = this.f31707r;
                    int i11 = this.f31706n;
                    if (i10 == i11 && this.f31708s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f31708s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (q2Var = this.f31711y) != null) {
                        q2Var.j(this);
                    }
                }
            }
            return true;
        }
        setPressedBtn(true);
        this.H = motionEvent.getX();
        this.I = motionEvent.getY();
        return true;
    }

    public void setOnBtnClickedListener(q2 q2Var) {
        this.f31711y = q2Var;
    }
}
