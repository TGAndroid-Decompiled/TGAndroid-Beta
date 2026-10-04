package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f25932a;
    public final Runnable f25933b;
    public float f25934c;
    public float d;
    public boolean f25935e;
    public long f25936f;
    public long f25937g;
    public TimeInterpolator h;
    public boolean f25938i;
    public long f25939j;
    public float f25940k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        tr trVar = tr.f31141f;
        this.f25932a = null;
        this.f25937g = j3;
        this.h = timeInterpolator;
        this.f25935e = true;
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
        if (!this.f25938i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f25939j) - this.f25936f)) / ((float) this.f25937g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25938i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f25939j) - this.f25936f)) / ((float) this.f25937g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25939j >= this.f25936f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25934c = AndroidUtilities.lerp(this.f25940k, this.d, a2);
                } else {
                    this.f25934c = AndroidUtilities.lerp(this.f25940k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25938i = false;
            } else {
                View view = this.f25932a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25933b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25934c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25937g > 0 && !this.f25935e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25938i = true;
                this.d = f7;
                this.f25940k = this.f25934c;
                this.f25939j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25934c = f7;
            this.f25938i = false;
            this.f25935e = false;
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
        this.f25936f = 0L;
        this.f25937g = 200L;
        tr trVar = tr.f31141f;
        this.f25932a = null;
        this.f25936f = j3;
        this.f25937g = j10;
        this.h = timeInterpolator;
        this.f25935e = true;
    }

    public e6(View view) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        this.h = tr.f31141f;
        this.f25932a = view;
        this.f25935e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        tr trVar = tr.f31141f;
        this.f25932a = view;
        this.f25937g = j3;
        this.h = timeInterpolator;
        this.f25935e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        tr trVar = tr.f31141f;
        this.f25932a = view;
        this.f25936f = j3;
        this.f25937g = j10;
        this.h = timeInterpolator;
        this.f25935e = true;
    }

    public e6(Runnable runnable) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        this.h = tr.f31141f;
        this.f25933b = runnable;
        this.f25935e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        tr trVar = tr.f31141f;
        this.f25933b = runnable;
        this.f25937g = j3;
        this.h = timeInterpolator;
        this.f25935e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        tr trVar = tr.f31141f;
        this.f25933b = runnable;
        this.f25936f = 0L;
        this.f25937g = j3;
        this.h = timeInterpolator;
        this.f25935e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        tr trVar = tr.f31141f;
        this.f25932a = view;
        this.d = f7;
        this.f25934c = f7;
        this.f25936f = j3;
        this.f25937g = j10;
        this.h = timeInterpolator;
        this.f25935e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25936f = 0L;
        this.f25937g = 200L;
        tr trVar = tr.f31141f;
        this.f25933b = runnable;
        this.d = f7;
        this.f25934c = f7;
        this.f25936f = j3;
        this.f25937g = j10;
        this.h = timeInterpolator;
        this.f25935e = false;
    }
}
