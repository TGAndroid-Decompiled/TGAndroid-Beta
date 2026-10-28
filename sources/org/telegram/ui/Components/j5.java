package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f29505a;
    public final Runnable f29506b;
    public int f29507c;
    public int d;
    public boolean e;
    public final long f29508f;
    public final TimeInterpolator f29509g;
    public boolean h;
    public long f29510i;
    public int f29511j;

    public j5(View view) {
        this.f29508f = 200L;
        this.f29509g = ds.f27530f;
        this.f29505a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f29508f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f29511j = this.f29507c;
                this.f29510i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f29507c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = a8.ee.a(((float) (elapsedRealtime - this.f29510i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f29510i >= 0) {
                TimeInterpolator timeInterpolator = this.f29509g;
                if (timeInterpolator == null) {
                    this.f29507c = i0.a.f(a2, this.f29511j, this.d);
                } else {
                    this.f29507c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f29511j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f29505a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f29506b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f29507c;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f29508f = 200L;
        ds dsVar = ds.f27530f;
        this.f29505a = view;
        this.f29508f = j10;
        this.f29509g = timeInterpolator;
        this.e = true;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f29508f = 200L;
        ds dsVar = ds.f27530f;
        this.f29505a = view;
        this.f29508f = j10;
        this.f29509g = timeInterpolator;
        this.e = true;
    }

    public j5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f29508f = 200L;
        ds dsVar = ds.f27530f;
        this.f29506b = runnable;
        this.f29508f = j10;
        this.f29509g = timeInterpolator;
        this.e = true;
    }
}
