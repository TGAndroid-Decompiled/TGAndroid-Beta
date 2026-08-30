package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class c5 {
    public final View f23836a;
    public final Runnable f23837b;
    public int f23838c;
    public int d;
    public boolean e;
    public final long f23839f;
    public final TimeInterpolator f23840g;
    public boolean h;
    public long f23841i;
    public int f23842j;

    public c5(View view) {
        this.f23839f = 200L;
        this.f23840g = nr.f27346f;
        this.f23836a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f23839f;
        if (!z4 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f23842j = this.f23838c;
                this.f23841i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f23838c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = k7.n.a(((float) (elapsedRealtime - this.f23841i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23841i >= 0) {
                TimeInterpolator timeInterpolator = this.f23840g;
                if (timeInterpolator == null) {
                    this.f23838c = i0.a.d(a2, this.f23842j, this.d);
                } else {
                    this.f23838c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f23842j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f23836a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23837b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23838c;
    }

    public c5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f23839f = 200L;
        nr nrVar = nr.f27346f;
        this.f23836a = view;
        this.f23839f = j10;
        this.f23840g = timeInterpolator;
        this.e = true;
    }

    public c5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f23839f = 200L;
        nr nrVar = nr.f27346f;
        this.f23836a = view;
        this.f23839f = j10;
        this.f23840g = timeInterpolator;
        this.e = true;
    }

    public c5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f23839f = 200L;
        nr nrVar = nr.f27346f;
        this.f23837b = runnable;
        this.f23839f = j10;
        this.f23840g = timeInterpolator;
        this.e = true;
    }
}
