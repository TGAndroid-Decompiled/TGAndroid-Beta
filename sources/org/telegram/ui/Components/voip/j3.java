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
import org.telegram.ui.Components.gj0;
public final class j3 extends View {
    public final n1 B;
    public ValueAnimator C;
    public float D;
    public float E;
    public float F;
    public gj0 f29698a;
    public gj0 f29699b;
    public gj0 f29700c;
    public final Paint d;
    public final Paint e;
    public final Paint f29701f;
    public final Path h;
    public final int f29702n;
    public int f29703r;
    public int f29704s;
    public boolean v;
    public int f29705w;
    public i3 f29706x;
    public ValueAnimator f29707y;

    public j3(Context context, n1 n1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f29701f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f29702n = dp;
        this.f29703r = dp;
        this.f29704s = 0;
        this.v = false;
        this.f29705w = 0;
        this.D = 1.0f;
        this.B = n1Var;
        n1Var.a(this);
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
        ofFloat.addUpdateListener(new g3(this, 0));
        this.C.setDuration(150L);
        this.C.start();
    }

    public final void a(int i10, boolean z4, boolean z10) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.f29707y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f29707y.removeAllUpdateListeners();
            this.f29707y.cancel();
            z10 = false;
        }
        int i11 = this.f29702n;
        if (z10) {
            if (this.f29700c != null) {
                ValueAnimator valueAnimator2 = this.f29707y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f29707y.cancel();
                }
                if (z4) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f29707y = ofInt;
                ofInt.addUpdateListener(new g3(this, 1));
                this.f29707y.setDuration(200L);
                this.f29707y.start();
                if (i10 == 2) {
                    this.f29700c.L(0, false, false);
                    this.f29700c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f29707y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f29707y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i11);
                this.f29707y = ofInt2;
                if (z4) {
                    this.f29703r = i11;
                    ofInt2.addUpdateListener(new g3(this, 2));
                    this.f29707y.addListener(new h3(this, 0));
                    this.f29707y.setDuration(200L);
                    this.f29707y.start();
                    this.f29699b.L(0, false, false);
                    this.f29699b.start();
                } else {
                    this.f29704s = i11;
                    ofInt2.addUpdateListener(new g3(this, 3));
                    this.f29707y.setDuration(200L);
                    this.f29707y.addListener(new h3(this, 1));
                    this.f29707y.start();
                }
            }
        } else if (z4) {
            this.f29704s = i11;
            this.f29703r = 0;
            this.f29705w = 100;
            if (i10 == 3 || i10 == 1) {
                gj0 gj0Var = this.f29699b;
                gj0Var.L(gj0Var.e[0] - 1, false, false);
            }
        } else {
            this.f29704s = 0;
            this.f29703r = i11;
            this.f29705w = 20;
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
        n1 n1Var = this.B;
        int i12 = n1Var.f29800g;
        Paint paint = n1Var.f29802j;
        a9.a aVar = n1Var.f29796a;
        float f11 = n1Var.f29800g;
        float f12 = 1.12f * f11;
        float f13 = -x10;
        float f14 = -y10;
        aVar.z(f13 - ((f12 - n1Var.f29799f) / 2.0f), f14 - ((f12 - f11) / 2.0f), (i12 * 1.12f) / ((Bitmap) aVar.f145c).getHeight(), n1Var.h);
        n1Var.f29798c.w(f13, f14, n1Var.f29799f - x10, n1Var.f29800g - y10);
        gj0 gj0Var = this.f29700c;
        Paint paint2 = this.e;
        Paint paint3 = this.d;
        int i13 = this.f29702n;
        if (gj0Var != null) {
            if (this.f29705w > 20) {
                Paint paint4 = this.f29701f;
                paint4.setAlpha((int) ((i11 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f29705w * 255) / 100.0f));
                canvas.drawCircle(width, height, i13, paint2);
                this.f29700c.o(canvas, paint3, false, 0L, 0);
                this.f29700c.o(canvas, paint4, false, 0L, 0);
                return;
            }
            float f15 = i13;
            if (!n1Var.f29801i) {
                paint = (Paint) aVar.f143a;
            }
            canvas.drawCircle(width, height, f15, paint);
            if (n1Var.e) {
                canvas.drawCircle(width, height, f15, (Paint) n1Var.f29798c.f143a);
            }
            this.f29700c.draw(canvas);
        } else if (this.f29699b != null && this.f29698a != null) {
            int i14 = this.f29703r;
            if (i14 == i13 && this.f29704s == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i15 = this.f29704s;
            if (i15 == i13 && i14 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Path path2 = this.h;
            if (i15 == i13 && i14 > 0 && i14 != i13) {
                canvas.drawCircle(width, height, i15, paint2);
                canvas.drawCircle(width, height, this.f29703r, paint3);
                this.f29699b.setAlpha(255);
                i10 = i13;
                this.f29699b.o(canvas, paint3, false, 0L, 0);
                this.f29699b.setAlpha(35);
                this.f29699b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f29703r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f29703r, paint3);
            } else {
                i10 = i13;
                path = path2;
            }
            if (z4 || this.f29703r > 0) {
                float f16 = this.f29703r;
                if (!n1Var.f29801i) {
                    paint = (Paint) aVar.f143a;
                }
                canvas.drawCircle(width, height, f16, paint);
                if (n1Var.e) {
                    canvas.drawCircle(width, height, this.f29703r, (Paint) n1Var.f29798c.f143a);
                }
                this.f29698a.draw(canvas);
            }
            if (z10 || (this.f29704s > 0 && this.f29703r == i10)) {
                path.reset();
                path.addCircle(width, height, this.f29704s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f29704s, paint2);
                this.f29699b.setAlpha(255);
                this.f29699b.o(canvas, paint3, false, 0L, 0);
                this.f29699b.setAlpha(35);
                this.f29699b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        i3 i3Var;
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
                    int i10 = this.f29703r;
                    int i11 = this.f29702n;
                    if (i10 == i11 && this.f29704s == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.f29704s == i11 && i10 == 0) {
                        z10 = true;
                    }
                    if ((z4 || z10) && (i3Var = this.f29706x) != null) {
                        i3Var.d(this);
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

    public void setOnBtnClickedListener(i3 i3Var) {
        this.f29706x = i3Var;
    }
}
