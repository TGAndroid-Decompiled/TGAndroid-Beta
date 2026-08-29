package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class hr implements Drawable.Callback {
    public final int f29216a;
    public final ir f29217b;

    public hr(ir irVar, int i10) {
        this.f29216a = i10;
        this.f29217b = irVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f29216a) {
            case 0:
                ir irVar = this.f29217b;
                if (irVar.f29455c < 1.0f) {
                    irVar.invalidateSelf();
                    return;
                }
                return;
            default:
                ir irVar2 = this.f29217b;
                if (irVar2.f29455c > 0.0f) {
                    irVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f29216a) {
            case 0:
                ir irVar = this.f29217b;
                if (irVar.f29455c < 1.0f) {
                    irVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                ir irVar2 = this.f29217b;
                if (irVar2.f29455c > 0.0f) {
                    irVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f29216a) {
            case 0:
                ir irVar = this.f29217b;
                if (irVar.f29455c < 1.0f) {
                    irVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                ir irVar2 = this.f29217b;
                if (irVar2.f29455c > 0.0f) {
                    irVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
