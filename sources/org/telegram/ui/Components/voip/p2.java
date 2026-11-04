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
import org.telegram.ui.Components.ch0;
public final class p2 extends View {
    public ValueAnimator E;
    public final x0 F;
    public ValueAnimator G;
    public float H;
    public float I;
    public float J;
    public ch0 f39516a;
    public ch0 f39517b;
    public ch0 f39518c;
    public final Paint d;
    public final Paint f39519e;
    public final Paint f39520f;
    public final Path h;
    public final int f39521n;
    public int f39522r;
    public int f39523s;
    public boolean f39524w;
    public int f39525x;
    public o2 f39526y;

    public p2(Context context, x0 x0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f39519e = paint2;
        Paint paint3 = new Paint(1);
        this.f39520f = paint3;
        this.h = new Path();
        int L = org.telegram.messenger.g0.L(26.0f);
        this.f39521n = L;
        this.f39522r = L;
        this.f39523s = 0;
        this.f39524w = false;
        this.f39525x = 0;
        this.H = 1.0f;
        this.F = x0Var;
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
        ofFloat.addUpdateListener(new m2(this, 0));
        this.G.setDuration(150L);
        this.G.start();
    }

    public final void a(int i3, boolean z10, boolean z11) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.E.removeAllUpdateListeners();
            this.E.cancel();
            z11 = false;
        }
        int i10 = this.f39521n;
        if (z11) {
            if (this.f39518c != null) {
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
                ofInt.addUpdateListener(new m2(this, 1));
                this.E.setDuration(200L);
                this.E.start();
                if (i3 == 2) {
                    this.f39518c.N(0, false, false);
                    this.f39518c.start();
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
                    this.f39522r = i10;
                    ofInt2.addUpdateListener(new m2(this, 2));
                    this.E.addListener(new n2(this, 0));
                    this.E.setDuration(200L);
                    this.E.start();
                    this.f39517b.N(0, false, false);
                    this.f39517b.start();
                } else {
                    this.f39523s = i10;
                    ofInt2.addUpdateListener(new m2(this, 3));
                    this.E.setDuration(200L);
                    this.E.addListener(new n2(this, 1));
                    this.E.start();
                }
            }
        } else if (z10) {
            this.f39523s = i10;
            this.f39522r = 0;
            this.f39525x = 100;
            if (i3 == 3 || i3 == 1) {
                ch0 ch0Var = this.f39517b;
                ch0Var.N(ch0Var.f32725e[0] - 1, false, false);
            }
        } else {
            this.f39523s = 0;
            this.f39522r = i10;
            this.f39525x = 20;
        }
        this.f39524w = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        int i3;
        Path path;
        int i10;
        canvas.save();
        float f10 = this.H;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y9 = ((View) ((View) getParent()).getParent()).getY() + getY();
        x0 x0Var = this.F;
        int i11 = x0Var.f39709g;
        Paint paint = x0Var.f39711j;
        l2.e eVar = x0Var.f39704a;
        float f11 = x0Var.f39709g;
        float f12 = 1.12f * f11;
        float f13 = -x10;
        float f14 = -y9;
        eVar.o(f13 - ((f12 - x0Var.f39708f) / 2.0f), f14 - ((f12 - f11) / 2.0f), (i11 * 1.12f) / ((Bitmap) eVar.f17691c).getHeight(), x0Var.h);
        x0Var.f39706c.m(f13, f14, x0Var.f39708f - x10, x0Var.f39709g - y9);
        ch0 ch0Var = this.f39518c;
        Paint paint2 = this.f39519e;
        Paint paint3 = this.d;
        int i12 = this.f39521n;
        if (ch0Var != null) {
            if (this.f39525x > 20) {
                Paint paint4 = this.f39520f;
                paint4.setAlpha((int) ((i10 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f39525x * 255) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.f39518c.q(canvas, paint3, false, 0L, 0);
                this.f39518c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f15 = i12;
            if (!x0Var.f39710i) {
                paint = (Paint) eVar.f17689a;
            }
            canvas.drawCircle(width, height, f15, paint);
            if (x0Var.f39707e) {
                canvas.drawCircle(width, height, f15, (Paint) x0Var.f39706c.f17689a);
            }
            this.f39518c.draw(canvas);
        } else if (this.f39517b != null && this.f39516a != null) {
            int i13 = this.f39522r;
            if (i13 == i12 && this.f39523s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = this.f39523s;
            if (i14 == i12 && i13 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i14 == i12 && i13 > 0 && i13 != i12) {
                canvas.drawCircle(width, height, i14, paint2);
                canvas.drawCircle(width, height, this.f39522r, paint3);
                this.f39517b.setAlpha(255);
                i3 = i12;
                this.f39517b.q(canvas, paint3, false, 0L, 0);
                this.f39517b.setAlpha(35);
                this.f39517b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f39522r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f39522r, paint3);
            } else {
                i3 = i12;
                path = path2;
            }
            if (z10 || this.f39522r > 0) {
                float f16 = this.f39522r;
                if (!x0Var.f39710i) {
                    paint = (Paint) eVar.f17689a;
                }
                canvas.drawCircle(width, height, f16, paint);
                if (x0Var.f39707e) {
                    canvas.drawCircle(width, height, this.f39522r, (Paint) x0Var.f39706c.f17689a);
                }
                this.f39516a.draw(canvas);
            }
            if (z11 || (this.f39523s > 0 && this.f39522r == i3)) {
                path.reset();
                path.addCircle(width, height, this.f39523s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f39523s, paint2);
                this.f39517b.setAlpha(255);
                this.f39517b.q(canvas, paint3, false, 0L, 0);
                this.f39517b.setAlpha(35);
                this.f39517b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        o2 o2Var;
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
                float y9 = motionEvent.getY();
                float f10 = this.I;
                float f11 = this.J;
                float abs = Math.abs(f10 - x10);
                float abs2 = Math.abs(f11 - y9);
                if (abs <= org.telegram.messenger.g0.L(48.0f) && abs2 <= org.telegram.messenger.g0.L(48.0f)) {
                    int i3 = this.f39522r;
                    int i10 = this.f39521n;
                    if (i3 == i10 && this.f39523s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f39523s == i10 && i3 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (o2Var = this.f39526y) != null) {
                        o2Var.i(this);
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

    public void setOnBtnClickedListener(o2 o2Var) {
        this.f39526y = o2Var;
    }
}
