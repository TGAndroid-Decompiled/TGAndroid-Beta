package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h6 {
    public View f28807a;
    public final Runnable f28808b;
    public float f28809c;
    public float d;
    public boolean e;
    public long f28810f;
    public long f28811g;
    public TimeInterpolator h;
    public boolean f28812i;
    public long f28813j;
    public float f28814k;

    public h6(long j10, TimeInterpolator timeInterpolator) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        ds dsVar = ds.f27584f;
        this.f28807a = null;
        this.f28811g = j10;
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
        if (!this.f28812i) {
            return 0.0f;
        }
        return a8.ee.a(((float) ((SystemClock.elapsedRealtime() - this.f28813j) - this.f28810f)) / ((float) this.f28811g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f28812i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = a8.ee.a(((float) ((elapsedRealtime - this.f28813j) - this.f28810f)) / ((float) this.f28811g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f28813j >= this.f28810f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f28809c = AndroidUtilities.lerp(this.f28814k, this.d, a2);
                } else {
                    this.f28809c = AndroidUtilities.lerp(this.f28814k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f28812i = false;
            } else {
                View view = this.f28807a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f28808b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f28809c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f28811g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f28812i = true;
                this.d = f7;
                this.f28814k = this.f28809c;
                this.f28813j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f28809c = f7;
            this.f28812i = false;
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

    public h6(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        ds dsVar = ds.f27584f;
        this.f28807a = null;
        this.f28810f = j10;
        this.f28811g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(View view) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        this.h = ds.f27584f;
        this.f28807a = view;
        this.e = true;
    }

    public h6(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        ds dsVar = ds.f27584f;
        this.f28807a = view;
        this.f28811g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        ds dsVar = ds.f27584f;
        this.f28807a = view;
        this.f28810f = j10;
        this.f28811g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(Runnable runnable) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        this.h = ds.f27584f;
        this.f28808b = runnable;
        this.e = true;
    }

    public h6(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        ds dsVar = ds.f27584f;
        this.f28808b = runnable;
        this.f28811g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        ds dsVar = ds.f27584f;
        this.f28808b = runnable;
        this.f28810f = 0L;
        this.f28811g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(float f7, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        ds dsVar = ds.f27584f;
        this.f28807a = view;
        this.d = f7;
        this.f28809c = f7;
        this.f28810f = j10;
        this.f28811g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public h6(float f7, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f28810f = 0L;
        this.f28811g = 200L;
        ds dsVar = ds.f27584f;
        this.f28808b = runnable;
        this.d = f7;
        this.f28809c = f7;
        this.f28810f = j10;
        this.f28811g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
