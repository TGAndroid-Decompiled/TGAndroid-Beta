package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r81;
public final class w6 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public r1.g J;
    public float K;
    public float L;
    public float M;
    public float N;
    public r1.g O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int f43285a;
    public final s6 f43286a0;
    public final int f43287b;
    public float f43288b0;
    public View f43289c;
    public Runnable f43290c0;
    public v6 d;
    public float f43291d0;
    public u6 f43292e;
    public double f43293e0;
    public vg.f f43294f;
    public long f43295f0;
    public float f43296g0;
    public ch0 h;
    public float f43297h0;
    public float f43298i0;
    public final s6 f43299j0;
    public int f43300k0;
    public final t6 f43301l0;
    public boolean f43302n;
    public boolean f43303r;
    public boolean f43304s;
    public boolean f43305w;
    public boolean f43306x;
    public boolean f43307y;

    public w6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(w6 w6Var) {
        if (w6Var.f43294f != null && w6Var.f43303r && !w6Var.f43307y) {
            w6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(w6 w6Var, boolean z9, float f10) {
        if (!z9 && f10 <= 1.001f && w6Var.f43294f != null) {
            w6Var.setRenderScale(1.0f);
        }
    }

    public static void c(w6 w6Var) {
        if (w6Var.f43294f != null) {
            w6Var.h(false);
            w6Var.f43300k0++;
            w6Var.removeCallbacks(w6Var.f43301l0);
            Choreographer.getInstance().removeFrameCallback(w6Var.f43299j0);
            w6Var.f43295f0 = 0L;
            w6Var.f43291d0 = 0.0f;
            w6Var.m(null);
            w6Var.setIdleAnimationEnabled(false);
            w6Var.setRendererPaused(true);
            v6 v6Var = w6Var.d;
            if (v6Var != null) {
                v6Var.setPaused(true);
                v6Var.onPause();
            }
            u6 u6Var = w6Var.f43292e;
            if (u6Var != null) {
                u6Var.o();
            }
            w6Var.removeView(w6Var.f43289c);
            w6Var.d = null;
            w6Var.f43292e = null;
            w6Var.f43294f = null;
            w6Var.g();
            View view = w6Var.f43289c;
            int i7 = w6Var.f43285a;
            w6Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
            w6Var.f43303r = false;
            if (w6Var.f43288b0 != 0.0f) {
                w6Var.h.getAnimatedDrawable().K(1);
            }
            w6Var.j();
            Runnable runnable = w6Var.f43290c0;
            w6Var.f43290c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z9) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setIdleAnimationEnabled(z9);
        }
        u6 u6Var = this.f43292e;
        if (u6Var != null) {
            u6Var.setIdleAnimationEnabled(z9);
        }
    }

    private void setRenderScale(float f10) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setRenderScale(f10);
        }
        if (this.f43292e != null) {
            this.f43294f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z9) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setPaused(z9);
        }
        u6 u6Var = this.f43292e;
        if (u6Var != null) {
            u6Var.setPaused(z9);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f43294f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            r1.g gVar = new r1.g(new r1.f(this.f43289c.getScaleX()));
            this.J = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54174m = hVar;
            this.J.f(0.001f);
            this.J.b(new q6(this, 0));
            this.J.a(new r6(this, 0));
        }
        this.J.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f43294f;
        if (fVar == null) {
            return;
        }
        float f10 = this.G;
        float f11 = this.f43296g0;
        float f12 = this.f43298i0;
        fVar.d = com.google.android.recaptcha.internal.a.z(1.0f, f12, f11, f10);
        fVar.f57287i = com.google.android.recaptcha.internal.a.z(1.0f, f12, this.f43297h0, this.H);
    }

    public final void f(w6 w6Var) {
        vg.f fVar;
        if (w6Var != null && (fVar = w6Var.f43294f) != null && this.f43294f != null) {
            this.G = fVar.d;
            this.H = fVar.f57287i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ch0 ch0Var = this.h;
        int i7 = this.f43287b;
        ch0Var.f(2131624355, i7, i7, null);
        this.h.getAnimatedDrawable().K(0);
        this.f43289c = this.h;
        setOnClickListener(new j3(this, 4));
        setClickable(!this.f43307y);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        vg.f fVar = this.f43294f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.f57287i + fVar.f57288j);
    }

    public float getFlightYaw() {
        vg.f fVar = this.f43294f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.d + fVar.f57285f);
    }

    public final void h(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.D != -1) {
            this.D = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            vg.f fVar = this.f43294f;
            if (fVar != null) {
                if (z9) {
                    this.f43296g0 = (float) Math.IEEEremainder(fVar.d - this.G, 360.0d);
                    this.f43297h0 = (float) Math.IEEEremainder(this.f43294f.f57287i - this.H, 360.0d);
                    this.f43298i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(xq.h);
                    this.I.addUpdateListener(new r3(this, 4));
                    this.I.addListener(new r81(this, 9));
                    this.I.start();
                } else {
                    this.f43298i0 = 1.0f;
                    this.f43297h0 = 0.0f;
                    this.f43296g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z9 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f43298i0 = 1.0f;
            this.f43297h0 = 0.0f;
            this.f43296g0 = 0.0f;
            e();
        }
        if (this.f43289c != null) {
            if (z9) {
                d(1.0f);
                return;
            }
            r1.g gVar = this.J;
            if (gVar != null) {
                gVar.d();
                this.J = null;
            }
            this.f43289c.setScaleX(1.0f);
            this.f43289c.setScaleY(1.0f);
            if (this.f43294f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f43307y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f43301l0);
        setClickable(false);
        if (this.f43294f != null) {
            v6 v6Var = this.d;
            if (v6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                v6Var.J = max;
                v6Var.f57270a.h = v6Var.I / max;
                v6Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f43294f;
            this.G = fVar.d;
            this.H = fVar.f57287i;
            if (this.f43303r) {
                Choreographer choreographer = Choreographer.getInstance();
                s6 s6Var = this.f43299j0;
                choreographer.removeFrameCallback(s6Var);
                this.f43295f0 = 0L;
                Choreographer.getInstance().postFrameCallback(s6Var);
            }
        }
    }

    public final void j() {
        boolean z9;
        if (!this.f43304s && this.f43302n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f43303r != z9) {
            this.f43303r = z9;
            if (!z9) {
                h(false);
            }
            int i7 = this.f43300k0 + 1;
            this.f43300k0 = i7;
            if (this.f43294f != null) {
                removeCallbacks(this.f43301l0);
                setIdleAnimationEnabled(false);
                if (this.f43307y) {
                    s6 s6Var = this.f43299j0;
                    if (z9) {
                        Choreographer.getInstance().removeFrameCallback(s6Var);
                        this.f43295f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(s6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(s6Var);
                        this.f43295f0 = 0L;
                        this.f43291d0 = 0.0f;
                    }
                } else if (z9) {
                    vg.f fVar = this.f43294f;
                    fVar.d = 0.0f;
                    fVar.f57287i = 0.0f;
                    m(new h2(this, i7, 2));
                }
                setRendererPaused(!z9);
                return;
            }
            ch0 ch0Var = this.h;
            if (ch0Var != null) {
                if (z9) {
                    if (!this.f43305w || this.f43306x) {
                        ch0Var.d();
                    }
                    this.f43305w = true;
                    return;
                }
                this.f43306x = ch0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        vg.f fVar = this.f43294f;
        if (fVar != null) {
            fVar.f57285f = this.T + this.L;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f43290c0 = runnable;
        if (this.f43294f != null) {
            m(new t6(this, 1));
        } else if (runnable != null) {
            post(new t6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.f57278w = runnable;
            if (v6Var.f57277s && runnable != null) {
                v6Var.f57278w = null;
                runnable.run();
            }
        }
        u6 u6Var = this.f43292e;
        if (u6Var != null) {
            u6Var.f57318a0 = runnable;
            if (u6Var.W && runnable != null) {
                u6Var.f57318a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43302n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43302n = false;
        Choreographer.getInstance().removeFrameCallback(this.f43286a0);
        r1.g gVar = this.O;
        if (gVar != null) {
            gVar.d();
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
        if ((isEnabled() && this.f43307y && this.f43294f != null && this.f43303r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.f43285a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i7);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f43289c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f43307y && this.f43294f != null && this.f43303r) {
            int actionMasked = motionEvent.getActionMasked();
            int i7 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.D == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.D) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i7 = 1;
                                }
                                this.D = motionEvent.getPointerId(i7);
                                this.E = motionEvent.getX(i7);
                                this.F = motionEvent.getY(i7);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.D);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f10 = 0.8f / org.telegram.messenger.g0.f22543p;
                        vg.f fVar = this.f43294f;
                        fVar.d = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.E, f10, fVar.d);
                        vg.f fVar2 = this.f43294f;
                        fVar2.f57287i = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.F, f10, fVar2.f57287i);
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
            this.f43291d0 = 0.0f;
            this.D = motionEvent.getPointerId(0);
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
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        j();
    }

    @Override
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        j();
    }

    @Override
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        j();
    }

    public void setContinuousRotation(float f10) {
        this.f43288b0 = f10;
        i();
        setEnabled(false);
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.K = f10;
        vg.f fVar = this.f43294f;
        if (fVar != null) {
            fVar.f57286g = f10 + this.M;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotation(f10 + this.M);
        }
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (!z9) {
            h(false);
        }
    }

    public void setHeaderTilt(float f10) {
        vg.f fVar = this.f43294f;
        if (fVar != null) {
            fVar.f57288j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f;
        float f12 = 1.0f - f10;
        float f13 = (2.0f * f12) + 1.0f;
        this.f43289c.setScaleX(f13);
        this.f43289c.setScaleY(f13);
        if (this.f43294f != null) {
            if (f13 > 1.0f) {
                f11 = 3.5f;
            }
            setRenderScale(f11);
        }
        this.L = f12 * (-720.0f);
        this.M = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f43294f;
        if (fVar != null) {
            fVar.f57286g = this.K + this.M;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z9) {
        this.f43304s = z9;
        j();
    }

    public void setStarParticlesView(ug.q1 q1Var) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setStarParticlesView(q1Var);
        }
        u6 u6Var = this.f43292e;
        if (u6Var != null) {
            u6Var.setStarParticlesView(q1Var);
        }
    }
}
