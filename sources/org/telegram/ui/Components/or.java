package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class or implements Drawable.Callback {
    public final int f26838a;
    public final pr f26839b;

    public or(pr prVar, int i10) {
        this.f26838a = i10;
        this.f26839b = prVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f26838a) {
            case 0:
                pr prVar = this.f26839b;
                if (prVar.f27117c < 1.0f) {
                    prVar.invalidateSelf();
                    return;
                }
                return;
            default:
                pr prVar2 = this.f26839b;
                if (prVar2.f27117c > 0.0f) {
                    prVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f26838a) {
            case 0:
                pr prVar = this.f26839b;
                if (prVar.f27117c < 1.0f) {
                    prVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                pr prVar2 = this.f26839b;
                if (prVar2.f27117c > 0.0f) {
                    prVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f26838a) {
            case 0:
                pr prVar = this.f26839b;
                if (prVar.f27117c < 1.0f) {
                    prVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                pr prVar2 = this.f26839b;
                if (prVar2.f27117c > 0.0f) {
                    prVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
