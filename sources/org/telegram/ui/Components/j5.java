package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f27358a;
    public final Runnable f27359b;
    public int f27360c;
    public int d;
    public boolean f27361e;
    public final long f27362f;
    public final TimeInterpolator f27363g;
    public boolean h;
    public long f27364i;
    public int f27365j;

    public j5(View view) {
        this.f27362f = 200L;
        this.f27363g = js.f27634f;
        this.f27358a = view;
        this.f27361e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27362f;
        if (!z10 && j3 > 0 && !this.f27361e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27365j = this.f27360c;
                this.f27364i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27360c = i10;
            this.h = false;
            this.f27361e = false;
        }
        if (this.h) {
            float a2 = w7.n.a(((float) (elapsedRealtime - this.f27364i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27364i >= 0) {
                TimeInterpolator timeInterpolator = this.f27363g;
                if (timeInterpolator == null) {
                    this.f27360c = i0.a.d(a2, this.f27365j, this.d);
                } else {
                    this.f27360c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27365j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27358a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27359b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27360c;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27362f = 200L;
        js jsVar = js.f27634f;
        this.f27358a = view;
        this.f27362f = j3;
        this.f27363g = timeInterpolator;
        this.f27361e = true;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27362f = 200L;
        js jsVar = js.f27634f;
        this.f27358a = view;
        this.f27362f = j3;
        this.f27363g = timeInterpolator;
        this.f27361e = true;
    }

    public j5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27362f = 200L;
        js jsVar = js.f27634f;
        this.f27359b = runnable;
        this.f27362f = j3;
        this.f27363g = timeInterpolator;
        this.f27361e = true;
    }
}
