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
import org.telegram.ui.Components.ds;
import org.telegram.ui.hc1;
import org.telegram.ui.yg1;
public final class m6 extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public float H;
    public ValueAnimator I;
    public o1.j J;
    public float K;
    public float L;
    public float M;
    public float N;
    public o1.j O;
    public float P;
    public float Q;
    public long R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public final int f36973a;
    public final i6 f36974a0;
    public final int f36975b;
    public float f36976b0;
    public View f36977c;
    public Runnable f36978c0;
    public l6 d;
    public float f36979d0;
    public k6 e;
    public double f36980e0;
    public ug.g f36981f;
    public long f36982f0;
    public float f36983g0;
    public bk0 h;
    public float f36984h0;
    public float f36985i0;
    public final i6 f36986j0;
    public int f36987k0;
    public final j6 f36988l0;
    public boolean f36989n;
    public boolean f36990r;
    public boolean f36991s;
    public boolean v;
    public boolean f36992w;
    public boolean f36993x;
    public int f36994y;

    public m6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(m6 m6Var) {
        if (m6Var.f36981f != null && m6Var.f36990r && !m6Var.f36993x) {
            m6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(m6 m6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && m6Var.f36981f != null) {
            m6Var.setRenderScale(1.0f);
        }
    }

    public static void c(m6 m6Var) {
        if (m6Var.f36981f != null) {
            m6Var.h(false);
            m6Var.f36987k0++;
            m6Var.removeCallbacks(m6Var.f36988l0);
            Choreographer.getInstance().removeFrameCallback(m6Var.f36986j0);
            m6Var.f36982f0 = 0L;
            m6Var.f36979d0 = 0.0f;
            m6Var.m(null);
            m6Var.setIdleAnimationEnabled(false);
            m6Var.setRendererPaused(true);
            l6 l6Var = m6Var.d;
            if (l6Var != null) {
                l6Var.setPaused(true);
                l6Var.onPause();
            }
            k6 k6Var = m6Var.e;
            if (k6Var != null) {
                k6Var.o();
            }
            m6Var.removeView(m6Var.f36977c);
            m6Var.d = null;
            m6Var.e = null;
            m6Var.f36981f = null;
            m6Var.g();
            View view = m6Var.f36977c;
            int i10 = m6Var.f36973a;
            m6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            m6Var.f36990r = false;
            if (m6Var.f36976b0 != 0.0f) {
                m6Var.h.getAnimatedDrawable().K(1);
            }
            m6Var.j();
            Runnable runnable = m6Var.f36978c0;
            m6Var.f36978c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.setIdleAnimationEnabled(z10);
        }
        k6 k6Var = this.e;
        if (k6Var != null) {
            k6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f36981f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.setPaused(z10);
        }
        k6 k6Var = this.e;
        if (k6Var != null) {
            k6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f36981f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.j jVar = new o1.j(new ac.a(this.f36977c.getScaleX()));
            this.J = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.f18968u = kVar;
            this.J.e(0.001f);
            this.J.b(new g6(this, 0));
            this.J.a(new h6(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        ug.g gVar = this.f36981f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f36983g0;
        float f11 = this.f36985i0;
        gVar.d = c3.h0.z(1.0f, f11, f10, f7);
        gVar.f49819i = c3.h0.z(1.0f, f11, this.f36984h0, this.H);
    }

    public final void f(m6 m6Var) {
        ug.g gVar;
        if (m6Var != null && (gVar = m6Var.f36981f) != null && this.f36981f != null) {
            this.G = gVar.d;
            this.H = gVar.f49819i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        bk0 bk0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f36975b;
        bk0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f36977c = this.h;
        setOnClickListener(new s2(this, 4));
        setClickable(!this.f36993x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        ug.g gVar = this.f36981f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f49819i + gVar.f49820j);
    }

    public float getFlightYaw() {
        ug.g gVar = this.f36981f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f49817f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f36994y != -1) {
            this.f36994y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            ug.g gVar = this.f36981f;
            if (gVar != null) {
                if (z10) {
                    this.f36983g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f36984h0 = (float) Math.IEEEremainder(this.f36981f.f49819i - this.H, 360.0d);
                    this.f36985i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(ds.h);
                    this.I.addUpdateListener(new a3(this, 4));
                    this.I.addListener(new hc1(this, 10));
                    this.I.start();
                } else {
                    this.f36985i0 = 1.0f;
                    this.f36984h0 = 0.0f;
                    this.f36983g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f36985i0 = 1.0f;
            this.f36984h0 = 0.0f;
            this.f36983g0 = 0.0f;
            e();
        }
        if (this.f36977c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.j jVar = this.J;
            if (jVar != null) {
                jVar.c();
                this.J = null;
            }
            this.f36977c.setScaleX(1.0f);
            this.f36977c.setScaleY(1.0f);
            if (this.f36981f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f36993x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f36988l0);
        setClickable(false);
        if (this.f36981f != null) {
            l6 l6Var = this.d;
            if (l6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                l6Var.J = max;
                l6Var.f49804a.h = l6Var.I / max;
                l6Var.f();
            }
            setIdleAnimationEnabled(false);
            ug.g gVar = this.f36981f;
            this.G = gVar.d;
            this.H = gVar.f49819i;
            if (this.f36990r) {
                Choreographer choreographer = Choreographer.getInstance();
                i6 i6Var = this.f36986j0;
                choreographer.removeFrameCallback(i6Var);
                this.f36982f0 = 0L;
                Choreographer.getInstance().postFrameCallback(i6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f36991s && this.f36989n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36990r != z10) {
            this.f36990r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f36987k0 + 1;
            this.f36987k0 = i10;
            if (this.f36981f != null) {
                removeCallbacks(this.f36988l0);
                setIdleAnimationEnabled(false);
                if (this.f36993x) {
                    i6 i6Var = this.f36986j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(i6Var);
                        this.f36982f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(i6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(i6Var);
                        this.f36982f0 = 0L;
                        this.f36979d0 = 0.0f;
                    }
                } else if (z10) {
                    ug.g gVar = this.f36981f;
                    gVar.d = 0.0f;
                    gVar.f49819i = 0.0f;
                    m(new yg1(this, i10, 4));
                }
                setRendererPaused(!z10);
                return;
            }
            bk0 bk0Var = this.h;
            if (bk0Var != null) {
                if (z10) {
                    if (!this.v || this.f36992w) {
                        bk0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f36992w = bk0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        ug.g gVar = this.f36981f;
        if (gVar != null) {
            gVar.f49817f = this.T + this.L;
            return;
        }
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f36978c0 = runnable;
        if (this.f36981f != null) {
            m(new j6(this, 1));
        } else if (runnable != null) {
            post(new j6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.v = runnable;
            if (l6Var.f49810s && runnable != null) {
                l6Var.v = null;
                runnable.run();
            }
        }
        k6 k6Var = this.e;
        if (k6Var != null) {
            k6Var.f49850a0 = runnable;
            if (k6Var.W && runnable != null) {
                k6Var.f49850a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36989n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f36989n = false;
        Choreographer.getInstance().removeFrameCallback(this.f36974a0);
        o1.j jVar = this.O;
        if (jVar != null) {
            jVar.c();
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
        if ((isEnabled() && this.f36993x && this.f36981f != null && this.f36990r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f36973a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f36977c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f36993x && this.f36981f != null && this.f36990r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f36994y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f36994y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f36994y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f36994y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        ug.g gVar = this.f36981f;
                        gVar.d = c3.h0.z(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        ug.g gVar2 = this.f36981f;
                        gVar2.f49819i = c3.h0.z(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f49819i);
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
            this.f36979d0 = 0.0f;
            this.f36994y = motionEvent.getPointerId(0);
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
        this.f36976b0 = f7;
        i();
        setEnabled(false);
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        ug.g gVar = this.f36981f;
        if (gVar != null) {
            gVar.f49818g = f7 + this.M;
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
        ug.g gVar = this.f36981f;
        if (gVar != null) {
            gVar.f49820j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f36977c.setScaleX(f12);
        this.f36977c.setScaleY(f12);
        if (this.f36981f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        ug.g gVar = this.f36981f;
        if (gVar != null) {
            gVar.f49818g = this.K + this.M;
            return;
        }
        bk0 bk0Var = this.h;
        if (bk0Var != null) {
            bk0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f36991s = z10;
        j();
    }

    public void setStarParticlesView(tg.x1 x1Var) {
        l6 l6Var = this.d;
        if (l6Var != null) {
            l6Var.setStarParticlesView(x1Var);
        }
        k6 k6Var = this.e;
        if (k6Var != null) {
            k6Var.setStarParticlesView(x1Var);
        }
    }
}
