package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.kk;
import org.telegram.ui.vf1;
public final class e6 extends tg.n {
    public final b6 f34194i0;
    public final f6 f34195j0;
    public final int f34196k0;
    public final n f34197l0;
    public float m0;
    public float f34198n0;
    public float f34199o0;
    public float f34200p0;
    public boolean f34201q0;
    public ValueAnimator f34202r0;

    public e6(Context context, f6 f6Var, int i10, int i11) {
        super(context, 0, 0);
        this.f34195j0 = f6Var;
        this.f34197l0 = new n(f6Var, 11);
        b6 b6Var = new b6(context, i10, i11);
        this.f34194i0 = b6Var;
        setRenderer(b6Var);
        setOpaque(false);
        this.f34196k0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final int getMaxFrameRate() {
        return 60;
    }

    @Override
    public final int getMsaaSamples() {
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            return 2;
        }
        return 4;
    }

    @Override
    public final float getRenderScale() {
        if (SharedConfig.getDevicePerformanceClass() == 1) {
            return 0.85f;
        }
        return 1.0f;
    }

    @Override
    public final long h(long j10) {
        if (this.f34194i0.f34053h0) {
            return Math.max(j10, 33333333L);
        }
        return j10;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f34197l0);
        this.f34195j0.setPressed(false);
        ValueAnimator valueAnimator = this.f34202r0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34202r0.cancel();
            this.f34202r0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f34194i0.Z = false;
        this.f34195j0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f34195j0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f34194i0.Z) {
            f6 f6Var = this.f34195j0;
            if (f6Var.f34236c) {
                f6Var.f34236c = false;
                setAlpha(1.0f);
                this.f34195j0.f34235b.setVisibility(4);
                this.f34195j0.f34238n.invalidate();
                this.f34195j0.invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        b6 b6Var = this.f34194i0;
        f6 f6Var = this.f34195j0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        f6Var.setPressed(false);
                        if (this.f34201q0) {
                            r();
                        }
                        this.f34201q0 = true;
                        return true;
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.m0);
                    float f7 = this.f34196k0;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.f34198n0) > f7) {
                        this.f34201q0 = true;
                        f6Var.setPressed(false);
                    }
                    if (this.f34201q0) {
                        float D = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getX(), this.m0, 0.03f, this.f34199o0);
                        float f10 = this.f34199o0;
                        b6Var.d = f6.b(D, f10 - 32.0f, f10 + 32.0f);
                        float D2 = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getY(), this.f34198n0, 0.03f, this.f34200p0);
                        float f11 = this.f34200p0;
                        b6Var.f47117i = f6.b(D2, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            f6Var.setPressed(false);
            if (this.f34201q0) {
                r();
                return true;
            }
            postDelayed(this.f34197l0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f34202r0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34202r0.cancel();
            this.f34202r0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.m0 = motionEvent.getX();
        this.f34198n0 = motionEvent.getY();
        this.f34199o0 = b6Var.d;
        this.f34200p0 = b6Var.f47117i;
        this.f34201q0 = false;
        f6Var.setPressed(true);
        return true;
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void r() {
        ValueAnimator valueAnimator = this.f34202r0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34202r0.cancel();
            this.f34202r0 = null;
        }
        b6 b6Var = this.f34194i0;
        float f7 = b6Var.d;
        float f10 = b6Var.f47117i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f34202r0 = ofFloat;
        ofFloat.setDuration(600L);
        kk.l(1.2f, this.f34202r0);
        this.f34202r0.addUpdateListener(new ei.ja(this, f7, f10, 7));
        this.f34202r0.addListener(new vf1(this, 7));
        this.f34202r0.start();
    }

    @Override
    public final void setPaused(boolean z10) {
        b6 b6Var = this.f34194i0;
        synchronized (b6Var) {
            if (b6Var.f34054i0 != z10) {
                b6Var.f34054i0 = z10;
                b6Var.f34056k0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override
    public final void p() {
    }
}
