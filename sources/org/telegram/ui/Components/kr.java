package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class kr implements Drawable.Callback {
    public final int f26386a;
    public final lr f26387b;

    public kr(lr lrVar, int i10) {
        this.f26386a = i10;
        this.f26387b = lrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f26386a) {
            case 0:
                lr lrVar = this.f26387b;
                if (lrVar.f26868c < 1.0f) {
                    lrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                lr lrVar2 = this.f26387b;
                if (lrVar2.f26868c > 0.0f) {
                    lrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f26386a) {
            case 0:
                lr lrVar = this.f26387b;
                if (lrVar.f26868c < 1.0f) {
                    lrVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                lr lrVar2 = this.f26387b;
                if (lrVar2.f26868c > 0.0f) {
                    lrVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f26386a) {
            case 0:
                lr lrVar = this.f26387b;
                if (lrVar.f26868c < 1.0f) {
                    lrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                lr lrVar2 = this.f26387b;
                if (lrVar2.f26868c > 0.0f) {
                    lrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
