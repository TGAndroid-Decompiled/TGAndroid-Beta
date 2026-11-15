package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class x4 {
    public final View f41558a;
    public final Runnable f41559b;
    public int f41560c;
    public int d;
    public boolean f41561e;
    public final long f41562f;
    public final TimeInterpolator f41563g;
    public boolean h;
    public long f41564i;
    public int f41565j;

    public x4(View view) {
        this.f41562f = 200L;
        this.f41563g = er.f34419f;
        this.f41558a = view;
        this.f41561e = true;
    }

    public final int a(int i7, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f41562f;
        if (!z10 && j3 > 0 && !this.f41561e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f41565j = this.f41560c;
                this.f41564i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f41560c = i7;
            this.h = false;
            this.f41561e = false;
        }
        if (this.h) {
            float a10 = c8.i9.a(((float) (elapsedRealtime - this.f41564i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f41564i >= 0) {
                TimeInterpolator timeInterpolator = this.f41563g;
                if (timeInterpolator == null) {
                    this.f41560c = i0.a.f(a10, this.f41565j, this.d);
                } else {
                    this.f41560c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f41565j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f41558a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f41559b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f41560c;
    }

    public x4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f41562f = 200L;
        er erVar = er.f34419f;
        this.f41558a = view;
        this.f41562f = j3;
        this.f41563g = timeInterpolator;
        this.f41561e = true;
    }

    public x4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f41562f = 200L;
        er erVar = er.f34419f;
        this.f41558a = view;
        this.f41562f = j3;
        this.f41563g = timeInterpolator;
        this.f41561e = true;
    }

    public x4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f41562f = 200L;
        er erVar = er.f34419f;
        this.f41559b = runnable;
        this.f41562f = j3;
        this.f41563g = timeInterpolator;
        this.f41561e = true;
    }
}
