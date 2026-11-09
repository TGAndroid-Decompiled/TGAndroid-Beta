package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.t81;
public final class u6 extends FrameLayout {
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
    public final int f43174a;
    public final q6 f43175a0;
    public final int f43176b;
    public float f43177b0;
    public View f43178c;
    public Runnable f43179c0;
    public t6 d;
    public float f43180d0;
    public s6 f43181e;
    public double f43182e0;
    public vg.f f43183f;
    public long f43184f0;
    public float f43185g0;
    public dh0 h;
    public float f43186h0;
    public float f43187i0;
    public final q6 f43188j0;
    public int f43189k0;
    public final r6 f43190l0;
    public boolean f43191n;
    public boolean f43192r;
    public boolean f43193s;
    public boolean f43194w;
    public boolean f43195x;
    public boolean f43196y;

    public u6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.u6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(u6 u6Var) {
        if (u6Var.f43183f != null && u6Var.f43192r && !u6Var.f43196y) {
            u6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(u6 u6Var, boolean z9, float f10) {
        if (!z9 && f10 <= 1.001f && u6Var.f43183f != null) {
            u6Var.setRenderScale(1.0f);
        }
    }

    public static void c(u6 u6Var) {
        if (u6Var.f43183f != null) {
            u6Var.h(false);
            u6Var.f43189k0++;
            u6Var.removeCallbacks(u6Var.f43190l0);
            Choreographer.getInstance().removeFrameCallback(u6Var.f43188j0);
            u6Var.f43184f0 = 0L;
            u6Var.f43180d0 = 0.0f;
            u6Var.m(null);
            u6Var.setIdleAnimationEnabled(false);
            u6Var.setRendererPaused(true);
            t6 t6Var = u6Var.d;
            if (t6Var != null) {
                t6Var.setPaused(true);
                t6Var.onPause();
            }
            s6 s6Var = u6Var.f43181e;
            if (s6Var != null) {
                s6Var.o();
            }
            u6Var.removeView(u6Var.f43178c);
            u6Var.d = null;
            u6Var.f43181e = null;
            u6Var.f43183f = null;
            u6Var.g();
            View view = u6Var.f43178c;
            int i7 = u6Var.f43174a;
            u6Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
            u6Var.f43192r = false;
            if (u6Var.f43177b0 != 0.0f) {
                u6Var.h.getAnimatedDrawable().K(1);
            }
            u6Var.j();
            Runnable runnable = u6Var.f43179c0;
            u6Var.f43179c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z9) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.setIdleAnimationEnabled(z9);
        }
        s6 s6Var = this.f43181e;
        if (s6Var != null) {
            s6Var.setIdleAnimationEnabled(z9);
        }
    }

    private void setRenderScale(float f10) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.setRenderScale(f10);
        }
        if (this.f43181e != null) {
            this.f43183f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z9) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.setPaused(z9);
        }
        s6 s6Var = this.f43181e;
        if (s6Var != null) {
            s6Var.setPaused(z9);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f43183f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            r1.g gVar = new r1.g(new r1.f(this.f43178c.getScaleX()));
            this.J = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54280m = hVar;
            this.J.f(0.001f);
            this.J.b(new o6(this, 0));
            this.J.a(new p6(this, 0));
        }
        this.J.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f43183f;
        if (fVar == null) {
            return;
        }
        float f10 = this.G;
        float f11 = this.f43185g0;
        float f12 = this.f43187i0;
        fVar.d = com.google.android.recaptcha.internal.a.z(1.0f, f12, f11, f10);
        fVar.f57392i = com.google.android.recaptcha.internal.a.z(1.0f, f12, this.f43186h0, this.H);
    }

    public final void f(u6 u6Var) {
        vg.f fVar;
        if (u6Var != null && (fVar = u6Var.f43183f) != null && this.f43183f != null) {
            this.G = fVar.d;
            this.H = fVar.f57392i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        dh0 dh0Var = this.h;
        int i7 = this.f43176b;
        dh0Var.f(2131624355, i7, i7, null);
        this.h.getAnimatedDrawable().K(0);
        this.f43178c = this.h;
        setOnClickListener(new h3(this, 4));
        setClickable(!this.f43196y);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        vg.f fVar = this.f43183f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.f57392i + fVar.f57393j);
    }

    public float getFlightYaw() {
        vg.f fVar = this.f43183f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.d + fVar.f57390f);
    }

    public final void h(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.D != -1) {
            this.D = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            vg.f fVar = this.f43183f;
            if (fVar != null) {
                if (z9) {
                    this.f43185g0 = (float) Math.IEEEremainder(fVar.d - this.G, 360.0d);
                    this.f43186h0 = (float) Math.IEEEremainder(this.f43183f.f57392i - this.H, 360.0d);
                    this.f43187i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(xq.h);
                    this.I.addUpdateListener(new p3(this, 4));
                    this.I.addListener(new t81(this, 9));
                    this.I.start();
                } else {
                    this.f43187i0 = 1.0f;
                    this.f43186h0 = 0.0f;
                    this.f43185g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z9 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f43187i0 = 1.0f;
            this.f43186h0 = 0.0f;
            this.f43185g0 = 0.0f;
            e();
        }
        if (this.f43178c != null) {
            if (z9) {
                d(1.0f);
                return;
            }
            r1.g gVar = this.J;
            if (gVar != null) {
                gVar.d();
                this.J = null;
            }
            this.f43178c.setScaleX(1.0f);
            this.f43178c.setScaleY(1.0f);
            if (this.f43183f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f43196y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f43190l0);
        setClickable(false);
        if (this.f43183f != null) {
            t6 t6Var = this.d;
            if (t6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                t6Var.J = max;
                t6Var.f57375a.h = t6Var.I / max;
                t6Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f43183f;
            this.G = fVar.d;
            this.H = fVar.f57392i;
            if (this.f43192r) {
                Choreographer choreographer = Choreographer.getInstance();
                q6 q6Var = this.f43188j0;
                choreographer.removeFrameCallback(q6Var);
                this.f43184f0 = 0L;
                Choreographer.getInstance().postFrameCallback(q6Var);
            }
        }
    }

    public final void j() {
        boolean z9;
        if (!this.f43193s && this.f43191n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f43192r != z9) {
            this.f43192r = z9;
            if (!z9) {
                h(false);
            }
            int i7 = this.f43189k0 + 1;
            this.f43189k0 = i7;
            if (this.f43183f != null) {
                removeCallbacks(this.f43190l0);
                setIdleAnimationEnabled(false);
                if (this.f43196y) {
                    q6 q6Var = this.f43188j0;
                    if (z9) {
                        Choreographer.getInstance().removeFrameCallback(q6Var);
                        this.f43184f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(q6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(q6Var);
                        this.f43184f0 = 0L;
                        this.f43180d0 = 0.0f;
                    }
                } else if (z9) {
                    vg.f fVar = this.f43183f;
                    fVar.d = 0.0f;
                    fVar.f57392i = 0.0f;
                    m(new f2(this, i7, 2));
                }
                setRendererPaused(!z9);
                return;
            }
            dh0 dh0Var = this.h;
            if (dh0Var != null) {
                if (z9) {
                    if (!this.f43194w || this.f43195x) {
                        dh0Var.d();
                    }
                    this.f43194w = true;
                    return;
                }
                this.f43195x = dh0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        vg.f fVar = this.f43183f;
        if (fVar != null) {
            fVar.f57390f = this.T + this.L;
            return;
        }
        dh0 dh0Var = this.h;
        if (dh0Var != null) {
            dh0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f43179c0 = runnable;
        if (this.f43183f != null) {
            m(new r6(this, 1));
        } else if (runnable != null) {
            post(new r6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.f57383w = runnable;
            if (t6Var.f57382s && runnable != null) {
                t6Var.f57383w = null;
                runnable.run();
            }
        }
        s6 s6Var = this.f43181e;
        if (s6Var != null) {
            s6Var.f57423a0 = runnable;
            if (s6Var.W && runnable != null) {
                s6Var.f57423a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43191n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43191n = false;
        Choreographer.getInstance().removeFrameCallback(this.f43175a0);
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
        if ((isEnabled() && this.f43196y && this.f43183f != null && this.f43192r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.f43174a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i7);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f43178c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f43196y && this.f43183f != null && this.f43192r) {
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
                        vg.f fVar = this.f43183f;
                        fVar.d = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.E, f10, fVar.d);
                        vg.f fVar2 = this.f43183f;
                        fVar2.f57392i = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.F, f10, fVar2.f57392i);
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
            this.f43180d0 = 0.0f;
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
        this.f43177b0 = f10;
        i();
        setEnabled(false);
        dh0 dh0Var = this.h;
        if (dh0Var != null) {
            dh0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.K = f10;
        vg.f fVar = this.f43183f;
        if (fVar != null) {
            fVar.f57391g = f10 + this.M;
            return;
        }
        dh0 dh0Var = this.h;
        if (dh0Var != null) {
            dh0Var.setRotation(f10 + this.M);
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
        vg.f fVar = this.f43183f;
        if (fVar != null) {
            fVar.f57393j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f;
        float f12 = 1.0f - f10;
        float f13 = (2.0f * f12) + 1.0f;
        this.f43178c.setScaleX(f13);
        this.f43178c.setScaleY(f13);
        if (this.f43183f != null) {
            if (f13 > 1.0f) {
                f11 = 3.5f;
            }
            setRenderScale(f11);
        }
        this.L = f12 * (-720.0f);
        this.M = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f43183f;
        if (fVar != null) {
            fVar.f57391g = this.K + this.M;
            return;
        }
        dh0 dh0Var = this.h;
        if (dh0Var != null) {
            dh0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z9) {
        this.f43193s = z9;
        j();
    }

    public void setStarParticlesView(ug.q1 q1Var) {
        t6 t6Var = this.d;
        if (t6Var != null) {
            t6Var.setStarParticlesView(q1Var);
        }
        s6 s6Var = this.f43181e;
        if (s6Var != null) {
            s6Var.setStarParticlesView(q1Var);
        }
    }
}
