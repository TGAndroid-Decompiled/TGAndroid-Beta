package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;
public final class jm0 extends FrameLayout {
    public boolean E;
    public int F;
    public float G;
    public im0 H;
    public final Paint f25369a;
    public final Paint f25370b;
    public final Paint f25371c;
    public final Paint d;
    public final f50 e;
    public final RectF f25372f;
    public final float h;
    public final float f25373n;
    public final float f25374r;
    public float f25375s;
    public float v;
    public float f25376w;
    public float f25377x;
    public boolean f25378y;

    public jm0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25369a = paint;
        Paint paint2 = new Paint(1);
        this.f25370b = paint2;
        Paint paint3 = new Paint(1);
        this.f25371c = paint3;
        Paint paint4 = new Paint(1);
        this.d = paint4;
        f50 f50Var = new f50(this, 1);
        this.e = f50Var;
        this.f25372f = new RectF();
        this.h = AndroidUtilities.dp(3.0f);
        this.f25373n = AndroidUtilities.dp(5.0f);
        this.f25374r = AndroidUtilities.dp(3.0f);
        d(paint, 0.2f);
        d(paint2, 0.6f);
        d(f50Var, 1.0f);
        paint3.setColor(-1);
        paint4.setColor(-1);
        setWillNotDraw(false);
    }

    public static float b(float f7, float f10) {
        float abs = Math.abs(f7 - f10);
        return Math.min(abs, 1.0f - abs);
    }

    public static float c(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public static void d(Paint paint, float f7) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f7 * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    private float getEndHandleProgress() {
        if (b(this.v, this.f25376w) < 0.006f) {
            float f7 = this.f25376w + 0.008f;
            if (f7 < 0.0f) {
                return f7 + 1.0f;
            }
            if (f7 > 1.0f) {
                return f7 - 1.0f;
            }
            return f7;
        }
        return this.f25376w;
    }

    private float getStartHandleProgress() {
        if (b(this.v, this.f25376w) < 0.006f) {
            float f7 = this.v - 0.008f;
            if (f7 < 0.0f) {
                return f7 + 1.0f;
            }
            if (f7 > 1.0f) {
                return f7 - 1.0f;
            }
            return f7;
        }
        return this.v;
    }

    public final float a(float f7) {
        float f10;
        float f11 = f7 + this.G;
        if (this.F == 1) {
            f10 = this.v;
        } else {
            f10 = this.f25376w;
        }
        if (f11 - f10 > 0.5f) {
            return f11 - 1.0f;
        }
        if (f10 - f11 > 0.5f) {
            return f11 + 1.0f;
        }
        return f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f25373n;
        float f10 = (this.h * 0.5f) + f7;
        RectF rectF = this.f25372f;
        rectF.set(f10, f10, getWidth() - f10, getHeight() - f10);
        canvas.drawOval(rectF, this.f25369a);
        boolean z10 = this.f25378y;
        f50 f50Var = this.e;
        if (z10) {
            canvas.drawArc(rectF, -90.0f, this.f25375s * 360.0f, false, this.f25370b);
            float f11 = this.v;
            canvas.drawArc(rectF, (-90.0f) + (f11 * 360.0f), (this.f25376w - f11) * 360.0f, false, f50Var);
            if (!this.E) {
                float startHandleProgress = getStartHandleProgress();
                Paint paint = this.f25371c;
                e(startHandleProgress, f7, canvas, paint);
                e(getEndHandleProgress(), f7, canvas, paint);
                e(this.f25377x, this.f25374r, canvas, this.d);
                return;
            }
            return;
        }
        canvas.drawArc(rectF, -90.0f, this.f25375s * 360.0f, false, f50Var);
    }

    public final void e(float f7, float f10, Canvas canvas, Paint paint) {
        double radians = Math.toRadians((f7 * 360.0f) - 90.0f);
        RectF rectF = this.f25372f;
        float width = rectF.width() * 0.5f;
        canvas.drawCircle((((float) Math.cos(radians)) * width) + rectF.centerX(), (((float) Math.sin(radians)) * width) + rectF.centerY(), f10, paint);
    }

    public final void f(boolean z10) {
        im0 im0Var = this.H;
        if (im0Var != null) {
            float f7 = this.v;
            float f10 = this.f25376w;
            a60 a60Var = ((w50) im0Var).f29865a;
            ki.h0 h0Var = a60Var.J;
            ki.g0 g0Var = a60Var.K;
            if (h0Var != null && g0Var != null && g0Var.f13699a == 5) {
                float f11 = (float) g0Var.d;
                long j3 = f7 * f11;
                long j10 = f10 * f11;
                if (h0Var.v(j3, j10)) {
                    VideoEditedInfo videoEditedInfo = a60Var.N;
                    if (videoEditedInfo != null) {
                        videoEditedInfo.startTime = j3;
                        videoEditedInfo.endTime = j10;
                    }
                    float max = (float) Math.max(1L, g0Var.f13700b);
                    a60Var.c(((float) j3) / max, ((float) j10) / max);
                    if (!z10) {
                        j3 = Math.max(j3, j10 - 100);
                    }
                    h0Var.s(j3);
                }
            }
        }
    }

    public final void g(float f7, float f10) {
        float c10 = c(f7, 0.0f, this.f25375s);
        this.v = c10;
        float c11 = c(f10, c10, this.f25375s);
        this.f25376w = c11;
        this.f25377x = c(this.f25377x, this.v, c11);
        invalidate();
    }

    public Paint getPaint() {
        return this.e;
    }

    public final void h(float f7) {
        float min = Math.min(this.f25375s, 0.016666668f);
        int i10 = this.F;
        if (i10 == 1) {
            float c10 = c(f7, 0.0f, this.f25376w - min);
            this.v = c10;
            this.f25377x = c10;
            f(true);
        } else if (i10 == 2) {
            float c11 = c(f7, this.v + min, this.f25375s);
            this.f25376w = c11;
            this.f25377x = c11;
            f(false);
        }
        invalidate();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f7;
        if (!this.f25378y || this.E) {
            return false;
        }
        float degrees = (float) ((((Math.toDegrees(Math.atan2(motionEvent.getY() - (getHeight() * 0.5f), motionEvent.getX() - (getWidth() * 0.5f))) + 90.0d) + 360.0d) % 360.0d) / 360.0d);
        int i10 = 2;
        if (motionEvent.getActionMasked() == 0) {
            if (b(degrees, getStartHandleProgress()) <= b(degrees, getEndHandleProgress())) {
                i10 = 1;
            }
            this.F = i10;
            if (i10 == 1) {
                f7 = this.v;
            } else {
                f7 = this.f25376w;
            }
            float f10 = f7 - degrees;
            if (f10 > 0.5f) {
                f10 -= 1.0f;
            } else if (f10 < -0.5f) {
                f10 += 1.0f;
            }
            this.G = f10;
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        } else if (motionEvent.getActionMasked() == 2) {
            h(a(degrees));
            return true;
        } else if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return true;
        } else {
            h(a(degrees));
            this.F = 0;
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
    }

    public void setLoading(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        invalidate();
    }

    public void setPlaybackProgress(float f7) {
        float c10 = c(f7, this.v, this.f25376w);
        if (this.f25377x == c10) {
            return;
        }
        this.f25377x = c10;
        invalidate();
    }

    public void setProgress(float f7) {
        float c10 = c(f7, 0.0f, 1.0f);
        if (this.f25375s == c10) {
            return;
        }
        this.f25375s = c10;
        invalidate();
    }

    public void setTrimEnabled(boolean z10) {
        if (this.f25378y == z10) {
            return;
        }
        this.f25378y = z10;
        this.F = 0;
        if (z10) {
            this.v = 0.0f;
            this.f25376w = this.f25375s;
            this.f25377x = 0.0f;
        }
        invalidate();
    }

    public void setTrimListener(im0 im0Var) {
        this.H = im0Var;
    }
}
