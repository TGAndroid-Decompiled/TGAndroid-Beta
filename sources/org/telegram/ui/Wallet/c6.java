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
public final class c6 extends FrameLayout {
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
    public final int f32741a;
    public final y5 f32742a0;
    public final int f32743b;
    public float f32744b0;
    public View f32745c;
    public Runnable f32746c0;
    public b6 d;
    public float f32747d0;
    public a6 e;
    public double f32748e0;
    public tg.g f32749f;
    public long f32750f0;
    public float f32751g0;
    public bk0 h;
    public float f32752h0;
    public float f32753i0;
    public final y5 f32754j0;
    public int f32755k0;
    public final z5 f32756l0;
    public boolean f32757n;
    public boolean f32758r;
    public boolean f32759s;
    public boolean v;
    public boolean f32760w;
    public boolean f32761x;
    public int f32762y;

    public c6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(c6 c6Var) {
        if (c6Var.f32749f != null && c6Var.f32758r && !c6Var.f32761x) {
            c6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(c6 c6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && c6Var.f32749f != null) {
            c6Var.setRenderScale(1.0f);
        }
    }

    public static void c(c6 c6Var) {
        if (c6Var.f32749f != null) {
            c6Var.h(false);
            c6Var.f32755k0++;
            c6Var.removeCallbacks(c6Var.f32756l0);
            Choreographer.getInstance().removeFrameCallback(c6Var.f32754j0);
            c6Var.f32750f0 = 0L;
            c6Var.f32747d0 = 0.0f;
            c6Var.m(null);
            c6Var.setIdleAnimationEnabled(false);
            c6Var.setRendererPaused(true);
            b6 b6Var = c6Var.d;
            if (b6Var != null) {
                b6Var.setPaused(true);
                b6Var.onPause();
            }
            a6 a6Var = c6Var.e;
            if (a6Var != null) {
                a6Var.o();
            }
            c6Var.removeView(c6Var.f32745c);
            c6Var.d = null;
            c6Var.e = null;
            c6Var.f32749f = null;
            c6Var.g();
            View view = c6Var.f32745c;
            int i10 = c6Var.f32741a;
            c6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            c6Var.f32758r = false;
            if (c6Var.f32744b0 != 0.0f) {
                c6Var.h.getAnimatedDrawable().K(1);
            }
            c6Var.j();
            Runnable runnable = c6Var.f32746c0;
            c6Var.f32746c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.setIdleAnimationEnabled(z10);
        }
        a6 a6Var = this.e;
        if (a6Var != null) {
            a6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f32749f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.setPaused(z10);
        }
        a6 a6Var = this.e;
        if (a6Var != null) {
            a6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f32749f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.k kVar = new o1.k(new o1.j(this.f32745c.getScaleX()));
            this.J = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f16161u = lVar;
            this.J.e(0.001f);
            this.J.b(new w5(this, 0));
            this.J.a(new x5(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        tg.g gVar = this.f32749f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f32751g0;
        float f11 = this.f32753i0;
        gVar.d = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, f10, f7);
        gVar.f45708i = com.google.android.gms.internal.play_billing.k3.y(1.0f, f11, this.f32752h0, this.H);
    }

    public final void f(c6 c6Var) {
        tg.g gVar;
        if (c6Var != null && (gVar = c6Var.f32749f) != null && this.f32749f != null) {
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
        int i11 = this.f32743b;
        bk0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f32745c = this.h;
        setOnClickListener(new k3(this, 3));
        setClickable(!this.f32761x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        tg.g gVar = this.f32749f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f45708i + gVar.f45709j);
    }

    public float getFlightYaw() {
        tg.g gVar = this.f32749f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f45706f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f32762y != -1) {
            this.f32762y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            tg.g gVar = this.f32749f;
            if (gVar != null) {
                if (z10) {
                    this.f32751g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f32752h0 = (float) Math.IEEEremainder(this.f32749f.f45708i - this.H, 360.0d);
                    this.f32753i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(es.h);
                    this.I.addUpdateListener(new t2(this, 5));
                    this.I.addListener(new fi1(this, 6));
                    this.I.start();
                } else {
                    this.f32753i0 = 1.0f;
                    this.f32752h0 = 0.0f;
                    this.f32751g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f32753i0 = 1.0f;
            this.f32752h0 = 0.0f;
            this.f32751g0 = 0.0f;
            e();
        }
        if (this.f32745c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.k kVar = this.J;
            if (kVar != null) {
                kVar.c();
                this.J = null;
            }
            this.f32745c.setScaleX(1.0f);
            this.f32745c.setScaleY(1.0f);
            if (this.f32749f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f32761x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f32756l0);
        setClickable(false);
        if (this.f32749f != null) {
            b6 b6Var = this.d;
            if (b6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                b6Var.J = max;
                b6Var.f45693a.h = b6Var.I / max;
                b6Var.f();
            }
            setIdleAnimationEnabled(false);
            tg.g gVar = this.f32749f;
            this.G = gVar.d;
            this.H = gVar.f45708i;
            if (this.f32758r) {
                Choreographer choreographer = Choreographer.getInstance();
                y5 y5Var = this.f32754j0;
                choreographer.removeFrameCallback(y5Var);
                this.f32750f0 = 0L;
                Choreographer.getInstance().postFrameCallback(y5Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f32759s && this.f32757n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f32758r != z10) {
            this.f32758r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f32755k0 + 1;
            this.f32755k0 = i10;
            if (this.f32749f != null) {
                removeCallbacks(this.f32756l0);
                setIdleAnimationEnabled(false);
                if (this.f32761x) {
                    y5 y5Var = this.f32754j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(y5Var);
                        this.f32750f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(y5Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(y5Var);
                        this.f32750f0 = 0L;
                        this.f32747d0 = 0.0f;
                    }
                } else if (z10) {
                    tg.g gVar = this.f32749f;
                    gVar.d = 0.0f;
                    gVar.f45708i = 0.0f;
                    m(new i(this, i10, 2));
                }
                setRendererPaused(!z10);
                return;
            }
            bk0 bk0Var = this.h;
            if (bk0Var != null) {
                if (z10) {
                    if (!this.v || this.f32760w) {
                        bk0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f32760w = bk0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        tg.g gVar = this.f32749f;
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
        this.f32746c0 = runnable;
        if (this.f32749f != null) {
            m(new z5(this, 1));
        } else if (runnable != null) {
            post(new z5(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.v = runnable;
            if (b6Var.f45699s && runnable != null) {
                b6Var.v = null;
                runnable.run();
            }
        }
        a6 a6Var = this.e;
        if (a6Var != null) {
            a6Var.U = runnable;
            if (a6Var.T && runnable != null) {
                a6Var.U = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32757n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f32757n = false;
        Choreographer.getInstance().removeFrameCallback(this.f32742a0);
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
        if ((isEnabled() && this.f32761x && this.f32749f != null && this.f32758r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f32741a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f32745c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f32761x && this.f32749f != null && this.f32758r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f32762y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f32762y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f32762y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f32762y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        tg.g gVar = this.f32749f;
                        gVar.d = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        tg.g gVar2 = this.f32749f;
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
            this.f32747d0 = 0.0f;
            this.f32762y = motionEvent.getPointerId(0);
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
        this.f32744b0 = f7;
        i();
        setEnabled(false);
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        tg.g gVar = this.f32749f;
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
        tg.g gVar = this.f32749f;
        if (gVar != null) {
            gVar.f45709j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f32745c.setScaleX(f12);
        this.f32745c.setScaleY(f12);
        if (this.f32749f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        tg.g gVar = this.f32749f;
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
        this.f32759s = z10;
        j();
    }

    public void setStarParticlesView(sg.x1 x1Var) {
        b6 b6Var = this.d;
        if (b6Var != null) {
            b6Var.setStarParticlesView(x1Var);
        }
        a6 a6Var = this.e;
        if (a6Var != null) {
            a6Var.setStarParticlesView(x1Var);
        }
    }
}
