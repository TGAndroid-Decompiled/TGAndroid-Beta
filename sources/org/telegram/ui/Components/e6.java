package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f23573a;
    public final Runnable f23574b;
    public float f23575c;
    public float d;
    public boolean e;
    public long f23576f;
    public long f23577g;
    public TimeInterpolator h;
    public boolean f23578i;
    public long f23579j;
    public float f23580k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        rr rrVar = rr.f27701f;
        this.f23573a = null;
        this.f23577g = j3;
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
        if (!this.f23578i) {
            return 0.0f;
        }
        return w7.p.a(((float) ((SystemClock.elapsedRealtime() - this.f23579j) - this.f23576f)) / ((float) this.f23577g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f23578i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.p.a(((float) ((elapsedRealtime - this.f23579j) - this.f23576f)) / ((float) this.f23577g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23579j >= this.f23576f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f23575c = AndroidUtilities.lerp(this.f23580k, this.d, a2);
                } else {
                    this.f23575c = AndroidUtilities.lerp(this.f23580k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f23578i = false;
            } else {
                View view = this.f23573a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23574b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23575c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f23577g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f23578i = true;
                this.d = f7;
                this.f23580k = this.f23575c;
                this.f23579j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f23575c = f7;
            this.f23578i = false;
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
        this.f23576f = 0L;
        this.f23577g = 200L;
        rr rrVar = rr.f27701f;
        this.f23573a = null;
        this.f23576f = j3;
        this.f23577g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        this.h = rr.f27701f;
        this.f23573a = view;
        this.e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        rr rrVar = rr.f27701f;
        this.f23573a = view;
        this.f23577g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        rr rrVar = rr.f27701f;
        this.f23573a = view;
        this.f23576f = j3;
        this.f23577g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        this.h = rr.f27701f;
        this.f23574b = runnable;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        rr rrVar = rr.f27701f;
        this.f23574b = runnable;
        this.f23577g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        rr rrVar = rr.f27701f;
        this.f23574b = runnable;
        this.f23576f = 0L;
        this.f23577g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        rr rrVar = rr.f27701f;
        this.f23573a = view;
        this.d = f7;
        this.f23575c = f7;
        this.f23576f = j3;
        this.f23577g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23576f = 0L;
        this.f23577g = 200L;
        rr rrVar = rr.f27701f;
        this.f23574b = runnable;
        this.d = f7;
        this.f23575c = f7;
        this.f23576f = j3;
        this.f23577g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
