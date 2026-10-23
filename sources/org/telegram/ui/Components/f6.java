package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f6 {
    public View f26178a;
    public final Runnable f26179b;
    public float f26180c;
    public float d;
    public boolean e;
    public long f26181f;
    public long f26182g;
    public TimeInterpolator h;
    public boolean f26183i;
    public long f26184j;
    public float f26185k;

    public f6(long j10, TimeInterpolator timeInterpolator) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        bs bsVar = bs.f25133f;
        this.f26178a = null;
        this.f26182g = j10;
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
        if (!this.f26183i) {
            return 0.0f;
        }
        return w7.r.a(((float) ((SystemClock.elapsedRealtime() - this.f26184j) - this.f26181f)) / ((float) this.f26182g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f26183i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.r.a(((float) ((elapsedRealtime - this.f26184j) - this.f26181f)) / ((float) this.f26182g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26184j >= this.f26181f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f26180c = AndroidUtilities.lerp(this.f26185k, this.d, a2);
                } else {
                    this.f26180c = AndroidUtilities.lerp(this.f26185k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f26183i = false;
            } else {
                View view = this.f26178a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26179b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26180c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f26182g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f26183i = true;
                this.d = f7;
                this.f26185k = this.f26180c;
                this.f26184j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f26180c = f7;
            this.f26183i = false;
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

    public f6(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        bs bsVar = bs.f25133f;
        this.f26178a = null;
        this.f26181f = j10;
        this.f26182g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public f6(View view) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        this.h = bs.f25133f;
        this.f26178a = view;
        this.e = true;
    }

    public f6(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        bs bsVar = bs.f25133f;
        this.f26178a = view;
        this.f26182g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public f6(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        bs bsVar = bs.f25133f;
        this.f26178a = view;
        this.f26181f = j10;
        this.f26182g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public f6(Runnable runnable) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        this.h = bs.f25133f;
        this.f26179b = runnable;
        this.e = true;
    }

    public f6(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        bs bsVar = bs.f25133f;
        this.f26179b = runnable;
        this.f26182g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public f6(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        bs bsVar = bs.f25133f;
        this.f26179b = runnable;
        this.f26181f = 0L;
        this.f26182g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public f6(float f7, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        bs bsVar = bs.f25133f;
        this.f26178a = view;
        this.d = f7;
        this.f26180c = f7;
        this.f26181f = j10;
        this.f26182g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public f6(float f7, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f26181f = 0L;
        this.f26182g = 200L;
        bs bsVar = bs.f25133f;
        this.f26179b = runnable;
        this.d = f7;
        this.f26180c = f7;
        this.f26181f = j10;
        this.f26182g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
