package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24628a;
    public final Runnable f24629b;
    public int f24630c;
    public int d;
    public boolean e;
    public final long f24631f;
    public final TimeInterpolator f24632g;
    public boolean h;
    public long f24633i;
    public int f24634j;

    public h5(View view) {
        this.f24631f = 200L;
        this.f24632g = rr.f28022f;
        this.f24628a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24631f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24634j = this.f24630c;
                this.f24633i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24630c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24633i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24633i >= 0) {
                TimeInterpolator timeInterpolator = this.f24632g;
                if (timeInterpolator == null) {
                    this.f24630c = i0.a.d(a2, this.f24634j, this.d);
                } else {
                    this.f24630c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24634j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24628a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24629b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24630c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24631f = 200L;
        rr rrVar = rr.f28022f;
        this.f24628a = view;
        this.f24631f = j3;
        this.f24632g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24631f = 200L;
        rr rrVar = rr.f28022f;
        this.f24628a = view;
        this.f24631f = j3;
        this.f24632g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24631f = 200L;
        rr rrVar = rr.f28022f;
        this.f24629b = runnable;
        this.f24631f = j3;
        this.f24632g = timeInterpolator;
        this.e = true;
    }
}
