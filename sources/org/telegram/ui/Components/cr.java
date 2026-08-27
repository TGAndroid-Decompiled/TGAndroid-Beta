package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;

public final class cr implements Drawable.Callback {

    public final int f27533a;

    public final dr f27534b;

    public cr(dr drVar, int i10) {
        this.f27533a = i10;
        this.f27534b = drVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f27533a) {
            case 0:
                dr drVar = this.f27534b;
                if (drVar.f27834c < 1.0f) {
                    drVar.invalidateSelf();
                }
                break;
            default:
                dr drVar2 = this.f27534b;
                if (drVar2.f27834c > 0.0f) {
                    drVar2.invalidateSelf();
                }
                break;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f27533a) {
            case 0:
                dr drVar = this.f27534b;
                if (drVar.f27834c < 1.0f) {
                    drVar.scheduleSelf(runnable, j10);
                }
                break;
            default:
                dr drVar2 = this.f27534b;
                if (drVar2.f27834c > 0.0f) {
                    drVar2.scheduleSelf(runnable, j10);
                }
                break;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f27533a) {
            case 0:
                dr drVar = this.f27534b;
                if (drVar.f27834c < 1.0f) {
                    drVar.unscheduleSelf(runnable);
                }
                break;
            default:
                dr drVar2 = this.f27534b;
                if (drVar2.f27834c > 0.0f) {
                    drVar2.unscheduleSelf(runnable);
                }
                break;
        }
    }
}
