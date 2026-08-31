package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class c5 {
    public final View f25793a;
    public final Runnable f25794b;
    public int f25795c;
    public int d;
    public boolean f25796e;
    public final long f25797f;
    public final TimeInterpolator f25798g;
    public boolean h;
    public long f25799i;
    public int f25800j;

    public c5(View view) {
        this.f25797f = 200L;
        this.f25798g = pr.f30183f;
        this.f25793a = view;
        this.f25796e = true;
    }

    public final int a(int i10, boolean z4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f25797f;
        if (!z4 && j10 > 0 && !this.f25796e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f25800j = this.f25795c;
                this.f25799i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f25795c = i10;
            this.h = false;
            this.f25796e = false;
        }
        if (this.h) {
            float a2 = k7.o.a(((float) (elapsedRealtime - this.f25799i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25799i >= 0) {
                TimeInterpolator timeInterpolator = this.f25798g;
                if (timeInterpolator == null) {
                    this.f25795c = i0.a.d(a2, this.f25800j, this.d);
                } else {
                    this.f25795c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f25800j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f25793a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25794b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25795c;
    }

    public c5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f25797f = 200L;
        pr prVar = pr.f30183f;
        this.f25793a = view;
        this.f25797f = j10;
        this.f25798g = timeInterpolator;
        this.f25796e = true;
    }

    public c5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f25797f = 200L;
        pr prVar = pr.f30183f;
        this.f25793a = view;
        this.f25797f = j10;
        this.f25798g = timeInterpolator;
        this.f25796e = true;
    }

    public c5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f25797f = 200L;
        pr prVar = pr.f30183f;
        this.f25794b = runnable;
        this.f25797f = j10;
        this.f25798g = timeInterpolator;
        this.f25796e = true;
    }
}
