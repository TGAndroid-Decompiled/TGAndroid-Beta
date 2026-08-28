package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class b5 {
    public final View f27035a;
    public final Runnable f27036b;
    public int f27037c;
    public int d;
    public boolean f27038e;
    public final long f27039f;
    public final TimeInterpolator f27040g;
    public boolean h;
    public long f27041i;
    public int f27042j;

    public b5(View view) {
        this.f27039f = 200L;
        this.f27040g = gr.f28844f;
        this.f27035a = view;
        this.f27038e = true;
    }

    public final int a(int i9, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27039f;
        if (!z10 && j10 > 0 && !this.f27038e) {
            if (this.d != i9) {
                this.h = true;
                this.d = i9;
                this.f27042j = this.f27037c;
                this.f27041i = elapsedRealtime;
            }
        } else {
            this.d = i9;
            this.f27037c = i9;
            this.h = false;
            this.f27038e = false;
        }
        if (this.h) {
            float a2 = g7.n.a(((float) (elapsedRealtime - this.f27041i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27041i >= 0) {
                TimeInterpolator timeInterpolator = this.f27040g;
                if (timeInterpolator == null) {
                    this.f27037c = i0.a.d(a2, this.f27042j, this.d);
                } else {
                    this.f27037c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27042j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27035a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27036b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27037c;
    }

    public b5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27039f = 200L;
        gr grVar = gr.f28844f;
        this.f27035a = view;
        this.f27039f = j10;
        this.f27040g = timeInterpolator;
        this.f27038e = true;
    }

    public b5(View view, long j10, TimeInterpolator timeInterpolator, int i9) {
        this.f27039f = 200L;
        gr grVar = gr.f28844f;
        this.f27035a = view;
        this.f27039f = j10;
        this.f27040g = timeInterpolator;
        this.f27038e = true;
    }

    public b5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27039f = 200L;
        gr grVar = gr.f28844f;
        this.f27036b = runnable;
        this.f27039f = j10;
        this.f27040g = timeInterpolator;
        this.f27038e = true;
    }
}
