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
import org.telegram.ui.Components.dk0;
public final class j3 extends View {
    public final q1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public dk0 f32076a;
    public dk0 f32077b;
    public dk0 f32078c;
    public final Paint d;
    public final Paint f32079e;
    public final Paint f32080f;
    public final Path h;
    public final int f32081n;
    public int f32082r;
    public int f32083s;
    public boolean v;
    public int f32084w;
    public i3 f32085x;
    public ValueAnimator f32086y;

    public j3(Context context, q1 q1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f32079e = paint2;
        Paint paint3 = new Paint(1);
        this.f32080f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f32081n = dp;
        this.f32082r = dp;
        this.f32083s = 0;
        this.v = false;
        this.f32084w = 0;
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
        ValueAnimator valueAnimator = this.f32086y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f32086y.removeAllUpdateListeners();
            this.f32086y.cancel();
            z11 = false;
        }
        int i11 = this.f32081n;
        if (z11) {
            if (this.f32078c != null) {
                ValueAnimator valueAnimator2 = this.f32086y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f32086y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f32086y = ofInt;
                ofInt.addUpdateListener(new g3(this, 1));
                this.f32086y.setDuration(200L);
                this.f32086y.start();
                if (i10 == 2) {
                    this.f32078c.N(0, false, false);
                    this.f32078c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f32086y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f32086y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f32086y = ofInt2;
                if (z10) {
                    this.f32082r = i11;
                    ofInt2.addUpdateListener(new g3(this, 2));
                    this.f32086y.addListener(new h3(this, 0));
                    this.f32086y.setDuration(200L);
                    this.f32086y.start();
                    this.f32077b.N(0, false, false);
                    this.f32077b.start();
                } else {
                    this.f32083s = i11;
                    ofInt2.addUpdateListener(new g3(this, 3));
                    this.f32086y.setDuration(200L);
                    this.f32086y.addListener(new h3(this, 1));
                    this.f32086y.start();
                }
            }
        } else if (z10) {
            this.f32083s = i11;
            this.f32082r = 0;
            this.f32084w = 100;
            if (i10 == 3 || i10 == 1) {
                dk0 dk0Var = this.f32077b;
                dk0Var.N(dk0Var.f25732e[0] - 1, false, false);
            }
        } else {
            this.f32083s = 0;
            this.f32082r = i11;
            this.f32084w = 20;
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
        int i12 = q1Var.f32242g;
        Paint paint = q1Var.f32244j;
        com.google.firebase.messaging.n nVar = q1Var.f32237a;
        float f10 = q1Var.f32242g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        nVar.B(f12 - ((f11 - q1Var.f32241f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) nVar.f7956c).getHeight(), q1Var.h);
        q1Var.f32239c.z(f12, f13, q1Var.f32241f - x10, q1Var.f32242g - y3);
        dk0 dk0Var = this.f32078c;
        Paint paint2 = this.f32079e;
        Paint paint3 = this.d;
        int i13 = this.f32081n;
        if (dk0Var != null) {
            if (this.f32084w > 20) {
                Paint paint4 = this.f32080f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f32084w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f32078c.q(canvas, paint3, false, 0L, 0);
                this.f32078c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!q1Var.f32243i) {
                paint = (Paint) nVar.f7954a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (q1Var.f32240e) {
                canvas.drawCircle(width, height, f14, (Paint) q1Var.f32239c.f7954a);
            }
            this.f32078c.draw(canvas);
        } else if (this.f32077b != null && this.f32076a != null) {
            int i14 = this.f32082r;
            if (i14 == i13 && this.f32083s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f32083s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f32082r, paint3);
                this.f32077b.setAlpha(255);
                i10 = i13;
                this.f32077b.q(canvas, paint3, false, 0L, 0);
                this.f32077b.setAlpha(35);
                this.f32077b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f32082r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f32082r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f32082r > 0) {
                float f15 = this.f32082r;
                if (!q1Var.f32243i) {
                    paint = (Paint) nVar.f7954a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (q1Var.f32240e) {
                    canvas.drawCircle(width, height, this.f32082r, (Paint) q1Var.f32239c.f7954a);
                }
                this.f32076a.draw(canvas);
            }
            if (z11 || (this.f32083s > 0 && this.f32082r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f32083s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f32083s, paint2);
                this.f32077b.setAlpha(255);
                this.f32077b.q(canvas, paint3, false, 0L, 0);
                this.f32077b.setAlpha(35);
                this.f32077b.draw(canvas);
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
                    int i10 = this.f32082r;
                    int i11 = this.f32081n;
                    if (i10 == i11 && this.f32083s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f32083s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (i3Var = this.f32085x) != null) {
                        i3Var.g(this);
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
        this.f32085x = i3Var;
    }
}
