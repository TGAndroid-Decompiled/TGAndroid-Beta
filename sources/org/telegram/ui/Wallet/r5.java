package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ci.ya;
import org.telegram.messenger.ai;
public final class r5 extends sg.n {
    public final m5 f35504f0;
    public final s5 f35505g0;
    public final int f35506h0;
    public final o f35507i0;
    public float f35508j0;
    public float f35509k0;
    public float f35510l0;
    public float m0;
    public boolean f35511n0;
    public ValueAnimator f35512o0;

    public r5(Context context, s5 s5Var, int i10, int i11) {
        super(context, 0, 0);
        this.f35505g0 = s5Var;
        this.f35507i0 = new o(s5Var, 9);
        m5 m5Var = new m5(context, i10, i11);
        this.f35504f0 = m5Var;
        setRenderer(m5Var);
        setOpaque(false);
        this.f35506h0 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        removeCallbacks(this.f35507i0);
        this.f35505g0.setPressed(false);
        ValueAnimator valueAnimator = this.f35512o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35512o0.cancel();
            this.f35512o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f35504f0.getClass();
        this.f35505g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f35505g0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r5.onSurfaceTextureUpdated(android.graphics.SurfaceTexture):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        m5 m5Var = this.f35504f0;
        s5 s5Var = this.f35505g0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        s5Var.setPressed(false);
                        if (this.f35511n0) {
                            p();
                        }
                        this.f35511n0 = true;
                        return true;
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.f35508j0);
                    float f7 = this.f35506h0;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.f35509k0) > f7) {
                        this.f35511n0 = true;
                        s5Var.setPressed(false);
                    }
                    if (this.f35511n0) {
                        float b10 = com.google.android.gms.internal.vision.e2.b(motionEvent.getX(), this.f35508j0, 0.03f, this.f35510l0);
                        float f10 = this.f35510l0;
                        m5Var.d = s5.b(b10, f10 - 32.0f, f10 + 32.0f);
                        float b11 = com.google.android.gms.internal.vision.e2.b(motionEvent.getY(), this.f35509k0, 0.03f, this.m0);
                        float f11 = this.m0;
                        m5Var.f48136i = s5.b(b11, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            s5Var.setPressed(false);
            if (this.f35511n0) {
                p();
                return true;
            }
            postDelayed(this.f35507i0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f35512o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35512o0.cancel();
            this.f35512o0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f35508j0 = motionEvent.getX();
        this.f35509k0 = motionEvent.getY();
        this.f35510l0 = m5Var.d;
        this.m0 = m5Var.f48136i;
        this.f35511n0 = false;
        s5Var.setPressed(true);
        return true;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.f35512o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35512o0.cancel();
            this.f35512o0 = null;
        }
        m5 m5Var = this.f35504f0;
        float f7 = m5Var.d;
        float f10 = m5Var.f48136i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35512o0 = ofFloat;
        ofFloat.setDuration(600L);
        ai.l(1.2f, this.f35512o0);
        this.f35512o0.addUpdateListener(new ya(this, f7, f10, 7));
        this.f35512o0.addListener(new z4(this, 2));
        this.f35512o0.start();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override
    public final void setPaused(boolean z10) {
        m5 m5Var = this.f35504f0;
        synchronized (m5Var) {
            if (m5Var.f35277e0 != z10) {
                m5Var.f35277e0 = z10;
                m5Var.f35279g0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override
    public final void n() {
    }
}
