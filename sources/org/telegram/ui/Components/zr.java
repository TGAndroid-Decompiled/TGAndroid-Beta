package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class zr implements Drawable.Callback {
    public final int f33009a;
    public final as f33010b;

    public zr(as asVar, int i10) {
        this.f33009a = i10;
        this.f33010b = asVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f33009a) {
            case 0:
                as asVar = this.f33010b;
                if (asVar.f24703c < 1.0f) {
                    asVar.invalidateSelf();
                    return;
                }
                return;
            default:
                as asVar2 = this.f33010b;
                if (asVar2.f24703c > 0.0f) {
                    asVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f33009a) {
            case 0:
                as asVar = this.f33010b;
                if (asVar.f24703c < 1.0f) {
                    asVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                as asVar2 = this.f33010b;
                if (asVar2.f24703c > 0.0f) {
                    asVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f33009a) {
            case 0:
                as asVar = this.f33010b;
                if (asVar.f24703c < 1.0f) {
                    asVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                as asVar2 = this.f33010b;
                if (asVar2.f24703c > 0.0f) {
                    asVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
