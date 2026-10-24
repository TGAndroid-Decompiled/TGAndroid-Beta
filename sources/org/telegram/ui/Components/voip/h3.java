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
public final class h3 extends View {
    public final o1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public xj0 f31609a;
    public xj0 f31610b;
    public xj0 f31611c;
    public final Paint d;
    public final Paint e;
    public final Paint f31612f;
    public final Path h;
    public final int f31613n;
    public int f31614r;
    public int f31615s;
    public boolean v;
    public int f31616w;
    public g3 f31617x;
    public ValueAnimator f31618y;

    public h3(Context context, o1 o1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f31612f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f31613n = dp;
        this.f31614r = dp;
        this.f31615s = 0;
        this.v = false;
        this.f31616w = 0;
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
        ValueAnimator valueAnimator = this.f31618y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f31618y.removeAllUpdateListeners();
            this.f31618y.cancel();
            z11 = false;
        }
        int i11 = this.f31613n;
        if (z11) {
            if (this.f31611c != null) {
                ValueAnimator valueAnimator2 = this.f31618y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f31618y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f31618y = ofInt;
                ofInt.addUpdateListener(new e3(this, 1));
                this.f31618y.setDuration(200L);
                this.f31618y.start();
                if (i10 == 2) {
                    this.f31611c.N(0, false, false);
                    this.f31611c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f31618y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f31618y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f31618y = ofInt2;
                if (z10) {
                    this.f31614r = i11;
                    ofInt2.addUpdateListener(new e3(this, 2));
                    this.f31618y.addListener(new f3(this, 0));
                    this.f31618y.setDuration(200L);
                    this.f31618y.start();
                    this.f31610b.N(0, false, false);
                    this.f31610b.start();
                } else {
                    this.f31615s = i11;
                    ofInt2.addUpdateListener(new e3(this, 3));
                    this.f31618y.setDuration(200L);
                    this.f31618y.addListener(new f3(this, 1));
                    this.f31618y.start();
                }
            }
        } else if (z10) {
            this.f31615s = i11;
            this.f31614r = 0;
            this.f31616w = 100;
            if (i10 == 3 || i10 == 1) {
                xj0 xj0Var = this.f31610b;
                xj0Var.N(xj0Var.e[0] - 1, false, false);
            }
        } else {
            this.f31615s = 0;
            this.f31614r = i11;
            this.f31616w = 20;
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
        int i12 = o1Var.f31770g;
        Paint paint = o1Var.f31772j;
        com.google.firebase.messaging.l lVar = o1Var.f31766a;
        float f10 = o1Var.f31770g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        lVar.y(f12 - ((f11 - o1Var.f31769f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) lVar.f7659c).getHeight(), o1Var.h);
        o1Var.f31768c.w(f12, f13, o1Var.f31769f - x10, o1Var.f31770g - y3);
        xj0 xj0Var = this.f31611c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f31613n;
        if (xj0Var != null) {
            if (this.f31616w > 20) {
                Paint paint4 = this.f31612f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f31616w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f31611c.q(canvas, paint3, false, 0L, 0);
                this.f31611c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!o1Var.f31771i) {
                paint = (Paint) lVar.f7657a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (o1Var.e) {
                canvas.drawCircle(width, height, f14, (Paint) o1Var.f31768c.f7657a);
            }
            this.f31611c.draw(canvas);
        } else if (this.f31610b != null && this.f31609a != null) {
            int i14 = this.f31614r;
            if (i14 == i13 && this.f31615s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f31615s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f31614r, paint3);
                this.f31610b.setAlpha(255);
                i10 = i13;
                this.f31610b.q(canvas, paint3, false, 0L, 0);
                this.f31610b.setAlpha(35);
                this.f31610b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f31614r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31614r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f31614r > 0) {
                float f15 = this.f31614r;
                if (!o1Var.f31771i) {
                    paint = (Paint) lVar.f7657a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (o1Var.e) {
                    canvas.drawCircle(width, height, this.f31614r, (Paint) o1Var.f31768c.f7657a);
                }
                this.f31609a.draw(canvas);
            }
            if (z11 || (this.f31615s > 0 && this.f31614r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f31615s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31615s, paint2);
                this.f31610b.setAlpha(255);
                this.f31610b.q(canvas, paint3, false, 0L, 0);
                this.f31610b.setAlpha(35);
                this.f31610b.draw(canvas);
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
                    int i10 = this.f31614r;
                    int i11 = this.f31613n;
                    if (i10 == i11 && this.f31615s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f31615s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (g3Var = this.f31617x) != null) {
                        g3Var.f(this);
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
        this.f31617x = g3Var;
    }
}
