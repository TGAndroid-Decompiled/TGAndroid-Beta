package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z5 {
    public View f33723a;
    public final Runnable f33724b;
    public float f33725c;
    public float d;
    public boolean f33726e;
    public long f33727f;
    public long f33728g;
    public TimeInterpolator h;
    public boolean f33729i;
    public long f33730j;
    public float f33731k;

    public z5(long j10, TimeInterpolator timeInterpolator) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        pr prVar = pr.f30183f;
        this.f33723a = null;
        this.f33728g = j10;
        this.h = timeInterpolator;
        this.f33726e = true;
    }

    public final void a(boolean z4) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        d(f10, true);
    }

    public final float b() {
        if (!this.f33729i) {
            return 0.0f;
        }
        return k7.o.a(((float) ((SystemClock.elapsedRealtime() - this.f33730j) - this.f33727f)) / ((float) this.f33728g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f33729i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = k7.o.a(((float) ((elapsedRealtime - this.f33730j) - this.f33727f)) / ((float) this.f33728g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f33730j >= this.f33727f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f33725c = AndroidUtilities.lerp(this.f33731k, this.d, a2);
                } else {
                    this.f33725c = AndroidUtilities.lerp(this.f33731k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f33729i = false;
            } else {
                View view = this.f33723a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f33724b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f33725c;
    }

    public final float d(float f10, boolean z4) {
        if (!z4 && this.f33728g > 0 && !this.f33726e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f33729i = true;
                this.d = f10;
                this.f33731k = this.f33725c;
                this.f33730j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f33725c = f10;
            this.f33729i = false;
            this.f33726e = false;
        }
        return c();
    }

    public final float e(boolean z4) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return d(f10, false);
    }

    public final float f(boolean z4, boolean z10) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return d(f10, z10);
    }

    public z5(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        pr prVar = pr.f30183f;
        this.f33723a = null;
        this.f33727f = j10;
        this.f33728g = j11;
        this.h = timeInterpolator;
        this.f33726e = true;
    }

    public z5(View view) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        this.h = pr.f30183f;
        this.f33723a = view;
        this.f33726e = true;
    }

    public z5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        pr prVar = pr.f30183f;
        this.f33723a = view;
        this.f33728g = j10;
        this.h = timeInterpolator;
        this.f33726e = true;
    }

    public z5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        pr prVar = pr.f30183f;
        this.f33723a = view;
        this.f33727f = j10;
        this.f33728g = j11;
        this.h = timeInterpolator;
        this.f33726e = true;
    }

    public z5(Runnable runnable) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        this.h = pr.f30183f;
        this.f33724b = runnable;
        this.f33726e = true;
    }

    public z5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        pr prVar = pr.f30183f;
        this.f33724b = runnable;
        this.f33728g = j10;
        this.h = timeInterpolator;
        this.f33726e = true;
    }

    public z5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        pr prVar = pr.f30183f;
        this.f33724b = runnable;
        this.f33727f = 0L;
        this.f33728g = j10;
        this.h = timeInterpolator;
        this.f33726e = true;
    }

    public z5(float f10, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        pr prVar = pr.f30183f;
        this.f33723a = view;
        this.d = f10;
        this.f33725c = f10;
        this.f33727f = j10;
        this.f33728g = j11;
        this.h = timeInterpolator;
        this.f33726e = false;
    }

    public z5(float f10, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f33727f = 0L;
        this.f33728g = 200L;
        pr prVar = pr.f30183f;
        this.f33724b = runnable;
        this.d = f10;
        this.f33725c = f10;
        this.f33727f = j10;
        this.f33728g = j11;
        this.h = timeInterpolator;
        this.f33726e = false;
    }
}
