package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g6 {
    public View f26299a;
    public final Runnable f26300b;
    public float f26301c;
    public float d;
    public boolean f26302e;
    public long f26303f;
    public long f26304g;
    public TimeInterpolator h;
    public boolean f26305i;
    public long f26306j;
    public float f26307k;

    public g6(long j3, TimeInterpolator timeInterpolator) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        js jsVar = js.f27634f;
        this.f26299a = null;
        this.f26304g = j3;
        this.h = timeInterpolator;
        this.f26302e = true;
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
        if (!this.f26305i) {
            return 0.0f;
        }
        return w7.n.a(((float) ((SystemClock.elapsedRealtime() - this.f26306j) - this.f26303f)) / ((float) this.f26304g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f26305i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.n.a(((float) ((elapsedRealtime - this.f26306j) - this.f26303f)) / ((float) this.f26304g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26306j >= this.f26303f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f26301c = AndroidUtilities.lerp(this.f26307k, this.d, a2);
                } else {
                    this.f26301c = AndroidUtilities.lerp(this.f26307k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f26305i = false;
            } else {
                View view = this.f26299a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26300b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26301c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f26304g > 0 && !this.f26302e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f26305i = true;
                this.d = f7;
                this.f26307k = this.f26301c;
                this.f26306j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f26301c = f7;
            this.f26305i = false;
            this.f26302e = false;
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
        this.f26303f = 0L;
        this.f26304g = 200L;
        js jsVar = js.f27634f;
        this.f26299a = null;
        this.f26303f = j3;
        this.f26304g = j10;
        this.h = timeInterpolator;
        this.f26302e = true;
    }

    public g6(View view) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        this.h = js.f27634f;
        this.f26299a = view;
        this.f26302e = true;
    }

    public g6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        js jsVar = js.f27634f;
        this.f26299a = view;
        this.f26304g = j3;
        this.h = timeInterpolator;
        this.f26302e = true;
    }

    public g6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        js jsVar = js.f27634f;
        this.f26299a = view;
        this.f26303f = j3;
        this.f26304g = j10;
        this.h = timeInterpolator;
        this.f26302e = true;
    }

    public g6(Runnable runnable) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        this.h = js.f27634f;
        this.f26300b = runnable;
        this.f26302e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        js jsVar = js.f27634f;
        this.f26300b = runnable;
        this.f26304g = j3;
        this.h = timeInterpolator;
        this.f26302e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        js jsVar = js.f27634f;
        this.f26300b = runnable;
        this.f26303f = 0L;
        this.f26304g = j3;
        this.h = timeInterpolator;
        this.f26302e = true;
    }

    public g6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        js jsVar = js.f27634f;
        this.f26299a = view;
        this.d = f7;
        this.f26301c = f7;
        this.f26303f = j3;
        this.f26304g = j10;
        this.h = timeInterpolator;
        this.f26302e = false;
    }

    public g6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26303f = 0L;
        this.f26304g = 200L;
        js jsVar = js.f27634f;
        this.f26300b = runnable;
        this.d = f7;
        this.f26301c = f7;
        this.f26303f = j3;
        this.f26304g = j10;
        this.h = timeInterpolator;
        this.f26302e = false;
    }
}
