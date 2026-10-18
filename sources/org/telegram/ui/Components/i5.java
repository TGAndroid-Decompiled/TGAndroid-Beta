package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class i5 {
    public final View f27075a;
    public final Runnable f27076b;
    public int f27077c;
    public int d;
    public boolean e;
    public final long f27078f;
    public final TimeInterpolator f27079g;
    public boolean h;
    public long f27080i;
    public int f27081j;

    public i5(View view) {
        this.f27078f = 200L;
        this.f27079g = bs.f25037f;
        this.f27075a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27078f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27081j = this.f27077c;
                this.f27080i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27077c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f27080i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27080i >= 0) {
                TimeInterpolator timeInterpolator = this.f27079g;
                if (timeInterpolator == null) {
                    this.f27077c = i0.a.f(a2, this.f27081j, this.d);
                } else {
                    this.f27077c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f27081j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27075a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27076b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27077c;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27078f = 200L;
        bs bsVar = bs.f25037f;
        this.f27075a = view;
        this.f27078f = j10;
        this.f27079g = timeInterpolator;
        this.e = true;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27078f = 200L;
        bs bsVar = bs.f25037f;
        this.f27075a = view;
        this.f27078f = j10;
        this.f27079g = timeInterpolator;
        this.e = true;
    }

    public i5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27078f = 200L;
        bs bsVar = bs.f25037f;
        this.f27076b = runnable;
        this.f27078f = j10;
        this.f27079g = timeInterpolator;
        this.e = true;
    }
}
