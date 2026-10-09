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
import org.telegram.ui.Components.ck0;
public final class j3 extends View {
    public final q1 E;
    public ValueAnimator F;
    public float G;
    public float H;
    public float I;
    public ck0 f32011a;
    public ck0 f32012b;
    public ck0 f32013c;
    public final Paint d;
    public final Paint f32014e;
    public final Paint f32015f;
    public final Path h;
    public final int f32016n;
    public int f32017r;
    public int f32018s;
    public boolean v;
    public int f32019w;
    public i3 f32020x;
    public ValueAnimator f32021y;

    public j3(Context context, q1 q1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f32014e = paint2;
        Paint paint3 = new Paint(1);
        this.f32015f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f32016n = dp;
        this.f32017r = dp;
        this.f32018s = 0;
        this.v = false;
        this.f32019w = 0;
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
        ValueAnimator valueAnimator = this.f32021y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f32021y.removeAllUpdateListeners();
            this.f32021y.cancel();
            z11 = false;
        }
        int i11 = this.f32016n;
        if (z11) {
            if (this.f32013c != null) {
                ValueAnimator valueAnimator2 = this.f32021y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f32021y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f32021y = ofInt;
                ofInt.addUpdateListener(new g3(this, 1));
                this.f32021y.setDuration(200L);
                this.f32021y.start();
                if (i10 == 2) {
                    this.f32013c.N(0, false, false);
                    this.f32013c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f32021y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f32021y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f32021y = ofInt2;
                if (z10) {
                    this.f32017r = i11;
                    ofInt2.addUpdateListener(new g3(this, 2));
                    this.f32021y.addListener(new h3(this, 0));
                    this.f32021y.setDuration(200L);
                    this.f32021y.start();
                    this.f32012b.N(0, false, false);
                    this.f32012b.start();
                } else {
                    this.f32018s = i11;
                    ofInt2.addUpdateListener(new g3(this, 3));
                    this.f32021y.setDuration(200L);
                    this.f32021y.addListener(new h3(this, 1));
                    this.f32021y.start();
                }
            }
        } else if (z10) {
            this.f32018s = i11;
            this.f32017r = 0;
            this.f32019w = 100;
            if (i10 == 3 || i10 == 1) {
                ck0 ck0Var = this.f32012b;
                ck0Var.N(ck0Var.f25401e[0] - 1, false, false);
            }
        } else {
            this.f32018s = 0;
            this.f32017r = i11;
            this.f32019w = 20;
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
        int i12 = q1Var.f32177g;
        Paint paint = q1Var.f32179j;
        com.google.firebase.messaging.n nVar = q1Var.f32172a;
        float f10 = q1Var.f32177g;
        float f11 = 1.12f * f10;
        float f12 = -x10;
        float f13 = -y3;
        nVar.B(f12 - ((f11 - q1Var.f32176f) / 2.0f), f13 - ((f11 - f10) / 2.0f), (i12 * 1.12f) / ((Bitmap) nVar.f7956c).getHeight(), q1Var.h);
        q1Var.f32174c.z(f12, f13, q1Var.f32176f - x10, q1Var.f32177g - y3);
        ck0 ck0Var = this.f32013c;
        Paint paint2 = this.f32014e;
        Paint paint3 = this.d;
        int i13 = this.f32016n;
        if (ck0Var != null) {
            if (this.f32019w > 20) {
                Paint paint4 = this.f32015f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f32019w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f32013c.q(canvas, paint3, false, 0L, 0);
                this.f32013c.q(canvas, paint4, false, 0L, 0);
                return;
            }
            float f14 = i13;
            if (!q1Var.f32178i) {
                paint = (Paint) nVar.f7954a;
            }
            canvas.drawCircle(width, height, f14, paint);
            if (q1Var.f32175e) {
                canvas.drawCircle(width, height, f14, (Paint) q1Var.f32174c.f7954a);
            }
            this.f32013c.draw(canvas);
        } else if (this.f32012b != null && this.f32011a != null) {
            int i14 = this.f32017r;
            if (i14 == i13 && this.f32018s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = this.f32018s;
            if (i15 == i13 && i14 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f32017r, paint3);
                this.f32012b.setAlpha(255);
                i10 = i13;
                this.f32012b.q(canvas, paint3, false, 0L, 0);
                this.f32012b.setAlpha(35);
                this.f32012b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f32017r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f32017r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z10 || this.f32017r > 0) {
                float f15 = this.f32017r;
                if (!q1Var.f32178i) {
                    paint = (Paint) nVar.f7954a;
                }
                canvas.drawCircle(width, height, f15, paint);
                if (q1Var.f32175e) {
                    canvas.drawCircle(width, height, this.f32017r, (Paint) q1Var.f32174c.f7954a);
                }
                this.f32011a.draw(canvas);
            }
            if (z11 || (this.f32018s > 0 && this.f32017r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f32018s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f32018s, paint2);
                this.f32012b.setAlpha(255);
                this.f32012b.q(canvas, paint3, false, 0L, 0);
                this.f32012b.setAlpha(35);
                this.f32012b.draw(canvas);
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
                    int i10 = this.f32017r;
                    int i11 = this.f32016n;
                    if (i10 == i11 && this.f32018s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f32018s == i11 && i10 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (i3Var = this.f32020x) != null) {
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
        this.f32020x = i3Var;
    }
}
