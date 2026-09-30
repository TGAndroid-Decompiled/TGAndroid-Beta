package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class rr implements Drawable.Callback {
    public final int f28119a;
    public final sr f28120b;

    public rr(sr srVar, int i10) {
        this.f28119a = i10;
        this.f28120b = srVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f28119a) {
            case 0:
                sr srVar = this.f28120b;
                if (srVar.f28333c < 1.0f) {
                    srVar.invalidateSelf();
                    return;
                }
                return;
            default:
                sr srVar2 = this.f28120b;
                if (srVar2.f28333c > 0.0f) {
                    srVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f28119a) {
            case 0:
                sr srVar = this.f28120b;
                if (srVar.f28333c < 1.0f) {
                    srVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                sr srVar2 = this.f28120b;
                if (srVar2.f28333c > 0.0f) {
                    srVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f28119a) {
            case 0:
                sr srVar = this.f28120b;
                if (srVar.f28333c < 1.0f) {
                    srVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                sr srVar2 = this.f28120b;
                if (srVar2.f28333c > 0.0f) {
                    srVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
