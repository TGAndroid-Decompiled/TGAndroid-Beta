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
import org.telegram.ui.Components.zg0;
public final class a3 extends View {
    public ValueAnimator D;
    public final i1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public zg0 f39041a;
    public zg0 f39042b;
    public zg0 f39043c;
    public final Paint d;
    public final Paint f39044e;
    public final Paint f39045f;
    public final Path h;
    public final int f39046n;
    public int f39047r;
    public int f39048s;
    public boolean f39049w;
    public int f39050x;
    public z2 f39051y;

    public a3(Context context, i1 i1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f39044e = paint2;
        Paint paint3 = new Paint(1);
        this.f39045f = paint3;
        this.h = new Path();
        int L = org.telegram.messenger.g0.L(26.0f);
        this.f39046n = L;
        this.f39047r = L;
        this.f39048s = 0;
        this.f39049w = false;
        this.f39050x = 0;
        this.G = 1.0f;
        this.E = i1Var;
        i1Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.G;
        if (z9) {
            f10 = 0.8f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new x2(this, 0));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void a(int i7, boolean z9, boolean z10) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.D.removeAllUpdateListeners();
            this.D.cancel();
            z10 = false;
        }
        int i10 = this.f39046n;
        if (z10) {
            if (this.f39043c != null) {
                ValueAnimator valueAnimator2 = this.D;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.D.cancel();
                }
                if (z9) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.D = ofInt;
                ofInt.addUpdateListener(new x2(this, 1));
                this.D.setDuration(200L);
                this.D.start();
                if (i7 == 2) {
                    this.f39043c.N(0, false, false);
                    this.f39043c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.D;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.D.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i10);
                this.D = ofInt2;
                if (z9) {
                    this.f39047r = i10;
                    ofInt2.addUpdateListener(new x2(this, 2));
                    this.D.addListener(new y2(this, 0));
                    this.D.setDuration(200L);
                    this.D.start();
                    this.f39042b.N(0, false, false);
                    this.f39042b.start();
                } else {
                    this.f39048s = i10;
                    ofInt2.addUpdateListener(new x2(this, 3));
                    this.D.setDuration(200L);
                    this.D.addListener(new y2(this, 1));
                    this.D.start();
                }
            }
        } else if (z9) {
            this.f39048s = i10;
            this.f39047r = 0;
            this.f39050x = 100;
            if (i7 == 3 || i7 == 1) {
                zg0 zg0Var = this.f39042b;
                zg0Var.N(zg0Var.f40956e[0] - 1, false, false);
            }
        } else {
            this.f39048s = 0;
            this.f39047r = i10;
            this.f39050x = 20;
        }
        this.f39049w = z9;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9;
        boolean z10;
        int i7;
        Path path;
        int i10;
        canvas.save();
        float f10 = this.G;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        i1 i1Var = this.E;
        int i11 = i1Var.f39204g;
        Paint paint = i1Var.f39206j;
        b8 b8Var = i1Var.f39199a;
        float f11 = i1Var.f39204g;
        float f12 = 1.12f * f11;
        float f13 = -x10;
        float f14 = -y10;
        b8Var.m(f13 - ((f12 - i1Var.f39203f) / 2.0f), f14 - ((f12 - f11) / 2.0f), (i11 * 1.12f) / ((Bitmap) b8Var.f337c).getHeight(), i1Var.h);
        i1Var.f39201c.k(f13, f14, i1Var.f39203f - x10, i1Var.f39204g - y10);
        zg0 zg0Var = this.f39043c;
        Paint paint2 = this.f39044e;
        Paint paint3 = this.d;
        int i12 = this.f39046n;
        if (zg0Var != null) {
            if (this.f39050x > 20) {
                Paint paint4 = this.f39045f;
                paint4.setAlpha((int) ((i10 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f39050x * 255) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.f39043c.q(canvas, paint3, false, 0L, 0);
                this.f39043c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f15 = i12;
            if (!i1Var.f39205i) {
                paint = (Paint) b8Var.f335a;
            }
            canvas.drawCircle(width, height, f15, paint);
            if (i1Var.f39202e) {
                canvas.drawCircle(width, height, f15, (Paint) i1Var.f39201c.f335a);
            }
            this.f39043c.draw(canvas);
        } else if (this.f39042b != null && this.f39041a != null) {
            int i13 = this.f39047r;
            if (i13 == i12 && this.f39048s == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i14 = this.f39048s;
            if (i14 == i12 && i13 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path2 = this.h;
            if (i14 == i12 && i13 > 0 && i13 != i12) {
                canvas.drawCircle(width, height, i14, paint2);
                canvas.drawCircle(width, height, this.f39047r, paint3);
                this.f39042b.setAlpha(255);
                i7 = i12;
                this.f39042b.q(canvas, paint3, false, 0L, 0);
                this.f39042b.setAlpha(35);
                this.f39042b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f39047r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f39047r, paint3);
            } else {
                i7 = i12;
                path = path2;
            }
            if (z9 || this.f39047r > 0) {
                float f16 = this.f39047r;
                if (!i1Var.f39205i) {
                    paint = (Paint) b8Var.f335a;
                }
                canvas.drawCircle(width, height, f16, paint);
                if (i1Var.f39202e) {
                    canvas.drawCircle(width, height, this.f39047r, (Paint) i1Var.f39201c.f335a);
                }
                this.f39041a.draw(canvas);
            }
            if (z10 || (this.f39048s > 0 && this.f39047r == i7)) {
                path.reset();
                path.addCircle(width, height, this.f39048s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f39048s, paint2);
                this.f39042b.setAlpha(255);
                this.f39042b.q(canvas, paint3, false, 0L, 0);
                this.f39042b.setAlpha(35);
                this.f39042b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        z2 z2Var;
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z10 = false;
            if (action != 1) {
                if (action == 3) {
                    setPressedBtn(false);
                    return true;
                }
            } else {
                setPressedBtn(false);
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f10 = this.H;
                float f11 = this.I;
                float abs = Math.abs(f10 - x10);
                float abs2 = Math.abs(f11 - y10);
                if (abs <= org.telegram.messenger.g0.L(48.0f) && abs2 <= org.telegram.messenger.g0.L(48.0f)) {
                    int i7 = this.f39047r;
                    int i10 = this.f39046n;
                    if (i7 == i10 && this.f39048s == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (this.f39048s == i10 && i7 == 0) {
                        z10 = true;
                    }
                    if ((z9 || z10) && (z2Var = this.f39051y) != null) {
                        z2Var.d(this);
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

    public void setOnBtnClickedListener(z2 z2Var) {
        this.f39051y = z2Var;
    }
}
