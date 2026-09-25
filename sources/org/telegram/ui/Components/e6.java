package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f23843a;
    public final Runnable f23844b;
    public float f23845c;
    public float d;
    public boolean e;
    public long f23846f;
    public long f23847g;
    public TimeInterpolator h;
    public boolean f23848i;
    public long f23849j;
    public float f23850k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        rr rrVar = rr.f28031f;
        this.f23843a = null;
        this.f23847g = j3;
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
        if (!this.f23848i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f23849j) - this.f23846f)) / ((float) this.f23847g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f23848i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f23849j) - this.f23846f)) / ((float) this.f23847g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23849j >= this.f23846f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f23845c = AndroidUtilities.lerp(this.f23850k, this.d, a2);
                } else {
                    this.f23845c = AndroidUtilities.lerp(this.f23850k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f23848i = false;
            } else {
                View view = this.f23843a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23844b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23845c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f23847g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f23848i = true;
                this.d = f7;
                this.f23850k = this.f23845c;
                this.f23849j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f23845c = f7;
            this.f23848i = false;
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
        this.f23846f = 0L;
        this.f23847g = 200L;
        rr rrVar = rr.f28031f;
        this.f23843a = null;
        this.f23846f = j3;
        this.f23847g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        this.h = rr.f28031f;
        this.f23843a = view;
        this.e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        rr rrVar = rr.f28031f;
        this.f23843a = view;
        this.f23847g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        rr rrVar = rr.f28031f;
        this.f23843a = view;
        this.f23846f = j3;
        this.f23847g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        this.h = rr.f28031f;
        this.f23844b = runnable;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        rr rrVar = rr.f28031f;
        this.f23844b = runnable;
        this.f23847g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        rr rrVar = rr.f28031f;
        this.f23844b = runnable;
        this.f23846f = 0L;
        this.f23847g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        rr rrVar = rr.f28031f;
        this.f23843a = view;
        this.d = f7;
        this.f23845c = f7;
        this.f23846f = j3;
        this.f23847g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23846f = 0L;
        this.f23847g = 200L;
        rr rrVar = rr.f28031f;
        this.f23844b = runnable;
        this.d = f7;
        this.f23845c = f7;
        this.f23846f = j3;
        this.f23847g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
