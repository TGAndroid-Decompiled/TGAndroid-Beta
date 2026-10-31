package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class w4 {
    public final View f31986a;
    public final Runnable f31987b;
    public int f31988c;
    public int d;
    public boolean e;
    public final long f31989f;
    public final TimeInterpolator f31990g;
    public boolean h;
    public long f31991i;
    public int f31992j;

    public w4(View view) {
        this.f31989f = 200L;
        this.f31990g = gr.f26495f;
        this.f31986a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f31989f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f31992j = this.f31988c;
                this.f31991i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f31988c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.u.a(((float) (elapsedRealtime - this.f31991i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f31991i >= 0) {
                TimeInterpolator timeInterpolator = this.f31990g;
                if (timeInterpolator == null) {
                    this.f31988c = i0.b.f(a2, this.f31992j, this.d);
                } else {
                    this.f31988c = i0.b.f(timeInterpolator.getInterpolation(a2), this.f31992j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f31986a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f31987b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f31988c;
    }

    public w4(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f31989f = 200L;
        gr grVar = gr.f26495f;
        this.f31986a = view;
        this.f31989f = j10;
        this.f31990g = timeInterpolator;
        this.e = true;
    }

    public w4(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f31989f = 200L;
        gr grVar = gr.f26495f;
        this.f31986a = view;
        this.f31989f = j10;
        this.f31990g = timeInterpolator;
        this.e = true;
    }

    public w4(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f31989f = 200L;
        gr grVar = gr.f26495f;
        this.f31987b = runnable;
        this.f31989f = j10;
        this.f31990g = timeInterpolator;
        this.e = true;
    }
}
