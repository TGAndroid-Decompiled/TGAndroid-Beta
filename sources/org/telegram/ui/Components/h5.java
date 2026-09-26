package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24634a;
    public final Runnable f24635b;
    public int f24636c;
    public int d;
    public boolean e;
    public final long f24637f;
    public final TimeInterpolator f24638g;
    public boolean h;
    public long f24639i;
    public int f24640j;

    public h5(View view) {
        this.f24637f = 200L;
        this.f24638g = rr.f28030f;
        this.f24634a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24637f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24640j = this.f24636c;
                this.f24639i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24636c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24639i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24639i >= 0) {
                TimeInterpolator timeInterpolator = this.f24638g;
                if (timeInterpolator == null) {
                    this.f24636c = i0.a.d(a2, this.f24640j, this.d);
                } else {
                    this.f24636c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24640j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24634a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24635b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24636c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24637f = 200L;
        rr rrVar = rr.f28030f;
        this.f24634a = view;
        this.f24637f = j3;
        this.f24638g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24637f = 200L;
        rr rrVar = rr.f28030f;
        this.f24634a = view;
        this.f24637f = j3;
        this.f24638g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24637f = 200L;
        rr rrVar = rr.f28030f;
        this.f24635b = runnable;
        this.f24637f = j3;
        this.f24638g = timeInterpolator;
        this.e = true;
    }
}
