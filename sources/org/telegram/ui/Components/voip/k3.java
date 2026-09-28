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
import org.telegram.ui.Components.kj0;
public final class k3 extends View {
    public final r1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public kj0 f29355a;
    public kj0 f29356b;
    public kj0 f29357c;
    public final Paint d;
    public final Paint e;
    public final Paint f29358f;
    public final Path h;
    public final int f29359n;
    public int f29360r;
    public int f29361s;
    public boolean v;
    public int f29362w;
    public j3 f29363x;
    public ValueAnimator f29364y;

    public k3(Context context, r1 r1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f29358f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f29359n = dp;
        this.f29360r = dp;
        this.f29361s = 0;
        this.v = false;
        this.f29362w = 0;
        this.G = 1.0f;
        this.E = r1Var;
        r1Var.a(this);
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
        ofFloat.addUpdateListener(new h3(this, 0));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void a(int i10, boolean z10, boolean z11) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.f29364y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f29364y.removeAllUpdateListeners();
            this.f29364y.cancel();
            z11 = false;
        }
        int i11 = this.f29359n;
        if (z11) {
            if (this.f29357c != null) {
                ValueAnimator valueAnimator2 = this.f29364y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f29364y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f29364y = ofInt;
                ofInt.addUpdateListener(new h3(this, 1));
                this.f29364y.setDuration(200L);
                this.f29364y.start();
                if (i10 == 2) {
                    this.f29357c.N(0, false, false);
                    this.f29357c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f29364y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f29364y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f29364y = ofInt2;
                if (z10) {
                    this.f29360r = i11;
                    ofInt2.addUpdateListener(new h3(this, 2));
                    this.f29364y.addListener(new i3(this, 0));
                    this.f29364y.setDuration(200L);
                    this.f29364y.start();
                    this.f29356b.N(0, false, false);
                    this.f29356b.start();
                } else {
                    this.f29361s = i11;
                    ofInt2.addUpdateListener(new h3(this, 3));
                    this.f29364y.setDuration(200L);
                    this.f29364y.addListener(new i3(this, 1));
                    this.f29364y.start();
                }
            }
        } else if (z10) {
            this.f29361s = i11;
            this.f29360r = 0;
            this.f29362w = 100;
            if (i10 == 3 || i10 == 1) {
                kj0 kj0Var = this.f29356b;
                kj0Var.N(kj0Var.e[0] - 1, false, false);
            }
        } else {
            this.f29361s = 0;
            this.f29360r = i11;
            this.f29362w = 20;
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
        r1 r1Var = this.E;
        int i12 = r1Var.f29507g;
        Paint paint = r1Var.f29509j;
        com.google.firebase.messaging.n nVar = r1Var.f29503a;
        float f10 = r1Var.f29507g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        nVar.B(f12 - ((f11 - r1Var.f29506f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) nVar.f7314c).getHeight(), r1Var.h);
        r1Var.f29505c.z(f12, f13, r1Var.f29506f - x10, r1Var.f29507g - y3);
        kj0 kj0Var = this.f29357c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f29359n;
        if (kj0Var != null) {
            if (this.f29362w > 20) {
                Paint paint4 = this.f29358f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f29362w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f29357c.q(canvas, paint3, false, 0L, 0);
                this.f29357c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!r1Var.f29508i) {
                paint = (Paint) nVar.f7312a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (r1Var.e) {
                canvas.drawCircle(width, height, f14, (Paint) r1Var.f29505c.f7312a);
            }
            this.f29357c.draw(canvas);
        } else if (this.f29356b != null && this.f29355a != null) {
            int i14 = this.f29360r;
            if (i14 == i13 && this.f29361s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f29361s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f29360r, paint3);
                this.f29356b.setAlpha(255);
                i10 = i13;
                this.f29356b.q(canvas, paint3, false, 0L, 0);
                this.f29356b.setAlpha(35);
                this.f29356b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f29360r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f29360r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f29360r > 0) {
                float f15 = this.f29360r;
                if (!r1Var.f29508i) {
                    paint = (Paint) nVar.f7312a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (r1Var.e) {
                    canvas.drawCircle(width, height, this.f29360r, (Paint) r1Var.f29505c.f7312a);
                }
                this.f29355a.draw(canvas);
            }
            if (z11 || (this.f29361s > 0 && this.f29360r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f29361s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f29361s, paint2);
                this.f29356b.setAlpha(255);
                this.f29356b.q(canvas, paint3, false, 0L, 0);
                this.f29356b.setAlpha(35);
                this.f29356b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        j3 j3Var;
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
                    int i10 = this.f29360r;
                    int i11 = this.f29359n;
                    if (i10 == i11 && this.f29361s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f29361s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (j3Var = this.f29363x) != null) {
                        j3Var.h(this);
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

    public void setOnBtnClickedListener(j3 j3Var) {
        this.f29363x = j3Var;
    }
}
