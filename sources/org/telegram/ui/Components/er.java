package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class er implements Drawable.Callback {
    public final int f28109a;
    public final fr f28110b;

    public er(fr frVar, int i9) {
        this.f28109a = i9;
        this.f28110b = frVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f28109a) {
            case 0:
                fr frVar = this.f28110b;
                if (frVar.f28558c < 1.0f) {
                    frVar.invalidateSelf();
                    return;
                }
                return;
            default:
                fr frVar2 = this.f28110b;
                if (frVar2.f28558c > 0.0f) {
                    frVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f28109a) {
            case 0:
                fr frVar = this.f28110b;
                if (frVar.f28558c < 1.0f) {
                    frVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                fr frVar2 = this.f28110b;
                if (frVar2.f28558c > 0.0f) {
                    frVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f28109a) {
            case 0:
                fr frVar = this.f28110b;
                if (frVar.f28558c < 1.0f) {
                    frVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                fr frVar2 = this.f28110b;
                if (frVar2.f28558c > 0.0f) {
                    frVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
