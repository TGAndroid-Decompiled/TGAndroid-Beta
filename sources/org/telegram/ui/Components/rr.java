package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class rr implements Drawable.Callback {
    public final int f30499a;
    public final sr f30500b;

    public rr(sr srVar, int i10) {
        this.f30499a = i10;
        this.f30500b = srVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f30499a) {
            case 0:
                sr srVar = this.f30500b;
                if (srVar.f30870c < 1.0f) {
                    srVar.invalidateSelf();
                    return;
                }
                return;
            default:
                sr srVar2 = this.f30500b;
                if (srVar2.f30870c > 0.0f) {
                    srVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f30499a) {
            case 0:
                sr srVar = this.f30500b;
                if (srVar.f30870c < 1.0f) {
                    srVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                sr srVar2 = this.f30500b;
                if (srVar2.f30870c > 0.0f) {
                    srVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f30499a) {
            case 0:
                sr srVar = this.f30500b;
                if (srVar.f30870c < 1.0f) {
                    srVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                sr srVar2 = this.f30500b;
                if (srVar2.f30870c > 0.0f) {
                    srVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
