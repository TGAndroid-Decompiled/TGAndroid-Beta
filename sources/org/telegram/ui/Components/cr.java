package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class cr implements Drawable.Callback {
    public final int f33668a;
    public final dr f33669b;

    public cr(dr drVar, int i7) {
        this.f33668a = i7;
        this.f33669b = drVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f33668a) {
            case 0:
                dr drVar = this.f33669b;
                if (drVar.f34041c < 1.0f) {
                    drVar.invalidateSelf();
                    return;
                }
                return;
            default:
                dr drVar2 = this.f33669b;
                if (drVar2.f34041c > 0.0f) {
                    drVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f33668a) {
            case 0:
                dr drVar = this.f33669b;
                if (drVar.f34041c < 1.0f) {
                    drVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                dr drVar2 = this.f33669b;
                if (drVar2.f34041c > 0.0f) {
                    drVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f33668a) {
            case 0:
                dr drVar = this.f33669b;
                if (drVar.f34041c < 1.0f) {
                    drVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                dr drVar2 = this.f33669b;
                if (drVar2.f34041c > 0.0f) {
                    drVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
