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
import org.telegram.ui.Components.oh0;
public final class d3 extends View {
    public ValueAnimator E;
    public final l1 F;
    public ValueAnimator G;
    public float H;
    public float I;
    public float J;
    public oh0 f40961a;
    public oh0 f40962b;
    public oh0 f40963c;
    public final Paint d;
    public final Paint f40964e;
    public final Paint f40965f;
    public final Path h;
    public final int f40966n;
    public int f40967r;
    public int f40968s;
    public boolean f40969w;
    public int f40970x;
    public c3 f40971y;

    public d3(Context context, l1 l1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f40964e = paint2;
        Paint paint3 = new Paint(1);
        this.f40965f = paint3;
        this.h = new Path();
        int L = org.telegram.messenger.g0.L(26.0f);
        this.f40966n = L;
        this.f40967r = L;
        this.f40968s = 0;
        this.f40969w = false;
        this.f40970x = 0;
        this.H = 1.0f;
        this.F = l1Var;
        l1Var.a(this);
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
        ofFloat.addUpdateListener(new a3(this, 0));
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
        int i10 = this.f40966n;
        if (z11) {
            if (this.f40963c != null) {
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
                ofInt.addUpdateListener(new a3(this, 1));
                this.E.setDuration(200L);
                this.E.start();
                if (i7 == 2) {
                    this.f40963c.N(0, false, false);
                    this.f40963c.start();
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
                    this.f40967r = i10;
                    ofInt2.addUpdateListener(new a3(this, 2));
                    this.E.addListener(new b3(this, 0));
                    this.E.setDuration(200L);
                    this.E.start();
                    this.f40962b.N(0, false, false);
                    this.f40962b.start();
                } else {
                    this.f40968s = i10;
                    ofInt2.addUpdateListener(new a3(this, 3));
                    this.E.setDuration(200L);
                    this.E.addListener(new b3(this, 1));
                    this.E.start();
                }
            }
        } else if (z10) {
            this.f40968s = i10;
            this.f40967r = 0;
            this.f40970x = 100;
            if (i7 == 3 || i7 == 1) {
                oh0 oh0Var = this.f40962b;
                oh0Var.N(oh0Var.f38210e[0] - 1, false, false);
            }
        } else {
            this.f40968s = 0;
            this.f40967r = i10;
            this.f40970x = 20;
        }
        this.f40969w = z10;
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
        l1 l1Var = this.F;
        int i11 = l1Var.f41159g;
        Paint paint = l1Var.f41161j;
        b8 b8Var = l1Var.f41154a;
        float f11 = l1Var.f41159g;
        float f12 = 1.12f * f11;
        float f13 = -x10;
        float f14 = -y10;
        b8Var.m(f13 - ((f12 - l1Var.f41158f) / 2.0f), f14 - ((f12 - f11) / 2.0f), (i11 * 1.12f) / ((Bitmap) b8Var.f343c).getHeight(), l1Var.h);
        l1Var.f41156c.k(f13, f14, l1Var.f41158f - x10, l1Var.f41159g - y10);
        oh0 oh0Var = this.f40963c;
        Paint paint2 = this.f40964e;
        Paint paint3 = this.d;
        int i12 = this.f40966n;
        if (oh0Var != null) {
            if (this.f40970x > 20) {
                Paint paint4 = this.f40965f;
                paint4.setAlpha((int) ((i10 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f40970x * 255) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.f40963c.q(canvas, paint3, false, 0L, 0);
                this.f40963c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f15 = i12;
            if (!l1Var.f41160i) {
                paint = (Paint) b8Var.f341a;
            }
            canvas.drawCircle(width, height, f15, paint);
            if (l1Var.f41157e) {
                canvas.drawCircle(width, height, f15, (Paint) l1Var.f41156c.f341a);
            }
            this.f40963c.draw(canvas);
        } else if (this.f40962b != null && this.f40961a != null) {
            int i13 = this.f40967r;
            if (i13 == i12 && this.f40968s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = this.f40968s;
            if (i14 == i12 && i13 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i14 == i12 && i13 > 0 && i13 != i12) {
                canvas.drawCircle(width, height, i14, paint2);
                canvas.drawCircle(width, height, this.f40967r, paint3);
                this.f40962b.setAlpha(255);
                i7 = i12;
                this.f40962b.q(canvas, paint3, false, 0L, 0);
                this.f40962b.setAlpha(35);
                this.f40962b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f40967r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f40967r, paint3);
            } else {
                i7 = i12;
                path = path2;
            }
            if (z10 || this.f40967r > 0) {
                float f16 = this.f40967r;
                if (!l1Var.f41160i) {
                    paint = (Paint) b8Var.f341a;
                }
                canvas.drawCircle(width, height, f16, paint);
                if (l1Var.f41157e) {
                    canvas.drawCircle(width, height, this.f40967r, (Paint) l1Var.f41156c.f341a);
                }
                this.f40961a.draw(canvas);
            }
            if (z11 || (this.f40968s > 0 && this.f40967r == i7)) {
                path.reset();
                path.addCircle(width, height, this.f40968s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f40968s, paint2);
                this.f40962b.setAlpha(255);
                this.f40962b.q(canvas, paint3, false, 0L, 0);
                this.f40962b.setAlpha(35);
                this.f40962b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        c3 c3Var;
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
                    int i7 = this.f40967r;
                    int i10 = this.f40966n;
                    if (i7 == i10 && this.f40968s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f40968s == i10 && i7 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (c3Var = this.f40971y) != null) {
                        c3Var.g(this);
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

    public void setOnBtnClickedListener(c3 c3Var) {
        this.f40971y = c3Var;
    }
}
