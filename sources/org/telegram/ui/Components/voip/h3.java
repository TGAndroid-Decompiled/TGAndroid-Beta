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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xi0;
public final class h3 extends View {
    public final o1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public xi0 f31557a;
    public xi0 f31558b;
    public xi0 f31559c;
    public final Paint d;
    public final Paint f31560e;
    public final Paint f31561f;
    public final Path h;
    public final int f31562n;
    public int f31563r;
    public int f31564s;
    public boolean v;
    public int f31565w;
    public g3 f31566x;
    public ValueAnimator f31567y;

    public h3(Context context, o1 o1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f31560e = paint2;
        Paint paint3 = new Paint(1);
        this.f31561f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f31562n = dp;
        this.f31563r = dp;
        this.f31564s = 0;
        this.v = false;
        this.f31565w = 0;
        this.G = 1.0f;
        this.E = o1Var;
        o1Var.a(this);
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
        ofFloat.addUpdateListener(new e3(this, 0));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void a(int i10, boolean z10, boolean z11) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.f31567y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f31567y.removeAllUpdateListeners();
            this.f31567y.cancel();
            z11 = false;
        }
        int i11 = this.f31562n;
        if (z11) {
            if (this.f31559c != null) {
                ValueAnimator valueAnimator2 = this.f31567y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f31567y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f31567y = ofInt;
                ofInt.addUpdateListener(new e3(this, 1));
                this.f31567y.setDuration(200L);
                this.f31567y.start();
                if (i10 == 2) {
                    this.f31559c.L(0, false, false);
                    this.f31559c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f31567y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f31567y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f31567y = ofInt2;
                if (z10) {
                    this.f31563r = i11;
                    ofInt2.addUpdateListener(new e3(this, 2));
                    this.f31567y.addListener(new f3(this, 0));
                    this.f31567y.setDuration(200L);
                    this.f31567y.start();
                    this.f31558b.L(0, false, false);
                    this.f31558b.start();
                } else {
                    this.f31564s = i11;
                    ofInt2.addUpdateListener(new e3(this, 3));
                    this.f31567y.setDuration(200L);
                    this.f31567y.addListener(new f3(this, 1));
                    this.f31567y.start();
                }
            }
        } else if (z10) {
            this.f31564s = i11;
            this.f31563r = 0;
            this.f31565w = 100;
            if (i10 == 3 || i10 == 1) {
                xi0 xi0Var = this.f31558b;
                xi0Var.L(xi0Var.f32584e[0] - 1, false, false);
            }
        } else {
            this.f31564s = 0;
            this.f31563r = i11;
            this.f31565w = 20;
        }
        this.v = z10;
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
        o1 o1Var = this.E;
        int i12 = o1Var.f31730g;
        Paint paint = o1Var.f31732j;
        com.google.firebase.messaging.n nVar = o1Var.f31725a;
        float f10 = o1Var.f31730g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        nVar.B(f12 - ((f11 - o1Var.f31729f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) nVar.f6403c).getHeight(), o1Var.h);
        o1Var.f31727c.z(f12, f13, o1Var.f31729f - x10, o1Var.f31730g - y3);
        xi0 xi0Var = this.f31559c;
        Paint paint2 = this.f31560e;
        Paint paint3 = this.d;
        int i13 = this.f31562n;
        if (xi0Var != null) {
            if (this.f31565w > 20) {
                Paint paint4 = this.f31561f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f31565w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f31559c.o(canvas, paint3, false, 0L, 0);
                this.f31559c.o(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!o1Var.f31731i) {
                paint = (Paint) nVar.f6401a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (o1Var.f31728e) {
                canvas.drawCircle(width, height, f14, (Paint) o1Var.f31727c.f6401a);
            }
            this.f31559c.draw(canvas);
        } else if (this.f31558b != null && this.f31557a != null) {
            int i14 = this.f31563r;
            if (i14 == i13 && this.f31564s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f31564s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f31563r, paint3);
                this.f31558b.setAlpha(255);
                i10 = i13;
                this.f31558b.o(canvas, paint3, false, 0L, 0);
                this.f31558b.setAlpha(35);
                this.f31558b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f31563r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31563r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f31563r > 0) {
                float f15 = this.f31563r;
                if (!o1Var.f31731i) {
                    paint = (Paint) nVar.f6401a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (o1Var.f31728e) {
                    canvas.drawCircle(width, height, this.f31563r, (Paint) o1Var.f31727c.f6401a);
                }
                this.f31557a.draw(canvas);
            }
            if (z11 || (this.f31564s > 0 && this.f31563r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f31564s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31564s, paint2);
                this.f31558b.setAlpha(255);
                this.f31558b.o(canvas, paint3, false, 0L, 0);
                this.f31558b.setAlpha(35);
                this.f31558b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        g3 g3Var;
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
                if (abs <= AndroidUtilities.dp(48.0f) && abs2 <= AndroidUtilities.dp(48.0f)) {
                    int i10 = this.f31563r;
                    int i11 = this.f31562n;
                    if (i10 == i11 && this.f31564s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f31564s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (g3Var = this.f31566x) != null) {
                        g3Var.c(this);
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

    public void setOnBtnClickedListener(g3 g3Var) {
        this.f31566x = g3Var;
    }
}
