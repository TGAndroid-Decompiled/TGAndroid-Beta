package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class er implements Drawable.Callback {
    public final int f25852a;
    public final fr f25853b;

    public er(fr frVar, int i10) {
        this.f25852a = i10;
        this.f25853b = frVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f25852a) {
            case 0:
                fr frVar = this.f25853b;
                if (frVar.f26122c < 1.0f) {
                    frVar.invalidateSelf();
                    return;
                }
                return;
            default:
                fr frVar2 = this.f25853b;
                if (frVar2.f26122c > 0.0f) {
                    frVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f25852a) {
            case 0:
                fr frVar = this.f25853b;
                if (frVar.f26122c < 1.0f) {
                    frVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                fr frVar2 = this.f25853b;
                if (frVar2.f26122c > 0.0f) {
                    frVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f25852a) {
            case 0:
                fr frVar = this.f25853b;
                if (frVar.f26122c < 1.0f) {
                    frVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                fr frVar2 = this.f25853b;
                if (frVar2.f26122c > 0.0f) {
                    frVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
