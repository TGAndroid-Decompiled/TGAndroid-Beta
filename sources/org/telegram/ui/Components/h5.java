package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f27015a;
    public final Runnable f27016b;
    public int f27017c;
    public int d;
    public boolean f27018e;
    public final long f27019f;
    public final TimeInterpolator f27020g;
    public boolean h;
    public long f27021i;
    public int f27022j;

    public h5(View view) {
        this.f27019f = 200L;
        this.f27020g = tr.f31147f;
        this.f27015a = view;
        this.f27018e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27019f;
        if (!z10 && j3 > 0 && !this.f27018e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27022j = this.f27017c;
                this.f27021i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27017c = i10;
            this.h = false;
            this.f27018e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f27021i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27021i >= 0) {
                TimeInterpolator timeInterpolator = this.f27020g;
                if (timeInterpolator == null) {
                    this.f27017c = i0.a.d(a2, this.f27022j, this.d);
                } else {
                    this.f27017c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27022j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27015a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27016b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27017c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27019f = 200L;
        tr trVar = tr.f31147f;
        this.f27015a = view;
        this.f27019f = j3;
        this.f27020g = timeInterpolator;
        this.f27018e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27019f = 200L;
        tr trVar = tr.f31147f;
        this.f27015a = view;
        this.f27019f = j3;
        this.f27020g = timeInterpolator;
        this.f27018e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27019f = 200L;
        tr trVar = tr.f31147f;
        this.f27016b = runnable;
        this.f27019f = j3;
        this.f27020g = timeInterpolator;
        this.f27018e = true;
    }
}
