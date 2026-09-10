package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d6 {
    public View f22293a;
    public final Runnable f22294b;
    public float f22295c;
    public float d;
    public boolean e;
    public long f22296f;
    public long f22297g;
    public TimeInterpolator h;
    public boolean f22298i;
    public long f22299j;
    public float f22300k;

    public d6(long j3, TimeInterpolator timeInterpolator) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        wr wrVar = wr.f28819f;
        this.f22293a = null;
        this.f22297g = j3;
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
        if (!this.f22298i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f22299j) - this.f22296f)) / ((float) this.f22297g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f22298i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f22299j) - this.f22296f)) / ((float) this.f22297g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f22299j >= this.f22296f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f22295c = AndroidUtilities.lerp(this.f22300k, this.d, a2);
                } else {
                    this.f22295c = AndroidUtilities.lerp(this.f22300k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f22298i = false;
            } else {
                View view = this.f22293a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f22294b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f22295c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f22297g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f22298i = true;
                this.d = f7;
                this.f22300k = this.f22295c;
                this.f22299j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f22295c = f7;
            this.f22298i = false;
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

    public d6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        wr wrVar = wr.f28819f;
        this.f22293a = null;
        this.f22296f = j3;
        this.f22297g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        this.h = wr.f28819f;
        this.f22293a = view;
        this.e = true;
    }

    public d6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        wr wrVar = wr.f28819f;
        this.f22293a = view;
        this.f22297g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        wr wrVar = wr.f28819f;
        this.f22293a = view;
        this.f22296f = j3;
        this.f22297g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        this.h = wr.f28819f;
        this.f22294b = runnable;
        this.e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        wr wrVar = wr.f28819f;
        this.f22294b = runnable;
        this.f22297g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        wr wrVar = wr.f28819f;
        this.f22294b = runnable;
        this.f22296f = 0L;
        this.f22297g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        wr wrVar = wr.f28819f;
        this.f22293a = view;
        this.d = f7;
        this.f22295c = f7;
        this.f22296f = j3;
        this.f22297g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public d6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22296f = 0L;
        this.f22297g = 200L;
        wr wrVar = wr.f28819f;
        this.f22294b = runnable;
        this.d = f7;
        this.f22295c = f7;
        this.f22296f = j3;
        this.f22297g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
