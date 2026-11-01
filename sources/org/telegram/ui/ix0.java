package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public class ix0 extends org.telegram.ui.Components.g9 implements org.telegram.ui.Components.su0 {
    public static final s0 f38205g0 = new s0("crossfadeProgress", 4);
    public boolean G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Path N;
    public final RectF O;
    public final Paint P;
    public boolean Q;
    public float R;
    public float S;
    public ImageReceiver T;
    public final ImageReceiver U;
    public float V;
    public org.telegram.messenger.lc W;
    public boolean f38206a0;
    public float f38207b0;
    public org.telegram.ui.Components.vg0 f38208c0;
    public boolean f38209d0;
    public float f38210e0;
    public Runnable f38211f0;

    public ix0(Context context) {
        super(context);
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.N = new Path();
        this.O = new RectF();
        this.Q = true;
        this.R = 1.0f;
        this.f38206a0 = true;
        this.f38210e0 = 1.0f;
        this.f38211f0 = null;
        setLayerType(2, null);
        this.U = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void f(Runnable runnable) {
        this.f38211f0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.V;
    }

    public org.telegram.ui.Components.gg getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        if (!this.M) {
            return getRoundRadius()[0];
        }
        return this.K;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vg0 vg0Var = this.f38208c0;
        if (vg0Var != null) {
            vg0Var.invalidate();
        }
        Runnable runnable = this.f38211f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.R();
        org.telegram.messenger.lc lcVar = this.W;
        if (lcVar != null) {
            lcVar.a();
            this.W = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Components.ng0 ng0Var;
        float f7;
        ImageReceiver imageReceiver;
        float f10;
        boolean z11;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.vg0 vg0Var = this.f38208c0;
        boolean z12 = true;
        if (vg0Var != null && vg0Var.getVisibility() == 0 && this.M && this.H > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.Components.ng0 blurDrawer = this.f38208c0.getBlurDrawer();
            if (blurDrawer == null) {
                z12 = false;
            }
            boolean z13 = z12;
            ng0Var = blurDrawer;
            z10 = z13;
        } else {
            ng0Var = null;
        }
        if (this.f38209d0) {
            f7 = (int) org.telegram.messenger.i0.N(3.5f);
        } else {
            f7 = 0.0f;
        }
        float A = org.telegram.messenger.m5.A(1.0f, this.V, this.f38210e0, (1.0f - this.f38207b0) * f7);
        org.telegram.ui.Components.f5 f5Var = this.e;
        if (f5Var != null) {
            imageReceiver = f5Var.f26070k;
        } else {
            imageReceiver = this.f26357a;
        }
        int i11 = this.K;
        if (i11 > 0) {
            Path path = this.N;
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            f10 = 1.0f;
            rectF.set(A, A, measuredWidth - A, measuredHeight - A);
            float f15 = i11;
            path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f10 = 1.0f;
        }
        canvas.save();
        float f16 = this.R;
        float f17 = measuredWidth;
        float f18 = measuredHeight;
        canvas.scale(f16, f16, f17 / 2.0f, f18 / 2.0f);
        if (z10) {
            if (this.G) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f18 - org.telegram.messenger.i0.T1(0.0f, this.L / this.I, this.H));
            }
        }
        ImageReceiver imageReceiver2 = this.T;
        if (imageReceiver2 != null) {
            float f19 = this.S;
            float f20 = (f10 - f19) * f10;
            if (f19 > 0.0f) {
                float f21 = imageReceiver2.K0;
                float f22 = imageReceiver2.L0;
                f11 = 0.0f;
                float f23 = imageReceiver2.M0;
                i10 = 0;
                float f24 = imageReceiver2.N0;
                float alpha = imageReceiver2.getAlpha();
                float f25 = A * 2.0f;
                z11 = z10;
                f14 = f20;
                this.T.y0(A, A, f17 - f25, measuredHeight - f25);
                this.T.setAlpha(f19);
                this.T.h(canvas, null);
                this.T.y0(f21, f22, f23, f24);
                this.T.setAlpha(alpha);
            } else {
                z11 = z10;
                f11 = 0.0f;
                f14 = f20;
                i10 = 0;
            }
            f12 = f14;
        } else {
            z11 = z10;
            f11 = 0.0f;
            i10 = 0;
            f12 = f10;
        }
        if (imageReceiver != null && f12 > f11 && (this.V < f10 || !this.f38206a0)) {
            float f26 = A * 2.0f;
            imageReceiver.y0(A, A, f17 - f26, measuredHeight - f26);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.Q) {
                int i12 = imageReceiver.W0[i10];
                if (z11) {
                    imageReceiver.J0(i10);
                }
                imageReceiver.h(canvas, null);
                if (z11) {
                    imageReceiver.J0(i12);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.V > f11 && this.f38206a0 && f12 > f11) {
            ImageReceiver imageReceiver3 = this.U;
            if (imageReceiver3.t() != null) {
                float f27 = A * 2.0f;
                imageReceiver3.y0(A, A, f17 - f27, measuredHeight - f27);
                imageReceiver3.setAlpha(this.V * f12);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.O;
                float f28 = f11;
                rectF2.set(f28, f28, f17, measuredHeight);
                Paint paint = this.P;
                paint.setAlpha((int) (this.V * f12 * 255.0f));
                float f29 = imageReceiver3.W0[0];
                canvas.drawRoundRect(rectF2, f29, f29, paint);
            }
        }
        if (z11) {
            float f30 = measuredHeight;
            canvas.translate(A, A + f30);
            if (!this.G && !ng0Var.f28816a && this.f38208c0.getRealPosition() != 0) {
                f13 = f10;
            } else {
                f13 = f10 - this.H;
            }
            float f31 = A * 2.0f;
            ng0Var.e(canvas, this, f17 - f31, f30 - f31, true, f13, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.T = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.vg0 vg0Var) {
        this.f38208c0 = vg0Var;
    }

    public void setCrossfadeProgress(float f7) {
        this.S = f7;
        invalidate();
    }

    public void setForegroundAlpha(float f7) {
        this.V = f7;
        invalidate();
    }

    public void setForegroundImageDrawable(org.telegram.messenger.lc lcVar) {
        if (lcVar != null) {
            this.U.w0(lcVar.d);
        }
        org.telegram.messenger.lc lcVar2 = this.W;
        if (lcVar2 != null) {
            lcVar2.a();
            this.W = null;
        }
        this.W = lcVar;
    }

    public void setHasStories(boolean z10) {
        if (this.f38209d0 == z10) {
            return;
        }
        this.f38209d0 = z10;
        invalidate();
    }

    public void setProgressToExpand(float f7) {
        if (this.f38207b0 == f7) {
            return;
        }
        this.f38207b0 = f7;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f7) {
        if (f7 == this.f38210e0) {
            return;
        }
        this.f38210e0 = f7;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.U.J0(i10);
    }

    public void setRoundRadiusCollapse(int i10) {
        int i11 = this.J;
        this.J = i10;
        if (i11 != i10) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i10) {
        if (!this.M) {
            setRoundRadius(i10);
            return;
        }
        this.K = i10;
        setRoundRadius(i10);
    }

    public final void v(int i10) {
        this.L = i10;
        this.M = true;
    }

    public final void w(org.telegram.messenger.jc jcVar, String str, Drawable drawable) {
        this.U.p0(jcVar, str, drawable, 0L, null, null, 0);
        org.telegram.messenger.lc lcVar = this.W;
        if (lcVar != null) {
            lcVar.a();
            this.W = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f38211f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.f38211f0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
