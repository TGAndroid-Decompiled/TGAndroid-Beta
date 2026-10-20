package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class i5 {
    public final View f27121a;
    public final Runnable f27122b;
    public int f27123c;
    public int d;
    public boolean e;
    public final long f27124f;
    public final TimeInterpolator f27125g;
    public boolean h;
    public long f27126i;
    public int f27127j;

    public i5(View view) {
        this.f27124f = 200L;
        this.f27125g = bs.f25021f;
        this.f27121a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27124f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27127j = this.f27123c;
                this.f27126i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27123c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f27126i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27126i >= 0) {
                TimeInterpolator timeInterpolator = this.f27125g;
                if (timeInterpolator == null) {
                    this.f27123c = i0.a.f(a2, this.f27127j, this.d);
                } else {
                    this.f27123c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f27127j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27121a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27122b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27123c;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27124f = 200L;
        bs bsVar = bs.f25021f;
        this.f27121a = view;
        this.f27124f = j10;
        this.f27125g = timeInterpolator;
        this.e = true;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27124f = 200L;
        bs bsVar = bs.f25021f;
        this.f27121a = view;
        this.f27124f = j10;
        this.f27125g = timeInterpolator;
        this.e = true;
    }

    public i5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27124f = 200L;
        bs bsVar = bs.f25021f;
        this.f27122b = runnable;
        this.f27124f = j10;
        this.f27125g = timeInterpolator;
        this.e = true;
    }
}
