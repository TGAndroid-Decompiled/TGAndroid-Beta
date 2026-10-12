package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g6 {
    public View f26301a;
    public final Runnable f26302b;
    public float f26303c;
    public float d;
    public boolean f26304e;
    public long f26305f;
    public long f26306g;
    public TimeInterpolator h;
    public boolean f26307i;
    public long f26308j;
    public float f26309k;

    public g6(long j3, TimeInterpolator timeInterpolator) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        js jsVar = js.f27627f;
        this.f26301a = null;
        this.f26306g = j3;
        this.h = timeInterpolator;
        this.f26304e = true;
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
        if (!this.f26307i) {
            return 0.0f;
        }
        return w7.n.a(((float) ((SystemClock.elapsedRealtime() - this.f26308j) - this.f26305f)) / ((float) this.f26306g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f26307i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.n.a(((float) ((elapsedRealtime - this.f26308j) - this.f26305f)) / ((float) this.f26306g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26308j >= this.f26305f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f26303c = AndroidUtilities.lerp(this.f26309k, this.d, a2);
                } else {
                    this.f26303c = AndroidUtilities.lerp(this.f26309k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f26307i = false;
            } else {
                View view = this.f26301a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26302b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26303c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f26306g > 0 && !this.f26304e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f26307i = true;
                this.d = f7;
                this.f26309k = this.f26303c;
                this.f26308j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f26303c = f7;
            this.f26307i = false;
            this.f26304e = false;
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
        this.f26305f = 0L;
        this.f26306g = 200L;
        js jsVar = js.f27627f;
        this.f26301a = null;
        this.f26305f = j3;
        this.f26306g = j10;
        this.h = timeInterpolator;
        this.f26304e = true;
    }

    public g6(View view) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        this.h = js.f27627f;
        this.f26301a = view;
        this.f26304e = true;
    }

    public g6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        js jsVar = js.f27627f;
        this.f26301a = view;
        this.f26306g = j3;
        this.h = timeInterpolator;
        this.f26304e = true;
    }

    public g6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        js jsVar = js.f27627f;
        this.f26301a = view;
        this.f26305f = j3;
        this.f26306g = j10;
        this.h = timeInterpolator;
        this.f26304e = true;
    }

    public g6(Runnable runnable) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        this.h = js.f27627f;
        this.f26302b = runnable;
        this.f26304e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        js jsVar = js.f27627f;
        this.f26302b = runnable;
        this.f26306g = j3;
        this.h = timeInterpolator;
        this.f26304e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        js jsVar = js.f27627f;
        this.f26302b = runnable;
        this.f26305f = 0L;
        this.f26306g = j3;
        this.h = timeInterpolator;
        this.f26304e = true;
    }

    public g6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        js jsVar = js.f27627f;
        this.f26301a = view;
        this.d = f7;
        this.f26303c = f7;
        this.f26305f = j3;
        this.f26306g = j10;
        this.h = timeInterpolator;
        this.f26304e = false;
    }

    public g6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26305f = 0L;
        this.f26306g = 200L;
        js jsVar = js.f27627f;
        this.f26302b = runnable;
        this.d = f7;
        this.f26303c = f7;
        this.f26305f = j3;
        this.f26306g = j10;
        this.h = timeInterpolator;
        this.f26304e = false;
    }
}
