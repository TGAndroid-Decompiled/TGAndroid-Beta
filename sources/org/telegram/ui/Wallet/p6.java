package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.vf1;
public final class p6 extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public o1.k J;
    public float K;
    public float L;
    public float M;
    public float N;
    public o1.k O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int f34727a;
    public final l6 f34728a0;
    public final int f34729b;
    public float f34730b0;
    public View f34731c;
    public Runnable f34732c0;
    public o6 d;
    public float f34733d0;
    public n6 e;
    public double f34734e0;
    public tg.g f34735f;
    public long f34736f0;
    public float f34737g0;
    public xj0 h;
    public float f34738h0;
    public float f34739i0;
    public final l6 f34740j0;
    public int f34741k0;
    public final m6 f34742l0;
    public boolean f34743n;
    public boolean f34744r;
    public boolean f34745s;
    public boolean v;
    public boolean f34746w;
    public boolean f34747x;
    public int f34748y;

    public p6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(p6 p6Var) {
        if (p6Var.f34735f != null && p6Var.f34744r && !p6Var.f34747x) {
            p6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(p6 p6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && p6Var.f34735f != null) {
            p6Var.setRenderScale(1.0f);
        }
    }

    public static void c(p6 p6Var) {
        if (p6Var.f34735f != null) {
            p6Var.h(false);
            p6Var.f34741k0++;
            p6Var.removeCallbacks(p6Var.f34742l0);
            Choreographer.getInstance().removeFrameCallback(p6Var.f34740j0);
            p6Var.f34736f0 = 0L;
            p6Var.f34733d0 = 0.0f;
            p6Var.m(null);
            p6Var.setIdleAnimationEnabled(false);
            p6Var.setRendererPaused(true);
            o6 o6Var = p6Var.d;
            if (o6Var != null) {
                o6Var.setPaused(true);
                o6Var.onPause();
            }
            n6 n6Var = p6Var.e;
            if (n6Var != null) {
                n6Var.o();
            }
            p6Var.removeView(p6Var.f34731c);
            p6Var.d = null;
            p6Var.e = null;
            p6Var.f34735f = null;
            p6Var.g();
            View view = p6Var.f34731c;
            int i10 = p6Var.f34727a;
            p6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            p6Var.f34744r = false;
            if (p6Var.f34730b0 != 0.0f) {
                p6Var.h.getAnimatedDrawable().K(1);
            }
            p6Var.j();
            Runnable runnable = p6Var.f34732c0;
            p6Var.f34732c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        o6 o6Var = this.d;
        if (o6Var != null) {
            o6Var.setIdleAnimationEnabled(z10);
        }
        n6 n6Var = this.e;
        if (n6Var != null) {
            n6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        o6 o6Var = this.d;
        if (o6Var != null) {
            o6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f34735f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        o6 o6Var = this.d;
        if (o6Var != null) {
            o6Var.setPaused(z10);
        }
        n6 n6Var = this.e;
        if (n6Var != null) {
            n6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f34735f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.f34731c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f17555u = lVar;
            this.J.e(0.001f);
            this.J.b(new j6(this, 0));
            this.J.a(new k6(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        tg.g gVar = this.f34735f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f34737g0;
        float f11 = this.f34739i0;
        gVar.d = com.google.android.gms.internal.cast.a6.x(1.0f, f11, f10, f7);
        gVar.f47095i = com.google.android.gms.internal.cast.a6.x(1.0f, f11, this.f34738h0, this.H);
    }

    public final void f(p6 p6Var) {
        tg.g gVar;
        if (p6Var != null && (gVar = p6Var.f34735f) != null && this.f34735f != null) {
            this.G = gVar.d;
            this.H = gVar.f47095i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        xj0 xj0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f34729b;
        xj0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f34731c = this.h;
        setOnClickListener(new t2(this, 4));
        setClickable(!this.f34747x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        tg.g gVar = this.f34735f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f47095i + gVar.f47096j);
    }

    public float getFlightYaw() {
        tg.g gVar = this.f34735f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f47093f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f34748y != -1) {
            this.f34748y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            tg.g gVar = this.f34735f;
            if (gVar != null) {
                if (z10) {
                    this.f34737g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f34738h0 = (float) Math.IEEEremainder(this.f34735f.f47095i - this.H, 360.0d);
                    this.f34739i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(bs.h);
                    this.I.addUpdateListener(new u2(this, 5));
                    this.I.addListener(new vf1(this, 8));
                    this.I.start();
                } else {
                    this.f34739i0 = 1.0f;
                    this.f34738h0 = 0.0f;
                    this.f34737g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f34739i0 = 1.0f;
            this.f34738h0 = 0.0f;
            this.f34737g0 = 0.0f;
            e();
        }
        if (this.f34731c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.k kVar = this.J;
            if (kVar != null) {
                kVar.c();
                this.J = null;
            }
            this.f34731c.setScaleX(1.0f);
            this.f34731c.setScaleY(1.0f);
            if (this.f34735f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f34747x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f34742l0);
        setClickable(false);
        if (this.f34735f != null) {
            o6 o6Var = this.d;
            if (o6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                o6Var.J = max;
                o6Var.f47080a.h = o6Var.I / max;
                o6Var.f();
            }
            setIdleAnimationEnabled(false);
            tg.g gVar = this.f34735f;
            this.G = gVar.d;
            this.H = gVar.f47095i;
            if (this.f34744r) {
                Choreographer choreographer = Choreographer.getInstance();
                l6 l6Var = this.f34740j0;
                choreographer.removeFrameCallback(l6Var);
                this.f34736f0 = 0L;
                Choreographer.getInstance().postFrameCallback(l6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f34745s && this.f34743n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34744r != z10) {
            this.f34744r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f34741k0 + 1;
            this.f34741k0 = i10;
            if (this.f34735f != null) {
                removeCallbacks(this.f34742l0);
                setIdleAnimationEnabled(false);
                if (this.f34747x) {
                    l6 l6Var = this.f34740j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(l6Var);
                        this.f34736f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(l6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(l6Var);
                        this.f34736f0 = 0L;
                        this.f34733d0 = 0.0f;
                    }
                } else if (z10) {
                    tg.g gVar = this.f34735f;
                    gVar.d = 0.0f;
                    gVar.f47095i = 0.0f;
                    m(new j(this, i10, 2));
                }
                setRendererPaused(!z10);
                return;
            }
            xj0 xj0Var = this.h;
            if (xj0Var != null) {
                if (z10) {
                    if (!this.v || this.f34746w) {
                        xj0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f34746w = xj0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        tg.g gVar = this.f34735f;
        if (gVar != null) {
            gVar.f47093f = this.T + this.L;
            return;
        }
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f34732c0 = runnable;
        if (this.f34735f != null) {
            m(new m6(this, 1));
        } else if (runnable != null) {
            post(new m6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        o6 o6Var = this.d;
        if (o6Var != null) {
            o6Var.v = runnable;
            if (o6Var.f47086s && runnable != null) {
                o6Var.v = null;
                runnable.run();
            }
        }
        n6 n6Var = this.e;
        if (n6Var != null) {
            n6Var.U = runnable;
            if (n6Var.T && runnable != null) {
                n6Var.U = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34743n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34743n = false;
        Choreographer.getInstance().removeFrameCallback(this.f34728a0);
        o1.k kVar = this.O;
        if (kVar != null) {
            kVar.c();
            this.O = null;
            setTranslationX(0.0f);
        }
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = 0L;
        this.W = false;
        this.S = false;
        this.V = 0L;
        this.U = 0.0f;
        this.T = 0.0f;
        k();
        j();
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((isEnabled() && this.f34747x && this.f34735f != null && this.f34744r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f34727a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f34731c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f34747x && this.f34735f != null && this.f34744r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f34748y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f34748y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f34748y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34748y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        tg.g gVar = this.f34735f;
                        gVar.d = com.google.android.gms.internal.cast.a6.x(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        tg.g gVar2 = this.f34735f;
                        gVar2.f47095i = com.google.android.gms.internal.cast.a6.x(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f47095i);
                        this.E = motionEvent.getX(findPointerIndex);
                        this.F = motionEvent.getY(findPointerIndex);
                        return true;
                    }
                }
                h(true);
                return true;
            }
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
                this.I = null;
            }
            this.f34733d0 = 0.0f;
            this.f34748y = motionEvent.getPointerId(0);
            this.E = motionEvent.getX();
            this.F = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            d(3.0f);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        j();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j();
    }

    @Override
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        j();
    }

    public void setContinuousRotation(float f7) {
        this.f34730b0 = f7;
        i();
        setEnabled(false);
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        tg.g gVar = this.f34735f;
        if (gVar != null) {
            gVar.f47094g = f7 + this.M;
            return;
        }
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.setRotation(f7 + this.M);
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            h(false);
        }
    }

    public void setHeaderTilt(float f7) {
        tg.g gVar = this.f34735f;
        if (gVar != null) {
            gVar.f47096j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f34731c.setScaleX(f12);
        this.f34731c.setScaleY(f12);
        if (this.f34735f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        tg.g gVar = this.f34735f;
        if (gVar != null) {
            gVar.f47094g = this.K + this.M;
            return;
        }
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f34745s = z10;
        j();
    }

    public void setStarParticlesView(sg.w1 w1Var) {
        o6 o6Var = this.d;
        if (o6Var != null) {
            o6Var.setStarParticlesView(w1Var);
        }
        n6 n6Var = this.e;
        if (n6Var != null) {
            n6Var.setStarParticlesView(w1Var);
        }
    }
}
