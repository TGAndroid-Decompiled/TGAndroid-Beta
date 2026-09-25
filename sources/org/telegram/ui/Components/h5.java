package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24635a;
    public final Runnable f24636b;
    public int f24637c;
    public int d;
    public boolean e;
    public final long f24638f;
    public final TimeInterpolator f24639g;
    public boolean h;
    public long f24640i;
    public int f24641j;

    public h5(View view) {
        this.f24638f = 200L;
        this.f24639g = rr.f28031f;
        this.f24635a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24638f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24641j = this.f24637c;
                this.f24640i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24637c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24640i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24640i >= 0) {
                TimeInterpolator timeInterpolator = this.f24639g;
                if (timeInterpolator == null) {
                    this.f24637c = i0.a.d(a2, this.f24641j, this.d);
                } else {
                    this.f24637c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24641j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24635a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24636b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24637c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24638f = 200L;
        rr rrVar = rr.f28031f;
        this.f24635a = view;
        this.f24638f = j3;
        this.f24639g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24638f = 200L;
        rr rrVar = rr.f28031f;
        this.f24635a = view;
        this.f24638f = j3;
        this.f24639g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24638f = 200L;
        rr rrVar = rr.f28031f;
        this.f24636b = runnable;
        this.f24638f = j3;
        this.f24639g = timeInterpolator;
        this.e = true;
    }
}
