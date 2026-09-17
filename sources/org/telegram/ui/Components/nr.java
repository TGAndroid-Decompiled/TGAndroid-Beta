package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class nr implements Drawable.Callback {
    public final int f28854a;
    public final or f28855b;

    public nr(or orVar, int i10) {
        this.f28854a = i10;
        this.f28855b = orVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f28854a) {
            case 0:
                or orVar = this.f28855b;
                if (orVar.f29172c < 1.0f) {
                    orVar.invalidateSelf();
                    return;
                }
                return;
            default:
                or orVar2 = this.f28855b;
                if (orVar2.f29172c > 0.0f) {
                    orVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f28854a) {
            case 0:
                or orVar = this.f28855b;
                if (orVar.f29172c < 1.0f) {
                    orVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                or orVar2 = this.f28855b;
                if (orVar2.f29172c > 0.0f) {
                    orVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f28854a) {
            case 0:
                or orVar = this.f28855b;
                if (orVar.f29172c < 1.0f) {
                    orVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                or orVar2 = this.f28855b;
                if (orVar2.f29172c > 0.0f) {
                    orVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
