package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d6 {
    public View f25566a;
    public final Runnable f25567b;
    public float f25568c;
    public float d;
    public boolean e;
    public long f25569f;
    public long f25570g;
    public TimeInterpolator h;
    public boolean f25571i;
    public long f25572j;
    public float f25573k;

    public d6(long j10, TimeInterpolator timeInterpolator) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        zr zrVar = zr.f33337f;
        this.f25566a = null;
        this.f25570g = j10;
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
        if (!this.f25571i) {
            return 0.0f;
        }
        return w7.r.a(((float) ((SystemClock.elapsedRealtime() - this.f25572j) - this.f25569f)) / ((float) this.f25570g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25571i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.r.a(((float) ((elapsedRealtime - this.f25572j) - this.f25569f)) / ((float) this.f25570g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25572j >= this.f25569f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25568c = AndroidUtilities.lerp(this.f25573k, this.d, a2);
                } else {
                    this.f25568c = AndroidUtilities.lerp(this.f25573k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25571i = false;
            } else {
                View view = this.f25566a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25567b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25568c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25570g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25571i = true;
                this.d = f7;
                this.f25573k = this.f25568c;
                this.f25572j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25568c = f7;
            this.f25571i = false;
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

    public d6(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        zr zrVar = zr.f33337f;
        this.f25566a = null;
        this.f25569f = j10;
        this.f25570g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        this.h = zr.f33337f;
        this.f25566a = view;
        this.e = true;
    }

    public d6(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        zr zrVar = zr.f33337f;
        this.f25566a = view;
        this.f25570g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        zr zrVar = zr.f33337f;
        this.f25566a = view;
        this.f25569f = j10;
        this.f25570g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        this.h = zr.f33337f;
        this.f25567b = runnable;
        this.e = true;
    }

    public d6(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        zr zrVar = zr.f33337f;
        this.f25567b = runnable;
        this.f25570g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        zr zrVar = zr.f33337f;
        this.f25567b = runnable;
        this.f25569f = 0L;
        this.f25570g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(float f7, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        zr zrVar = zr.f33337f;
        this.f25566a = view;
        this.d = f7;
        this.f25568c = f7;
        this.f25569f = j10;
        this.f25570g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public d6(float f7, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f25569f = 0L;
        this.f25570g = 200L;
        zr zrVar = zr.f33337f;
        this.f25567b = runnable;
        this.d = f7;
        this.f25568c = f7;
        this.f25569f = j10;
        this.f25570g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
