package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24494a;
    public final Runnable f24495b;
    public int f24496c;
    public int d;
    public boolean e;
    public final long f24497f;
    public final TimeInterpolator f24498g;
    public boolean h;
    public long f24499i;
    public int f24500j;

    public h5(View view) {
        this.f24497f = 200L;
        this.f24498g = rr.f27701f;
        this.f24494a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24497f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24500j = this.f24496c;
                this.f24499i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24496c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f24499i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24499i >= 0) {
                TimeInterpolator timeInterpolator = this.f24498g;
                if (timeInterpolator == null) {
                    this.f24496c = i0.a.d(a2, this.f24500j, this.d);
                } else {
                    this.f24496c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24500j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24494a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24495b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24496c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24497f = 200L;
        rr rrVar = rr.f27701f;
        this.f24494a = view;
        this.f24497f = j3;
        this.f24498g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24497f = 200L;
        rr rrVar = rr.f27701f;
        this.f24494a = view;
        this.f24497f = j3;
        this.f24498g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24497f = 200L;
        rr rrVar = rr.f27701f;
        this.f24495b = runnable;
        this.f24497f = j3;
        this.f24498g = timeInterpolator;
        this.e = true;
    }
}
