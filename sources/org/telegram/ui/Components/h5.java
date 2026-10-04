package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f27010a;
    public final Runnable f27011b;
    public int f27012c;
    public int d;
    public boolean f27013e;
    public final long f27014f;
    public final TimeInterpolator f27015g;
    public boolean h;
    public long f27016i;
    public int f27017j;

    public h5(View view) {
        this.f27014f = 200L;
        this.f27015g = tr.f31141f;
        this.f27010a = view;
        this.f27013e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27014f;
        if (!z10 && j3 > 0 && !this.f27013e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27017j = this.f27012c;
                this.f27016i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27012c = i10;
            this.h = false;
            this.f27013e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f27016i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27016i >= 0) {
                TimeInterpolator timeInterpolator = this.f27015g;
                if (timeInterpolator == null) {
                    this.f27012c = i0.a.d(a2, this.f27017j, this.d);
                } else {
                    this.f27012c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27017j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27010a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27011b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27012c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27014f = 200L;
        tr trVar = tr.f31141f;
        this.f27010a = view;
        this.f27014f = j3;
        this.f27015g = timeInterpolator;
        this.f27013e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27014f = 200L;
        tr trVar = tr.f31141f;
        this.f27010a = view;
        this.f27014f = j3;
        this.f27015g = timeInterpolator;
        this.f27013e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27014f = 200L;
        tr trVar = tr.f31141f;
        this.f27011b = runnable;
        this.f27014f = j3;
        this.f27015g = timeInterpolator;
        this.f27013e = true;
    }
}
