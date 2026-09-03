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
public final class k3 extends View {
    public final o1 B;
    public ValueAnimator C;
    public float D;
    public float E;
    public float F;
    public hj0 f32127a;
    public hj0 f32128b;
    public hj0 f32129c;
    public final Paint d;
    public final Paint f32130e;
    public final Paint f32131f;
    public final Path h;
    public final int f32132n;
    public int f32133r;
    public int f32134s;
    public boolean v;
    public int f32135w;
    public j3 f32136x;
    public ValueAnimator f32137y;

    public k3(Context context, o1 o1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f32130e = paint2;
        Paint paint3 = new Paint(1);
        this.f32131f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f32132n = dp;
        this.f32133r = dp;
        this.f32134s = 0;
        this.v = false;
        this.f32135w = 0;
        this.D = 1.0f;
        this.B = o1Var;
        o1Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.D;
        if (z4) {
            f10 = 0.8f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new h3(this, 0));
        this.C.setDuration(150L);
        this.C.start();
    }

    public final void a(int i10, boolean z4, boolean z10) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.f32137y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f32137y.removeAllUpdateListeners();
            this.f32137y.cancel();
            z10 = false;
        }
        int i11 = this.f32132n;
        if (z10) {
            if (this.f32129c != null) {
                ValueAnimator valueAnimator2 = this.f32137y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f32137y.cancel();
                }
                if (z4) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f32137y = ofInt;
                ofInt.addUpdateListener(new h3(this, 1));
                this.f32137y.setDuration(200L);
                this.f32137y.start();
                if (i10 == 2) {
                    this.f32129c.L(0, false, false);
                    this.f32129c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f32137y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f32137y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f32137y = ofInt2;
                if (z4) {
                    this.f32133r = i11;
                    ofInt2.addUpdateListener(new h3(this, 2));
                    this.f32137y.addListener(new i3(this, 0));
                    this.f32137y.setDuration(200L);
                    this.f32137y.start();
                    this.f32128b.L(0, false, false);
                    this.f32128b.start();
                } else {
                    this.f32134s = i11;
                    ofInt2.addUpdateListener(new h3(this, 3));
                    this.f32137y.setDuration(200L);
                    this.f32137y.addListener(new i3(this, 1));
                    this.f32137y.start();
                }
            }
        } else if (z4) {
            this.f32134s = i11;
            this.f32133r = 0;
            this.f32135w = 100;
            if (i10 == 3 || i10 == 1) {
                hj0 hj0Var = this.f32128b;
                hj0Var.L(hj0Var.f27524e[0] - 1, false, false);
            }
        } else {
            this.f32134s = 0;
            this.f32133r = i11;
            this.f32135w = 20;
        }
        this.v = z4;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4;
        boolean z10;
        int i10;
        Path path;
        int i11;
        canvas.save();
        float f10 = this.D;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        o1 o1Var = this.B;
        int i12 = o1Var.f32237g;
        Paint paint = o1Var.f32239j;
        a9.a aVar = o1Var.f32232a;
        float f11 = o1Var.f32237g;
        float f12 = 1.12f * f11;
        float f13 = -x10;
        float f14 = -y10;
        aVar.z(f13 - ((f12 - o1Var.f32236f) / 2.0f), f14 - ((f12 - f11) / 2.0f), (i12 * 1.12f) / ((Bitmap) aVar.f157c).getHeight(), o1Var.h);
        o1Var.f32234c.x(f13, f14, o1Var.f32236f - x10, o1Var.f32237g - y10);
        hj0 hj0Var = this.f32129c;
        Paint paint2 = this.f32130e;
        Paint paint3 = this.d;
        int i13 = this.f32132n;
        if (hj0Var != null) {
            if (this.f32135w > 20) {
                Paint paint4 = this.f32131f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f32135w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f32129c.o(canvas, paint3, false, 0L, 0);
                this.f32129c.o(canvas, paint4, false, 0L, 0);
                return;
            }
            float f15 = i13;
            if (!o1Var.f32238i) {
                paint = (Paint) aVar.f155a;
            }
            canvas.drawCircle(width, height, f15, paint);
            if (o1Var.f32235e) {
                canvas.drawCircle(width, height, f15, (Paint) o1Var.f32234c.f155a);
            }
            this.f32129c.draw(canvas);
        } else if (this.f32128b != null && this.f32127a != null) {
            int i14 = this.f32133r;
            if (i14 == i13 && this.f32134s == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i15 = this.f32134s;
            if (i15 == i13 && i14 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f32133r, paint3);
                this.f32128b.setAlpha(255);
                i10 = i13;
                this.f32128b.o(canvas, paint3, false, 0L, 0);
                this.f32128b.setAlpha(35);
                this.f32128b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f32133r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f32133r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z4 || this.f32133r > 0) {
                float f16 = this.f32133r;
                if (!o1Var.f32238i) {
                    paint = (Paint) aVar.f155a;
                }
                canvas.drawCircle(width, height, f16, paint);
                if (o1Var.f32235e) {
                    canvas.drawCircle(width, height, this.f32133r, (Paint) o1Var.f32234c.f155a);
                }
                this.f32127a.draw(canvas);
            }
            if (z10 || (this.f32134s > 0 && this.f32133r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f32134s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f32134s, paint2);
                this.f32128b.setAlpha(255);
                this.f32128b.o(canvas, paint3, false, 0L, 0);
                this.f32128b.setAlpha(35);
                this.f32128b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        j3 j3Var;
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
                float f10 = this.E;
                float f11 = this.F;
                float abs = Math.abs(f10 - x10);
                float abs2 = Math.abs(f11 - y10);
                if (abs <= AndroidUtilities.dp(48.0f) && abs2 <= AndroidUtilities.dp(48.0f)) {
                    int i10 = this.f32133r;
                    int i11 = this.f32132n;
                    if (i10 == i11 && this.f32134s == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.f32134s == i11 && i10 == 0) {
                        z10 = true;
                    }
                    if ((z4 || z10) && (j3Var = this.f32136x) != null) {
                        j3Var.d(this);
                    }
                }
            }
            return true;
        }
        setPressedBtn(true);
        this.E = motionEvent.getX();
        this.F = motionEvent.getY();
        return true;
    }

    public void setOnBtnClickedListener(j3 j3Var) {
        this.f32136x = j3Var;
    }
}
