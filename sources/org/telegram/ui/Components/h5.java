package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24694a;
    public final Runnable f24695b;
    public int f24696c;
    public int d;
    public boolean e;
    public final long f24697f;
    public final TimeInterpolator f24698g;
    public boolean h;
    public long f24699i;
    public int f24700j;

    public h5(View view) {
        this.f24697f = 200L;
        this.f24698g = sr.f28346f;
        this.f24694a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24697f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24700j = this.f24696c;
                this.f24699i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24696c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24699i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24699i >= 0) {
                TimeInterpolator timeInterpolator = this.f24698g;
                if (timeInterpolator == null) {
                    this.f24696c = i0.a.d(a2, this.f24700j, this.d);
                } else {
                    this.f24696c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24700j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24694a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24695b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24696c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24697f = 200L;
        sr srVar = sr.f28346f;
        this.f24694a = view;
        this.f24697f = j3;
        this.f24698g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24697f = 200L;
        sr srVar = sr.f28346f;
        this.f24694a = view;
        this.f24697f = j3;
        this.f24698g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24697f = 200L;
        sr srVar = sr.f28346f;
        this.f24695b = runnable;
        this.f24697f = j3;
        this.f24698g = timeInterpolator;
        this.e = true;
    }
}
