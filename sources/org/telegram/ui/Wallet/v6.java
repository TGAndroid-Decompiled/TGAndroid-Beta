package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s81;
public final class v6 extends FrameLayout {
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
    public final int f43256a;
    public final r6 f43257a0;
    public final int f43258b;
    public float f43259b0;
    public View f43260c;
    public Runnable f43261c0;
    public u6 d;
    public float f43262d0;
    public t6 f43263e;
    public double f43264e0;
    public vg.f f43265f;
    public long f43266f0;
    public float f43267g0;
    public ch0 h;
    public float f43268h0;
    public float f43269i0;
    public final r6 f43270j0;
    public int f43271k0;
    public final s6 f43272l0;
    public boolean f43273n;
    public boolean f43274r;
    public boolean f43275s;
    public boolean f43276w;
    public boolean f43277x;
    public boolean f43278y;

    public v6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.v6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(v6 v6Var) {
        if (v6Var.f43265f != null && v6Var.f43274r && !v6Var.f43278y) {
            v6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(v6 v6Var, boolean z9, float f10) {
        if (!z9 && f10 <= 1.001f && v6Var.f43265f != null) {
            v6Var.setRenderScale(1.0f);
        }
    }

    public static void c(v6 v6Var) {
        if (v6Var.f43265f != null) {
            v6Var.h(false);
            v6Var.f43271k0++;
            v6Var.removeCallbacks(v6Var.f43272l0);
            Choreographer.getInstance().removeFrameCallback(v6Var.f43270j0);
            v6Var.f43266f0 = 0L;
            v6Var.f43262d0 = 0.0f;
            v6Var.m(null);
            v6Var.setIdleAnimationEnabled(false);
            v6Var.setRendererPaused(true);
            u6 u6Var = v6Var.d;
            if (u6Var != null) {
                u6Var.setPaused(true);
                u6Var.onPause();
            }
            t6 t6Var = v6Var.f43263e;
            if (t6Var != null) {
                t6Var.o();
            }
            v6Var.removeView(v6Var.f43260c);
            v6Var.d = null;
            v6Var.f43263e = null;
            v6Var.f43265f = null;
            v6Var.g();
            View view = v6Var.f43260c;
            int i7 = v6Var.f43256a;
            v6Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
            v6Var.f43274r = false;
            if (v6Var.f43259b0 != 0.0f) {
                v6Var.h.getAnimatedDrawable().K(1);
            }
            v6Var.j();
            Runnable runnable = v6Var.f43261c0;
            v6Var.f43261c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z9) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.setIdleAnimationEnabled(z9);
        }
        t6 t6Var = this.f43263e;
        if (t6Var != null) {
            t6Var.setIdleAnimationEnabled(z9);
        }
    }

    private void setRenderScale(float f10) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.setRenderScale(f10);
        }
        if (this.f43263e != null) {
            this.f43265f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z9) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.setPaused(z9);
        }
        t6 t6Var = this.f43263e;
        if (t6Var != null) {
            t6Var.setPaused(z9);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f43265f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            r1.g gVar = new r1.g(new r1.f(this.f43260c.getScaleX()));
            this.J = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54268m = hVar;
            this.J.f(0.001f);
            this.J.b(new p6(this, 0));
            this.J.a(new q6(this, 0));
        }
        this.J.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f43265f;
        if (fVar == null) {
            return;
        }
        float f10 = this.G;
        float f11 = this.f43267g0;
        float f12 = this.f43269i0;
        fVar.d = com.google.android.recaptcha.internal.a.z(1.0f, f12, f11, f10);
        fVar.f57380i = com.google.android.recaptcha.internal.a.z(1.0f, f12, this.f43268h0, this.H);
    }

    public final void f(v6 v6Var) {
        vg.f fVar;
        if (v6Var != null && (fVar = v6Var.f43265f) != null && this.f43265f != null) {
            this.G = fVar.d;
            this.H = fVar.f57380i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ch0 ch0Var = this.h;
        int i7 = this.f43258b;
        ch0Var.f(2131624355, i7, i7, null);
        this.h.getAnimatedDrawable().K(0);
        this.f43260c = this.h;
        setOnClickListener(new i3(this, 4));
        setClickable(!this.f43278y);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        vg.f fVar = this.f43265f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.f57380i + fVar.f57381j);
    }

    public float getFlightYaw() {
        vg.f fVar = this.f43265f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.d + fVar.f57378f);
    }

    public final void h(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.D != -1) {
            this.D = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            vg.f fVar = this.f43265f;
            if (fVar != null) {
                if (z9) {
                    this.f43267g0 = (float) Math.IEEEremainder(fVar.d - this.G, 360.0d);
                    this.f43268h0 = (float) Math.IEEEremainder(this.f43265f.f57380i - this.H, 360.0d);
                    this.f43269i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(xq.h);
                    this.I.addUpdateListener(new q3(this, 4));
                    this.I.addListener(new s81(this, 9));
                    this.I.start();
                } else {
                    this.f43269i0 = 1.0f;
                    this.f43268h0 = 0.0f;
                    this.f43267g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z9 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f43269i0 = 1.0f;
            this.f43268h0 = 0.0f;
            this.f43267g0 = 0.0f;
            e();
        }
        if (this.f43260c != null) {
            if (z9) {
                d(1.0f);
                return;
            }
            r1.g gVar = this.J;
            if (gVar != null) {
                gVar.d();
                this.J = null;
            }
            this.f43260c.setScaleX(1.0f);
            this.f43260c.setScaleY(1.0f);
            if (this.f43265f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f43278y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f43272l0);
        setClickable(false);
        if (this.f43265f != null) {
            u6 u6Var = this.d;
            if (u6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                u6Var.J = max;
                u6Var.f57363a.h = u6Var.I / max;
                u6Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f43265f;
            this.G = fVar.d;
            this.H = fVar.f57380i;
            if (this.f43274r) {
                Choreographer choreographer = Choreographer.getInstance();
                r6 r6Var = this.f43270j0;
                choreographer.removeFrameCallback(r6Var);
                this.f43266f0 = 0L;
                Choreographer.getInstance().postFrameCallback(r6Var);
            }
        }
    }

    public final void j() {
        boolean z9;
        if (!this.f43275s && this.f43273n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f43274r != z9) {
            this.f43274r = z9;
            if (!z9) {
                h(false);
            }
            int i7 = this.f43271k0 + 1;
            this.f43271k0 = i7;
            if (this.f43265f != null) {
                removeCallbacks(this.f43272l0);
                setIdleAnimationEnabled(false);
                if (this.f43278y) {
                    r6 r6Var = this.f43270j0;
                    if (z9) {
                        Choreographer.getInstance().removeFrameCallback(r6Var);
                        this.f43266f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(r6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(r6Var);
                        this.f43266f0 = 0L;
                        this.f43262d0 = 0.0f;
                    }
                } else if (z9) {
                    vg.f fVar = this.f43265f;
                    fVar.d = 0.0f;
                    fVar.f57380i = 0.0f;
                    m(new g2(this, i7, 2));
                }
                setRendererPaused(!z9);
                return;
            }
            ch0 ch0Var = this.h;
            if (ch0Var != null) {
                if (z9) {
                    if (!this.f43276w || this.f43277x) {
                        ch0Var.d();
                    }
                    this.f43276w = true;
                    return;
                }
                this.f43277x = ch0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        vg.f fVar = this.f43265f;
        if (fVar != null) {
            fVar.f57378f = this.T + this.L;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f43261c0 = runnable;
        if (this.f43265f != null) {
            m(new s6(this, 1));
        } else if (runnable != null) {
            post(new s6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.f57371w = runnable;
            if (u6Var.f57370s && runnable != null) {
                u6Var.f57371w = null;
                runnable.run();
            }
        }
        t6 t6Var = this.f43263e;
        if (t6Var != null) {
            t6Var.f57411a0 = runnable;
            if (t6Var.W && runnable != null) {
                t6Var.f57411a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43273n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43273n = false;
        Choreographer.getInstance().removeFrameCallback(this.f43257a0);
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
        if ((isEnabled() && this.f43278y && this.f43265f != null && this.f43274r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.f43256a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i7);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f43260c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f43278y && this.f43265f != null && this.f43274r) {
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
                        float f10 = 0.8f / org.telegram.messenger.g0.f22562p;
                        vg.f fVar = this.f43265f;
                        fVar.d = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.E, f10, fVar.d);
                        vg.f fVar2 = this.f43265f;
                        fVar2.f57380i = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.F, f10, fVar2.f57380i);
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
            this.f43262d0 = 0.0f;
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
        this.f43259b0 = f10;
        i();
        setEnabled(false);
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.K = f10;
        vg.f fVar = this.f43265f;
        if (fVar != null) {
            fVar.f57379g = f10 + this.M;
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
        vg.f fVar = this.f43265f;
        if (fVar != null) {
            fVar.f57381j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f;
        float f12 = 1.0f - f10;
        float f13 = (2.0f * f12) + 1.0f;
        this.f43260c.setScaleX(f13);
        this.f43260c.setScaleY(f13);
        if (this.f43265f != null) {
            if (f13 > 1.0f) {
                f11 = 3.5f;
            }
            setRenderScale(f11);
        }
        this.L = f12 * (-720.0f);
        this.M = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f43265f;
        if (fVar != null) {
            fVar.f57379g = this.K + this.M;
            return;
        }
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            ch0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z9) {
        this.f43275s = z9;
        j();
    }

    public void setStarParticlesView(ug.q1 q1Var) {
        u6 u6Var = this.d;
        if (u6Var != null) {
            u6Var.setStarParticlesView(q1Var);
        }
        t6 t6Var = this.f43263e;
        if (t6Var != null) {
            t6Var.setStarParticlesView(q1Var);
        }
    }
}
