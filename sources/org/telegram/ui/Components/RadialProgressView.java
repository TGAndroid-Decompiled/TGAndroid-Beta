package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public class RadialProgressView extends View {
    public float A;
    public int B;
    public float C;
    public boolean D;
    public float E;
    public boolean F;

    public long f26487a;

    public float f26488b;

    public float f26489c;
    public boolean d;

    public float f26490e;

    public final RectF f26491f;
    public boolean h;

    public float f26492n;

    public int f26493r;

    public final DecelerateInterpolator f26494s;
    public final AccelerateInterpolator v;

    public final Paint f26495w;

    public int f26496x;

    public float f26497y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f26496x / 2.0f;
        RectF rectF = this.f26491f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.f26488b;
        float f14 = this.f26489c;
        this.f26492n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.f26495w);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f26487a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f26487a = jCurrentTimeMillis;
        b(j10);
    }

    public final void b(long j10) {
        float f10;
        float f11;
        float f12 = ((360 * j10) / 2000.0f) + this.f26488b;
        this.f26488b = f12 - (((int) (f12 / 360.0f)) * 360);
        boolean z10 = this.D;
        if (z10) {
            float f13 = this.E;
            if (f13 != 1.0f) {
                float f14 = f13 + 0.07272727f;
                this.E = f14;
                if (f14 > 1.0f) {
                    this.E = 1.0f;
                }
            } else if (!z10) {
                f10 = this.E;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.04f;
                    this.E = f11;
                    if (f11 < 0.0f) {
                        this.E = 0.0f;
                    }
                }
            }
        } else if (!z10) {
            f10 = this.E;
            if (f10 != 0.0f) {
                f11 = f10 - 0.04f;
                this.E = f11;
                if (f11 < 0.0f) {
                    this.E = 0.0f;
                }
            }
        }
        if (this.F) {
            float f15 = this.E;
            DecelerateInterpolator decelerateInterpolator = this.f26494s;
            AccelerateInterpolator accelerateInterpolator = this.v;
            if (f15 == 0.0f) {
                float f16 = this.f26490e + j10;
                this.f26490e = f16;
                if (f16 >= 500.0f) {
                    this.f26490e = 500.0f;
                }
                if (this.d) {
                    this.f26489c = (accelerateInterpolator.getInterpolation(this.f26490e / 500.0f) * 266.0f) + 4.0f;
                } else {
                    this.f26489c = 4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.f26490e / 500.0f)) * 270.0f);
                }
                if (this.f26490e == 500.0f) {
                    boolean z11 = this.d;
                    if (z11) {
                        this.f26488b += 270.0f;
                        this.f26489c = -266.0f;
                    }
                    this.d = !z11;
                    this.f26490e = 0.0f;
                }
            } else if (this.d) {
                float f17 = this.f26489c;
                float interpolation = (this.E * 360.0f) + (accelerateInterpolator.getInterpolation(this.f26490e / 500.0f) * 266.0f) + 4.0f;
                this.f26489c = interpolation;
                float f18 = f17 - interpolation;
                if (f18 > 0.0f) {
                    this.f26488b = f18 + this.f26488b;
                }
            } else {
                float f19 = this.f26489c;
                float interpolation2 = (4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.f26490e / 500.0f)) * 270.0f)) - (this.E * 364.0f);
                this.f26489c = interpolation2;
                float f20 = f19 - interpolation2;
                if (f20 > 0.0f) {
                    this.f26488b = f20 + this.f26488b;
                }
            }
        } else {
            float f21 = this.f26497y;
            float f22 = this.A;
            float f23 = f21 - f22;
            if (f23 > 0.0f) {
                int i10 = (int) (((long) this.B) + j10);
                this.B = i10;
                float f24 = i10;
                if (f24 >= 200.0f) {
                    this.A = f21;
                    this.C = f21;
                    this.B = 0;
                } else {
                    this.C = (AndroidUtilities.decelerateInterpolator.getInterpolation(f24 / 200.0f) * f23) + f22;
                }
            }
            this.f26489c = Math.max(4.0f, this.C * 360.0f);
        }
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.f26496x) / 2;
        int measuredHeight = getMeasuredHeight();
        int i10 = this.f26496x;
        int i11 = (measuredHeight - i10) / 2;
        RectF rectF = this.f26491f;
        rectF.set(measuredWidth, i11, measuredWidth + i10, i11 + i10);
        float f10 = this.f26488b;
        float f11 = this.f26489c;
        this.f26492n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.f26495w);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f26487a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f26487a = jCurrentTimeMillis;
        b(j10);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.h) {
            Drawable background = getBackground();
            int i10 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i10);
            }
            this.f26495w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.F = z10;
    }

    public void setProgress(float f10) {
        this.f26497y = f10;
        if (this.C > f10) {
            this.C = f10;
        }
        this.A = this.C;
        this.B = 0;
    }

    public void setProgressColor(int i10) {
        this.f26493r = i10;
        this.f26495w.setColor(i10);
    }

    public void setSize(int i10) {
        this.f26496x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f26495w.setStrokeWidth(AndroidUtilities.dp(f10));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26491f = new RectF();
        this.F = true;
        this.f26496x = AndroidUtilities.dp(40.0f);
        this.f26493r = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23125h6, c6Var);
        this.f26494s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.f26495w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.f26493r);
    }
}
