package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.is;
public final class d6 extends FrameLayout {
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
    public final int f34818a;
    public final z5 f34819a0;
    public final int f34820b;
    public float f34821b0;
    public View f34822c;
    public Runnable f34823c0;
    public c6 d;
    public float f34824d0;
    public b6 f34825e;
    public double f34826e0;
    public sg.g f34827f;
    public long f34828f0;
    public float f34829g0;
    public gk0 h;
    public float f34830h0;
    public float f34831i0;
    public final z5 f34832j0;
    public int f34833k0;
    public final a6 f34834l0;
    public boolean f34835n;
    public boolean f34836r;
    public boolean f34837s;
    public boolean v;
    public boolean f34838w;
    public boolean f34839x;
    public int f34840y;

    public d6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(d6 d6Var) {
        if (d6Var.f34827f != null && d6Var.f34836r && !d6Var.f34839x) {
            d6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(d6 d6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && d6Var.f34827f != null) {
            d6Var.setRenderScale(1.0f);
        }
    }

    public static void c(d6 d6Var) {
        if (d6Var.f34827f != null) {
            d6Var.h(false);
            d6Var.f34833k0++;
            d6Var.removeCallbacks(d6Var.f34834l0);
            Choreographer.getInstance().removeFrameCallback(d6Var.f34832j0);
            d6Var.f34828f0 = 0L;
            d6Var.f34824d0 = 0.0f;
            d6Var.m(null);
            d6Var.setIdleAnimationEnabled(false);
            d6Var.setRendererPaused(true);
            c6 c6Var = d6Var.d;
            if (c6Var != null) {
                c6Var.setPaused(true);
                c6Var.onPause();
            }
            b6 b6Var = d6Var.f34825e;
            if (b6Var != null) {
                b6Var.o();
            }
            d6Var.removeView(d6Var.f34822c);
            d6Var.d = null;
            d6Var.f34825e = null;
            d6Var.f34827f = null;
            d6Var.g();
            View view = d6Var.f34822c;
            int i10 = d6Var.f34818a;
            d6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            d6Var.f34836r = false;
            if (d6Var.f34821b0 != 0.0f) {
                d6Var.h.getAnimatedDrawable().K(1);
            }
            d6Var.j();
            Runnable runnable = d6Var.f34823c0;
            d6Var.f34823c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        c6 c6Var = this.d;
        if (c6Var != null) {
            c6Var.setIdleAnimationEnabled(z10);
        }
        b6 b6Var = this.f34825e;
        if (b6Var != null) {
            b6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        c6 c6Var = this.d;
        if (c6Var != null) {
            c6Var.setRenderScale(f7);
        }
        if (this.f34825e != null) {
            this.f34827f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        c6 c6Var = this.d;
        if (c6Var != null) {
            c6Var.setPaused(z10);
        }
        b6 b6Var = this.f34825e;
        if (b6Var != null) {
            b6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f34827f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.f34822c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f16942u = lVar;
            this.J.e(0.001f);
            this.J.b(new x5(this, 0));
            this.J.a(new y5(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        sg.g gVar = this.f34827f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f34829g0;
        float f11 = this.f34831i0;
        gVar.d = com.google.android.gms.internal.vision.e2.y(1.0f, f11, f10, f7);
        gVar.f48090i = com.google.android.gms.internal.vision.e2.y(1.0f, f11, this.f34830h0, this.H);
    }

    public final void f(d6 d6Var) {
        sg.g gVar;
        if (d6Var != null && (gVar = d6Var.f34827f) != null && this.f34827f != null) {
            this.G = gVar.d;
            this.H = gVar.f48090i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        gk0 gk0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f34820b;
        gk0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f34822c = this.h;
        setOnClickListener(new k3(this, 3));
        setClickable(!this.f34839x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        sg.g gVar = this.f34827f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f48090i + gVar.f48091j);
    }

    public float getFlightYaw() {
        sg.g gVar = this.f34827f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f48088f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f34840y != -1) {
            this.f34840y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            sg.g gVar = this.f34827f;
            if (gVar != null) {
                if (z10) {
                    this.f34829g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f34830h0 = (float) Math.IEEEremainder(this.f34827f.f48090i - this.H, 360.0d);
                    this.f34831i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(is.h);
                    this.I.addUpdateListener(new t2(this, 5));
                    this.I.addListener(new y4(this, 3));
                    this.I.start();
                } else {
                    this.f34831i0 = 1.0f;
                    this.f34830h0 = 0.0f;
                    this.f34829g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f34831i0 = 1.0f;
            this.f34830h0 = 0.0f;
            this.f34829g0 = 0.0f;
            e();
        }
        if (this.f34822c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.k kVar = this.J;
            if (kVar != null) {
                kVar.c();
                this.J = null;
            }
            this.f34822c.setScaleX(1.0f);
            this.f34822c.setScaleY(1.0f);
            if (this.f34827f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f34839x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f34834l0);
        setClickable(false);
        if (this.f34827f != null) {
            c6 c6Var = this.d;
            if (c6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                c6Var.J = max;
                c6Var.f48073a.h = c6Var.I / max;
                c6Var.f();
            }
            setIdleAnimationEnabled(false);
            sg.g gVar = this.f34827f;
            this.G = gVar.d;
            this.H = gVar.f48090i;
            if (this.f34836r) {
                Choreographer choreographer = Choreographer.getInstance();
                z5 z5Var = this.f34832j0;
                choreographer.removeFrameCallback(z5Var);
                this.f34828f0 = 0L;
                Choreographer.getInstance().postFrameCallback(z5Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f34837s && this.f34835n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34836r != z10) {
            this.f34836r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f34833k0 + 1;
            this.f34833k0 = i10;
            if (this.f34827f != null) {
                removeCallbacks(this.f34834l0);
                setIdleAnimationEnabled(false);
                if (this.f34839x) {
                    z5 z5Var = this.f34832j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(z5Var);
                        this.f34828f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(z5Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(z5Var);
                        this.f34828f0 = 0L;
                        this.f34824d0 = 0.0f;
                    }
                } else if (z10) {
                    sg.g gVar = this.f34827f;
                    gVar.d = 0.0f;
                    gVar.f48090i = 0.0f;
                    m(new i(this, i10, 2));
                }
                setRendererPaused(!z10);
                return;
            }
            gk0 gk0Var = this.h;
            if (gk0Var != null) {
                if (z10) {
                    if (!this.v || this.f34838w) {
                        gk0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f34838w = gk0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        sg.g gVar = this.f34827f;
        if (gVar != null) {
            gVar.f48088f = this.T + this.L;
            return;
        }
        gk0 gk0Var = this.h;
        if (gk0Var != null) {
            gk0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f34823c0 = runnable;
        if (this.f34827f != null) {
            m(new a6(this, 1));
        } else if (runnable != null) {
            post(new a6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        c6 c6Var = this.d;
        if (c6Var != null) {
            c6Var.v = runnable;
            if (c6Var.f48080s && runnable != null) {
                c6Var.v = null;
                runnable.run();
            }
        }
        b6 b6Var = this.f34825e;
        if (b6Var != null) {
            b6Var.U = runnable;
            if (b6Var.T && runnable != null) {
                b6Var.U = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34835n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34835n = false;
        Choreographer.getInstance().removeFrameCallback(this.f34819a0);
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
        if ((isEnabled() && this.f34839x && this.f34827f != null && this.f34836r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f34818a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f34822c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f34839x && this.f34827f != null && this.f34836r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f34840y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f34840y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f34840y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34840y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        sg.g gVar = this.f34827f;
                        gVar.d = com.google.android.gms.internal.vision.e2.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        sg.g gVar2 = this.f34827f;
                        gVar2.f48090i = com.google.android.gms.internal.vision.e2.y(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f48090i);
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
            this.f34824d0 = 0.0f;
            this.f34840y = motionEvent.getPointerId(0);
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
        this.f34821b0 = f7;
        i();
        setEnabled(false);
        gk0 gk0Var = this.h;
        if (gk0Var != null) {
            gk0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        sg.g gVar = this.f34827f;
        if (gVar != null) {
            gVar.f48089g = f7 + this.M;
            return;
        }
        gk0 gk0Var = this.h;
        if (gk0Var != null) {
            gk0Var.setRotation(f7 + this.M);
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
        sg.g gVar = this.f34827f;
        if (gVar != null) {
            gVar.f48091j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f34822c.setScaleX(f12);
        this.f34822c.setScaleY(f12);
        if (this.f34827f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        sg.g gVar = this.f34827f;
        if (gVar != null) {
            gVar.f48089g = this.K + this.M;
            return;
        }
        gk0 gk0Var = this.h;
        if (gk0Var != null) {
            gk0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f34837s = z10;
        j();
    }

    public void setStarParticlesView(rg.w1 w1Var) {
        c6 c6Var = this.d;
        if (c6Var != null) {
            c6Var.setStarParticlesView(w1Var);
        }
        b6 b6Var = this.f34825e;
        if (b6Var != null) {
            b6Var.setStarParticlesView(w1Var);
        }
    }
}
