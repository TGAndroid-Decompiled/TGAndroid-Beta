package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f23848a;
    public final Runnable f23849b;
    public float f23850c;
    public float d;
    public boolean e;
    public long f23851f;
    public long f23852g;
    public TimeInterpolator h;
    public boolean f23853i;
    public long f23854j;
    public float f23855k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        sr srVar = sr.f28339f;
        this.f23848a = null;
        this.f23852g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public final void a(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        d(f7, true);
    }

    public final float b() {
        if (!this.f23853i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f23854j) - this.f23851f)) / ((float) this.f23852g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f23853i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f23854j) - this.f23851f)) / ((float) this.f23852g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23854j >= this.f23851f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f23850c = AndroidUtilities.lerp(this.f23855k, this.d, a2);
                } else {
                    this.f23850c = AndroidUtilities.lerp(this.f23855k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f23853i = false;
            } else {
                View view = this.f23848a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23849b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23850c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f23852g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f23853i = true;
                this.d = f7;
                this.f23855k = this.f23850c;
                this.f23854j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f23850c = f7;
            this.f23853i = false;
            this.e = false;
        }
        return c();
    }

    public final float e(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return d(f7, false);
    }

    public final float f(boolean z10, boolean z11) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return d(f7, z11);
    }

    public e6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        sr srVar = sr.f28339f;
        this.f23848a = null;
        this.f23851f = j3;
        this.f23852g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        this.h = sr.f28339f;
        this.f23848a = view;
        this.e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        sr srVar = sr.f28339f;
        this.f23848a = view;
        this.f23852g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        sr srVar = sr.f28339f;
        this.f23848a = view;
        this.f23851f = j3;
        this.f23852g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        this.h = sr.f28339f;
        this.f23849b = runnable;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        sr srVar = sr.f28339f;
        this.f23849b = runnable;
        this.f23852g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        sr srVar = sr.f28339f;
        this.f23849b = runnable;
        this.f23851f = 0L;
        this.f23852g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        sr srVar = sr.f28339f;
        this.f23848a = view;
        this.d = f7;
        this.f23850c = f7;
        this.f23851f = j3;
        this.f23852g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23851f = 0L;
        this.f23852g = 200L;
        sr srVar = sr.f28339f;
        this.f23849b = runnable;
        this.d = f7;
        this.f23850c = f7;
        this.f23851f = j3;
        this.f23852g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
