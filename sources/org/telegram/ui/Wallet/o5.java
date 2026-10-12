package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import di.xa;
import org.telegram.ui.fi1;
public final class o5 extends tg.n {
    public final j5 f33562f0;
    public final p5 f33563g0;
    public final int f33564h0;
    public final m f33565i0;
    public float f33566j0;
    public float f33567k0;
    public float f33568l0;
    public float m0;
    public boolean f33569n0;
    public ValueAnimator f33570o0;

    public o5(Context context, p5 p5Var, int i10, int i11) {
        super(context, 0, 0);
        this.f33563g0 = p5Var;
        this.f33565i0 = new m(p5Var, 9);
        j5 j5Var = new j5(context, i10, i11);
        this.f33562f0 = j5Var;
        setRenderer(j5Var);
        setOpaque(false);
        this.f33564h0 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        removeCallbacks(this.f33565i0);
        this.f33563g0.setPressed(false);
        ValueAnimator valueAnimator = this.f33570o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33570o0.cancel();
            this.f33570o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f33562f0.getClass();
        this.f33563g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f33563g0.d();
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
        j5 j5Var = this.f33562f0;
        p5 p5Var = this.f33563g0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        p5Var.setPressed(false);
                        if (this.f33569n0) {
                            p();
                        }
                        this.f33569n0 = true;
                        return true;
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.f33566j0);
                    float f7 = this.f33564h0;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.f33567k0) > f7) {
                        this.f33569n0 = true;
                        p5Var.setPressed(false);
                    }
                    if (this.f33569n0) {
                        float D = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getX(), this.f33566j0, 0.03f, this.f33568l0);
                        float f10 = this.f33568l0;
                        j5Var.d = p5.b(D, f10 - 32.0f, f10 + 32.0f);
                        float D2 = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getY(), this.f33567k0, 0.03f, this.m0);
                        float f11 = this.m0;
                        j5Var.f45708i = p5.b(D2, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            p5Var.setPressed(false);
            if (this.f33569n0) {
                p();
                return true;
            }
            postDelayed(this.f33565i0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f33570o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33570o0.cancel();
            this.f33570o0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f33566j0 = motionEvent.getX();
        this.f33567k0 = motionEvent.getY();
        this.f33568l0 = j5Var.d;
        this.m0 = j5Var.f45708i;
        this.f33569n0 = false;
        p5Var.setPressed(true);
        return true;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.f33570o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f33570o0.cancel();
            this.f33570o0 = null;
        }
        j5 j5Var = this.f33562f0;
        float f7 = j5Var.d;
        float f10 = j5Var.f45708i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f33570o0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.ui.Cells.d0.l(1.2f, this.f33570o0);
        this.f33570o0.addUpdateListener(new xa(this, f7, f10, 7));
        this.f33570o0.addListener(new fi1(this, 5));
        this.f33570o0.start();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override
    public final void setPaused(boolean z10) {
        j5 j5Var = this.f33562f0;
        synchronized (j5Var) {
            if (j5Var.f33360e0 != z10) {
                j5Var.f33360e0 = z10;
                j5Var.f33362g0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override
    public final void n() {
    }
}
