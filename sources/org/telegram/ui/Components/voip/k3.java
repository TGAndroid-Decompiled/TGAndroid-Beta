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
import org.telegram.ui.Components.xj0;
public final class k3 extends View {
    public final r1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public xj0 f33884a;
    public xj0 f33885b;
    public xj0 f33886c;
    public final Paint d;
    public final Paint e;
    public final Paint f33887f;
    public final Path h;
    public final int f33888n;
    public int f33889r;
    public int f33890s;
    public boolean v;
    public int f33891w;
    public j3 f33892x;
    public ValueAnimator f33893y;

    public k3(Context context, r1 r1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f33887f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f33888n = dp;
        this.f33889r = dp;
        this.f33890s = 0;
        this.v = false;
        this.f33891w = 0;
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
        ValueAnimator valueAnimator = this.f33893y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33893y.removeAllUpdateListeners();
            this.f33893y.cancel();
            z11 = false;
        }
        int i11 = this.f33888n;
        if (z11) {
            if (this.f33886c != null) {
                ValueAnimator valueAnimator2 = this.f33893y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f33893y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f33893y = ofInt;
                ofInt.addUpdateListener(new h3(this, 1));
                this.f33893y.setDuration(200L);
                this.f33893y.start();
                if (i10 == 2) {
                    this.f33886c.N(0, false, false);
                    this.f33886c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f33893y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f33893y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f33893y = ofInt2;
                if (z10) {
                    this.f33889r = i11;
                    ofInt2.addUpdateListener(new h3(this, 2));
                    this.f33893y.addListener(new i3(this, 0));
                    this.f33893y.setDuration(200L);
                    this.f33893y.start();
                    this.f33885b.N(0, false, false);
                    this.f33885b.start();
                } else {
                    this.f33890s = i11;
                    ofInt2.addUpdateListener(new h3(this, 3));
                    this.f33893y.setDuration(200L);
                    this.f33893y.addListener(new i3(this, 1));
                    this.f33893y.start();
                }
            }
        } else if (z10) {
            this.f33890s = i11;
            this.f33889r = 0;
            this.f33891w = 100;
            if (i10 == 3 || i10 == 1) {
                xj0 xj0Var = this.f33885b;
                xj0Var.N(xj0Var.e[0] - 1, false, false);
            }
        } else {
            this.f33890s = 0;
            this.f33889r = i11;
            this.f33891w = 20;
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
        float x9 = ((View) getParent()).getX() + getX();
        float y3 = ((View) ((View) getParent()).getParent()).getY() + getY();
        r1 r1Var = this.E;
        int i12 = r1Var.f34044g;
        Paint paint = r1Var.f34046j;
        aa.m0 m0Var = r1Var.f34040a;
        float f10 = r1Var.f34044g;
        float f11 = 1.12f * f10;
        float f12 = -x9;
        float f13 = -y3;
        m0Var.y(f12 - ((f11 - r1Var.f34043f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) m0Var.f1152c).getHeight(), r1Var.h);
        r1Var.f34042c.w(f12, f13, r1Var.f34043f - x9, r1Var.f34044g - y3);
        xj0 xj0Var = this.f33886c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f33888n;
        if (xj0Var != null) {
            if (this.f33891w > 20) {
                Paint paint4 = this.f33887f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f33891w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f33886c.q(canvas, paint3, false, 0L, 0);
                this.f33886c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!r1Var.f34045i) {
                paint = (Paint) m0Var.f1150a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (r1Var.e) {
                canvas.drawCircle(width, height, f14, (Paint) r1Var.f34042c.f1150a);
            }
            this.f33886c.draw(canvas);
        } else if (this.f33885b != null && this.f33884a != null) {
            int i14 = this.f33889r;
            if (i14 == i13 && this.f33890s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f33890s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f33889r, paint3);
                this.f33885b.setAlpha(255);
                i10 = i13;
                this.f33885b.q(canvas, paint3, false, 0L, 0);
                this.f33885b.setAlpha(35);
                this.f33885b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f33889r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f33889r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f33889r > 0) {
                float f15 = this.f33889r;
                if (!r1Var.f34045i) {
                    paint = (Paint) m0Var.f1150a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (r1Var.e) {
                    canvas.drawCircle(width, height, this.f33889r, (Paint) r1Var.f34042c.f1150a);
                }
                this.f33884a.draw(canvas);
            }
            if (z11 || (this.f33890s > 0 && this.f33889r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f33890s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f33890s, paint2);
                this.f33885b.setAlpha(255);
                this.f33885b.q(canvas, paint3, false, 0L, 0);
                this.f33885b.setAlpha(35);
                this.f33885b.draw(canvas);
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
                float x9 = motionEvent.getX();
                float y3 = motionEvent.getY();
                float f7 = this.H;
                float f10 = this.I;
                float abs = Math.abs(f7 - x9);
                float abs2 = Math.abs(f10 - y3);
                if (abs <= AndroidUtilities.dp(48.0f) && abs2 <= AndroidUtilities.dp(48.0f)) {
                    int i10 = this.f33889r;
                    int i11 = this.f33888n;
                    if (i10 == i11 && this.f33890s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f33890s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (j3Var = this.f33892x) != null) {
                        j3Var.d(this);
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
        this.f33892x = j3Var;
    }
}
