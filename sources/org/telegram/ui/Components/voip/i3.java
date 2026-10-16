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
import org.telegram.ui.Components.yj0;
public final class i3 extends View {
    public final o1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public yj0 f29899a;
    public yj0 f29900b;
    public yj0 f29901c;
    public final Paint d;
    public final Paint e;
    public final Paint f29902f;
    public final Path h;
    public final int f29903n;
    public int f29904r;
    public int f29905s;
    public boolean v;
    public int f29906w;
    public h3 f29907x;
    public ValueAnimator f29908y;

    public i3(Context context, o1 o1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f29902f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f29903n = dp;
        this.f29904r = dp;
        this.f29905s = 0;
        this.v = false;
        this.f29906w = 0;
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
        ofFloat.addUpdateListener(new f3(this, 0));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void a(int i10, boolean z10, boolean z11) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.f29908y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f29908y.removeAllUpdateListeners();
            this.f29908y.cancel();
            z11 = false;
        }
        int i11 = this.f29903n;
        if (z11) {
            if (this.f29901c != null) {
                ValueAnimator valueAnimator2 = this.f29908y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f29908y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f29908y = ofInt;
                ofInt.addUpdateListener(new f3(this, 1));
                this.f29908y.setDuration(200L);
                this.f29908y.start();
                if (i10 == 2) {
                    this.f29901c.N(0, false, false);
                    this.f29901c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f29908y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f29908y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f29908y = ofInt2;
                if (z10) {
                    this.f29904r = i11;
                    ofInt2.addUpdateListener(new f3(this, 2));
                    this.f29908y.addListener(new g3(this, 0));
                    this.f29908y.setDuration(200L);
                    this.f29908y.start();
                    this.f29900b.N(0, false, false);
                    this.f29900b.start();
                } else {
                    this.f29905s = i11;
                    ofInt2.addUpdateListener(new f3(this, 3));
                    this.f29908y.setDuration(200L);
                    this.f29908y.addListener(new g3(this, 1));
                    this.f29908y.start();
                }
            }
        } else if (z10) {
            this.f29905s = i11;
            this.f29904r = 0;
            this.f29906w = 100;
            if (i10 == 3 || i10 == 1) {
                yj0 yj0Var = this.f29900b;
                yj0Var.N(yj0Var.e[0] - 1, false, false);
            }
        } else {
            this.f29905s = 0;
            this.f29904r = i11;
            this.f29906w = 20;
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
        int i12 = o1Var.f30052g;
        Paint paint = o1Var.f30054j;
        com.google.firebase.messaging.m mVar = o1Var.f30048a;
        float f10 = o1Var.f30052g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        mVar.B(f12 - ((f11 - o1Var.f30051f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) mVar.f6196c).getHeight(), o1Var.h);
        o1Var.f30050c.z(f12, f13, o1Var.f30051f - x10, o1Var.f30052g - y3);
        yj0 yj0Var = this.f29901c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f29903n;
        if (yj0Var != null) {
            if (this.f29906w > 20) {
                Paint paint4 = this.f29902f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f29906w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f29901c.q(canvas, paint3, false, 0L, 0);
                this.f29901c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!o1Var.f30053i) {
                paint = (Paint) mVar.f6194a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (o1Var.e) {
                canvas.drawCircle(width, height, f14, (Paint) o1Var.f30050c.f6194a);
            }
            this.f29901c.draw(canvas);
        } else if (this.f29900b != null && this.f29899a != null) {
            int i14 = this.f29904r;
            if (i14 == i13 && this.f29905s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f29905s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f29904r, paint3);
                this.f29900b.setAlpha(255);
                i10 = i13;
                this.f29900b.q(canvas, paint3, false, 0L, 0);
                this.f29900b.setAlpha(35);
                this.f29900b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f29904r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f29904r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f29904r > 0) {
                float f15 = this.f29904r;
                if (!o1Var.f30053i) {
                    paint = (Paint) mVar.f6194a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (o1Var.e) {
                    canvas.drawCircle(width, height, this.f29904r, (Paint) o1Var.f30050c.f6194a);
                }
                this.f29899a.draw(canvas);
            }
            if (z11 || (this.f29905s > 0 && this.f29904r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f29905s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f29905s, paint2);
                this.f29900b.setAlpha(255);
                this.f29900b.q(canvas, paint3, false, 0L, 0);
                this.f29900b.setAlpha(35);
                this.f29900b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        h3 h3Var;
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
                    int i10 = this.f29904r;
                    int i11 = this.f29903n;
                    if (i10 == i11 && this.f29905s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f29905s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (h3Var = this.f29907x) != null) {
                        h3Var.c(this);
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

    public void setOnBtnClickedListener(h3 h3Var) {
        this.f29907x = h3Var;
    }
}
