package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.fc1;
import org.telegram.ui.wg1;
public final class l6 extends FrameLayout {
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
    public final int f36843a;
    public final h6 f36844a0;
    public final int f36845b;
    public float f36846b0;
    public View f36847c;
    public Runnable f36848c0;
    public k6 d;
    public float f36849d0;
    public j6 e;
    public double f36850e0;
    public ug.g f36851f;
    public long f36852f0;
    public float f36853g0;
    public ak0 h;
    public float f36854h0;
    public float f36855i0;
    public final h6 f36856j0;
    public int f36857k0;
    public final i6 f36858l0;
    public boolean f36859n;
    public boolean f36860r;
    public boolean f36861s;
    public boolean v;
    public boolean f36862w;
    public boolean f36863x;
    public int f36864y;

    public l6(int r3, android.content.Context r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l6.<init>(int, android.content.Context, boolean):void");
    }

    public static void a(l6 l6Var) {
        if (l6Var.f36851f != null && l6Var.f36860r && !l6Var.f36863x) {
            l6Var.setIdleAnimationEnabled(true);
        }
    }

    public static void b(l6 l6Var, boolean z10, float f7) {
        if (!z10 && f7 <= 1.001f && l6Var.f36851f != null) {
            l6Var.setRenderScale(1.0f);
        }
    }

