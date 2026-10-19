package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class zr implements Drawable.Callback {
    public final int f33026a;
    public final as f33027b;

    public zr(as asVar, int i10) {
        this.f33026a = i10;
        this.f33027b = asVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f33026a) {
            case 0:
                as asVar = this.f33027b;
                if (asVar.f24691c < 1.0f) {
                    asVar.invalidateSelf();
                    return;
                }
                return;
            default:
                as asVar2 = this.f33027b;
                if (asVar2.f24691c > 0.0f) {
                    asVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f33026a) {
            case 0:
                as asVar = this.f33027b;
                if (asVar.f24691c < 1.0f) {
                    asVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                as asVar2 = this.f33027b;
                if (asVar2.f24691c > 0.0f) {
                    asVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f33026a) {
            case 0:
                as asVar = this.f33027b;
                if (asVar.f24691c < 1.0f) {
                    asVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                as asVar2 = this.f33027b;
                if (asVar2.f24691c > 0.0f) {
                    asVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
