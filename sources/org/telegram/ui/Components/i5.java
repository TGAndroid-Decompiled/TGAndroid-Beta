package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class i5 {
    public final View f27072a;
    public final Runnable f27073b;
    public int f27074c;
    public int d;
    public boolean e;
    public final long f27075f;
    public final TimeInterpolator f27076g;
    public boolean h;
    public long f27077i;
    public int f27078j;

    public i5(View view) {
        this.f27075f = 200L;
        this.f27076g = bs.f25014f;
        this.f27072a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27075f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27078j = this.f27074c;
                this.f27077i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27074c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f27077i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27077i >= 0) {
                TimeInterpolator timeInterpolator = this.f27076g;
                if (timeInterpolator == null) {
                    this.f27074c = i0.a.f(a2, this.f27078j, this.d);
                } else {
                    this.f27074c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f27078j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27072a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27073b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27074c;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27075f = 200L;
        bs bsVar = bs.f25014f;
        this.f27072a = view;
        this.f27075f = j10;
        this.f27076g = timeInterpolator;
        this.e = true;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27075f = 200L;
        bs bsVar = bs.f25014f;
        this.f27072a = view;
        this.f27075f = j10;
        this.f27076g = timeInterpolator;
        this.e = true;
    }

    public i5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27075f = 200L;
        bs bsVar = bs.f25014f;
        this.f27073b = runnable;
        this.f27075f = j10;
        this.f27076g = timeInterpolator;
        this.e = true;
    }
}
