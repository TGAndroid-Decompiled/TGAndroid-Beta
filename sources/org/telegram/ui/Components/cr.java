package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class cr implements Drawable.Callback {
    public final int f33666a;
    public final dr f33667b;

    public cr(dr drVar, int i7) {
        this.f33666a = i7;
        this.f33667b = drVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f33666a) {
            case 0:
                dr drVar = this.f33667b;
                if (drVar.f34054c < 1.0f) {
                    drVar.invalidateSelf();
                    return;
                }
                return;
            default:
                dr drVar2 = this.f33667b;
                if (drVar2.f34054c > 0.0f) {
                    drVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f33666a) {
            case 0:
                dr drVar = this.f33667b;
                if (drVar.f34054c < 1.0f) {
                    drVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                dr drVar2 = this.f33667b;
                if (drVar2.f34054c > 0.0f) {
                    drVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f33666a) {
            case 0:
                dr drVar = this.f33667b;
                if (drVar.f34054c < 1.0f) {
                    drVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                dr drVar2 = this.f33667b;
                if (drVar2.f34054c > 0.0f) {
                    drVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
