package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z5 {
    public View f31251a;
    public final Runnable f31252b;
    public float f31253c;
    public float d;
    public boolean e;
    public long f31254f;
    public long f31255g;
    public TimeInterpolator h;
    public boolean f31256i;
    public long f31257j;
    public float f31258k;

    public z5(long j10, TimeInterpolator timeInterpolator) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        mr mrVar = mr.f27122f;
        this.f31251a = null;
        this.f31255g = j10;
        this.h = timeInterpolator;
        this.e = true;
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
        if (!this.f31256i) {
            return 0.0f;
        }
        return k7.n.a(((float) ((SystemClock.elapsedRealtime() - this.f31257j) - this.f31254f)) / ((float) this.f31255g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f31256i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = k7.n.a(((float) ((elapsedRealtime - this.f31257j) - this.f31254f)) / ((float) this.f31255g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f31257j >= this.f31254f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f31253c = AndroidUtilities.lerp(this.f31258k, this.d, a2);
                } else {
                    this.f31253c = AndroidUtilities.lerp(this.f31258k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f31256i = false;
            } else {
                View view = this.f31251a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f31252b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f31253c;
    }

    public final float d(float f10, boolean z4) {
        if (!z4 && this.f31255g > 0 && !this.e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f31256i = true;
                this.d = f10;
                this.f31258k = this.f31253c;
                this.f31257j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f31253c = f10;
            this.f31256i = false;
            this.e = false;
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
        this.f31254f = 0L;
        this.f31255g = 200L;
        mr mrVar = mr.f27122f;
        this.f31251a = null;
        this.f31254f = j10;
        this.f31255g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public z5(View view) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        this.h = mr.f27122f;
        this.f31251a = view;
        this.e = true;
    }

    public z5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        mr mrVar = mr.f27122f;
        this.f31251a = view;
        this.f31255g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public z5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        mr mrVar = mr.f27122f;
        this.f31251a = view;
        this.f31254f = j10;
        this.f31255g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public z5(Runnable runnable) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        this.h = mr.f27122f;
        this.f31252b = runnable;
        this.e = true;
    }

    public z5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        mr mrVar = mr.f27122f;
        this.f31252b = runnable;
        this.f31255g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public z5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        mr mrVar = mr.f27122f;
        this.f31252b = runnable;
        this.f31254f = 0L;
        this.f31255g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public z5(float f10, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        mr mrVar = mr.f27122f;
        this.f31251a = view;
        this.d = f10;
        this.f31253c = f10;
        this.f31254f = j10;
        this.f31255g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public z5(float f10, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f31254f = 0L;
        this.f31255g = 200L;
        mr mrVar = mr.f27122f;
        this.f31252b = runnable;
        this.d = f10;
        this.f31253c = f10;
        this.f31254f = j10;
        this.f31255g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
