package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hs;
public final class b6 extends FrameLayout {
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
    public final int f34658a;
    public final x5 f34659a0;
    public final int f34660b;
    public float f34661b0;
    public View f34662c;
    public Runnable f34663c0;
    public a6 d;
    public float f34664d0;
    public z5 f34665e;
    public double f34666e0;
    public sg.g f34667f;
    public long f34668f0;
    public float f34669g0;
    public fk0 h;
    public float f34670h0;
    public float f34671i0;
    public final x5 f34672j0;
    public int f34673k0;
    public final y5 f34674l0;
    public boolean f34675n;
    public boolean f34676r;
    public boolean f34677s;
    public boolean v;
    public boolean f34678w;
    public boolean f34679x;
    public int f34680y;

    public b6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.b6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(b6 b6Var) {
        if (b6Var.f34667f != null && b6Var.f34676r && !b6Var.f34679x) {
            b6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(b6 b6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && b6Var.f34667f != null) {
            b6Var.setRenderScale(1.0f);
        }
    }

    public static void c(b6 b6Var) {
        if (b6Var.f34667f != null) {
            b6Var.h(false);
            b6Var.f34673k0++;
            b6Var.removeCallbacks(b6Var.f34674l0);
            Choreographer.getInstance().removeFrameCallback(b6Var.f34672j0);
            b6Var.f34668f0 = 0L;
            b6Var.f34664d0 = 0.0f;
            b6Var.m(null);
            b6Var.setIdleAnimationEnabled(false);
            b6Var.setRendererPaused(true);
            a6 a6Var = b6Var.d;
            if (a6Var != null) {
                a6Var.setPaused(true);
                a6Var.onPause();
            }
            z5 z5Var = b6Var.f34665e;
            if (z5Var != null) {
                z5Var.o();
            }
            b6Var.removeView(b6Var.f34662c);
            b6Var.d = null;
            b6Var.f34665e = null;
            b6Var.f34667f = null;
            b6Var.g();
            View view = b6Var.f34662c;
            int i10 = b6Var.f34658a;
            b6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            b6Var.f34676r = false;
            if (b6Var.f34661b0 != 0.0f) {
                b6Var.h.getAnimatedDrawable().K(1);
            }
            b6Var.j();
            Runnable runnable = b6Var.f34663c0;
            b6Var.f34663c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setIdleAnimationEnabled(z10);
        }
        z5 z5Var = this.f34665e;
        if (z5Var != null) {
            z5Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setRenderScale(f7);
        }
        if (this.f34665e != null) {
            this.f34667f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setPaused(z10);
        }
        z5 z5Var = this.f34665e;
        if (z5Var != null) {
            z5Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f34667f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.f34662c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f16938u = lVar;
            this.J.e(0.001f);
            this.J.b(new v5(this, 0));
            this.J.a(new w5(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        sg.g gVar = this.f34667f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f34669g0;
        float f11 = this.f34671i0;
        gVar.d = com.google.android.gms.internal.vision.e2.y(1.0f, f11, f10, f7);
        gVar.f48044i = com.google.android.gms.internal.vision.e2.y(1.0f, f11, this.f34670h0, this.H);
    }

    public final void f(b6 b6Var) {
        sg.g gVar;
        if (b6Var != null && (gVar = b6Var.f34667f) != null && this.f34667f != null) {
            this.G = gVar.d;
            this.H = gVar.f48044i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        fk0 fk0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f34660b;
        fk0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f34662c = this.h;
        setOnClickListener(new i3(this, 3));
        setClickable(!this.f34679x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        sg.g gVar = this.f34667f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f48044i + gVar.f48045j);
    }

    public float getFlightYaw() {
        sg.g gVar = this.f34667f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f48042f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f34680y != -1) {
            this.f34680y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            sg.g gVar = this.f34667f;
            if (gVar != null) {
                if (z10) {
                    this.f34669g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f34670h0 = (float) Math.IEEEremainder(this.f34667f.f48044i - this.H, 360.0d);
                    this.f34671i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(hs.h);
                    this.I.addUpdateListener(new s2(this, 5));
                    this.I.addListener(new w4(this, 3));
                    this.I.start();
                } else {
                    this.f34671i0 = 1.0f;
                    this.f34670h0 = 0.0f;
                    this.f34669g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f34671i0 = 1.0f;
            this.f34670h0 = 0.0f;
            this.f34669g0 = 0.0f;
            e();
        }
        if (this.f34662c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.k kVar = this.J;
            if (kVar != null) {
                kVar.c();
                this.J = null;
            }
            this.f34662c.setScaleX(1.0f);
            this.f34662c.setScaleY(1.0f);
            if (this.f34667f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f34679x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f34674l0);
        setClickable(false);
        if (this.f34667f != null) {
            a6 a6Var = this.d;
            if (a6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                a6Var.J = max;
                a6Var.f48027a.h = a6Var.I / max;
                a6Var.f();
            }
            setIdleAnimationEnabled(false);
            sg.g gVar = this.f34667f;
            this.G = gVar.d;
            this.H = gVar.f48044i;
            if (this.f34676r) {
                Choreographer choreographer = Choreographer.getInstance();
                x5 x5Var = this.f34672j0;
                choreographer.removeFrameCallback(x5Var);
                this.f34668f0 = 0L;
                Choreographer.getInstance().postFrameCallback(x5Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f34677s && this.f34675n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34676r != z10) {
            this.f34676r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f34673k0 + 1;
            this.f34673k0 = i10;
            if (this.f34667f != null) {
                removeCallbacks(this.f34674l0);
                setIdleAnimationEnabled(false);
                if (this.f34679x) {
                    x5 x5Var = this.f34672j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(x5Var);
                        this.f34668f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(x5Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(x5Var);
                        this.f34668f0 = 0L;
                        this.f34664d0 = 0.0f;
                    }
                } else if (z10) {
                    sg.g gVar = this.f34667f;
                    gVar.d = 0.0f;
                    gVar.f48044i = 0.0f;
                    m(new r(this, i10, 1));
                }
                setRendererPaused(!z10);
                return;
            }
            fk0 fk0Var = this.h;
            if (fk0Var != null) {
                if (z10) {
                    if (!this.v || this.f34678w) {
                        fk0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f34678w = fk0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        sg.g gVar = this.f34667f;
        if (gVar != null) {
            gVar.f48042f = this.T + this.L;
            return;
        }
        fk0 fk0Var = this.h;
        if (fk0Var != null) {
            fk0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f34663c0 = runnable;
        if (this.f34667f != null) {
            m(new y5(this, 1));
        } else if (runnable != null) {
            post(new y5(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.v = runnable;
            if (a6Var.f48034s && runnable != null) {
                a6Var.v = null;
                runnable.run();
            }
        }
        z5 z5Var = this.f34665e;
        if (z5Var != null) {
            z5Var.U = runnable;
            if (z5Var.T && runnable != null) {
                z5Var.U = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34675n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34675n = false;
        Choreographer.getInstance().removeFrameCallback(this.f34659a0);
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
        if ((isEnabled() && this.f34679x && this.f34667f != null && this.f34676r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f34658a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f34662c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f34679x && this.f34667f != null && this.f34676r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f34680y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f34680y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f34680y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34680y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        sg.g gVar = this.f34667f;
                        gVar.d = com.google.android.gms.internal.vision.e2.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        sg.g gVar2 = this.f34667f;
                        gVar2.f48044i = com.google.android.gms.internal.vision.e2.y(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f48044i);
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
            this.f34664d0 = 0.0f;
            this.f34680y = motionEvent.getPointerId(0);
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
        this.f34661b0 = f7;
        i();
        setEnabled(false);
        fk0 fk0Var = this.h;
        if (fk0Var != null) {
            fk0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        sg.g gVar = this.f34667f;
        if (gVar != null) {
            gVar.f48043g = f7 + this.M;
            return;
        }
        fk0 fk0Var = this.h;
        if (fk0Var != null) {
            fk0Var.setRotation(f7 + this.M);
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
        sg.g gVar = this.f34667f;
        if (gVar != null) {
            gVar.f48045j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f34662c.setScaleX(f12);
        this.f34662c.setScaleY(f12);
        if (this.f34667f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        sg.g gVar = this.f34667f;
        if (gVar != null) {
            gVar.f48043g = this.K + this.M;
            return;
        }
        fk0 fk0Var = this.h;
        if (fk0Var != null) {
            fk0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f34677s = z10;
        j();
    }

    public void setStarParticlesView(rg.w1 w1Var) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setStarParticlesView(w1Var);
        }
        z5 z5Var = this.f34665e;
        if (z5Var != null) {
            z5Var.setStarParticlesView(w1Var);
        }
    }
}
