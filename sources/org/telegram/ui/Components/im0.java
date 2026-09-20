package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class im0 extends FrameLayout {
    public boolean E;
    public int F;
    public float G;
    public final Paint f25075a;
    public final Paint f25076b;
    public final Paint f25077c;
    public final Paint d;
    public final f50 e;
    public final RectF f25078f;
    public final float h;
    public final float f25079n;
    public final float f25080r;
    public float f25081s;
    public float v;
    public float f25082w;
    public float f25083x;
    public boolean f25084y;

    public im0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25075a = paint;
        Paint paint2 = new Paint(1);
        this.f25076b = paint2;
        Paint paint3 = new Paint(1);
        this.f25077c = paint3;
        Paint paint4 = new Paint(1);
        this.d = paint4;
        f50 f50Var = new f50(this, 1);
        this.e = f50Var;
        this.f25078f = new RectF();
        this.h = AndroidUtilities.dp(3.0f);
        this.f25079n = AndroidUtilities.dp(5.0f);
        this.f25080r = AndroidUtilities.dp(3.0f);
        c(paint, 0.2f);
        c(paint2, 0.6f);
        c(f50Var, 1.0f);
        paint3.setColor(-1);
        paint4.setColor(-1);
        setWillNotDraw(false);
    }

    public static float b(float f7, float f10) {
        float abs = Math.abs(f7 - f10);
        return Math.min(abs, 1.0f - abs);
    }

    public static void c(Paint paint, float f7) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f7 * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    private float getEndHandleProgress() {
        if (b(this.v, this.f25082w) < 0.006f) {
            float f7 = this.f25082w + 0.008f;
            if (f7 < 0.0f) {
                return f7 + 1.0f;
            }
            if (f7 > 1.0f) {
                return f7 - 1.0f;
            }
            return f7;
        }
        return this.f25082w;
    }

    private float getStartHandleProgress() {
        if (b(this.v, this.f25082w) < 0.006f) {
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
            f10 = this.f25082w;
        }
        if (f11 - f10 > 0.5f) {
            return f11 - 1.0f;
        }
        if (f10 - f11 > 0.5f) {
            return f11 + 1.0f;
        }
        return f11;
    }

    public final void d(float f7, float f10, Canvas canvas, Paint paint) {
        double radians = Math.toRadians((f7 * 360.0f) - 90.0f);
        RectF rectF = this.f25078f;
        float width = rectF.width() * 0.5f;
        canvas.drawCircle((((float) Math.cos(radians)) * width) + rectF.centerX(), (((float) Math.sin(radians)) * width) + rectF.centerY(), f10, paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f25079n;
        float f10 = (this.h * 0.5f) + f7;
        RectF rectF = this.f25078f;
        rectF.set(f10, f10, getWidth() - f10, getHeight() - f10);
        canvas.drawOval(rectF, this.f25075a);
        boolean z10 = this.f25084y;
        f50 f50Var = this.e;
        if (z10) {
            canvas.drawArc(rectF, -90.0f, this.f25081s * 360.0f, false, this.f25076b);
            float f11 = this.v;
            canvas.drawArc(rectF, (-90.0f) + (f11 * 360.0f), (this.f25082w - f11) * 360.0f, false, f50Var);
            if (!this.E) {
                float startHandleProgress = getStartHandleProgress();
                Paint paint = this.f25077c;
                d(startHandleProgress, f7, canvas, paint);
                d(getEndHandleProgress(), f7, canvas, paint);
                d(this.f25083x, this.f25080r, canvas, this.d);
                return;
            }
            return;
        }
        canvas.drawArc(rectF, -90.0f, this.f25081s * 360.0f, false, f50Var);
    }

    public final void e(float f7) {
        float min = Math.min(this.f25081s, 0.016666668f);
        int i10 = this.F;
        if (i10 == 1) {
            float max = Math.max(0.0f, Math.min(this.f25082w - min, f7));
            this.v = max;
            this.f25083x = max;
        } else if (i10 == 2) {
            float max2 = Math.max(this.v + min, Math.min(this.f25081s, f7));
            this.f25082w = max2;
            this.f25083x = max2;
        }
        invalidate();
    }

    public Paint getPaint() {
        return this.e;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f7;
        if (!this.f25084y || this.E) {
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
                f7 = this.f25082w;
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
            e(a(degrees));
            return true;
        } else if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return true;
        } else {
            e(a(degrees));
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
        float max = Math.max(this.v, Math.min(this.f25082w, f7));
        if (this.f25083x == max) {
            return;
        }
        this.f25083x = max;
        invalidate();
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.f25081s == max) {
            return;
        }
        this.f25081s = max;
        invalidate();
    }

    public void setTrimEnabled(boolean z10) {
        if (this.f25084y == z10) {
            return;
        }
        this.f25084y = z10;
        this.F = 0;
        if (z10) {
            this.v = 0.0f;
            this.f25082w = this.f25081s;
            this.f25083x = 0.0f;
        }
        invalidate();
    }

    public void setTrimListener(hm0 hm0Var) {
    }
}
