package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class i5 {
    public final View f27125a;
    public final Runnable f27126b;
    public int f27127c;
    public int d;
    public boolean e;
    public final long f27128f;
    public final TimeInterpolator f27129g;
    public boolean h;
    public long f27130i;
    public int f27131j;

    public i5(View view) {
        this.f27128f = 200L;
        this.f27129g = bs.f25025f;
        this.f27125a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27128f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27131j = this.f27127c;
                this.f27130i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27127c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f27130i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27130i >= 0) {
                TimeInterpolator timeInterpolator = this.f27129g;
                if (timeInterpolator == null) {
                    this.f27127c = i0.a.f(a2, this.f27131j, this.d);
                } else {
                    this.f27127c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f27131j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27125a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27126b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27127c;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27128f = 200L;
        bs bsVar = bs.f25025f;
        this.f27125a = view;
        this.f27128f = j10;
        this.f27129g = timeInterpolator;
        this.e = true;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27128f = 200L;
        bs bsVar = bs.f25025f;
        this.f27125a = view;
        this.f27128f = j10;
        this.f27129g = timeInterpolator;
        this.e = true;
    }

    public i5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27128f = 200L;
        bs bsVar = bs.f25025f;
        this.f27126b = runnable;
        this.f27128f = j10;
        this.f27129g = timeInterpolator;
        this.e = true;
    }
}
