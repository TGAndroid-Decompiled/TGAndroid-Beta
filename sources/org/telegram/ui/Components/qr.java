package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class qr implements Drawable.Callback {
    public final int f27751a;
    public final rr f27752b;

    public qr(rr rrVar, int i10) {
        this.f27751a = i10;
        this.f27752b = rrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f27751a) {
            case 0:
                rr rrVar = this.f27752b;
                if (rrVar.f28047c < 1.0f) {
                    rrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                rr rrVar2 = this.f27752b;
                if (rrVar2.f28047c > 0.0f) {
                    rrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f27751a) {
            case 0:
                rr rrVar = this.f27752b;
                if (rrVar.f28047c < 1.0f) {
                    rrVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                rr rrVar2 = this.f27752b;
                if (rrVar2.f28047c > 0.0f) {
                    rrVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f27751a) {
            case 0:
                rr rrVar = this.f27752b;
                if (rrVar.f28047c < 1.0f) {
                    rrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                rr rrVar2 = this.f27752b;
                if (rrVar2.f28047c > 0.0f) {
                    rrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
