package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class z4 {
    public final View f40831a;
    public final Runnable f40832b;
    public int f40833c;
    public int d;
    public boolean f40834e;
    public final long f40835f;
    public final TimeInterpolator f40836g;
    public boolean h;
    public long f40837i;
    public int f40838j;

    public z4(View view) {
        this.f40835f = 200L;
        this.f40836g = xq.f40310f;
        this.f40831a = view;
        this.f40834e = true;
    }

    public final int a(int i7, boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f40835f;
        if (!z9 && j3 > 0 && !this.f40834e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f40838j = this.f40833c;
                this.f40837i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f40833c = i7;
            this.h = false;
            this.f40834e = false;
        }
        if (this.h) {
            float a10 = c8.j9.a(((float) (elapsedRealtime - this.f40837i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f40837i >= 0) {
                TimeInterpolator timeInterpolator = this.f40836g;
                if (timeInterpolator == null) {
                    this.f40833c = i0.a.f(a10, this.f40838j, this.d);
                } else {
                    this.f40833c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f40838j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f40831a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f40832b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f40833c;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f40835f = 200L;
        xq xqVar = xq.f40310f;
        this.f40831a = view;
        this.f40835f = j3;
        this.f40836g = timeInterpolator;
        this.f40834e = true;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f40835f = 200L;
        xq xqVar = xq.f40310f;
        this.f40831a = view;
        this.f40835f = j3;
        this.f40836g = timeInterpolator;
        this.f40834e = true;
    }

    public z4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f40835f = 200L;
        xq xqVar = xq.f40310f;
        this.f40832b = runnable;
        this.f40835f = j3;
        this.f40836g = timeInterpolator;
        this.f40834e = true;
    }
}
