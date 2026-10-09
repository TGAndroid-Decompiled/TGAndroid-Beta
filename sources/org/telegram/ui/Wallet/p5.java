package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ci.ya;
import org.telegram.messenger.bi;
public final class p5 extends sg.n {
    public final k5 f35384f0;
    public final q5 f35385g0;
    public final int f35386h0;
    public final m f35387i0;
    public float f35388j0;
    public float f35389k0;
    public float f35390l0;
    public float m0;
    public boolean f35391n0;
    public ValueAnimator f35392o0;

    public p5(Context context, q5 q5Var, int i10, int i11) {
        super(context, 0, 0);
        this.f35385g0 = q5Var;
        this.f35387i0 = new m(q5Var, 9);
        k5 k5Var = new k5(context, i10, i11);
        this.f35384f0 = k5Var;
        setRenderer(k5Var);
        setOpaque(false);
        this.f35386h0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final int getMaxFrameRate() {
        return 60;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f35387i0);
        this.f35385g0.setPressed(false);
        ValueAnimator valueAnimator = this.f35392o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35392o0.cancel();
            this.f35392o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f35384f0.getClass();
        this.f35385g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f35385g0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p5.onSurfaceTextureUpdated(android.graphics.SurfaceTexture):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        k5 k5Var = this.f35384f0;
        q5 q5Var = this.f35385g0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        q5Var.setPressed(false);
                        if (this.f35391n0) {
                            p();
                        }
                        this.f35391n0 = true;
                        return true;
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.f35388j0);
                    float f7 = this.f35386h0;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.f35389k0) > f7) {
                        this.f35391n0 = true;
                        q5Var.setPressed(false);
                    }
                    if (this.f35391n0) {
                        float b10 = com.google.android.gms.internal.vision.e2.b(motionEvent.getX(), this.f35388j0, 0.03f, this.f35390l0);
                        float f10 = this.f35390l0;
                        k5Var.d = q5.b(b10, f10 - 32.0f, f10 + 32.0f);
                        float b11 = com.google.android.gms.internal.vision.e2.b(motionEvent.getY(), this.f35389k0, 0.03f, this.m0);
                        float f11 = this.m0;
                        k5Var.f48046i = q5.b(b11, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            q5Var.setPressed(false);
            if (this.f35391n0) {
                p();
                return true;
            }
            postDelayed(this.f35387i0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f35392o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35392o0.cancel();
            this.f35392o0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f35388j0 = motionEvent.getX();
        this.f35389k0 = motionEvent.getY();
        this.f35390l0 = k5Var.d;
        this.m0 = k5Var.f48046i;
        this.f35391n0 = false;
        q5Var.setPressed(true);
        return true;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.f35392o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35392o0.cancel();
            this.f35392o0 = null;
        }
        k5 k5Var = this.f35384f0;
        float f7 = k5Var.d;
        float f10 = k5Var.f48046i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35392o0 = ofFloat;
        ofFloat.setDuration(600L);
        bi.l(1.2f, this.f35392o0);
        this.f35392o0.addUpdateListener(new ya(this, f7, f10, 7));
        this.f35392o0.addListener(new x4(this, 2));
        this.f35392o0.start();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override
    public final void setPaused(boolean z10) {
        k5 k5Var = this.f35384f0;
        synchronized (k5Var) {
            if (k5Var.f35157e0 != z10) {
                k5Var.f35157e0 = z10;
                k5Var.f35159g0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override
    public final void n() {
    }
}
