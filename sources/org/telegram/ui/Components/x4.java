package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class x4 {
    public final View f41555a;
    public final Runnable f41556b;
    public int f41557c;
    public int d;
    public boolean f41558e;
    public final long f41559f;
    public final TimeInterpolator f41560g;
    public boolean h;
    public long f41561i;
    public int f41562j;

    public x4(View view) {
        this.f41559f = 200L;
        this.f41560g = er.f34420f;
        this.f41555a = view;
        this.f41558e = true;
    }

    public final int a(int i7, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f41559f;
        if (!z10 && j3 > 0 && !this.f41558e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f41562j = this.f41557c;
                this.f41561i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f41557c = i7;
            this.h = false;
            this.f41558e = false;
        }
        if (this.h) {
            float a10 = c8.i9.a(((float) (elapsedRealtime - this.f41561i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f41561i >= 0) {
                TimeInterpolator timeInterpolator = this.f41560g;
                if (timeInterpolator == null) {
                    this.f41557c = i0.a.f(a10, this.f41562j, this.d);
                } else {
                    this.f41557c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f41562j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f41555a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f41556b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f41557c;
    }

    public x4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f41559f = 200L;
        er erVar = er.f34420f;
        this.f41555a = view;
        this.f41559f = j3;
        this.f41560g = timeInterpolator;
        this.f41558e = true;
    }

    public x4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f41559f = 200L;
        er erVar = er.f34420f;
        this.f41555a = view;
        this.f41559f = j3;
        this.f41560g = timeInterpolator;
        this.f41558e = true;
    }

    public x4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f41559f = 200L;
        er erVar = er.f34420f;
        this.f41556b = runnable;
        this.f41559f = j3;
        this.f41560g = timeInterpolator;
        this.f41558e = true;
    }
}
