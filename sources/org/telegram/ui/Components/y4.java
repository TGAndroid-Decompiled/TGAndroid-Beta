package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class y4 {
    public final View f40488a;
    public final Runnable f40489b;
    public int f40490c;
    public int d;
    public boolean f40491e;
    public final long f40492f;
    public final TimeInterpolator f40493g;
    public boolean h;
    public long f40494i;
    public int f40495j;

    public y4(View view) {
        this.f40492f = 200L;
        this.f40493g = wq.f40046f;
        this.f40488a = view;
        this.f40491e = true;
    }

    public final int a(int i7, boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f40492f;
        if (!z9 && j3 > 0 && !this.f40491e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f40495j = this.f40490c;
                this.f40494i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f40490c = i7;
            this.h = false;
            this.f40491e = false;
        }
        if (this.h) {
            float a10 = c8.j9.a(((float) (elapsedRealtime - this.f40494i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f40494i >= 0) {
                TimeInterpolator timeInterpolator = this.f40493g;
                if (timeInterpolator == null) {
                    this.f40490c = i0.a.f(a10, this.f40495j, this.d);
                } else {
                    this.f40490c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f40495j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f40488a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f40489b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f40490c;
    }

    public y4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f40492f = 200L;
        wq wqVar = wq.f40046f;
        this.f40488a = view;
        this.f40492f = j3;
        this.f40493g = timeInterpolator;
        this.f40491e = true;
    }

    public y4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f40492f = 200L;
        wq wqVar = wq.f40046f;
        this.f40488a = view;
        this.f40492f = j3;
        this.f40493g = timeInterpolator;
        this.f40491e = true;
    }

    public y4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f40492f = 200L;
        wq wqVar = wq.f40046f;
        this.f40489b = runnable;
        this.f40492f = j3;
        this.f40493g = timeInterpolator;
        this.f40491e = true;
    }
}
