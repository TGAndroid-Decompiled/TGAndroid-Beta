package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class hs implements Drawable.Callback {
    public final int f26899a;
    public final is f26900b;

    public hs(is isVar, int i10) {
        this.f26899a = i10;
        this.f26900b = isVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f26899a) {
            case 0:
                is isVar = this.f26900b;
                if (isVar.f27274c < 1.0f) {
                    isVar.invalidateSelf();
                    return;
                }
                return;
            default:
                is isVar2 = this.f26900b;
                if (isVar2.f27274c > 0.0f) {
                    isVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f26899a) {
            case 0:
                is isVar = this.f26900b;
                if (isVar.f27274c < 1.0f) {
                    isVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                is isVar2 = this.f26900b;
                if (isVar2.f27274c > 0.0f) {
                    isVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f26899a) {
            case 0:
                is isVar = this.f26900b;
                if (isVar.f27274c < 1.0f) {
                    isVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                is isVar2 = this.f26900b;
                if (isVar2.f27274c > 0.0f) {
                    isVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
