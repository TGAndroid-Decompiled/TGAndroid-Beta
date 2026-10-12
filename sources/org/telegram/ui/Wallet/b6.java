package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.es;
import org.telegram.ui.fi1;
import org.telegram.ui.li1;
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
    public final int f32965a;
    public final x5 f32966a0;
    public final int f32967b;
    public float f32968b0;
    public View f32969c;
    public Runnable f32970c0;
    public a6 d;
    public float f32971d0;
    public z5 e;
    public double f32972e0;
    public tg.g f32973f;
    public long f32974f0;
    public float f32975g0;
    public bk0 h;
    public float f32976h0;
    public float f32977i0;
    public final x5 f32978j0;
    public int f32979k0;
    public final y5 f32980l0;
    public boolean f32981n;
    public boolean f32982r;
    public boolean f32983s;
    public boolean v;
    public boolean f32984w;
    public boolean f32985x;
    public int f32986y;

    public b6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.b6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(b6 b6Var) {
        if (b6Var.f32973f != null && b6Var.f32982r && !b6Var.f32985x) {
            b6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(b6 b6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && b6Var.f32973f != null) {
            b6Var.setRenderScale(1.0f);
        }
    }

    public static void c(b6 b6Var) {
        if (b6Var.f32973f != null) {
            b6Var.h(false);
            b6Var.f32979k0++;
            b6Var.removeCallbacks(b6Var.f32980l0);
            Choreographer.getInstance().removeFrameCallback(b6Var.f32978j0);
            b6Var.f32974f0 = 0L;
            b6Var.f32971d0 = 0.0f;
            b6Var.m(null);
            b6Var.setIdleAnimationEnabled(false);
            b6Var.setRendererPaused(true);
            a6 a6Var = b6Var.d;
            if (a6Var != null) {
                a6Var.setPaused(true);
                a6Var.onPause();
            }
            z5 z5Var = b6Var.e;
            if (z5Var != null) {
                z5Var.o();
            }
            b6Var.removeView(b6Var.f32969c);
            b6Var.d = null;
            b6Var.e = null;
            b6Var.f32973f = null;
            b6Var.g();
            View view = b6Var.f32969c;
            int i10 = b6Var.f32965a;
            b6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            b6Var.f32982r = false;
            if (b6Var.f32968b0 != 0.0f) {
                b6Var.h.getAnimatedDrawable().K(1);
            }
            b6Var.j();
            Runnable runnable = b6Var.f32970c0;
            b6Var.f32970c0 = null;
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
        z5 z5Var = this.e;
        if (z5Var != null) {
            z5Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f32973f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setPaused(z10);
        }
        z5 z5Var = this.e;
        if (z5Var != null) {
            z5Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f32973f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.f32969c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f16468u = lVar;
            this.J.e(0.001f);
            this.J.b(new v5(this, 0));
            this.J.a(new w5(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        tg.g gVar = this.f32973f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f32975g0;
        float f11 = this.f32977i0;
        gVar.d = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, f10, f7);
        gVar.f45708i = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, this.f32976h0, this.H);
    }

    public final void f(b6 b6Var) {
        tg.g gVar;
        if (b6Var != null && (gVar = b6Var.f32973f) != null && this.f32973f != null) {
            this.G = gVar.d;
            this.H = gVar.f45708i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        bk0 bk0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f32967b;
        bk0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f32969c = this.h;
        setOnClickListener(new j3(this, 3));
        setClickable(!this.f32985x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        tg.g gVar = this.f32973f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f45708i + gVar.f45709j);
    }

    public float getFlightYaw() {
        tg.g gVar = this.f32973f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f45706f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f32986y != -1) {
            this.f32986y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            tg.g gVar = this.f32973f;
            if (gVar != null) {
                if (z10) {
                    this.f32975g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f32976h0 = (float) Math.IEEEremainder(this.f32973f.f45708i - this.H, 360.0d);
                    this.f32977i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(es.h);
                    this.I.addUpdateListener(new s2(this, 5));
                    this.I.addListener(new fi1(this, 6));
                    this.I.start();
                } else {
                    this.f32977i0 = 1.0f;
                    this.f32976h0 = 0.0f;
                    this.f32975g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f32977i0 = 1.0f;
            this.f32976h0 = 0.0f;
            this.f32975g0 = 0.0f;
            e();
        }
        if (this.f32969c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.k kVar = this.J;
            if (kVar != null) {
                kVar.c();
                this.J = null;
            }
            this.f32969c.setScaleX(1.0f);
            this.f32969c.setScaleY(1.0f);
            if (this.f32973f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f32985x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f32980l0);
        setClickable(false);
        if (this.f32973f != null) {
            a6 a6Var = this.d;
            if (a6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                a6Var.J = max;
                a6Var.f45693a.h = a6Var.I / max;
                a6Var.f();
            }
            setIdleAnimationEnabled(false);
            tg.g gVar = this.f32973f;
            this.G = gVar.d;
            this.H = gVar.f45708i;
            if (this.f32982r) {
                Choreographer choreographer = Choreographer.getInstance();
                x5 x5Var = this.f32978j0;
                choreographer.removeFrameCallback(x5Var);
                this.f32974f0 = 0L;
                Choreographer.getInstance().postFrameCallback(x5Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f32983s && this.f32981n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32982r != z10) {
            this.f32982r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f32979k0 + 1;
            this.f32979k0 = i10;
            if (this.f32973f != null) {
                removeCallbacks(this.f32980l0);
                setIdleAnimationEnabled(false);
                if (this.f32985x) {
                    x5 x5Var = this.f32978j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(x5Var);
                        this.f32974f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(x5Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(x5Var);
                        this.f32974f0 = 0L;
                        this.f32971d0 = 0.0f;
                    }
                } else if (z10) {
                    tg.g gVar = this.f32973f;
                    gVar.d = 0.0f;
                    gVar.f45708i = 0.0f;
                    m(new li1(this, i10, 3));
                }
                setRendererPaused(!z10);
                return;
            }
            bk0 bk0Var = this.h;
            if (bk0Var != null) {
                if (z10) {
                    if (!this.v || this.f32984w) {
                        bk0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f32984w = bk0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        tg.g gVar = this.f32973f;
        if (gVar != null) {
            gVar.f45706f = this.T + this.L;
            return;
        }
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f32970c0 = runnable;
        if (this.f32973f != null) {
            m(new y5(this, 1));
        } else if (runnable != null) {
            post(new y5(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.v = runnable;
            if (a6Var.f45699s && runnable != null) {
                a6Var.v = null;
                runnable.run();
            }
        }
        z5 z5Var = this.e;
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
        this.f32981n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f32981n = false;
        Choreographer.getInstance().removeFrameCallback(this.f32966a0);
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
        if ((isEnabled() && this.f32985x && this.f32973f != null && this.f32982r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f32965a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f32969c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f32985x && this.f32973f != null && this.f32982r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f32986y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f32986y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f32986y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f32986y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        tg.g gVar = this.f32973f;
                        gVar.d = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        tg.g gVar2 = this.f32973f;
                        gVar2.f45708i = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f45708i);
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
            this.f32971d0 = 0.0f;
            this.f32986y = motionEvent.getPointerId(0);
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
        this.f32968b0 = f7;
        i();
        setEnabled(false);
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        tg.g gVar = this.f32973f;
        if (gVar != null) {
            gVar.f45707g = f7 + this.M;
            return;
        }
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.setRotation(f7 + this.M);
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
        tg.g gVar = this.f32973f;
        if (gVar != null) {
            gVar.f45709j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f32969c.setScaleX(f12);
        this.f32969c.setScaleY(f12);
        if (this.f32973f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        tg.g gVar = this.f32973f;
        if (gVar != null) {
            gVar.f45707g = this.K + this.M;
            return;
        }
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f32983s = z10;
        j();
    }

    public void setStarParticlesView(sg.x1 x1Var) {
        a6 a6Var = this.d;
        if (a6Var != null) {
            a6Var.setStarParticlesView(x1Var);
        }
        z5 z5Var = this.e;
        if (z5Var != null) {
            z5Var.setStarParticlesView(x1Var);
        }
    }
}
