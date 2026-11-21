package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class g5 {
    public final View f35401a;
    public final Runnable f35402b;
    public int f35403c;
    public int d;
    public boolean f35404e;
    public final long f35405f;
    public final TimeInterpolator f35406g;
    public boolean h;
    public long f35407i;
    public int f35408j;

    public g5(View view) {
        this.f35405f = 200L;
        this.f35406g = nr.f37956f;
        this.f35401a = view;
        this.f35404e = true;
    }

    public final int a(int i7, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f35405f;
        if (!z10 && j3 > 0 && !this.f35404e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f35408j = this.f35403c;
                this.f35407i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f35403c = i7;
            this.h = false;
            this.f35404e = false;
        }
        if (this.h) {
            float a10 = c8.l9.a(((float) (elapsedRealtime - this.f35407i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f35407i >= 0) {
                TimeInterpolator timeInterpolator = this.f35406g;
                if (timeInterpolator == null) {
                    this.f35403c = i0.a.f(a10, this.f35408j, this.d);
                } else {
                    this.f35403c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f35408j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f35401a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f35402b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f35403c;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f35405f = 200L;
        nr nrVar = nr.f37956f;
        this.f35401a = view;
        this.f35405f = j3;
        this.f35406g = timeInterpolator;
        this.f35404e = true;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f35405f = 200L;
        nr nrVar = nr.f37956f;
        this.f35401a = view;
        this.f35405f = j3;
        this.f35406g = timeInterpolator;
        this.f35404e = true;
    }

    public g5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f35405f = 200L;
        nr nrVar = nr.f37956f;
        this.f35402b = runnable;
        this.f35405f = j3;
        this.f35406g = timeInterpolator;
        this.f35404e = true;
    }
}
