package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g6 {
    public View f24883a;
    public final Runnable f24884b;
    public float f24885c;
    public float d;
    public boolean e;
    public long f24886f;
    public long f24887g;
    public TimeInterpolator h;
    public boolean f24888i;
    public long f24889j;
    public float f24890k;

    public g6(long j10, TimeInterpolator timeInterpolator) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        es esVar = es.f24465f;
        this.f24883a = null;
        this.f24887g = j10;
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
        if (!this.f24888i) {
            return 0.0f;
        }
        return w7.r.a(((float) ((SystemClock.elapsedRealtime() - this.f24889j) - this.f24886f)) / ((float) this.f24887g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f24888i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.r.a(((float) ((elapsedRealtime - this.f24889j) - this.f24886f)) / ((float) this.f24887g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24889j >= this.f24886f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f24885c = AndroidUtilities.lerp(this.f24890k, this.d, a2);
                } else {
                    this.f24885c = AndroidUtilities.lerp(this.f24890k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f24888i = false;
            } else {
                View view = this.f24883a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24884b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24885c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f24887g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f24888i = true;
                this.d = f7;
                this.f24890k = this.f24885c;
                this.f24889j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f24885c = f7;
            this.f24888i = false;
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

    public g6(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        es esVar = es.f24465f;
        this.f24883a = null;
        this.f24886f = j10;
        this.f24887g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(View view) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        this.h = es.f24465f;
        this.f24883a = view;
        this.e = true;
    }

    public g6(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        es esVar = es.f24465f;
        this.f24883a = view;
        this.f24887g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        es esVar = es.f24465f;
        this.f24883a = view;
        this.f24886f = j10;
        this.f24887g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(Runnable runnable) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        this.h = es.f24465f;
        this.f24884b = runnable;
        this.e = true;
    }

    public g6(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        es esVar = es.f24465f;
        this.f24884b = runnable;
        this.f24887g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        es esVar = es.f24465f;
        this.f24884b = runnable;
        this.f24886f = 0L;
        this.f24887g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(float f7, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        es esVar = es.f24465f;
        this.f24883a = view;
        this.d = f7;
        this.f24885c = f7;
        this.f24886f = j10;
        this.f24887g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public g6(float f7, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f24886f = 0L;
        this.f24887g = 200L;
        es esVar = es.f24465f;
        this.f24884b = runnable;
        this.d = f7;
        this.f24885c = f7;
        this.f24886f = j10;
        this.f24887g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
