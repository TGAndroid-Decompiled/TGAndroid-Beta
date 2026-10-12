package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.js;
public final class e6 extends FrameLayout {
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
    public final int f34659a;
    public final a6 f34660a0;
    public final int f34661b;
    public float f34662b0;
    public View f34663c;
    public Runnable f34664c0;
    public d6 d;
    public float f34665d0;
    public c6 f34666e;
    public double f34667e0;
    public sg.g f34668f;
    public long f34669f0;
    public float f34670g0;
    public ik0 h;
    public float f34671h0;
    public float f34672i0;
    public final a6 f34673j0;
    public int f34674k0;
    public final b6 f34675l0;
    public boolean f34676n;
    public boolean f34677r;
    public boolean f34678s;
    public boolean v;
    public boolean f34679w;
    public boolean f34680x;
    public int f34681y;

    public e6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.e6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(e6 e6Var) {
        if (e6Var.f34668f != null && e6Var.f34677r && !e6Var.f34680x) {
            e6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(e6 e6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && e6Var.f34668f != null) {
            e6Var.setRenderScale(1.0f);
        }
    }

    public static void c(e6 e6Var) {
        if (e6Var.f34668f != null) {
            e6Var.h(false);
            e6Var.f34674k0++;
            e6Var.removeCallbacks(e6Var.f34675l0);
            Choreographer.getInstance().removeFrameCallback(e6Var.f34673j0);
            e6Var.f34669f0 = 0L;
            e6Var.f34665d0 = 0.0f;
            e6Var.m(null);
            e6Var.setIdleAnimationEnabled(false);
            e6Var.setRendererPaused(true);
            d6 d6Var = e6Var.d;
            if (d6Var != null) {
                d6Var.setPaused(true);
                d6Var.onPause();
            }
            c6 c6Var = e6Var.f34666e;
            if (c6Var != null) {
                c6Var.o();
            }
            e6Var.removeView(e6Var.f34663c);
            e6Var.d = null;
            e6Var.f34666e = null;
            e6Var.f34668f = null;
            e6Var.g();
            View view = e6Var.f34663c;
            int i10 = e6Var.f34659a;
            e6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            e6Var.f34677r = false;
            if (e6Var.f34662b0 != 0.0f) {
                e6Var.h.getAnimatedDrawable().K(1);
            }
            e6Var.j();
            Runnable runnable = e6Var.f34664c0;
            e6Var.f34664c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        d6 d6Var = this.d;
        if (d6Var != null) {
            d6Var.setIdleAnimationEnabled(z10);
        }
        c6 c6Var = this.f34666e;
        if (c6Var != null) {
            c6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        d6 d6Var = this.d;
        if (d6Var != null) {
            d6Var.setRenderScale(f7);
        }
        if (this.f34666e != null) {
            this.f34668f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        d6 d6Var = this.d;
        if (d6Var != null) {
            d6Var.setPaused(z10);
        }
        c6 c6Var = this.f34666e;
        if (c6Var != null) {
            c6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f34668f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.f34663c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f16691u = lVar;
            this.J.e(0.001f);
            this.J.b(new y5(this, 0));
            this.J.a(new z5(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        sg.g gVar = this.f34668f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f34670g0;
        float f11 = this.f34672i0;
        gVar.d = com.google.android.gms.internal.vision.e2.y(1.0f, f11, f10, f7);
        gVar.f48285i = com.google.android.gms.internal.vision.e2.y(1.0f, f11, this.f34671h0, this.H);
    }

    public final void f(e6 e6Var) {
        sg.g gVar;
        if (e6Var != null && (gVar = e6Var.f34668f) != null && this.f34668f != null) {
            this.G = gVar.d;
            this.H = gVar.f48285i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ik0 ik0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f34661b;
        ik0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f34663c = this.h;
        setOnClickListener(new l3(this, 3));
        setClickable(!this.f34680x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        sg.g gVar = this.f34668f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f48285i + gVar.f48286j);
    }

    public float getFlightYaw() {
        sg.g gVar = this.f34668f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f48283f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f34681y != -1) {
            this.f34681y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            sg.g gVar = this.f34668f;
            if (gVar != null) {
                if (z10) {
                    this.f34670g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f34671h0 = (float) Math.IEEEremainder(this.f34668f.f48285i - this.H, 360.0d);
                    this.f34672i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(js.h);
                    this.I.addUpdateListener(new u2(this, 5));
                    this.I.addListener(new z4(this, 3));
                    this.I.start();
                } else {
                    this.f34672i0 = 1.0f;
                    this.f34671h0 = 0.0f;
                    this.f34670g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f34672i0 = 1.0f;
            this.f34671h0 = 0.0f;
            this.f34670g0 = 0.0f;
            e();
        }
        if (this.f34663c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.k kVar = this.J;
            if (kVar != null) {
                kVar.c();
                this.J = null;
            }
            this.f34663c.setScaleX(1.0f);
            this.f34663c.setScaleY(1.0f);
            if (this.f34668f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f34680x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f34675l0);
        setClickable(false);
        if (this.f34668f != null) {
            d6 d6Var = this.d;
            if (d6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                d6Var.J = max;
                d6Var.f48268a.h = d6Var.I / max;
                d6Var.f();
            }
            setIdleAnimationEnabled(false);
            sg.g gVar = this.f34668f;
            this.G = gVar.d;
            this.H = gVar.f48285i;
            if (this.f34677r) {
                Choreographer choreographer = Choreographer.getInstance();
                a6 a6Var = this.f34673j0;
                choreographer.removeFrameCallback(a6Var);
                this.f34669f0 = 0L;
                Choreographer.getInstance().postFrameCallback(a6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f34678s && this.f34676n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34677r != z10) {
            this.f34677r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f34674k0 + 1;
            this.f34674k0 = i10;
            if (this.f34668f != null) {
                removeCallbacks(this.f34675l0);
                setIdleAnimationEnabled(false);
                if (this.f34680x) {
                    a6 a6Var = this.f34673j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(a6Var);
                        this.f34669f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(a6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(a6Var);
                        this.f34669f0 = 0L;
                        this.f34665d0 = 0.0f;
                    }
                } else if (z10) {
                    sg.g gVar = this.f34668f;
                    gVar.d = 0.0f;
                    gVar.f48285i = 0.0f;
                    m(new i(this, i10, 2));
                }
                setRendererPaused(!z10);
                return;
            }
            ik0 ik0Var = this.h;
            if (ik0Var != null) {
                if (z10) {
                    if (!this.v || this.f34679w) {
                        ik0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f34679w = ik0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        sg.g gVar = this.f34668f;
        if (gVar != null) {
            gVar.f48283f = this.T + this.L;
            return;
        }
        ik0 ik0Var = this.h;
        if (ik0Var != null) {
            ik0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f34664c0 = runnable;
        if (this.f34668f != null) {
            m(new b6(this, 1));
        } else if (runnable != null) {
            post(new b6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        d6 d6Var = this.d;
        if (d6Var != null) {
            d6Var.v = runnable;
            if (d6Var.f48275s && runnable != null) {
                d6Var.v = null;
                runnable.run();
            }
        }
        c6 c6Var = this.f34666e;
        if (c6Var != null) {
            c6Var.U = runnable;
            if (c6Var.T && runnable != null) {
                c6Var.U = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34676n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34676n = false;
        Choreographer.getInstance().removeFrameCallback(this.f34660a0);
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
        if ((isEnabled() && this.f34680x && this.f34668f != null && this.f34677r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f34659a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f34663c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f34680x && this.f34668f != null && this.f34677r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f34681y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f34681y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f34681y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34681y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        sg.g gVar = this.f34668f;
                        gVar.d = com.google.android.gms.internal.vision.e2.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        sg.g gVar2 = this.f34668f;
                        gVar2.f48285i = com.google.android.gms.internal.vision.e2.y(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f48285i);
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
            this.f34665d0 = 0.0f;
            this.f34681y = motionEvent.getPointerId(0);
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
        this.f34662b0 = f7;
        i();
        setEnabled(false);
        ik0 ik0Var = this.h;
        if (ik0Var != null) {
            ik0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        sg.g gVar = this.f34668f;
        if (gVar != null) {
            gVar.f48284g = f7 + this.M;
            return;
        }
        ik0 ik0Var = this.h;
        if (ik0Var != null) {
            ik0Var.setRotation(f7 + this.M);
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
        sg.g gVar = this.f34668f;
        if (gVar != null) {
            gVar.f48286j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f34663c.setScaleX(f12);
        this.f34663c.setScaleY(f12);
        if (this.f34668f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        sg.g gVar = this.f34668f;
        if (gVar != null) {
            gVar.f48284g = this.K + this.M;
            return;
        }
        ik0 ik0Var = this.h;
        if (ik0Var != null) {
            ik0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f34678s = z10;
        j();
    }

    public void setStarParticlesView(rg.w1 w1Var) {
        d6 d6Var = this.d;
        if (d6Var != null) {
            d6Var.setStarParticlesView(w1Var);
        }
        c6 c6Var = this.f34666e;
        if (c6Var != null) {
            c6Var.setStarParticlesView(w1Var);
        }
    }
}
