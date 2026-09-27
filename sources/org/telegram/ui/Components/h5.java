package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24723a;
    public final Runnable f24724b;
    public int f24725c;
    public int d;
    public boolean e;
    public final long f24726f;
    public final TimeInterpolator f24727g;
    public boolean h;
    public long f24728i;
    public int f24729j;

    public h5(View view) {
        this.f24726f = 200L;
        this.f24727g = sr.f28359f;
        this.f24723a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24726f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24729j = this.f24725c;
                this.f24728i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24725c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24728i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24728i >= 0) {
                TimeInterpolator timeInterpolator = this.f24727g;
                if (timeInterpolator == null) {
                    this.f24725c = i0.a.d(a2, this.f24729j, this.d);
                } else {
                    this.f24725c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24729j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24723a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24724b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24725c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24726f = 200L;
        sr srVar = sr.f28359f;
        this.f24723a = view;
        this.f24726f = j3;
        this.f24727g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24726f = 200L;
        sr srVar = sr.f28359f;
        this.f24723a = view;
        this.f24726f = j3;
        this.f24727g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24726f = 200L;
        sr srVar = sr.f28359f;
        this.f24724b = runnable;
        this.f24726f = j3;
        this.f24727g = timeInterpolator;
        this.e = true;
    }
}
