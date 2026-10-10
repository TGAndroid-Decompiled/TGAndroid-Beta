package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g6 {
    public View f26614a;
    public final Runnable f26615b;
    public float f26616c;
    public float d;
    public boolean f26617e;
    public long f26618f;
    public long f26619g;
    public TimeInterpolator h;
    public boolean f26620i;
    public long f26621j;
    public float f26622k;

    public g6(long j3, TimeInterpolator timeInterpolator) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        is isVar = is.f27443f;
        this.f26614a = null;
        this.f26619g = j3;
        this.h = timeInterpolator;
        this.f26617e = true;
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
        if (!this.f26620i) {
            return 0.0f;
        }
        return w7.o.a(((float) ((SystemClock.elapsedRealtime() - this.f26621j) - this.f26618f)) / ((float) this.f26619g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f26620i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.o.a(((float) ((elapsedRealtime - this.f26621j) - this.f26618f)) / ((float) this.f26619g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26621j >= this.f26618f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f26616c = AndroidUtilities.lerp(this.f26622k, this.d, a2);
                } else {
                    this.f26616c = AndroidUtilities.lerp(this.f26622k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f26620i = false;
            } else {
                View view = this.f26614a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26615b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26616c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f26619g > 0 && !this.f26617e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f26620i = true;
                this.d = f7;
                this.f26622k = this.f26616c;
                this.f26621j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f26616c = f7;
            this.f26620i = false;
            this.f26617e = false;
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

    public g6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        is isVar = is.f27443f;
        this.f26614a = null;
        this.f26618f = j3;
        this.f26619g = j10;
        this.h = timeInterpolator;
        this.f26617e = true;
    }

    public g6(View view) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        this.h = is.f27443f;
        this.f26614a = view;
        this.f26617e = true;
    }

    public g6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        is isVar = is.f27443f;
        this.f26614a = view;
        this.f26619g = j3;
        this.h = timeInterpolator;
        this.f26617e = true;
    }

    public g6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        is isVar = is.f27443f;
        this.f26614a = view;
        this.f26618f = j3;
        this.f26619g = j10;
        this.h = timeInterpolator;
        this.f26617e = true;
    }

    public g6(Runnable runnable) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        this.h = is.f27443f;
        this.f26615b = runnable;
        this.f26617e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        is isVar = is.f27443f;
        this.f26615b = runnable;
        this.f26619g = j3;
        this.h = timeInterpolator;
        this.f26617e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        is isVar = is.f27443f;
        this.f26615b = runnable;
        this.f26618f = 0L;
        this.f26619g = j3;
        this.h = timeInterpolator;
        this.f26617e = true;
    }

    public g6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        is isVar = is.f27443f;
        this.f26614a = view;
        this.d = f7;
        this.f26616c = f7;
        this.f26618f = j3;
        this.f26619g = j10;
        this.h = timeInterpolator;
        this.f26617e = false;
    }

    public g6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26618f = 0L;
        this.f26619g = 200L;
        is isVar = is.f27443f;
        this.f26615b = runnable;
        this.d = f7;
        this.f26616c = f7;
        this.f26618f = j3;
        this.f26619g = j10;
        this.h = timeInterpolator;
        this.f26617e = false;
    }
}
