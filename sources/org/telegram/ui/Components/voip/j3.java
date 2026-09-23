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
import org.telegram.ui.Components.yi0;
public final class j3 extends View {
    public final q1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public yi0 f28989a;
    public yi0 f28990b;
    public yi0 f28991c;
    public final Paint d;
    public final Paint e;
    public final Paint f28992f;
    public final Path h;
    public final int f28993n;
    public int f28994r;
    public int f28995s;
    public boolean v;
    public int f28996w;
    public i3 f28997x;
    public ValueAnimator f28998y;

    public j3(Context context, q1 q1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f28992f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f28993n = dp;
        this.f28994r = dp;
        this.f28995s = 0;
        this.v = false;
        this.f28996w = 0;
        this.G = 1.0f;
        this.E = q1Var;
        q1Var.a(this);
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
        ofFloat.addUpdateListener(new g3(this, 0));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void a(int i10, boolean z10, boolean z11) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.f28998y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f28998y.removeAllUpdateListeners();
            this.f28998y.cancel();
            z11 = false;
        }
        int i11 = this.f28993n;
        if (z11) {
            if (this.f28991c != null) {
                ValueAnimator valueAnimator2 = this.f28998y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f28998y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f28998y = ofInt;
                ofInt.addUpdateListener(new g3(this, 1));
                this.f28998y.setDuration(200L);
                this.f28998y.start();
                if (i10 == 2) {
                    this.f28991c.N(0, false, false);
                    this.f28991c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f28998y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f28998y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f28998y = ofInt2;
                if (z10) {
                    this.f28994r = i11;
                    ofInt2.addUpdateListener(new g3(this, 2));
                    this.f28998y.addListener(new h3(this, 0));
                    this.f28998y.setDuration(200L);
                    this.f28998y.start();
                    this.f28990b.N(0, false, false);
                    this.f28990b.start();
                } else {
                    this.f28995s = i11;
                    ofInt2.addUpdateListener(new g3(this, 3));
                    this.f28998y.setDuration(200L);
                    this.f28998y.addListener(new h3(this, 1));
                    this.f28998y.start();
                }
            }
        } else if (z10) {
            this.f28995s = i11;
            this.f28994r = 0;
            this.f28996w = 100;
            if (i10 == 3 || i10 == 1) {
                yi0 yi0Var = this.f28990b;
                yi0Var.N(yi0Var.e[0] - 1, false, false);
            }
        } else {
            this.f28995s = 0;
            this.f28994r = i11;
            this.f28996w = 20;
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
        q1 q1Var = this.E;
        int i12 = q1Var.f29144g;
        Paint paint = q1Var.f29146j;
        com.google.firebase.messaging.n nVar = q1Var.f29140a;
        float f10 = q1Var.f29144g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        nVar.B(f12 - ((f11 - q1Var.f29143f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) nVar.f7321c).getHeight(), q1Var.h);
        q1Var.f29142c.z(f12, f13, q1Var.f29143f - x10, q1Var.f29144g - y3);
        yi0 yi0Var = this.f28991c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f28993n;
        if (yi0Var != null) {
            if (this.f28996w > 20) {
                Paint paint4 = this.f28992f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f28996w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f28991c.q(canvas, paint3, false, 0L, 0);
                this.f28991c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!q1Var.f29145i) {
                paint = (Paint) nVar.f7319a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (q1Var.e) {
                canvas.drawCircle(width, height, f14, (Paint) q1Var.f29142c.f7319a);
            }
            this.f28991c.draw(canvas);
        } else if (this.f28990b != null && this.f28989a != null) {
            int i14 = this.f28994r;
            if (i14 == i13 && this.f28995s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f28995s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f28994r, paint3);
                this.f28990b.setAlpha(255);
                i10 = i13;
                this.f28990b.q(canvas, paint3, false, 0L, 0);
                this.f28990b.setAlpha(35);
                this.f28990b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f28994r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f28994r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f28994r > 0) {
                float f15 = this.f28994r;
                if (!q1Var.f29145i) {
                    paint = (Paint) nVar.f7319a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (q1Var.e) {
                    canvas.drawCircle(width, height, this.f28994r, (Paint) q1Var.f29142c.f7319a);
                }
                this.f28989a.draw(canvas);
            }
            if (z11 || (this.f28995s > 0 && this.f28994r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f28995s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f28995s, paint2);
                this.f28990b.setAlpha(255);
                this.f28990b.q(canvas, paint3, false, 0L, 0);
                this.f28990b.setAlpha(35);
                this.f28990b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        i3 i3Var;
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
                    int i10 = this.f28994r;
                    int i11 = this.f28993n;
                    if (i10 == i11 && this.f28995s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f28995s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (i3Var = this.f28997x) != null) {
                        i3Var.h(this);
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

    public void setOnBtnClickedListener(i3 i3Var) {
        this.f28997x = i3Var;
    }
}
