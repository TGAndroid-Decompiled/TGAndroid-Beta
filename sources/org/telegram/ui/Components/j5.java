package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f27561a;
    public final Runnable f27562b;
    public int f27563c;
    public int d;
    public boolean f27564e;
    public final long f27565f;
    public final TimeInterpolator f27566g;
    public boolean h;
    public long f27567i;
    public int f27568j;

    public j5(View view) {
        this.f27565f = 200L;
        this.f27566g = is.f27451f;
        this.f27561a = view;
        this.f27564e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27565f;
        if (!z10 && j3 > 0 && !this.f27564e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27568j = this.f27563c;
                this.f27567i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27563c = i10;
            this.h = false;
            this.f27564e = false;
        }
        if (this.h) {
            float a2 = w7.o.a(((float) (elapsedRealtime - this.f27567i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27567i >= 0) {
                TimeInterpolator timeInterpolator = this.f27566g;
                if (timeInterpolator == null) {
                    this.f27563c = i0.a.d(a2, this.f27568j, this.d);
                } else {
                    this.f27563c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27568j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27561a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27562b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27563c;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27565f = 200L;
        is isVar = is.f27451f;
        this.f27561a = view;
        this.f27565f = j3;
        this.f27566g = timeInterpolator;
        this.f27564e = true;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27565f = 200L;
        is isVar = is.f27451f;
        this.f27561a = view;
        this.f27565f = j3;
        this.f27566g = timeInterpolator;
        this.f27564e = true;
    }

    public j5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27565f = 200L;
        is isVar = is.f27451f;
        this.f27562b = runnable;
        this.f27565f = j3;
        this.f27566g = timeInterpolator;
        this.f27564e = true;
    }
}
