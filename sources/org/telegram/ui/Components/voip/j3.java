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
import org.telegram.ui.Components.hj0;
public final class j3 extends View {
    public final q1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public hj0 f29421a;
    public hj0 f29422b;
    public hj0 f29423c;
    public final Paint d;
    public final Paint e;
    public final Paint f29424f;
    public final Path h;
    public final int f29425n;
    public int f29426r;
    public int f29427s;
    public boolean v;
    public int f29428w;
    public i3 f29429x;
    public ValueAnimator f29430y;

    public j3(Context context, q1 q1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f29424f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f29425n = dp;
        this.f29426r = dp;
        this.f29427s = 0;
        this.v = false;
        this.f29428w = 0;
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
        ValueAnimator valueAnimator = this.f29430y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f29430y.removeAllUpdateListeners();
            this.f29430y.cancel();
            z11 = false;
        }
        int i11 = this.f29425n;
        if (z11) {
            if (this.f29423c != null) {
                ValueAnimator valueAnimator2 = this.f29430y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f29430y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f29430y = ofInt;
                ofInt.addUpdateListener(new g3(this, 1));
                this.f29430y.setDuration(200L);
                this.f29430y.start();
                if (i10 == 2) {
                    this.f29423c.N(0, false, false);
                    this.f29423c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f29430y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f29430y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f29430y = ofInt2;
                if (z10) {
                    this.f29426r = i11;
                    ofInt2.addUpdateListener(new g3(this, 2));
                    this.f29430y.addListener(new h3(this, 0));
                    this.f29430y.setDuration(200L);
                    this.f29430y.start();
                    this.f29422b.N(0, false, false);
                    this.f29422b.start();
                } else {
                    this.f29427s = i11;
                    ofInt2.addUpdateListener(new g3(this, 3));
                    this.f29430y.setDuration(200L);
                    this.f29430y.addListener(new h3(this, 1));
                    this.f29430y.start();
                }
            }
        } else if (z10) {
            this.f29427s = i11;
            this.f29426r = 0;
            this.f29428w = 100;
            if (i10 == 3 || i10 == 1) {
                hj0 hj0Var = this.f29422b;
                hj0Var.N(hj0Var.e[0] - 1, false, false);
            }
        } else {
            this.f29427s = 0;
            this.f29426r = i11;
            this.f29428w = 20;
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
        int i12 = q1Var.f29576g;
        Paint paint = q1Var.f29578j;
        com.google.firebase.messaging.n nVar = q1Var.f29572a;
        float f10 = q1Var.f29576g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        nVar.B(f12 - ((f11 - q1Var.f29575f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) nVar.f7332c).getHeight(), q1Var.h);
        q1Var.f29574c.z(f12, f13, q1Var.f29575f - x10, q1Var.f29576g - y3);
        hj0 hj0Var = this.f29423c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f29425n;
        if (hj0Var != null) {
            if (this.f29428w > 20) {
                Paint paint4 = this.f29424f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f29428w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f29423c.q(canvas, paint3, false, 0L, 0);
                this.f29423c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!q1Var.f29577i) {
                paint = (Paint) nVar.f7330a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (q1Var.e) {
                canvas.drawCircle(width, height, f14, (Paint) q1Var.f29574c.f7330a);
            }
            this.f29423c.draw(canvas);
        } else if (this.f29422b != null && this.f29421a != null) {
            int i14 = this.f29426r;
            if (i14 == i13 && this.f29427s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f29427s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f29426r, paint3);
                this.f29422b.setAlpha(255);
                i10 = i13;
                this.f29422b.q(canvas, paint3, false, 0L, 0);
                this.f29422b.setAlpha(35);
                this.f29422b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f29426r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f29426r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f29426r > 0) {
                float f15 = this.f29426r;
                if (!q1Var.f29577i) {
                    paint = (Paint) nVar.f7330a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (q1Var.e) {
                    canvas.drawCircle(width, height, this.f29426r, (Paint) q1Var.f29574c.f7330a);
                }
                this.f29421a.draw(canvas);
            }
            if (z11 || (this.f29427s > 0 && this.f29426r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f29427s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f29427s, paint2);
                this.f29422b.setAlpha(255);
                this.f29422b.q(canvas, paint3, false, 0L, 0);
                this.f29422b.setAlpha(35);
                this.f29422b.draw(canvas);
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
                    int i10 = this.f29426r;
                    int i11 = this.f29425n;
                    if (i10 == i11 && this.f29427s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f29427s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (i3Var = this.f29429x) != null) {
                        i3Var.f(this);
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
        this.f29429x = i3Var;
    }
}
