package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g6 {
    public View f26611a;
    public final Runnable f26612b;
    public float f26613c;
    public float d;
    public boolean f26614e;
    public long f26615f;
    public long f26616g;
    public TimeInterpolator h;
    public boolean f26617i;
    public long f26618j;
    public float f26619k;

    public g6(long j3, TimeInterpolator timeInterpolator) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        is isVar = is.f27451f;
        this.f26611a = null;
        this.f26616g = j3;
        this.h = timeInterpolator;
        this.f26614e = true;
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
        if (!this.f26617i) {
            return 0.0f;
        }
        return w7.o.a(((float) ((SystemClock.elapsedRealtime() - this.f26618j) - this.f26615f)) / ((float) this.f26616g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f26617i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.o.a(((float) ((elapsedRealtime - this.f26618j) - this.f26615f)) / ((float) this.f26616g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26618j >= this.f26615f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f26613c = AndroidUtilities.lerp(this.f26619k, this.d, a2);
                } else {
                    this.f26613c = AndroidUtilities.lerp(this.f26619k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f26617i = false;
            } else {
                View view = this.f26611a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26612b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26613c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f26616g > 0 && !this.f26614e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f26617i = true;
                this.d = f7;
                this.f26619k = this.f26613c;
                this.f26618j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f26613c = f7;
            this.f26617i = false;
            this.f26614e = false;
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

    public g6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        is isVar = is.f27451f;
        this.f26611a = null;
        this.f26615f = j3;
        this.f26616g = j10;
        this.h = timeInterpolator;
        this.f26614e = true;
    }

    public g6(View view) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        this.h = is.f27451f;
        this.f26611a = view;
        this.f26614e = true;
    }

    public g6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        is isVar = is.f27451f;
        this.f26611a = view;
        this.f26616g = j3;
        this.h = timeInterpolator;
        this.f26614e = true;
    }

    public g6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        is isVar = is.f27451f;
        this.f26611a = view;
        this.f26615f = j3;
        this.f26616g = j10;
        this.h = timeInterpolator;
        this.f26614e = true;
    }

    public g6(Runnable runnable) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        this.h = is.f27451f;
        this.f26612b = runnable;
        this.f26614e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        is isVar = is.f27451f;
        this.f26612b = runnable;
        this.f26616g = j3;
        this.h = timeInterpolator;
        this.f26614e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        is isVar = is.f27451f;
        this.f26612b = runnable;
        this.f26615f = 0L;
        this.f26616g = j3;
        this.h = timeInterpolator;
        this.f26614e = true;
    }

    public g6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        is isVar = is.f27451f;
        this.f26611a = view;
        this.d = f7;
        this.f26613c = f7;
        this.f26615f = j3;
        this.f26616g = j10;
        this.h = timeInterpolator;
        this.f26614e = false;
    }

    public g6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26615f = 0L;
        this.f26616g = 200L;
        is isVar = is.f27451f;
        this.f26612b = runnable;
        this.d = f7;
        this.f26613c = f7;
        this.f26615f = j3;
        this.f26616g = j10;
        this.h = timeInterpolator;
        this.f26614e = false;
    }
}
