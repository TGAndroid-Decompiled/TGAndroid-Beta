package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class ur implements Drawable.Callback {
    public final int f27739a;
    public final vr f27740b;

    public ur(vr vrVar, int i10) {
        this.f27739a = i10;
        this.f27740b = vrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f27739a) {
            case 0:
                vr vrVar = this.f27740b;
                if (vrVar.f28591c < 1.0f) {
                    vrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                vr vrVar2 = this.f27740b;
                if (vrVar2.f28591c > 0.0f) {
                    vrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f27739a) {
            case 0:
                vr vrVar = this.f27740b;
                if (vrVar.f28591c < 1.0f) {
                    vrVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                vr vrVar2 = this.f27740b;
                if (vrVar2.f28591c > 0.0f) {
                    vrVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f27739a) {
            case 0:
                vr vrVar = this.f27740b;
                if (vrVar.f28591c < 1.0f) {
                    vrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                vr vrVar2 = this.f27740b;
                if (vrVar2.f28591c > 0.0f) {
                    vrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
