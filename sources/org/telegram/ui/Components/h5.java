package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24671a;
    public final Runnable f24672b;
    public int f24673c;
    public int d;
    public boolean e;
    public final long f24674f;
    public final TimeInterpolator f24675g;
    public boolean h;
    public long f24676i;
    public int f24677j;

    public h5(View view) {
        this.f24674f = 200L;
        this.f24675g = sr.f28339f;
        this.f24671a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24674f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24677j = this.f24673c;
                this.f24676i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24673c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24676i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24676i >= 0) {
                TimeInterpolator timeInterpolator = this.f24675g;
                if (timeInterpolator == null) {
                    this.f24673c = i0.a.d(a2, this.f24677j, this.d);
                } else {
                    this.f24673c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24677j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24671a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24672b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24673c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24674f = 200L;
        sr srVar = sr.f28339f;
        this.f24671a = view;
        this.f24674f = j3;
        this.f24675g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24674f = 200L;
        sr srVar = sr.f28339f;
        this.f24671a = view;
        this.f24674f = j3;
        this.f24675g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24674f = 200L;
        sr srVar = sr.f28339f;
        this.f24672b = runnable;
        this.f24674f = j3;
        this.f24675g = timeInterpolator;
        this.e = true;
    }
}
