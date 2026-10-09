package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ci.ya;
import org.telegram.messenger.bi;
public final class o5 extends sg.n {
    public final j5 f35315f0;
    public final p5 f35316g0;
    public final int f35317h0;
    public final m f35318i0;
    public float f35319j0;
    public float f35320k0;
    public float f35321l0;
    public float m0;
    public boolean f35322n0;
    public ValueAnimator f35323o0;

    public o5(Context context, p5 p5Var, int i10, int i11) {
        super(context, 0, 0);
        this.f35316g0 = p5Var;
        this.f35318i0 = new m(p5Var, 10);
        j5 j5Var = new j5(context, i10, i11);
        this.f35315f0 = j5Var;
        setRenderer(j5Var);
        setOpaque(false);
        this.f35317h0 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        removeCallbacks(this.f35318i0);
        this.f35316g0.setPressed(false);
        ValueAnimator valueAnimator = this.f35323o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35323o0.cancel();
            this.f35323o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f35315f0.getClass();
        this.f35316g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f35316g0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o5.onSurfaceTextureUpdated(android.graphics.SurfaceTexture):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        j5 j5Var = this.f35315f0;
        p5 p5Var = this.f35316g0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        p5Var.setPressed(false);
                        if (this.f35322n0) {
                            p();
                        }
                        this.f35322n0 = true;
                        return true;
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.f35319j0);
                    float f7 = this.f35317h0;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.f35320k0) > f7) {
                        this.f35322n0 = true;
                        p5Var.setPressed(false);
                    }
                    if (this.f35322n0) {
                        float b10 = com.google.android.gms.internal.vision.e2.b(motionEvent.getX(), this.f35319j0, 0.03f, this.f35321l0);
                        float f10 = this.f35321l0;
                        j5Var.d = p5.b(b10, f10 - 32.0f, f10 + 32.0f);
                        float b11 = com.google.android.gms.internal.vision.e2.b(motionEvent.getY(), this.f35320k0, 0.03f, this.m0);
                        float f11 = this.m0;
                        j5Var.f48044i = p5.b(b11, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            p5Var.setPressed(false);
            if (this.f35322n0) {
                p();
                return true;
            }
            postDelayed(this.f35318i0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f35323o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35323o0.cancel();
            this.f35323o0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f35319j0 = motionEvent.getX();
        this.f35320k0 = motionEvent.getY();
        this.f35321l0 = j5Var.d;
        this.m0 = j5Var.f48044i;
        this.f35322n0 = false;
        p5Var.setPressed(true);
        return true;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.f35323o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f35323o0.cancel();
            this.f35323o0 = null;
        }
        j5 j5Var = this.f35315f0;
        float f7 = j5Var.d;
        float f10 = j5Var.f48044i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35323o0 = ofFloat;
        ofFloat.setDuration(600L);
        bi.l(1.2f, this.f35323o0);
        this.f35323o0.addUpdateListener(new ya(this, f7, f10, 7));
        this.f35323o0.addListener(new w4(this, 2));
        this.f35323o0.start();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override
    public final void setPaused(boolean z10) {
        j5 j5Var = this.f35315f0;
        synchronized (j5Var) {
            if (j5Var.f35070e0 != z10) {
                j5Var.f35070e0 = z10;
                j5Var.f35072g0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override
    public final void n() {
    }
}
