package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class xr implements Drawable.Callback {
    public final int f32687a;
    public final yr f32688b;

    public xr(yr yrVar, int i10) {
        this.f32687a = i10;
        this.f32688b = yrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f32687a) {
            case 0:
                yr yrVar = this.f32688b;
                if (yrVar.f33027c < 1.0f) {
                    yrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                yr yrVar2 = this.f32688b;
                if (yrVar2.f33027c > 0.0f) {
                    yrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f32687a) {
            case 0:
                yr yrVar = this.f32688b;
                if (yrVar.f33027c < 1.0f) {
                    yrVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                yr yrVar2 = this.f32688b;
                if (yrVar2.f33027c > 0.0f) {
                    yrVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f32687a) {
            case 0:
                yr yrVar = this.f32688b;
                if (yrVar.f33027c < 1.0f) {
                    yrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                yr yrVar2 = this.f32688b;
                if (yrVar2.f33027c > 0.0f) {
                    yrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
