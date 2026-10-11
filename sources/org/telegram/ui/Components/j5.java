package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f27607a;
    public final Runnable f27608b;
    public int f27609c;
    public int d;
    public boolean f27610e;
    public final long f27611f;
    public final TimeInterpolator f27612g;
    public boolean h;
    public long f27613i;
    public int f27614j;

    public j5(View view) {
        this.f27611f = 200L;
        this.f27612g = is.f27500f;
        this.f27607a = view;
        this.f27610e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27611f;
        if (!z10 && j3 > 0 && !this.f27610e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27614j = this.f27609c;
                this.f27613i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27609c = i10;
            this.h = false;
            this.f27610e = false;
        }
        if (this.h) {
            float a2 = w7.o.a(((float) (elapsedRealtime - this.f27613i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27613i >= 0) {
                TimeInterpolator timeInterpolator = this.f27612g;
                if (timeInterpolator == null) {
                    this.f27609c = i0.a.d(a2, this.f27614j, this.d);
                } else {
                    this.f27609c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27614j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27607a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27608b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27609c;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27611f = 200L;
        is isVar = is.f27500f;
        this.f27607a = view;
        this.f27611f = j3;
        this.f27612g = timeInterpolator;
        this.f27610e = true;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27611f = 200L;
        is isVar = is.f27500f;
        this.f27607a = view;
        this.f27611f = j3;
        this.f27612g = timeInterpolator;
        this.f27610e = true;
    }

    public j5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27611f = 200L;
        is isVar = is.f27500f;
        this.f27608b = runnable;
        this.f27611f = j3;
        this.f27612g = timeInterpolator;
        this.f27610e = true;
    }
}
