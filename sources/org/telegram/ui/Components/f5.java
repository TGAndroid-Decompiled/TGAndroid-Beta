package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class f5 {
    public final View f34938a;
    public final Runnable f34939b;
    public int f34940c;
    public int d;
    public boolean f34941e;
    public final long f34942f;
    public final TimeInterpolator f34943g;
    public boolean h;
    public long f34944i;
    public int f34945j;

    public f5(View view) {
        this.f34942f = 200L;
        this.f34943g = lr.f37208f;
        this.f34938a = view;
        this.f34941e = true;
    }

    public final int a(int i7, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f34942f;
        if (!z10 && j3 > 0 && !this.f34941e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f34945j = this.f34940c;
                this.f34944i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f34940c = i7;
            this.h = false;
            this.f34941e = false;
        }
        if (this.h) {
            float a10 = c8.l9.a(((float) (elapsedRealtime - this.f34944i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f34944i >= 0) {
                TimeInterpolator timeInterpolator = this.f34943g;
                if (timeInterpolator == null) {
                    this.f34940c = i0.a.f(a10, this.f34945j, this.d);
                } else {
                    this.f34940c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f34945j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f34938a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f34939b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f34940c;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f34942f = 200L;
        lr lrVar = lr.f37208f;
        this.f34938a = view;
        this.f34942f = j3;
        this.f34943g = timeInterpolator;
        this.f34941e = true;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f34942f = 200L;
        lr lrVar = lr.f37208f;
        this.f34938a = view;
        this.f34942f = j3;
        this.f34943g = timeInterpolator;
        this.f34941e = true;
    }

    public f5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f34942f = 200L;
        lr lrVar = lr.f37208f;
        this.f34939b = runnable;
        this.f34942f = j3;
        this.f34943g = timeInterpolator;
        this.f34941e = true;
    }
}
