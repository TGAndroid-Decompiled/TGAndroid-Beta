package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class uq implements Drawable.Callback {
    public final int f38729a;
    public final vq f38730b;

    public uq(vq vqVar, int i7) {
        this.f38729a = i7;
        this.f38730b = vqVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f38729a) {
            case 0:
                vq vqVar = this.f38730b;
                if (vqVar.f39715c < 1.0f) {
                    vqVar.invalidateSelf();
                    return;
                }
                return;
            default:
                vq vqVar2 = this.f38730b;
                if (vqVar2.f39715c > 0.0f) {
                    vqVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f38729a) {
            case 0:
                vq vqVar = this.f38730b;
                if (vqVar.f39715c < 1.0f) {
                    vqVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                vq vqVar2 = this.f38730b;
                if (vqVar2.f39715c > 0.0f) {
                    vqVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f38729a) {
            case 0:
                vq vqVar = this.f38730b;
                if (vqVar.f39715c < 1.0f) {
                    vqVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                vq vqVar2 = this.f38730b;
                if (vqVar2.f39715c > 0.0f) {
                    vqVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
