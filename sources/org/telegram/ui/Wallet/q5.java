package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ci.ya;
import org.telegram.messenger.bi;
public final class q5 extends sg.n {
    public final l5 f35474f0;
    public final r5 f35475g0;
    public final int f35476h0;
    public final n f35477i0;
    public float f35478j0;
    public float f35479k0;
    public float f35480l0;
    public float m0;
    public boolean f35481n0;
    public ValueAnimator f35482o0;

    public q5(Context context, r5 r5Var, int i10, int i11) {
        super(context, 0, 0);
        this.f35475g0 = r5Var;
        this.f35477i0 = new n(r5Var, 9);
        l5 l5Var = new l5(context, i10, i11);
        this.f35474f0 = l5Var;
        setRenderer(l5Var);
        setOpaque(false);
        this.f35476h0 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        removeCallbacks(this.f35477i0);
        this.f35475g0.setPressed(false);
        ValueAnimator valueAnimator = this.f35482o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35482o0.cancel();
            this.f35482o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f35474f0.getClass();
        this.f35475g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f35475g0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q5.onSurfaceTextureUpdated(android.graphics.SurfaceTexture):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        l5 l5Var = this.f35474f0;
        r5 r5Var = this.f35475g0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        r5Var.setPressed(false);
                        if (this.f35481n0) {
                            p();
                        }
                        this.f35481n0 = true;
                        return true;
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.f35478j0);
                    float f7 = this.f35476h0;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.f35479k0) > f7) {
                        this.f35481n0 = true;
                        r5Var.setPressed(false);
                    }
                    if (this.f35481n0) {
                        float b10 = com.google.android.gms.internal.vision.e2.b(motionEvent.getX(), this.f35478j0, 0.03f, this.f35480l0);
                        float f10 = this.f35480l0;
                        l5Var.d = r5.b(b10, f10 - 32.0f, f10 + 32.0f);
                        float b11 = com.google.android.gms.internal.vision.e2.b(motionEvent.getY(), this.f35479k0, 0.03f, this.m0);
                        float f11 = this.m0;
                        l5Var.f48090i = r5.b(b11, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            r5Var.setPressed(false);
            if (this.f35481n0) {
                p();
                return true;
            }
            postDelayed(this.f35477i0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f35482o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35482o0.cancel();
            this.f35482o0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f35478j0 = motionEvent.getX();
        this.f35479k0 = motionEvent.getY();
        this.f35480l0 = l5Var.d;
        this.m0 = l5Var.f48090i;
        this.f35481n0 = false;
        r5Var.setPressed(true);
        return true;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.f35482o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35482o0.cancel();
            this.f35482o0 = null;
        }
        l5 l5Var = this.f35474f0;
        float f7 = l5Var.d;
        float f10 = l5Var.f48090i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35482o0 = ofFloat;
        ofFloat.setDuration(600L);
        bi.l(1.2f, this.f35482o0);
        this.f35482o0.addUpdateListener(new ya(this, f7, f10, 7));
        this.f35482o0.addListener(new y4(this, 2));
        this.f35482o0.start();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override
    public final void setPaused(boolean z10) {
        l5 l5Var = this.f35474f0;
        synchronized (l5Var) {
            if (l5Var.f35247e0 != z10) {
                l5Var.f35247e0 = z10;
                l5Var.f35249g0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override
    public final void n() {
    }
}
