package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.g71;
import org.telegram.ui.nb1;
public final class w6 extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public ValueAnimator J;
    public r1.g K;
    public float L;
    public float M;
    public float N;
    public float O;
    public r1.g P;
    public float Q;
    public float R;
    public long S;
    public boolean T;
    public float U;
    public float V;
    public long W;
    public final int f44632a;
    public boolean f44633a0;
    public final int f44634b;
    public final s6 f44635b0;
    public View f44636c;
    public float f44637c0;
    public v6 d;
    public Runnable f44638d0;
    public u6 f44639e;
    public float f44640e0;
    public vg.f f44641f;
    public double f44642f0;
    public long f44643g0;
    public fh0 h;
    public float f44644h0;
    public float f44645i0;
    public float f44646j0;
    public final s6 f44647k0;
    public int f44648l0;
    public final t6 m0;
    public boolean f44649n;
    public boolean f44650r;
    public boolean f44651s;
    public boolean f44652w;
    public boolean f44653x;
    public boolean f44654y;

    public w6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(w6 w6Var) {
        if (w6Var.f44641f != null && w6Var.f44650r && !w6Var.f44654y) {
            w6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(w6 w6Var, boolean z10, float f10) {
        if (!z10 && f10 <= 1.001f && w6Var.f44641f != null) {
            w6Var.setRenderScale(1.0f);
        }
    }

    public static void c(w6 w6Var) {
        if (w6Var.f44641f != null) {
            w6Var.h(false);
            w6Var.f44648l0++;
            w6Var.removeCallbacks(w6Var.m0);
            Choreographer.getInstance().removeFrameCallback(w6Var.f44647k0);
            w6Var.f44643g0 = 0L;
            w6Var.f44640e0 = 0.0f;
            w6Var.m(null);
            w6Var.setIdleAnimationEnabled(false);
            w6Var.setRendererPaused(true);
            v6 v6Var = w6Var.d;
            if (v6Var != null) {
                v6Var.setPaused(true);
                v6Var.onPause();
            }
            u6 u6Var = w6Var.f44639e;
            if (u6Var != null) {
                u6Var.o();
            }
            w6Var.removeView(w6Var.f44636c);
            w6Var.d = null;
            w6Var.f44639e = null;
            w6Var.f44641f = null;
            w6Var.g();
            View view = w6Var.f44636c;
            int i7 = w6Var.f44632a;
            w6Var.addView(view, new FrameLayout.LayoutParams(i7, i7, 17));
            w6Var.f44650r = false;
            if (w6Var.f44637c0 != 0.0f) {
                w6Var.h.getAnimatedDrawable().K(1);
            }
            w6Var.j();
            Runnable runnable = w6Var.f44638d0;
            w6Var.f44638d0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setIdleAnimationEnabled(z10);
        }
        u6 u6Var = this.f44639e;
        if (u6Var != null) {
            u6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f10) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setRenderScale(f10);
        }
        if (this.f44639e != null) {
            this.f44641f.h = f10 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setPaused(z10);
        }
        u6 u6Var = this.f44639e;
        if (u6Var != null) {
            u6Var.setPaused(z10);
        }
    }

    public final void d(float f10) {
        if (f10 > 1.0f && this.f44641f != null) {
            setRenderScale(3.5f);
        }
        if (this.K == null) {
            r1.g gVar = new r1.g(new r1.f(this.f44636c.getScaleX()));
            this.K = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f55748m = hVar;
            this.K.f(0.001f);
            this.K.b(new q6(this, 0));
            this.K.a(new r6(this, 0));
        }
        this.K.c(f10);
    }

    public final void e() {
        vg.f fVar = this.f44641f;
        if (fVar == null) {
            return;
        }
        float f10 = this.H;
        float f11 = this.f44644h0;
        float f12 = this.f44646j0;
        fVar.d = com.google.android.gms.internal.vision.e2.z(1.0f, f12, f11, f10);
        fVar.f58861i = com.google.android.gms.internal.vision.e2.z(1.0f, f12, this.f44645i0, this.I);
    }

    public final void f(w6 w6Var) {
        vg.f fVar;
        if (w6Var != null && (fVar = w6Var.f44641f) != null && this.f44641f != null) {
            this.H = fVar.d;
            this.I = fVar.f58861i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        fh0 fh0Var = this.h;
        int i7 = this.f44634b;
        fh0Var.f(2131624356, i7, i7, null);
        this.h.getAnimatedDrawable().K(0);
        this.f44636c = this.h;
        setOnClickListener(new g3(this, 4));
        setClickable(!this.f44654y);
    }

    public float getConversionWobble() {
        return this.L;
    }

    public float getFlightPitch() {
        vg.f fVar = this.f44641f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.f58861i + fVar.f58862j);
    }

    public float getFlightYaw() {
        vg.f fVar = this.f44641f;
        if (fVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(fVar.d + fVar.f58859f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.E != -1) {
            this.E = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            vg.f fVar = this.f44641f;
            if (fVar != null) {
                if (z10) {
                    this.f44644h0 = (float) Math.IEEEremainder(fVar.d - this.H, 360.0d);
                    this.f44645i0 = (float) Math.IEEEremainder(this.f44641f.f58861i - this.I, 360.0d);
                    this.f44646j0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setDuration(350L);
                    this.J.setInterpolator(er.h);
                    this.J.addUpdateListener(new q3(this, 4));
                    this.J.addListener(new g71(this, 10));
                    this.J.start();
                } else {
                    this.f44646j0 = 1.0f;
                    this.f44645i0 = 0.0f;
                    this.f44644h0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.J) != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
            this.J = null;
            this.f44646j0 = 1.0f;
            this.f44645i0 = 0.0f;
            this.f44644h0 = 0.0f;
            e();
        }
        if (this.f44636c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            r1.g gVar = this.K;
            if (gVar != null) {
                gVar.d();
                this.K = null;
            }
            this.f44636c.setScaleX(1.0f);
            this.f44636c.setScaleY(1.0f);
            if (this.f44641f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f44654y = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.m0);
        setClickable(false);
        if (this.f44641f != null) {
            v6 v6Var = this.d;
            if (v6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                v6Var.K = max;
                v6Var.f58844a.h = v6Var.J / max;
                v6Var.f();
            }
            setIdleAnimationEnabled(false);
            vg.f fVar = this.f44641f;
            this.H = fVar.d;
            this.I = fVar.f58861i;
            if (this.f44650r) {
                Choreographer choreographer = Choreographer.getInstance();
                s6 s6Var = this.f44647k0;
                choreographer.removeFrameCallback(s6Var);
                this.f44643g0 = 0L;
                Choreographer.getInstance().postFrameCallback(s6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f44651s && this.f44649n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f44650r != z10) {
            this.f44650r = z10;
            if (!z10) {
                h(false);
            }
            int i7 = this.f44648l0 + 1;
            this.f44648l0 = i7;
            if (this.f44641f != null) {
                removeCallbacks(this.m0);
                setIdleAnimationEnabled(false);
                if (this.f44654y) {
                    s6 s6Var = this.f44647k0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(s6Var);
                        this.f44643g0 = 0L;
                        Choreographer.getInstance().postFrameCallback(s6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(s6Var);
                        this.f44643g0 = 0L;
                        this.f44640e0 = 0.0f;
                    }
                } else if (z10) {
                    vg.f fVar = this.f44641f;
                    fVar.d = 0.0f;
                    fVar.f58861i = 0.0f;
                    m(new nb1(this, i7, 5));
                }
                setRendererPaused(!z10);
                return;
            }
            fh0 fh0Var = this.h;
            if (fh0Var != null) {
                if (z10) {
                    if (!this.f44652w || this.f44653x) {
                        fh0Var.d();
                    }
                    this.f44652w = true;
                    return;
                }
                this.f44653x = fh0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        vg.f fVar = this.f44641f;
        if (fVar != null) {
            fVar.f58859f = this.U + this.M;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotationY(this.U + this.M);
        }
    }

    public final void l(Runnable runnable) {
        this.f44638d0 = runnable;
        if (this.f44641f != null) {
            m(new t6(this, 1));
        } else if (runnable != null) {
            post(new t6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.f58852w = runnable;
            if (v6Var.f58851s && runnable != null) {
                v6Var.f58852w = null;
                runnable.run();
            }
        }
        u6 u6Var = this.f44639e;
        if (u6Var != null) {
            u6Var.f58894b0 = runnable;
            if (u6Var.f58892a0 && runnable != null) {
                u6Var.f58894b0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44649n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f44649n = false;
        Choreographer.getInstance().removeFrameCallback(this.f44635b0);
        r1.g gVar = this.P;
        if (gVar != null) {
            gVar.d();
            this.P = null;
            setTranslationX(0.0f);
        }
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0L;
        this.f44633a0 = false;
        this.T = false;
        this.W = 0L;
        this.V = 0.0f;
        this.U = 0.0f;
        k();
        j();
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((isEnabled() && this.f44654y && this.f44641f != null && this.f44650r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.f44632a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i11, i7);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i11, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f44636c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f44654y && this.f44641f != null && this.f44650r) {
            int actionMasked = motionEvent.getActionMasked();
            int i7 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.E == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.E) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i7 = 1;
                                }
                                this.E = motionEvent.getPointerId(i7);
                                this.F = motionEvent.getX(i7);
                                this.G = motionEvent.getY(i7);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.E);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f10 = 0.8f / org.telegram.messenger.g0.f23610p;
                        vg.f fVar = this.f44641f;
                        fVar.d = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), this.F, f10, fVar.d);
                        vg.f fVar2 = this.f44641f;
                        fVar2.f58861i = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), this.G, f10, fVar2.f58861i);
                        this.F = motionEvent.getX(findPointerIndex);
                        this.G = motionEvent.getY(findPointerIndex);
                        return true;
                    }
                }
                h(true);
                return true;
            }
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
                this.J = null;
            }
            this.f44640e0 = 0.0f;
            this.E = motionEvent.getPointerId(0);
            this.F = motionEvent.getX();
            this.G = motionEvent.getY();
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
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        j();
    }

    @Override
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        j();
    }

    public void setContinuousRotation(float f10) {
        this.f44637c0 = f10;
        i();
        setEnabled(false);
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f10) {
        this.L = f10;
        vg.f fVar = this.f44641f;
        if (fVar != null) {
            fVar.f58860g = f10 + this.N;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotation(f10 + this.N);
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            h(false);
        }
    }

    public void setHeaderTilt(float f10) {
        vg.f fVar = this.f44641f;
        if (fVar != null) {
            fVar.f58862j = f10;
        }
    }

    public void setIntroProgress(float f10) {
        float f11 = 1.0f;
        float f12 = 1.0f - f10;
        float f13 = (2.0f * f12) + 1.0f;
        this.f44636c.setScaleX(f13);
        this.f44636c.setScaleY(f13);
        if (this.f44641f != null) {
            if (f13 > 1.0f) {
                f11 = 3.5f;
            }
            setRenderScale(f11);
        }
        this.M = f12 * (-720.0f);
        this.N = ((float) Math.sin(f10 * 3.141592653589793d)) * 35.0f;
        k();
        vg.f fVar = this.f44641f;
        if (fVar != null) {
            fVar.f58860g = this.L + this.N;
            return;
        }
        fh0 fh0Var = this.h;
        if (fh0Var != null) {
            fh0Var.setRotation(this.L + this.N);
        }
    }

    public void setPaused(boolean z10) {
        this.f44651s = z10;
        j();
    }

    public void setStarParticlesView(ug.s1 s1Var) {
        v6 v6Var = this.d;
        if (v6Var != null) {
            v6Var.setStarParticlesView(s1Var);
        }
        u6 u6Var = this.f44639e;
        if (u6Var != null) {
            u6Var.setStarParticlesView(s1Var);
        }
    }
}
