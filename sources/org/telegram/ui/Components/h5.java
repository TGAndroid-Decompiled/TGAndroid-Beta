package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24693a;
    public final Runnable f24694b;
    public int f24695c;
    public int d;
    public boolean e;
    public final long f24696f;
    public final TimeInterpolator f24697g;
    public boolean h;
    public long f24698i;
    public int f24699j;

    public h5(View view) {
        this.f24696f = 200L;
        this.f24697g = sr.f28348f;
        this.f24693a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24696f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24699j = this.f24695c;
                this.f24698i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24695c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24698i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24698i >= 0) {
                TimeInterpolator timeInterpolator = this.f24697g;
                if (timeInterpolator == null) {
                    this.f24695c = i0.a.d(a2, this.f24699j, this.d);
                } else {
                    this.f24695c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24699j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24693a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24694b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24695c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24696f = 200L;
        sr srVar = sr.f28348f;
        this.f24693a = view;
        this.f24696f = j3;
        this.f24697g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24696f = 200L;
        sr srVar = sr.f28348f;
        this.f24693a = view;
        this.f24696f = j3;
        this.f24697g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24696f = 200L;
        sr srVar = sr.f28348f;
        this.f24694b = runnable;
        this.f24696f = j3;
        this.f24697g = timeInterpolator;
        this.e = true;
    }
}
