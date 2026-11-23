package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class f5 {
    public final View f35002a;
    public final Runnable f35003b;
    public int f35004c;
    public int d;
    public boolean f35005e;
    public final long f35006f;
    public final TimeInterpolator f35007g;
    public boolean h;
    public long f35008i;
    public int f35009j;

    public f5(View view) {
        this.f35006f = 200L;
        this.f35007g = kr.f36858f;
        this.f35002a = view;
        this.f35005e = true;
    }

    public final int a(int i7, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f35006f;
        if (!z10 && j3 > 0 && !this.f35005e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f35009j = this.f35004c;
                this.f35008i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f35004c = i7;
            this.h = false;
            this.f35005e = false;
        }
        if (this.h) {
            float a10 = c8.m9.a(((float) (elapsedRealtime - this.f35008i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f35008i >= 0) {
                TimeInterpolator timeInterpolator = this.f35007g;
                if (timeInterpolator == null) {
                    this.f35004c = i0.a.f(a10, this.f35009j, this.d);
                } else {
                    this.f35004c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f35009j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f35002a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f35003b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f35004c;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f35006f = 200L;
        kr krVar = kr.f36858f;
        this.f35002a = view;
        this.f35006f = j3;
        this.f35007g = timeInterpolator;
        this.f35005e = true;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f35006f = 200L;
        kr krVar = kr.f36858f;
        this.f35002a = view;
        this.f35006f = j3;
        this.f35007g = timeInterpolator;
        this.f35005e = true;
    }

    public f5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f35006f = 200L;
        kr krVar = kr.f36858f;
        this.f35003b = runnable;
        this.f35006f = j3;
        this.f35007g = timeInterpolator;
        this.f35005e = true;
    }
}
