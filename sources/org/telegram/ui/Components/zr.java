package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class zr implements Drawable.Callback {
    public final int f33025a;
    public final as f33026b;

    public zr(as asVar, int i10) {
        this.f33025a = i10;
        this.f33026b = asVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f33025a) {
            case 0:
                as asVar = this.f33026b;
                if (asVar.f24707c < 1.0f) {
                    asVar.invalidateSelf();
                    return;
                }
                return;
            default:
                as asVar2 = this.f33026b;
                if (asVar2.f24707c > 0.0f) {
                    asVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f33025a) {
            case 0:
                as asVar = this.f33026b;
                if (asVar.f24707c < 1.0f) {
                    asVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                as asVar2 = this.f33026b;
                if (asVar2.f24707c > 0.0f) {
                    asVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f33025a) {
            case 0:
                as asVar = this.f33026b;
                if (asVar.f24707c < 1.0f) {
                    asVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                as asVar2 = this.f33026b;
                if (asVar2.f24707c > 0.0f) {
                    asVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
