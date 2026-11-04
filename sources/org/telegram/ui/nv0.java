package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public class nv0 extends org.telegram.ui.Components.k9 implements org.telegram.ui.Components.nt0 {
    public static final r0 f48130h0 = new r0("crossfadeProgress", 4);
    public boolean H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Path O;
    public final RectF P;
    public final Paint Q;
    public boolean R;
    public float S;
    public float T;
    public ImageReceiver U;
    public final ImageReceiver V;
    public float W;
    public org.telegram.messenger.cc f48131a0;
    public boolean f48132b0;
    public float f48133c0;
    public org.telegram.ui.Components.vf0 f48134d0;
    public boolean f48135e0;
    public float f48136f0;
    public Runnable f48137g0;

    public nv0(Context context) {
        super(context);
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.O = new Path();
        this.P = new RectF();
        this.R = true;
        this.S = 1.0f;
        this.f48132b0 = true;
        this.f48136f0 = 1.0f;
        this.f48137g0 = null;
        setLayerType(2, null);
        this.V = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.Q = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void f(Runnable runnable) {
        this.f48137g0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.W;
    }

    public org.telegram.ui.Components.ig getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        if (!this.N) {
            return getRoundRadius()[0];
        }
        return this.L;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vf0 vf0Var = this.f48134d0;
        if (vf0Var != null) {
            vf0Var.invalidate();
        }
        Runnable runnable = this.f48137g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.R();
        org.telegram.messenger.cc ccVar = this.f48131a0;
        if (ccVar != null) {
            ccVar.a();
            this.f48131a0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Components.nf0 nf0Var;
        float f10;
        ImageReceiver imageReceiver;
        float f11;
        boolean z11;
        float f12;
        int i3;
        float f13;
        float f14;
        float f15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.vf0 vf0Var = this.f48134d0;
        boolean z12 = true;
        if (vf0Var != null && vf0Var.getVisibility() == 0 && this.N && this.I > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.Components.nf0 blurDrawer = this.f48134d0.getBlurDrawer();
            if (blurDrawer == null) {
                z12 = false;
            }
            boolean z13 = z12;
            nf0Var = blurDrawer;
            z10 = z13;
        } else {
            nf0Var = null;
        }
        if (this.f48135e0) {
            f10 = (int) org.telegram.messenger.g0.N(3.5f);
        } else {
            f10 = 0.0f;
        }
        float A = org.telegram.messenger.k5.A(1.0f, this.W, this.f48136f0, (1.0f - this.f48133c0) * f10);
        org.telegram.ui.Components.g5 g5Var = this.f35345e;
        if (g5Var != null) {
            imageReceiver = g5Var.f33971k;
        } else {
            imageReceiver = this.f35342a;
        }
        int i10 = this.L;
        if (i10 > 0) {
            Path path = this.O;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            f11 = 1.0f;
            rectF.set(A, A, measuredWidth - A, measuredHeight - A);
            float f16 = i10;
            path.addRoundRect(rectF, f16, f16, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f11 = 1.0f;
        }
        canvas.save();
        float f17 = this.S;
        float f18 = measuredWidth;
        float f19 = measuredHeight;
        canvas.scale(f17, f17, f18 / 2.0f, f19 / 2.0f);
        if (z10) {
            if (this.H) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f19 - org.telegram.messenger.g0.T1(0.0f, this.M / this.J, this.I));
            }
        }
        ImageReceiver imageReceiver2 = this.U;
        if (imageReceiver2 != null) {
            float f20 = this.T;
            float f21 = (f11 - f20) * f11;
            if (f20 > 0.0f) {
                float f22 = imageReceiver2.L0;
                float f23 = imageReceiver2.M0;
                f12 = 0.0f;
                float f24 = imageReceiver2.N0;
                i3 = 0;
                float f25 = imageReceiver2.O0;
                float alpha = imageReceiver2.getAlpha();
                float f26 = A * 2.0f;
                z11 = z10;
                f15 = f21;
                this.U.y0(A, A, f18 - f26, measuredHeight - f26);
                this.U.setAlpha(f20);
                this.U.h(canvas, null);
                this.U.y0(f22, f23, f24, f25);
                this.U.setAlpha(alpha);
            } else {
                z11 = z10;
                f12 = 0.0f;
                f15 = f21;
                i3 = 0;
            }
            f13 = f15;
        } else {
            z11 = z10;
            f12 = 0.0f;
            i3 = 0;
            f13 = f11;
        }
        if (imageReceiver != null && f13 > f12 && (this.W < f11 || !this.f48132b0)) {
            float f27 = A * 2.0f;
            imageReceiver.y0(A, A, f18 - f27, measuredHeight - f27);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f13);
            if (this.R) {
                int i11 = imageReceiver.X0[i3];
                if (z11) {
                    imageReceiver.J0(i3);
                }
                imageReceiver.h(canvas, null);
                if (z11) {
                    imageReceiver.J0(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.W > f12 && this.f48132b0 && f13 > f12) {
            ImageReceiver imageReceiver3 = this.V;
            if (imageReceiver3.t() != null) {
                float f28 = A * 2.0f;
                imageReceiver3.y0(A, A, f18 - f28, measuredHeight - f28);
                imageReceiver3.setAlpha(this.W * f13);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.P;
                float f29 = f12;
                rectF2.set(f29, f29, f18, measuredHeight);
                Paint paint = this.Q;
                paint.setAlpha((int) (this.W * f13 * 255.0f));
                float f30 = imageReceiver3.X0[0];
                canvas.drawRoundRect(rectF2, f30, f30, paint);
            }
        }
        if (z11) {
            float f31 = measuredHeight;
            canvas.translate(A, A + f31);
            if (!this.H && !nf0Var.f36498a && this.f48134d0.getRealPosition() != 0) {
                f14 = f11;
            } else {
                f14 = f11 - this.I;
            }
            float f32 = A * 2.0f;
            nf0Var.e(canvas, this, f18 - f32, f31 - f32, true, f14, f13);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.U = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.vf0 vf0Var) {
        this.f48134d0 = vf0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.T = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.W = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(org.telegram.messenger.cc ccVar) {
        if (ccVar != null) {
            this.V.w0(ccVar.d);
        }
        org.telegram.messenger.cc ccVar2 = this.f48131a0;
        if (ccVar2 != null) {
            ccVar2.a();
            this.f48131a0 = null;
        }
        this.f48131a0 = ccVar;
    }

    public void setHasStories(boolean z10) {
        if (this.f48135e0 == z10) {
            return;
        }
        this.f48135e0 = z10;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.f48133c0 == f10) {
            return;
        }
        this.f48133c0 = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.f48136f0) {
            return;
        }
        this.f48136f0 = f10;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i3) {
        super.setRoundRadius(i3);
        this.V.J0(i3);
    }

    public void setRoundRadiusCollapse(int i3) {
        int i10 = this.K;
        this.K = i3;
        if (i10 != i3) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i3) {
        if (!this.N) {
            setRoundRadius(i3);
            return;
        }
        this.L = i3;
        setRoundRadius(i3);
    }

    public final void v(int i3) {
        this.M = i3;
        this.N = true;
    }

    public final void w(org.telegram.messenger.ac acVar, String str, Drawable drawable) {
        this.V.p0(acVar, str, drawable, 0L, null, null, 0);
        org.telegram.messenger.cc ccVar = this.f48131a0;
        if (ccVar != null) {
            ccVar.a();
            this.f48131a0 = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f48137g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        super.invalidate(i3, i10, i11, i12);
        Runnable runnable = this.f48137g0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
