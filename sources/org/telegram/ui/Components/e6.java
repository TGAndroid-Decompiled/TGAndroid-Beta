package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f25937a;
    public final Runnable f25938b;
    public float f25939c;
    public float d;
    public boolean f25940e;
    public long f25941f;
    public long f25942g;
    public TimeInterpolator h;
    public boolean f25943i;
    public long f25944j;
    public float f25945k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        tr trVar = tr.f31147f;
        this.f25937a = null;
        this.f25942g = j3;
        this.h = timeInterpolator;
        this.f25940e = true;
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
        if (!this.f25943i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f25944j) - this.f25941f)) / ((float) this.f25942g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25943i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f25944j) - this.f25941f)) / ((float) this.f25942g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25944j >= this.f25941f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25939c = AndroidUtilities.lerp(this.f25945k, this.d, a2);
                } else {
                    this.f25939c = AndroidUtilities.lerp(this.f25945k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25943i = false;
            } else {
                View view = this.f25937a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25938b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25939c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25942g > 0 && !this.f25940e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25943i = true;
                this.d = f7;
                this.f25945k = this.f25939c;
                this.f25944j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25939c = f7;
            this.f25943i = false;
            this.f25940e = false;
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
        this.f25941f = 0L;
        this.f25942g = 200L;
        tr trVar = tr.f31147f;
        this.f25937a = null;
        this.f25941f = j3;
        this.f25942g = j10;
        this.h = timeInterpolator;
        this.f25940e = true;
    }

    public e6(View view) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        this.h = tr.f31147f;
        this.f25937a = view;
        this.f25940e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        tr trVar = tr.f31147f;
        this.f25937a = view;
        this.f25942g = j3;
        this.h = timeInterpolator;
        this.f25940e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        tr trVar = tr.f31147f;
        this.f25937a = view;
        this.f25941f = j3;
        this.f25942g = j10;
        this.h = timeInterpolator;
        this.f25940e = true;
    }

    public e6(Runnable runnable) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        this.h = tr.f31147f;
        this.f25938b = runnable;
        this.f25940e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        tr trVar = tr.f31147f;
        this.f25938b = runnable;
        this.f25942g = j3;
        this.h = timeInterpolator;
        this.f25940e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        tr trVar = tr.f31147f;
        this.f25938b = runnable;
        this.f25941f = 0L;
        this.f25942g = j3;
        this.h = timeInterpolator;
        this.f25940e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        tr trVar = tr.f31147f;
        this.f25937a = view;
        this.d = f7;
        this.f25939c = f7;
        this.f25941f = j3;
        this.f25942g = j10;
        this.h = timeInterpolator;
        this.f25940e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25941f = 0L;
        this.f25942g = 200L;
        tr trVar = tr.f31147f;
        this.f25938b = runnable;
        this.d = f7;
        this.f25939c = f7;
        this.f25941f = j3;
        this.f25942g = j10;
        this.h = timeInterpolator;
        this.f25940e = false;
    }
}
