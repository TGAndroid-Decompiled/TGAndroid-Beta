package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f27066a;
    public final Runnable f27067b;
    public int f27068c;
    public int d;
    public boolean f27069e;
    public final long f27070f;
    public final TimeInterpolator f27071g;
    public boolean h;
    public long f27072i;
    public int f27073j;

    public h5(View view) {
        this.f27070f = 200L;
        this.f27071g = tr.f31215f;
        this.f27066a = view;
        this.f27069e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27070f;
        if (!z10 && j3 > 0 && !this.f27069e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27073j = this.f27068c;
                this.f27072i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27068c = i10;
            this.h = false;
            this.f27069e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f27072i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27072i >= 0) {
                TimeInterpolator timeInterpolator = this.f27071g;
                if (timeInterpolator == null) {
                    this.f27068c = i0.a.d(a2, this.f27073j, this.d);
                } else {
                    this.f27068c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27073j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27066a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27067b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27068c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27070f = 200L;
        tr trVar = tr.f31215f;
        this.f27066a = view;
        this.f27070f = j3;
        this.f27071g = timeInterpolator;
        this.f27069e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27070f = 200L;
        tr trVar = tr.f31215f;
        this.f27066a = view;
        this.f27070f = j3;
        this.f27071g = timeInterpolator;
        this.f27069e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27070f = 200L;
        tr trVar = tr.f31215f;
        this.f27067b = runnable;
        this.f27070f = j3;
        this.f27071g = timeInterpolator;
        this.f27069e = true;
    }
}
