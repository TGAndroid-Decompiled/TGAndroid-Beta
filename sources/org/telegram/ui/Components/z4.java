package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class z4 {
    public final View f40880a;
    public final Runnable f40881b;
    public int f40882c;
    public int d;
    public boolean f40883e;
    public final long f40884f;
    public final TimeInterpolator f40885g;
    public boolean h;
    public long f40886i;
    public int f40887j;

    public z4(View view) {
        this.f40884f = 200L;
        this.f40885g = xq.f40366f;
        this.f40880a = view;
        this.f40883e = true;
    }

    public final int a(int i7, boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f40884f;
        if (!z9 && j3 > 0 && !this.f40883e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f40887j = this.f40882c;
                this.f40886i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f40882c = i7;
            this.h = false;
            this.f40883e = false;
        }
        if (this.h) {
            float a10 = c8.j9.a(((float) (elapsedRealtime - this.f40886i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f40886i >= 0) {
                TimeInterpolator timeInterpolator = this.f40885g;
                if (timeInterpolator == null) {
                    this.f40882c = i0.a.f(a10, this.f40887j, this.d);
                } else {
                    this.f40882c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f40887j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f40880a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f40881b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f40882c;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f40884f = 200L;
        xq xqVar = xq.f40366f;
        this.f40880a = view;
        this.f40884f = j3;
        this.f40885g = timeInterpolator;
        this.f40883e = true;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f40884f = 200L;
        xq xqVar = xq.f40366f;
        this.f40880a = view;
        this.f40884f = j3;
        this.f40885g = timeInterpolator;
        this.f40883e = true;
    }

    public z4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f40884f = 200L;
        xq xqVar = xq.f40366f;
        this.f40881b = runnable;
        this.f40884f = j3;
        this.f40885g = timeInterpolator;
        this.f40883e = true;
    }
}
