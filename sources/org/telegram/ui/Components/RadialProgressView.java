package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.HashSet;
public class RadialProgressView extends View implements snb {
    public float E;
    public float F;
    public int G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public final vnb L;
    public int M;
    public int N;
    public long a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public final RectF f;
    public boolean h;
    public float n;
    public int r;
    public final DecelerateInterpolator s;
    public final AccelerateInterpolator w;
    public final Paint x;
    public int y;

    public RadialProgressView(Context context, vnb vnbVar) {
        super(context);
        this.f = new RectF();
        this.K = true;
        int i = aob.h6;
        this.M = i;
        this.L = vnbVar;
        this.y = hl.L(40.0f);
        this.r = aob.v0(i, vnbVar);
        this.s = new DecelerateInterpolator();
        this.w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.L(3.0f));
        paint.setColor(this.r);
        this.N = this.r;
    }

    public final void a(Canvas canvas, float f, float f2) {
        float f3 = this.y / 2.0f;
        RectF rectF = this.f;
        rectF.set(f - f3, f2 - f3, f + f3, f3 + f2);
        float f4 = this.b;
        float f5 = this.c;
        this.n = f5;
        canvas.drawArc(rectF, f4, f5, false, this.x);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        if (j > 17) {
            j = 17;
        }
        this.a = currentTimeMillis;
        b(j);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    public final void b(long j) {
        float f;
        this.b = ((((float) (360 * j)) / 2000.0f) + this.b) - (((int) (f / 360.0f)) * 360);
        boolean z = this.I;
        float f2 = this.J;
        if (z) {
            if (f2 != 1.0f) {
                f2 += 0.07272727f;
                this.J = f2;
                if (f2 > 1.0f) {
                    this.J = 1.0f;
                    f2 = 1.0f;
                }
            }
        } else if (f2 != 0.0f) {
            f2 -= 0.04f;
            this.J = f2;
            if (f2 < 0.0f) {
                this.J = 0.0f;
                f2 = 0.0f;
            }
        }
        if (this.K) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            DecelerateInterpolator decelerateInterpolator = this.s;
            AccelerateInterpolator accelerateInterpolator = this.w;
            if (i == 0) {
                float f3 = this.e + ((float) j);
                this.e = f3;
                if (f3 >= 500.0f) {
                    this.e = 500.0f;
                    f3 = 500.0f;
                }
                float f4 = f3 / 500.0f;
                if (this.d) {
                    this.c = (accelerateInterpolator.getInterpolation(f4) * 266.0f) + 4.0f;
                } else {
                    this.c = 4.0f - ((1.0f - decelerateInterpolator.getInterpolation(f4)) * 270.0f);
                }
                if (this.e == 500.0f) {
                    boolean z2 = this.d;
                    if (z2) {
                        this.b += 270.0f;
                        this.c = -266.0f;
                    }
                    this.d = !z2;
                    this.e = 0.0f;
                }
            } else {
                boolean z3 = this.d;
                float f5 = this.c;
                float f6 = this.e / 500.0f;
                if (z3) {
                    float interpolation = (this.J * 360.0f) + (accelerateInterpolator.getInterpolation(f6) * 266.0f) + 4.0f;
                    this.c = interpolation;
                    float f7 = f5 - interpolation;
                    if (f7 > 0.0f) {
                        this.b = f7 + this.b;
                    }
                } else {
                    float interpolation2 = (4.0f - ((1.0f - decelerateInterpolator.getInterpolation(f6)) * 270.0f)) - (this.J * 364.0f);
                    this.c = interpolation2;
                    float f8 = f5 - interpolation2;
                    if (f8 > 0.0f) {
                        this.b = f8 + this.b;
                    }
                }
            }
        } else {
            float f9 = this.E;
            float f10 = this.F;
            float f11 = f9 - f10;
            if (f11 > 0.0f) {
                int i2 = (int) (this.G + j);
                this.G = i2;
                float f12 = i2;
                if (f12 >= 200.0f) {
                    this.F = f9;
                    this.H = f9;
                    this.G = 0;
                } else {
                    this.H = (hl.F.getInterpolation(f12 / 200.0f) * f11) + f10;
                }
            }
            this.c = Math.max(4.0f, this.H * 360.0f);
        }
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int i;
        int measuredHeight;
        RectF rectF = this.f;
        rectF.set((getMeasuredWidth() - this.y) / 2, (getMeasuredHeight() - this.y) / 2, measuredWidth + i, measuredHeight + i);
        float f = this.b;
        float f2 = this.c;
        this.n = f2;
        canvas.drawArc(rectF, f, f2, false, this.x);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        if (j > 17) {
            j = 17;
        }
        this.a = currentTimeMillis;
        b(j);
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (this.h) {
            Drawable background = getBackground();
            int i = (int) (f * 255.0f);
            if (background != null) {
                background.setAlpha(i);
            }
            this.x.setAlpha(i);
        }
    }

    public void setNoProgress(boolean z) {
        this.K = z;
    }

    public void setProgress(float f) {
        this.E = f;
        float f2 = this.H;
        if (f2 > f) {
            this.H = f;
        } else {
            f = f2;
        }
        this.F = f;
        this.G = 0;
    }

    public void setProgressColor(int i) {
        this.r = i;
        this.x.setColor(i);
    }

    public void setProgressColorKey(int i) {
        this.M = i;
        setProgressColor(aob.v0(i, this.L));
        this.N = this.r;
    }

    public void setSize(int i) {
        this.y = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.x.setStrokeWidth(hl.L(f));
    }

    public void setUseSelfAlpha(boolean z) {
        this.h = z;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.x;
        if (paint != null) {
            try {
                if (this.r == this.N) {
                    int v0 = aob.v0(this.M, this.L);
                    this.N = v0;
                    if (v0 != this.r) {
                        int alpha = paint.getAlpha();
                        setProgressColor(v0);
                        this.N = v0;
                        if (this.h) {
                            paint.setAlpha(alpha);
                        }
                        invalidate();
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public RadialProgressView(Context context) {
        this(context, null);
    }
}
