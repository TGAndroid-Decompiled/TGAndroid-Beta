package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f23873a;
    public final Runnable f23874b;
    public float f23875c;
    public float d;
    public boolean e;
    public long f23876f;
    public long f23877g;
    public TimeInterpolator h;
    public boolean f23878i;
    public long f23879j;
    public float f23880k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        sr srVar = sr.f28348f;
        this.f23873a = null;
        this.f23877g = j3;
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
        if (!this.f23878i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f23879j) - this.f23876f)) / ((float) this.f23877g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f23878i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f23879j) - this.f23876f)) / ((float) this.f23877g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23879j >= this.f23876f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f23875c = AndroidUtilities.lerp(this.f23880k, this.d, a2);
                } else {
                    this.f23875c = AndroidUtilities.lerp(this.f23880k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f23878i = false;
            } else {
                View view = this.f23873a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23874b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23875c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f23877g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f23878i = true;
                this.d = f7;
                this.f23880k = this.f23875c;
                this.f23879j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f23875c = f7;
            this.f23878i = false;
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
        this.f23876f = 0L;
        this.f23877g = 200L;
        sr srVar = sr.f28348f;
        this.f23873a = null;
        this.f23876f = j3;
        this.f23877g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        this.h = sr.f28348f;
        this.f23873a = view;
        this.e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        sr srVar = sr.f28348f;
        this.f23873a = view;
        this.f23877g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        sr srVar = sr.f28348f;
        this.f23873a = view;
        this.f23876f = j3;
        this.f23877g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        this.h = sr.f28348f;
        this.f23874b = runnable;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        sr srVar = sr.f28348f;
        this.f23874b = runnable;
        this.f23877g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        sr srVar = sr.f28348f;
        this.f23874b = runnable;
        this.f23876f = 0L;
        this.f23877g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        sr srVar = sr.f28348f;
        this.f23873a = view;
        this.d = f7;
        this.f23875c = f7;
        this.f23876f = j3;
        this.f23877g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23876f = 0L;
        this.f23877g = 200L;
        sr srVar = sr.f28348f;
        this.f23874b = runnable;
        this.d = f7;
        this.f23875c = f7;
        this.f23876f = j3;
        this.f23877g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
