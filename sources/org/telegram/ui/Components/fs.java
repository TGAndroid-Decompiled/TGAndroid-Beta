package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class fs implements Drawable.Callback {
    public final int f26476a;
    public final gs f26477b;

    public fs(gs gsVar, int i10) {
        this.f26476a = i10;
        this.f26477b = gsVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f26476a) {
            case 0:
                gs gsVar = this.f26477b;
                if (gsVar.f26867c < 1.0f) {
                    gsVar.invalidateSelf();
                    return;
                }
                return;
            default:
                gs gsVar2 = this.f26477b;
                if (gsVar2.f26867c > 0.0f) {
                    gsVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f26476a) {
            case 0:
                gs gsVar = this.f26477b;
                if (gsVar.f26867c < 1.0f) {
                    gsVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                gs gsVar2 = this.f26477b;
                if (gsVar2.f26867c > 0.0f) {
                    gsVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f26476a) {
            case 0:
                gs gsVar = this.f26477b;
                if (gsVar.f26867c < 1.0f) {
                    gsVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                gs gsVar2 = this.f26477b;
                if (gsVar2.f26867c > 0.0f) {
                    gsVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
