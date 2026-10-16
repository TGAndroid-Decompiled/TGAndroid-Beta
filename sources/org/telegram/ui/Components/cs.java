package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class cs implements Drawable.Callback {
    public final int f23885a;
    public final ds f23886b;

    public cs(ds dsVar, int i10) {
        this.f23885a = i10;
        this.f23886b = dsVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f23885a) {
            case 0:
                ds dsVar = this.f23886b;
                if (dsVar.f24174c < 1.0f) {
                    dsVar.invalidateSelf();
                    return;
                }
                return;
            default:
                ds dsVar2 = this.f23886b;
                if (dsVar2.f24174c > 0.0f) {
                    dsVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f23885a) {
            case 0:
                ds dsVar = this.f23886b;
                if (dsVar.f24174c < 1.0f) {
                    dsVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                ds dsVar2 = this.f23886b;
                if (dsVar2.f24174c > 0.0f) {
                    dsVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f23885a) {
            case 0:
                ds dsVar = this.f23886b;
                if (dsVar.f24174c < 1.0f) {
                    dsVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                ds dsVar2 = this.f23886b;
                if (dsVar2.f24174c > 0.0f) {
                    dsVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
