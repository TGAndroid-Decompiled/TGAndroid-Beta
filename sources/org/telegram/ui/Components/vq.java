package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class vq implements Drawable.Callback {
    public final int f39766a;
    public final wq f39767b;

    public vq(wq wqVar, int i3) {
        this.f39766a = i3;
        this.f39767b = wqVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39766a) {
            case 0:
                wq wqVar = this.f39767b;
                if (wqVar.f40055c < 1.0f) {
                    wqVar.invalidateSelf();
                    return;
                }
                return;
            default:
                wq wqVar2 = this.f39767b;
                if (wqVar2.f40055c > 0.0f) {
                    wqVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f39766a) {
            case 0:
                wq wqVar = this.f39767b;
                if (wqVar.f40055c < 1.0f) {
                    wqVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                wq wqVar2 = this.f39767b;
                if (wqVar2.f40055c > 0.0f) {
                    wqVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39766a) {
            case 0:
                wq wqVar = this.f39767b;
                if (wqVar.f40055c < 1.0f) {
                    wqVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                wq wqVar2 = this.f39767b;
                if (wqVar2.f40055c > 0.0f) {
                    wqVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
