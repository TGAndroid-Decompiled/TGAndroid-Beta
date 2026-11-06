package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class vq implements Drawable.Callback {
    public final int f39646a;
    public final wq f39647b;

    public vq(wq wqVar, int i7) {
        this.f39646a = i7;
        this.f39647b = wqVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39646a) {
            case 0:
                wq wqVar = this.f39647b;
                if (wqVar.f40072c < 1.0f) {
                    wqVar.invalidateSelf();
                    return;
                }
                return;
            default:
                wq wqVar2 = this.f39647b;
                if (wqVar2.f40072c > 0.0f) {
                    wqVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f39646a) {
            case 0:
                wq wqVar = this.f39647b;
                if (wqVar.f40072c < 1.0f) {
                    wqVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                wq wqVar2 = this.f39647b;
                if (wqVar2.f40072c > 0.0f) {
                    wqVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39646a) {
            case 0:
                wq wqVar = this.f39647b;
                if (wqVar.f40072c < 1.0f) {
                    wqVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                wq wqVar2 = this.f39647b;
                if (wqVar2.f40072c > 0.0f) {
                    wqVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
