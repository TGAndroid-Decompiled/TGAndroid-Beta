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
import org.telegram.ui.Components.bi0;
public final class q2 extends View {
    public ValueAnimator D;
    public final x0 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public bi0 f31590a;
    public bi0 f31591b;
    public bi0 f31592c;
    public final Paint d;
    public final Paint e;
    public final Paint f31593f;
    public final Path h;
    public final int f31594n;
    public int f31595r;
    public int f31596s;
    public boolean f31597w;
    public int f31598x;
    public p2 f31599y;

    public q2(Context context, x0 x0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f31593f = paint3;
        this.h = new Path();
        int L = org.telegram.messenger.i0.L(26.0f);
        this.f31594n = L;
        this.f31595r = L;
        this.f31596s = 0;
        this.f31597w = false;
        this.f31598x = 0;
        this.G = 1.0f;
        this.E = x0Var;
        x0Var.a(this);
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
        ofFloat.addUpdateListener(new n2(this, 0));
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
        int i11 = this.f31594n;
        if (z11) {
            if (this.f31592c != null) {
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
                ofInt.addUpdateListener(new n2(this, 1));
                this.D.setDuration(200L);
                this.D.start();
                if (i10 == 2) {
                    this.f31592c.N(0, false, false);
                    this.f31592c.start();
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
                    this.f31595r = i11;
                    ofInt2.addUpdateListener(new n2(this, 2));
                    this.D.addListener(new o2(this, 0));
                    this.D.setDuration(200L);
                    this.D.start();
                    this.f31591b.N(0, false, false);
                    this.f31591b.start();
                } else {
                    this.f31596s = i11;
                    ofInt2.addUpdateListener(new n2(this, 3));
                    this.D.setDuration(200L);
                    this.D.addListener(new o2(this, 1));
                    this.D.start();
                }
            }
        } else if (z10) {
            this.f31596s = i11;
            this.f31595r = 0;
            this.f31598x = 100;
            if (i10 == 3 || i10 == 1) {
                bi0 bi0Var = this.f31591b;
                bi0Var.N(bi0Var.e[0] - 1, false, false);
            }
        } else {
            this.f31596s = 0;
            this.f31595r = i11;
            this.f31598x = 20;
        }
        this.f31597w = z10;
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
        x0 x0Var = this.E;
        int i12 = x0Var.f31757g;
        Paint paint = x0Var.f31759j;
        j2.f fVar = x0Var.f31753a;
        float f10 = x0Var.f31757g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        fVar.z(f12 - ((f11 - x0Var.f31756f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) fVar.f9349c).getHeight(), x0Var.h);
        x0Var.f31755c.x(f12, f13, x0Var.f31756f - x10, x0Var.f31757g - y3);
        bi0 bi0Var = this.f31592c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f31594n;
        if (bi0Var != null) {
            if (this.f31598x > 20) {
                Paint paint4 = this.f31593f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f31598x * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f31592c.q(canvas, paint3, false, 0L, 0);
                this.f31592c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!x0Var.f31758i) {
                paint = (Paint) fVar.f9347a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (x0Var.e) {
                canvas.drawCircle(width, height, f14, (Paint) x0Var.f31755c.f9347a);
            }
            this.f31592c.draw(canvas);
        } else if (this.f31591b != null && this.f31590a != null) {
            int i14 = this.f31595r;
            if (i14 == i13 && this.f31596s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f31596s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f31595r, paint3);
                this.f31591b.setAlpha(255);
                i10 = i13;
                this.f31591b.q(canvas, paint3, false, 0L, 0);
                this.f31591b.setAlpha(35);
                this.f31591b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f31595r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31595r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f31595r > 0) {
                float f15 = this.f31595r;
                if (!x0Var.f31758i) {
                    paint = (Paint) fVar.f9347a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (x0Var.e) {
                    canvas.drawCircle(width, height, this.f31595r, (Paint) x0Var.f31755c.f9347a);
                }
                this.f31590a.draw(canvas);
            }
            if (z11 || (this.f31596s > 0 && this.f31595r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f31596s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31596s, paint2);
                this.f31591b.setAlpha(255);
                this.f31591b.q(canvas, paint3, false, 0L, 0);
                this.f31591b.setAlpha(35);
                this.f31591b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        p2 p2Var;
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
                    int i10 = this.f31595r;
                    int i11 = this.f31594n;
                    if (i10 == i11 && this.f31596s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f31596s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (p2Var = this.f31599y) != null) {
                        p2Var.j(this);
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

    public void setOnBtnClickedListener(p2 p2Var) {
        this.f31599y = p2Var;
    }
}
