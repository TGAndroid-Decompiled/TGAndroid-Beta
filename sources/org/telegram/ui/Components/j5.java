package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f27598a;
    public final Runnable f27599b;
    public int f27600c;
    public int d;
    public boolean f27601e;
    public final long f27602f;
    public final TimeInterpolator f27603g;
    public boolean h;
    public long f27604i;
    public int f27605j;

    public j5(View view) {
        this.f27602f = 200L;
        this.f27603g = hs.f27118f;
        this.f27598a = view;
        this.f27601e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27602f;
        if (!z10 && j3 > 0 && !this.f27601e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27605j = this.f27600c;
                this.f27604i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27600c = i10;
            this.h = false;
            this.f27601e = false;
        }
        if (this.h) {
            float a2 = w7.o.a(((float) (elapsedRealtime - this.f27604i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27604i >= 0) {
                TimeInterpolator timeInterpolator = this.f27603g;
                if (timeInterpolator == null) {
                    this.f27600c = i0.a.d(a2, this.f27605j, this.d);
                } else {
                    this.f27600c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27605j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27598a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27599b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27600c;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27602f = 200L;
        hs hsVar = hs.f27118f;
        this.f27598a = view;
        this.f27602f = j3;
        this.f27603g = timeInterpolator;
        this.f27601e = true;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27602f = 200L;
        hs hsVar = hs.f27118f;
        this.f27598a = view;
        this.f27602f = j3;
        this.f27603g = timeInterpolator;
        this.f27601e = true;
    }

    public j5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27602f = 200L;
        hs hsVar = hs.f27118f;
        this.f27599b = runnable;
        this.f27602f = j3;
        this.f27603g = timeInterpolator;
        this.f27601e = true;
    }
}