    public static void c(l6 l6Var) {
        if (l6Var.f36851f != null) {
            l6Var.h(false);
            l6Var.f36857k0++;
            l6Var.removeCallbacks(l6Var.f36858l0);
            Choreographer.getInstance().removeFrameCallback(l6Var.f36856j0);
            l6Var.f36852f0 = 0L;
            l6Var.f36849d0 = 0.0f;
            l6Var.m(null);
            l6Var.setIdleAnimationEnabled(false);
            l6Var.setRendererPaused(true);
            k6 k6Var = l6Var.d;
            if (k6Var != null) {
                k6Var.setPaused(true);
                k6Var.onPause();
            }
            j6 j6Var = l6Var.e;
            if (j6Var != null) {
                j6Var.o();
            }
            l6Var.removeView(l6Var.f36847c);
            l6Var.d = null;
            l6Var.e = null;
            l6Var.f36851f = null;
            l6Var.g();
            View view = l6Var.f36847c;
            int i10 = l6Var.f36843a;
            l6Var.addView(view, new FrameLayout.LayoutParams(i10, i10, 17));
            l6Var.f36860r = false;
            if (l6Var.f36846b0 != 0.0f) {
                l6Var.h.getAnimatedDrawable().K(1);
            }
            l6Var.j();
            Runnable runnable = l6Var.f36848c0;
            l6Var.f36848c0 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void setIdleAnimationEnabled(boolean z10) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.setIdleAnimationEnabled(z10);
        }
        j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.setIdleAnimationEnabled(z10);
        }
    }

    private void setRenderScale(float f7) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.setRenderScale(f7);
        }
        if (this.e != null) {
            this.f36851f.h = f7 / 3.5f;
        }
    }

    private void setRendererPaused(boolean z10) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.setPaused(z10);
        }
        j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.setPaused(z10);
        }
    }

    public final void d(float f7) {
        if (f7 > 1.0f && this.f36851f != null) {
            setRenderScale(3.5f);
        }
        if (this.J == null) {
            o1.j jVar = new o1.j(new ac.a(this.f36847c.getScaleX()));
            this.J = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.f18969u = kVar;
            this.J.e(0.001f);
            this.J.b(new f6(this, 0));
            this.J.a(new g6(this, 0));
        }
        this.J.g(f7);
    }

    public final void e() {
        ug.g gVar = this.f36851f;
        if (gVar == null) {
            return;
        }
        float f7 = this.G;
        float f10 = this.f36853g0;
        float f11 = this.f36855i0;
        gVar.d = c3.h0.z(1.0f, f11, f10, f7);
        gVar.f49781i = c3.h0.z(1.0f, f11, this.f36854h0, this.H);
    }

    public final void f(l6 l6Var) {
        ug.g gVar;
        if (l6Var != null && (gVar = l6Var.f36851f) != null && this.f36851f != null) {
            this.G = gVar.d;
            this.H = gVar.f49781i;
            e();
        }
    }

    public final void g() {
        ?? imageView = new ImageView(getContext());
        this.h = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ak0 ak0Var = this.h;
        int i10 = R.raw.wallet_diamond_blue;
        int i11 = this.f36845b;
        ak0Var.f(i10, i11, i11, null);
        this.h.getAnimatedDrawable().K(0);
        this.f36847c = this.h;
        setOnClickListener(new s2(this, 4));
        setClickable(!this.f36863x);
    }

    public float getConversionWobble() {
        return this.K;
    }

    public float getFlightPitch() {
        ug.g gVar = this.f36851f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.f49781i + gVar.f49782j);
    }

    public float getFlightYaw() {
        ug.g gVar = this.f36851f;
        if (gVar == null) {
            return 0.0f;
        }
        return (float) Math.toRadians(gVar.d + gVar.f49779f);
    }

    public final void h(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.f36864y != -1) {
            this.f36864y = -1;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            ug.g gVar = this.f36851f;
            if (gVar != null) {
                if (z10) {
                    this.f36853g0 = (float) Math.IEEEremainder(gVar.d - this.G, 360.0d);
                    this.f36854h0 = (float) Math.IEEEremainder(this.f36851f.f49781i - this.H, 360.0d);
                    this.f36855i0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(350L);
                    this.I.setInterpolator(ds.h);
                    this.I.addUpdateListener(new a3(this, 4));
                    this.I.addListener(new fc1(this, 10));
                    this.I.start();
                } else {
                    this.f36855i0 = 1.0f;
                    this.f36854h0 = 0.0f;
                    this.f36853g0 = 0.0f;
                    e();
                }
            }
        }
        if (!z10 && (valueAnimator = this.I) != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
            this.f36855i0 = 1.0f;
            this.f36854h0 = 0.0f;
            this.f36853g0 = 0.0f;
            e();
        }
        if (this.f36847c != null) {
            if (z10) {
                d(1.0f);
                return;
            }
            o1.j jVar = this.J;
            if (jVar != null) {
                jVar.c();
                this.J = null;
            }
            this.f36847c.setScaleX(1.0f);
            this.f36847c.setScaleY(1.0f);
            if (this.f36851f != null) {
                setRenderScale(1.0f);
            }
        }
    }

    public final void i() {
        this.f36863x = true;
        setClipChildren(false);
        setClipToPadding(false);
        removeCallbacks(this.f36858l0);
        setClickable(false);
        if (this.f36851f != null) {
            k6 k6Var = this.d;
            if (k6Var != null) {
                float max = Math.max(1.0f, 3.5f);
                k6Var.J = max;
                k6Var.f49766a.h = k6Var.I / max;
                k6Var.f();
            }
            setIdleAnimationEnabled(false);
            ug.g gVar = this.f36851f;
            this.G = gVar.d;
            this.H = gVar.f49781i;
            if (this.f36860r) {
                Choreographer choreographer = Choreographer.getInstance();
                h6 h6Var = this.f36856j0;
                choreographer.removeFrameCallback(h6Var);
                this.f36852f0 = 0L;
                Choreographer.getInstance().postFrameCallback(h6Var);
            }
        }
    }

    public final void j() {
        boolean z10;
        if (!this.f36861s && this.f36859n && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36860r != z10) {
            this.f36860r = z10;
            if (!z10) {
                h(false);
            }
            int i10 = this.f36857k0 + 1;
            this.f36857k0 = i10;
            if (this.f36851f != null) {
                removeCallbacks(this.f36858l0);
                setIdleAnimationEnabled(false);
                if (this.f36863x) {
                    h6 h6Var = this.f36856j0;
                    if (z10) {
                        Choreographer.getInstance().removeFrameCallback(h6Var);
                        this.f36852f0 = 0L;
                        Choreographer.getInstance().postFrameCallback(h6Var);
                    } else {
                        Choreographer.getInstance().removeFrameCallback(h6Var);
                        this.f36852f0 = 0L;
                        this.f36849d0 = 0.0f;
                    }
                } else if (z10) {
                    ug.g gVar = this.f36851f;
                    gVar.d = 0.0f;
                    gVar.f49781i = 0.0f;
                    m(new wg1(this, i10, 4));
                }
                setRendererPaused(!z10);
                return;
            }
            ak0 ak0Var = this.h;
            if (ak0Var != null) {
                if (z10) {
                    if (!this.v || this.f36862w) {
                        ak0Var.d();
                    }
                    this.v = true;
                    return;
                }
                this.f36862w = ak0Var.b();
                this.h.i();
            }
        }
    }

    public final void k() {
        ug.g gVar = this.f36851f;
        if (gVar != null) {
            gVar.f49779f = this.T + this.L;
            return;
        }
        ak0 ak0Var = this.h;
        if (ak0Var != null) {
            ak0Var.setRotationY(this.T + this.L);
        }
    }

    public final void l(Runnable runnable) {
        this.f36848c0 = runnable;
        if (this.f36851f != null) {
            m(new i6(this, 1));
        } else if (runnable != null) {
            post(new i6(this, 1));
        }
    }

    public final void m(Runnable runnable) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.v = runnable;
            if (k6Var.f49772s && runnable != null) {
                k6Var.v = null;
                runnable.run();
            }
        }
        j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.f49812a0 = runnable;
            if (j6Var.W && runnable != null) {
                j6Var.f49812a0 = null;
                runnable.run();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36859n = true;
        j();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f36859n = false;
        Choreographer.getInstance().removeFrameCallback(this.f36844a0);
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
        if ((isEnabled() && this.f36863x && this.f36851f != null && this.f36860r) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int i12 = this.f36843a;
        int resolveSize = View.resolveSize(getPaddingRight() + paddingLeft + i12, i10);
        int resolveSize2 = View.resolveSize(getPaddingBottom() + getPaddingTop() + i12, i11);
        setMeasuredDimension(resolveSize, resolveSize2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((resolveSize - getPaddingLeft()) - getPaddingRight(), (resolveSize2 - getPaddingTop()) - getPaddingBottom())), 1073741824);
        this.f36847c.measure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f36863x && this.f36851f != null && this.f36860r) {
            int actionMasked = motionEvent.getActionMasked();
            int i10 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.f36864y == -1) {
                                    return false;
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f36864y) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i10 = 1;
                                }
                                this.f36864y = motionEvent.getPointerId(i10);
                                this.E = motionEvent.getX(i10);
                                this.F = motionEvent.getY(i10);
                            }
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f36864y);
                        if (findPointerIndex < 0) {
                            h(true);
                            return true;
                        }
                        float f7 = 0.8f / AndroidUtilities.density;
                        ug.g gVar = this.f36851f;
                        gVar.d = c3.h0.z(motionEvent.getX(findPointerIndex), this.E, f7, gVar.d);
                        ug.g gVar2 = this.f36851f;
                        gVar2.f49781i = c3.h0.z(motionEvent.getY(findPointerIndex), this.F, f7, gVar2.f49781i);
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
            this.f36849d0 = 0.0f;
            this.f36864y = motionEvent.getPointerId(0);
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
        this.f36846b0 = f7;
        i();
        setEnabled(false);
        ak0 ak0Var = this.h;
        if (ak0Var != null) {
            ak0Var.getAnimatedDrawable().K(1);
        }
    }

    public void setConversionWobble(float f7) {
        this.K = f7;
        ug.g gVar = this.f36851f;
        if (gVar != null) {
            gVar.f49780g = f7 + this.M;
            return;
        }
        ak0 ak0Var = this.h;
        if (ak0Var != null) {
            ak0Var.setRotation(f7 + this.M);
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
        ug.g gVar = this.f36851f;
        if (gVar != null) {
            gVar.f49782j = f7;
        }
    }

    public void setIntroProgress(float f7) {
        float f10 = 1.0f;
        float f11 = 1.0f - f7;
        float f12 = (2.0f * f11) + 1.0f;
        this.f36847c.setScaleX(f12);
        this.f36847c.setScaleY(f12);
        if (this.f36851f != null) {
            if (f12 > 1.0f) {
                f10 = 3.5f;
            }
            setRenderScale(f10);
        }
        this.L = f11 * (-720.0f);
        this.M = ((float) Math.sin(f7 * 3.141592653589793d)) * 35.0f;
        k();
        ug.g gVar = this.f36851f;
        if (gVar != null) {
            gVar.f49780g = this.K + this.M;
            return;
        }
        ak0 ak0Var = this.h;
        if (ak0Var != null) {
            ak0Var.setRotation(this.K + this.M);
        }
    }

    public void setPaused(boolean z10) {
        this.f36861s = z10;
        j();
    }

    public void setStarParticlesView(tg.x1 x1Var) {
        k6 k6Var = this.d;
        if (k6Var != null) {
            k6Var.setStarParticlesView(x1Var);
        }
        j6 j6Var = this.e;
        if (j6Var != null) {
            j6Var.setStarParticlesView(x1Var);
        }
    }
}
