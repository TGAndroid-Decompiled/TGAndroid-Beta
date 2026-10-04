package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f27009a;
    public final Runnable f27010b;
    public int f27011c;
    public int d;
    public boolean f27012e;
    public final long f27013f;
    public final TimeInterpolator f27014g;
    public boolean h;
    public long f27015i;
    public int f27016j;

    public h5(View view) {
        this.f27013f = 200L;
        this.f27014g = tr.f31140f;
        this.f27009a = view;
        this.f27012e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27013f;
        if (!z10 && j3 > 0 && !this.f27012e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27016j = this.f27011c;
                this.f27015i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27011c = i10;
            this.h = false;
            this.f27012e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f27015i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27015i >= 0) {
                TimeInterpolator timeInterpolator = this.f27014g;
                if (timeInterpolator == null) {
                    this.f27011c = i0.a.d(a2, this.f27016j, this.d);
                } else {
                    this.f27011c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27016j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27009a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27010b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27011c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27013f = 200L;
        tr trVar = tr.f31140f;
        this.f27009a = view;
        this.f27013f = j3;
        this.f27014g = timeInterpolator;
        this.f27012e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27013f = 200L;
        tr trVar = tr.f31140f;
        this.f27009a = view;
        this.f27013f = j3;
        this.f27014g = timeInterpolator;
        this.f27012e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27013f = 200L;
        tr trVar = tr.f31140f;
        this.f27010b = runnable;
        this.f27013f = j3;
        this.f27014g = timeInterpolator;
        this.f27012e = true;
    }
}
