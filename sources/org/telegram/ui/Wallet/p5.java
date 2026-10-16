package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import di.xa;
import org.telegram.messenger.sk;
import org.telegram.ui.fi1;
public final class p5 extends tg.n {
    public final l5 f33336f0;
    public final q5 f33337g0;
    public final int f33338h0;
    public final n f33339i0;
    public float f33340j0;
    public float f33341k0;
    public float f33342l0;
    public float m0;
    public boolean f33343n0;
    public ValueAnimator f33344o0;

    public p5(Context context, q5 q5Var, int i10, int i11) {
        super(context, 0, 0);
        this.f33337g0 = q5Var;
        this.f33339i0 = new n(q5Var, 9);
        l5 l5Var = new l5(context, i10, i11);
        this.f33336f0 = l5Var;
        setRenderer(l5Var);
        setOpaque(false);
        this.f33338h0 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        removeCallbacks(this.f33339i0);
        this.f33337g0.setPressed(false);
        ValueAnimator valueAnimator = this.f33344o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33344o0.cancel();
            this.f33344o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f33336f0.getClass();
        this.f33337g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f33337g0.d();
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
        l5 l5Var = this.f33336f0;
        q5 q5Var = this.f33337g0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        q5Var.setPressed(false);
                        if (this.f33343n0) {
                            p();
                        }
                        this.f33343n0 = true;
                        return true;
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.f33340j0);
                    float f7 = this.f33338h0;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.f33341k0) > f7) {
                        this.f33343n0 = true;
                        q5Var.setPressed(false);
                    }
                    if (this.f33343n0) {
                        float D = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getX(), this.f33340j0, 0.03f, this.f33342l0);
                        float f10 = this.f33342l0;
                        l5Var.d = q5.b(D, f10 - 32.0f, f10 + 32.0f);
                        float D2 = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getY(), this.f33341k0, 0.03f, this.m0);
                        float f11 = this.m0;
                        l5Var.f45708i = q5.b(D2, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            q5Var.setPressed(false);
            if (this.f33343n0) {
                p();
                return true;
            }
            postDelayed(this.f33339i0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f33344o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33344o0.cancel();
            this.f33344o0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f33340j0 = motionEvent.getX();
        this.f33341k0 = motionEvent.getY();
        this.f33342l0 = l5Var.d;
        this.m0 = l5Var.f45708i;
        this.f33343n0 = false;
        q5Var.setPressed(true);
        return true;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.f33344o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33344o0.cancel();
            this.f33344o0 = null;
        }
        l5 l5Var = this.f33336f0;
        float f7 = l5Var.d;
        float f10 = l5Var.f45708i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f33344o0 = ofFloat;
        ofFloat.setDuration(600L);
        sk.l(1.2f, this.f33344o0);
        this.f33344o0.addUpdateListener(new xa(this, f7, f10, 7));
        this.f33344o0.addListener(new fi1(this, 5));
        this.f33344o0.start();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override
    public final void setPaused(boolean z10) {
        l5 l5Var = this.f33336f0;
        synchronized (l5Var) {
            if (l5Var.f33165e0 != z10) {
                l5Var.f33165e0 = z10;
                l5Var.f33167g0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override
    public final void n() {
    }
}
