package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class z4 {
    public final View f40861a;
    public final Runnable f40862b;
    public int f40863c;
    public int d;
    public boolean f40864e;
    public final long f40865f;
    public final TimeInterpolator f40866g;
    public boolean h;
    public long f40867i;
    public int f40868j;

    public z4(View view) {
        this.f40865f = 200L;
        this.f40866g = xq.f40345f;
        this.f40861a = view;
        this.f40864e = true;
    }

    public final int a(int i7, boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f40865f;
        if (!z9 && j3 > 0 && !this.f40864e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f40868j = this.f40863c;
                this.f40867i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f40863c = i7;
            this.h = false;
            this.f40864e = false;
        }
        if (this.h) {
            float a10 = c8.j9.a(((float) (elapsedRealtime - this.f40867i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f40867i >= 0) {
                TimeInterpolator timeInterpolator = this.f40866g;
                if (timeInterpolator == null) {
                    this.f40863c = i0.a.f(a10, this.f40868j, this.d);
                } else {
                    this.f40863c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f40868j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f40861a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f40862b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f40863c;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f40865f = 200L;
        xq xqVar = xq.f40345f;
        this.f40861a = view;
        this.f40865f = j3;
        this.f40866g = timeInterpolator;
        this.f40864e = true;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f40865f = 200L;
        xq xqVar = xq.f40345f;
        this.f40861a = view;
        this.f40865f = j3;
        this.f40866g = timeInterpolator;
        this.f40864e = true;
    }

    public z4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f40865f = 200L;
        xq xqVar = xq.f40345f;
        this.f40862b = runnable;
        this.f40865f = j3;
        this.f40866g = timeInterpolator;
        this.f40864e = true;
    }
}
