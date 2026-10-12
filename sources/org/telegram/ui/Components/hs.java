package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class hs implements Drawable.Callback {
    public final int f26885a;
    public final is f26886b;

    public hs(is isVar, int i10) {
        this.f26885a = i10;
        this.f26886b = isVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f26885a) {
            case 0:
                is isVar = this.f26886b;
                if (isVar.f27268c < 1.0f) {
                    isVar.invalidateSelf();
                    return;
                }
                return;
            default:
                is isVar2 = this.f26886b;
                if (isVar2.f27268c > 0.0f) {
                    isVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f26885a) {
            case 0:
                is isVar = this.f26886b;
                if (isVar.f27268c < 1.0f) {
                    isVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                is isVar2 = this.f26886b;
                if (isVar2.f27268c > 0.0f) {
                    isVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f26885a) {
            case 0:
                is isVar = this.f26886b;
                if (isVar.f27268c < 1.0f) {
                    isVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                is isVar2 = this.f26886b;
                if (isVar2.f27268c > 0.0f) {
                    isVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
