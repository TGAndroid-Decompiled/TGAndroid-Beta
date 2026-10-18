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
public final class s6 extends FrameLayout {
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
    public final int f34897a;
    public final o6 f34898a0;
    public final int f34899b;
    public float f34900b0;
    public View f34901c;
    public Runnable f34902c0;
    public r6 d;
    public float f34903d0;
    public q6 e;
    public double f34904e0;
    public tg.g f34905f;
    public long f34906f0;
    public float f34907g0;
    public xj0 h;
    public float f34908h0;
    public float f34909i0;
    public final o6 f34910j0;
    public int f34911k0;
    public final p6 f34912l0;
    public boolean f34913n;
    public boolean f34914r;
    public boolean f34915s;
    public boolean v;
    public boolean f34916w;
    public boolean f34917x;
    public int f34918y;

    public s6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(s6 s6Var) {
        if (s6Var.f34905f != null && s6Var.f34914r && !s6Var.f34917x) {
            s6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(s6 s6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && s6Var.f34905f != null) {
            s6Var.setRenderScale(1.0f);
        }
    }

    public static void c(s6 s6Var) {
        if (s6Var.f34905f != null) {
            s6Var.h(false);
            s6Var.f34911k0++;
            s6Var.removeCallbacks(s6Var.f34912l0);
            Choreographer.getInstance().removeFrameCallback(s6Var.f34910j0);
            s6Var.f34906f0 = 0L;
            s6Var.f34903d0 = 0.0f;
            s6Var.m(null);
            s6Var.setIdleAnimationEnabled(false);
            s6Var.setRendererPaused(true);
            r6 r6Var = s6Var.d;
            if (r6Var != null) {
                r6Var.setPaused(true);
                r6Var.onPause();
            }
            q6 q6Var = s6Var.e;
            if (q6Var != null) {
                q6Var.q();
            }
            s6Var.removeView(s6Var.f34901c);
            s6Var.d = null;
            s6Var.e = null;
            s6Var.f34905f = null;
            s6Var.g();
            View view = s6Var.f34901c;
            int i10 = s6Var.f34897a;
            s6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            s6Var.f34914r = false;
            if (s6Var.f34900b0 != 0.0f) {
                s6Var.h.getAnimatedDrawable().K(1);
            }
            s6Var.j();
            Runnable runnable = s6Var.f34902c0;
            s6Var.f34902c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        r6 r6Var = this.d;
        if (r6Var != null) {
            r6Var.setIdleAnimationEnabled(z10);
        }
        q6 q6Var = this.e;
        if (q6Var != null) {
            q6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        r6 r6Var = this.d;
        if (r6Var != null) {
            r6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f34905f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        r6 r6Var = this.d;
        if (r6Var != null) {
            r6Var.setPaused(z10);
        }
        q6 q6Var = this.e;
        if (q6Var != null) {
            q6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f34905f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.f34901c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f17562u = lVar;
            this.J.e(0.001f);
            this.J.b(new m6(this, 0));
            this.J.a(new n6(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        tg.g gVar = this.f34905f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f34907g0;
        float f11 = this.f34909i0;
        gVar.d = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, f10, f7);
        gVar.f47117i = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, this.f34908h0, this.H);
    }

    public final void f(s6 s6Var) {
        tg.g gVar;
        if (s6Var != null && (gVar = s6Var.f34905f) != null && this.f34905f != null) {
            this.G = gVar.d;
            this.H = gVar.f47117i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        xj0 xj0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f34899b;
        xj0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f34901c = this.h;
        setOnClickListener(new t2(this, 4));
        setClickable(!this.f34917x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        tg.g gVar = this.f34905f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f47117i + gVar.f47118j);
    }

    public float getFlightYaw() {
        tg.g gVar = this.f34905f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f47115f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f34918y != -1) {
            this.f34918y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            tg.g gVar = this.f34905f;
            if (gVar != null) {
                if (z10) {
                    this.f34907g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f34908h0 = (float) Math.IEEEremainder(this.f34905f.f47117i - this.H, 360.0d);
                    this.f34909i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(bs.h);
                    this.I.addUpdateListener(new u2(this, 5));
                    this.I.addListener(new vf1(this, 8));
                    this.I.start();
                } else {
                    this.f34909i0 = 1.0f;
                    this.f34908h0 = 0.0f;
                    this.f34907g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f34909i0 = 1.0f;
            this.f34908h0 = 0.0f;
            this.f34907g0 = 0.0f;
            e();
        }
        if (this.f34901c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.k kVar = this.J;
            if (kVar != null) {
                kVar.c();
                this.J = null;
            }
            this.f34901c.setScaleX(1.0f);
            this.f34901c.setScaleY(1.0f);
            if (this.f34905f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f34917x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f34912l0);
        setClickable(false);
        if (this.f34905f != null) {
            r6 r6Var = this.d;
            if (r6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                r6Var.J = max;
                r6Var.f47102a.h = r6Var.I / max;
                r6Var.f();
            }
            setIdleAnimationEnabled(false);
            tg.g gVar = this.f34905f;
            this.G = gVar.d;
            this.H = gVar.f47117i;
            if (this.f34914r) {
                Choreographer choreographer = Choreographer.getInstance();
                o6 o6Var = this.f34910j0;
                choreographer.removeFrameCallback(o6Var);
                this.f34906f0 = 0L;
                Choreographer.getInstance().postFrameCallback(o6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f34915s && this.f34913n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f34914r != z10) {
            this.f34914r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f34911k0 + 1;
            this.f34911k0 = i10;
            if (this.f34905f != null) {
                removeCallbacks(this.f34912l0);
                setIdleAnimationEnabled(false);
                if (this.f34917x) {
                    o6 o6Var = this.f34910j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(o6Var);
                        this.f34906f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(o6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(o6Var);
                        this.f34906f0 = 0L;
                        this.f34903d0 = 0.0f;
                    }
                } else if (z10) {
                    tg.g gVar = this.f34905f;
                    gVar.d = 0.0f;
                    gVar.f47117i = 0.0f;
                    m(new j(this, i10, 2));
                }
                setRendererPaused(!z10);
                return;
            }
            xj0 xj0Var = this.h;
            if (xj0Var != null) {
                if (z10) {
                    if (!this.v || this.f34916w) {
                        xj0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f34916w = xj0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        tg.g gVar = this.f34905f;
        if (gVar != null) {
            gVar.f47115f = this.T + this.L;
            return;
        }
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f34902c0 = runnable;
        if (this.f34905f != null) {
            m(new p6(this, 1));
        } else if (runnable != null) {
            post(new p6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        r6 r6Var = this.d;
        if (r6Var != null) {
            r6Var.v = runnable;
            if (r6Var.f47108s && runnable != null) {
                r6Var.v = null;
                runnable.run();
            }
        }
        q6 q6Var = this.e;
        if (q6Var != null) {
            q6Var.f47148a0 = runnable;
            if (q6Var.W && runnable != null) {
                q6Var.f47148a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34913n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34913n = false;
        Choreographer.getInstance().removeFrameCallback(this.f34898a0);
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
        if ((isEnabled() && this.f34917x && this.f34905f != null && this.f34914r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f34897a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f34901c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f34917x && this.f34905f != null && this.f34914r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f34918y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f34918y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f34918y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34918y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        tg.g gVar = this.f34905f;
                        gVar.d = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        tg.g gVar2 = this.f34905f;
                        gVar2.f47117i = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f47117i);
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
            this.f34903d0 = 0.0f;
            this.f34918y = motionEvent.getPointerId(0);
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
        this.f34900b0 = f7;
        i();
        setEnabled(false);
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        tg.g gVar = this.f34905f;
        if (gVar != null) {
            gVar.f47116g = f7 + this.M;
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
        tg.g gVar = this.f34905f;
        if (gVar != null) {
            gVar.f47118j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f34901c.setScaleX(f12);
        this.f34901c.setScaleY(f12);
        if (this.f34905f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        tg.g gVar = this.f34905f;
        if (gVar != null) {
            gVar.f47116g = this.K + this.M;
            return;
        }
        xj0 xj0Var = this.h;
        if (xj0Var != null) {
            xj0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f34915s = z10;
        j();
    }

    public void setStarParticlesView(sg.w1 w1Var) {
        r6 r6Var = this.d;
        if (r6Var != null) {
            r6Var.setStarParticlesView(w1Var);
        }
        q6 q6Var = this.e;
        if (q6Var != null) {
            q6Var.setStarParticlesView(w1Var);
        }
    }
}
