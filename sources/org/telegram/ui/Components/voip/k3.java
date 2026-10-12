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
import org.telegram.ui.Components.fk0;
public final class k3 extends View {
    public final r1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public fk0 f31756a;
    public fk0 f31757b;
    public fk0 f31758c;
    public final Paint d;
    public final Paint f31759e;
    public final Paint f31760f;
    public final Path h;
    public final int f31761n;
    public int f31762r;
    public int f31763s;
    public boolean v;
    public int f31764w;
    public j3 f31765x;
    public ValueAnimator f31766y;

    public k3(Context context, r1 r1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f31759e = paint2;
        Paint paint3 = new Paint(1);
        this.f31760f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f31761n = dp;
        this.f31762r = dp;
        this.f31763s = 0;
        this.v = false;
        this.f31764w = 0;
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
        ValueAnimator valueAnimator = this.f31766y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f31766y.removeAllUpdateListeners();
            this.f31766y.cancel();
            z11 = false;
        }
        int i11 = this.f31761n;
        if (z11) {
            if (this.f31758c != null) {
                ValueAnimator valueAnimator2 = this.f31766y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f31766y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f31766y = ofInt;
                ofInt.addUpdateListener(new h3(this, 1));
                this.f31766y.setDuration(200L);
                this.f31766y.start();
                if (i10 == 2) {
                    this.f31758c.N(0, false, false);
                    this.f31758c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f31766y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f31766y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f31766y = ofInt2;
                if (z10) {
                    this.f31762r = i11;
                    ofInt2.addUpdateListener(new h3(this, 2));
                    this.f31766y.addListener(new i3(this, 0));
                    this.f31766y.setDuration(200L);
                    this.f31766y.start();
                    this.f31757b.N(0, false, false);
                    this.f31757b.start();
                } else {
                    this.f31763s = i11;
                    ofInt2.addUpdateListener(new h3(this, 3));
                    this.f31766y.setDuration(200L);
                    this.f31766y.addListener(new i3(this, 1));
                    this.f31766y.start();
                }
            }
        } else if (z10) {
            this.f31763s = i11;
            this.f31762r = 0;
            this.f31764w = 100;
            if (i10 == 3 || i10 == 1) {
                fk0 fk0Var = this.f31757b;
                fk0Var.N(fk0Var.f26109e[0] - 1, false, false);
            }
        } else {
            this.f31763s = 0;
            this.f31762r = i11;
            this.f31764w = 20;
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
        int i12 = r1Var.f31922g;
        Paint paint = r1Var.f31924j;
        com.google.firebase.messaging.n nVar = r1Var.f31917a;
        float f10 = r1Var.f31922g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        nVar.B(f12 - ((f11 - r1Var.f31921f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) nVar.f7952c).getHeight(), r1Var.h);
        r1Var.f31919c.z(f12, f13, r1Var.f31921f - x10, r1Var.f31922g - y3);
        fk0 fk0Var = this.f31758c;
        Paint paint2 = this.f31759e;
        Paint paint3 = this.d;
        int i13 = this.f31761n;
        if (fk0Var != null) {
            if (this.f31764w > 20) {
                Paint paint4 = this.f31760f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f31764w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f31758c.q(canvas, paint3, false, 0L, 0);
                this.f31758c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!r1Var.f31923i) {
                paint = (Paint) nVar.f7950a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (r1Var.f31920e) {
                canvas.drawCircle(width, height, f14, (Paint) r1Var.f31919c.f7950a);
            }
            this.f31758c.draw(canvas);
        } else if (this.f31757b != null && this.f31756a != null) {
            int i14 = this.f31762r;
            if (i14 == i13 && this.f31763s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f31763s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f31762r, paint3);
                this.f31757b.setAlpha(255);
                i10 = i13;
                this.f31757b.q(canvas, paint3, false, 0L, 0);
                this.f31757b.setAlpha(35);
                this.f31757b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f31762r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31762r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f31762r > 0) {
                float f15 = this.f31762r;
                if (!r1Var.f31923i) {
                    paint = (Paint) nVar.f7950a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (r1Var.f31920e) {
                    canvas.drawCircle(width, height, this.f31762r, (Paint) r1Var.f31919c.f7950a);
                }
                this.f31756a.draw(canvas);
            }
            if (z11 || (this.f31763s > 0 && this.f31762r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f31763s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f31763s, paint2);
                this.f31757b.setAlpha(255);
                this.f31757b.q(canvas, paint3, false, 0L, 0);
                this.f31757b.setAlpha(35);
                this.f31757b.draw(canvas);
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
                    int i10 = this.f31762r;
                    int i11 = this.f31761n;
                    if (i10 == i11 && this.f31763s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f31763s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (j3Var = this.f31765x) != null) {
                        j3Var.g(this);
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
        this.f31765x = j3Var;
    }
}
