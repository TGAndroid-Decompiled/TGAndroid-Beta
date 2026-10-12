package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g6 {
    public View f25188a;
    public final Runnable f25189b;
    public float f25190c;
    public float d;
    public boolean e;
    public long f25191f;
    public long f25192g;
    public TimeInterpolator h;
    public boolean f25193i;
    public long f25194j;
    public float f25195k;

    public g6(long j10, TimeInterpolator timeInterpolator) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        es esVar = es.f24771f;
        this.f25188a = null;
        this.f25192g = j10;
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
        if (!this.f25193i) {
            return 0.0f;
        }
        return w7.s.a(((float) ((SystemClock.elapsedRealtime() - this.f25194j) - this.f25191f)) / ((float) this.f25192g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25193i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.s.a(((float) ((elapsedRealtime - this.f25194j) - this.f25191f)) / ((float) this.f25192g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25194j >= this.f25191f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25190c = AndroidUtilities.lerp(this.f25195k, this.d, a2);
                } else {
                    this.f25190c = AndroidUtilities.lerp(this.f25195k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25193i = false;
            } else {
                View view = this.f25188a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25189b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25190c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25192g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25193i = true;
                this.d = f7;
                this.f25195k = this.f25190c;
                this.f25194j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25190c = f7;
            this.f25193i = false;
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
        this.f25191f = 0L;
        this.f25192g = 200L;
        es esVar = es.f24771f;
        this.f25188a = null;
        this.f25191f = j10;
        this.f25192g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(View view) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        this.h = es.f24771f;
        this.f25188a = view;
        this.e = true;
    }

    public g6(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        es esVar = es.f24771f;
        this.f25188a = view;
        this.f25192g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        es esVar = es.f24771f;
        this.f25188a = view;
        this.f25191f = j10;
        this.f25192g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(Runnable runnable) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        this.h = es.f24771f;
        this.f25189b = runnable;
        this.e = true;
    }

    public g6(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        es esVar = es.f24771f;
        this.f25189b = runnable;
        this.f25192g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        es esVar = es.f24771f;
        this.f25189b = runnable;
        this.f25191f = 0L;
        this.f25192g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public g6(float f7, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        es esVar = es.f24771f;
        this.f25188a = view;
        this.d = f7;
        this.f25190c = f7;
        this.f25191f = j10;
        this.f25192g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public g6(float f7, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25191f = 0L;
        this.f25192g = 200L;
        es esVar = es.f24771f;
        this.f25189b = runnable;
        this.d = f7;
        this.f25190c = f7;
        this.f25191f = j10;
        this.f25192g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
