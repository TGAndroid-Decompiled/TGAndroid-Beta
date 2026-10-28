package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h6 {
    public View f28862a;
    public final Runnable f28863b;
    public float f28864c;
    public float d;
    public boolean e;
    public long f28865f;
    public long f28866g;
    public TimeInterpolator h;
    public boolean f28867i;
    public long f28868j;
    public float f28869k;

    public h6(long j10, TimeInterpolator timeInterpolator) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        ds dsVar = ds.f27530f;
        this.f28862a = null;
        this.f28866g = j10;
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
        if (!this.f28867i) {
            return 0.0f;
        }
        return a8.ee.a(((float) ((SystemClock.elapsedRealtime() - this.f28868j) - this.f28865f)) / ((float) this.f28866g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f28867i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = a8.ee.a(((float) ((elapsedRealtime - this.f28868j) - this.f28865f)) / ((float) this.f28866g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f28868j >= this.f28865f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f28864c = AndroidUtilities.lerp(this.f28869k, this.d, a2);
                } else {
                    this.f28864c = AndroidUtilities.lerp(this.f28869k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f28867i = false;
            } else {
                View view = this.f28862a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f28863b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f28864c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f28866g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f28867i = true;
                this.d = f7;
                this.f28869k = this.f28864c;
                this.f28868j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f28864c = f7;
            this.f28867i = false;
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
        this.f28865f = 0L;
        this.f28866g = 200L;
        ds dsVar = ds.f27530f;
        this.f28862a = null;
        this.f28865f = j10;
        this.f28866g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(View view) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        this.h = ds.f27530f;
        this.f28862a = view;
        this.e = true;
    }

    public h6(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        ds dsVar = ds.f27530f;
        this.f28862a = view;
        this.f28866g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        ds dsVar = ds.f27530f;
        this.f28862a = view;
        this.f28865f = j10;
        this.f28866g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(Runnable runnable) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        this.h = ds.f27530f;
        this.f28863b = runnable;
        this.e = true;
    }

    public h6(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        ds dsVar = ds.f27530f;
        this.f28863b = runnable;
        this.f28866g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        ds dsVar = ds.f27530f;
        this.f28863b = runnable;
        this.f28865f = 0L;
        this.f28866g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public h6(float f7, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        ds dsVar = ds.f27530f;
        this.f28862a = view;
        this.d = f7;
        this.f28864c = f7;
        this.f28865f = j10;
        this.f28866g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public h6(float f7, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f28865f = 0L;
        this.f28866g = 200L;
        ds dsVar = ds.f27530f;
        this.f28863b = runnable;
        this.d = f7;
        this.f28864c = f7;
        this.f28865f = j10;
        this.f28866g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
