package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f25931a;
    public final Runnable f25932b;
    public float f25933c;
    public float d;
    public boolean f25934e;
    public long f25935f;
    public long f25936g;
    public TimeInterpolator h;
    public boolean f25937i;
    public long f25938j;
    public float f25939k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        tr trVar = tr.f31140f;
        this.f25931a = null;
        this.f25936g = j3;
        this.h = timeInterpolator;
        this.f25934e = true;
    }

    public final void a(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        d(f7, true);
    }

    public final float b() {
        if (!this.f25937i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f25938j) - this.f25935f)) / ((float) this.f25936g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25937i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f25938j) - this.f25935f)) / ((float) this.f25936g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25938j >= this.f25935f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25933c = AndroidUtilities.lerp(this.f25939k, this.d, a2);
                } else {
                    this.f25933c = AndroidUtilities.lerp(this.f25939k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25937i = false;
            } else {
                View view = this.f25931a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25932b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25933c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25936g > 0 && !this.f25934e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25937i = true;
                this.d = f7;
                this.f25939k = this.f25933c;
                this.f25938j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25933c = f7;
            this.f25937i = false;
            this.f25934e = false;
        }
        return c();
    }

    public final float e(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return d(f7, false);
    }

    public final float f(boolean z10, boolean z11) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return d(f7, z11);
    }

    public e6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        tr trVar = tr.f31140f;
        this.f25931a = null;
        this.f25935f = j3;
        this.f25936g = j10;
        this.h = timeInterpolator;
        this.f25934e = true;
    }

    public e6(View view) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        this.h = tr.f31140f;
        this.f25931a = view;
        this.f25934e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        tr trVar = tr.f31140f;
        this.f25931a = view;
        this.f25936g = j3;
        this.h = timeInterpolator;
        this.f25934e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        tr trVar = tr.f31140f;
        this.f25931a = view;
        this.f25935f = j3;
        this.f25936g = j10;
        this.h = timeInterpolator;
        this.f25934e = true;
    }

    public e6(Runnable runnable) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        this.h = tr.f31140f;
        this.f25932b = runnable;
        this.f25934e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        tr trVar = tr.f31140f;
        this.f25932b = runnable;
        this.f25936g = j3;
        this.h = timeInterpolator;
        this.f25934e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        tr trVar = tr.f31140f;
        this.f25932b = runnable;
        this.f25935f = 0L;
        this.f25936g = j3;
        this.h = timeInterpolator;
        this.f25934e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        tr trVar = tr.f31140f;
        this.f25931a = view;
        this.d = f7;
        this.f25933c = f7;
        this.f25935f = j3;
        this.f25936g = j10;
        this.h = timeInterpolator;
        this.f25934e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25935f = 0L;
        this.f25936g = 200L;
        tr trVar = tr.f31140f;
        this.f25932b = runnable;
        this.d = f7;
        this.f25933c = f7;
        this.f25935f = j3;
        this.f25936g = j10;
        this.h = timeInterpolator;
        this.f25934e = false;
    }
}
