package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ei.ja;
import org.telegram.messenger.wh;
import org.telegram.ui.vf1;
public final class b6 extends tg.n {
    public final y5 f34039f0;
    public final c6 f34040g0;
    public final int f34041h0;
    public final n f34042i0;
    public float f34043j0;
    public float f34044k0;
    public float f34045l0;
    public float m0;
    public boolean f34046n0;
    public ValueAnimator f34047o0;

    public b6(Context context, c6 c6Var, int i10, int i11) {
        super(context, 0, 0);
        this.f34040g0 = c6Var;
        this.f34042i0 = new n(c6Var, 11);
        y5 y5Var = new y5(context, i10, i11);
        this.f34039f0 = y5Var;
        setRenderer(y5Var);
        setOpaque(false);
        this.f34041h0 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        removeCallbacks(this.f34042i0);
        this.f34040g0.setPressed(false);
        ValueAnimator valueAnimator = this.f34047o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34047o0.cancel();
            this.f34047o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f34039f0.Z = false;
        this.f34040g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f34040g0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f34039f0.Z) {
            c6 c6Var = this.f34040g0;
            if (c6Var.f34082c) {
                c6Var.f34082c = false;
                setAlpha(1.0f);
                this.f34040g0.f34081b.setVisibility(4);
                this.f34040g0.f34084n.invalidate();
                this.f34040g0.invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        y5 y5Var = this.f34039f0;
        c6 c6Var = this.f34040g0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        c6Var.setPressed(false);
                        if (this.f34046n0) {
                            p();
                        }
                        this.f34046n0 = true;
                        return true;
                    }
                } else {
                    float abs = Math.abs(motionEvent.getX() - this.f34043j0);
                    float f7 = this.f34041h0;
                    if (abs > f7 || Math.abs(motionEvent.getY() - this.f34044k0) > f7) {
                        this.f34046n0 = true;
                        c6Var.setPressed(false);
                    }
                    if (this.f34046n0) {
                        float D = com.google.android.gms.internal.cast.a6.D(motionEvent.getX(), this.f34043j0, 0.03f, this.f34045l0);
                        float f10 = this.f34045l0;
                        y5Var.d = c6.b(D, f10 - 32.0f, f10 + 32.0f);
                        float D2 = com.google.android.gms.internal.cast.a6.D(motionEvent.getY(), this.f34044k0, 0.03f, this.m0);
                        float f11 = this.m0;
                        y5Var.f47095i = c6.b(D2, f11 - 22.0f, f11 + 22.0f);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            c6Var.setPressed(false);
            if (this.f34046n0) {
                p();
                return true;
            }
            postDelayed(this.f34042i0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.f34047o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34047o0.cancel();
            this.f34047o0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f34043j0 = motionEvent.getX();
        this.f34044k0 = motionEvent.getY();
        this.f34045l0 = y5Var.d;
        this.m0 = y5Var.f47095i;
        this.f34046n0 = false;
        c6Var.setPressed(true);
        return true;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.f34047o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34047o0.cancel();
            this.f34047o0 = null;
        }
        y5 y5Var = this.f34039f0;
        float f7 = y5Var.d;
        float f10 = y5Var.f47095i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f34047o0 = ofFloat;
        ofFloat.setDuration(600L);
        wh.l(1.2f, this.f34047o0);
        this.f34047o0.addUpdateListener(new ja(this, f7, f10, 7));
        this.f34047o0.addListener(new vf1(this, 7));
        this.f34047o0.start();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override
    public final void setPaused(boolean z10) {
        y5 y5Var = this.f34039f0;
        synchronized (y5Var) {
            if (y5Var.f35173a0 != z10) {
                y5Var.f35173a0 = z10;
                y5Var.f35175c0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override
    public final void n() {
    }
}
