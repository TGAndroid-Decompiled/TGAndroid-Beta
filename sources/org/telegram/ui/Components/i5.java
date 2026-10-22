package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class i5 {
    public final View f27124a;
    public final Runnable f27125b;
    public int f27126c;
    public int d;
    public boolean e;
    public final long f27127f;
    public final TimeInterpolator f27128g;
    public boolean h;
    public long f27129i;
    public int f27130j;

    public i5(View view) {
        this.f27127f = 200L;
        this.f27128g = bs.f25024f;
        this.f27124a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27127f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27130j = this.f27126c;
                this.f27129i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27126c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f27129i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27129i >= 0) {
                TimeInterpolator timeInterpolator = this.f27128g;
                if (timeInterpolator == null) {
                    this.f27126c = i0.a.f(a2, this.f27130j, this.d);
                } else {
                    this.f27126c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f27130j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27124a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27125b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27126c;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27127f = 200L;
        bs bsVar = bs.f25024f;
        this.f27124a = view;
        this.f27127f = j10;
        this.f27128g = timeInterpolator;
        this.e = true;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27127f = 200L;
        bs bsVar = bs.f25024f;
        this.f27124a = view;
        this.f27127f = j10;
        this.f27128g = timeInterpolator;
        this.e = true;
    }

    public i5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27127f = 200L;
        bs bsVar = bs.f25024f;
        this.f27125b = runnable;
        this.f27127f = j10;
        this.f27128g = timeInterpolator;
        this.e = true;
    }
}
