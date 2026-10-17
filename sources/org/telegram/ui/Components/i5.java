package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class i5 {
    public final View f27068a;
    public final Runnable f27069b;
    public int f27070c;
    public int d;
    public boolean e;
    public final long f27071f;
    public final TimeInterpolator f27072g;
    public boolean h;
    public long f27073i;
    public int f27074j;

    public i5(View view) {
        this.f27071f = 200L;
        this.f27072g = bs.f25030f;
        this.f27068a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27071f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27074j = this.f27070c;
                this.f27073i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27070c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f27073i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27073i >= 0) {
                TimeInterpolator timeInterpolator = this.f27072g;
                if (timeInterpolator == null) {
                    this.f27070c = i0.b.f(a2, this.f27074j, this.d);
                } else {
                    this.f27070c = i0.b.f(timeInterpolator.getInterpolation(a2), this.f27074j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27068a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27069b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27070c;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27071f = 200L;
        bs bsVar = bs.f25030f;
        this.f27068a = view;
        this.f27071f = j10;
        this.f27072g = timeInterpolator;
        this.e = true;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27071f = 200L;
        bs bsVar = bs.f25030f;
        this.f27068a = view;
        this.f27071f = j10;
        this.f27072g = timeInterpolator;
        this.e = true;
    }

    public i5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27071f = 200L;
        bs bsVar = bs.f25030f;
        this.f27069b = runnable;
        this.f27071f = j10;
        this.f27072g = timeInterpolator;
        this.e = true;
    }
}
