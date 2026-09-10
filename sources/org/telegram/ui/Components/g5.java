package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class g5 {
    public final View f23236a;
    public final Runnable f23237b;
    public int f23238c;
    public int d;
    public boolean e;
    public final long f23239f;
    public final TimeInterpolator f23240g;
    public boolean h;
    public long f23241i;
    public int f23242j;

    public g5(View view) {
        this.f23239f = 200L;
        this.f23240g = wr.f28819f;
        this.f23236a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f23239f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f23242j = this.f23238c;
                this.f23241i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f23238c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f23241i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23241i >= 0) {
                TimeInterpolator timeInterpolator = this.f23240g;
                if (timeInterpolator == null) {
                    this.f23238c = i0.a.d(a2, this.f23242j, this.d);
                } else {
                    this.f23238c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f23242j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f23236a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23237b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23238c;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23239f = 200L;
        wr wrVar = wr.f28819f;
        this.f23236a = view;
        this.f23239f = j3;
        this.f23240g = timeInterpolator;
        this.e = true;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23239f = 200L;
        wr wrVar = wr.f28819f;
        this.f23236a = view;
        this.f23239f = j3;
        this.f23240g = timeInterpolator;
        this.e = true;
    }

    public g5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23239f = 200L;
        wr wrVar = wr.f28819f;
        this.f23237b = runnable;
        this.f23239f = j3;
        this.f23240g = timeInterpolator;
        this.e = true;
    }
}
