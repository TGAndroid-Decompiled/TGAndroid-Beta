package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class nr implements Drawable.Callback {
    public final int f29566a;
    public final or f29567b;

    public nr(or orVar, int i10) {
        this.f29566a = i10;
        this.f29567b = orVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f29566a) {
            case 0:
                or orVar = this.f29567b;
                if (orVar.f29874c < 1.0f) {
                    orVar.invalidateSelf();
                    return;
                }
                return;
            default:
                or orVar2 = this.f29567b;
                if (orVar2.f29874c > 0.0f) {
                    orVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f29566a) {
            case 0:
                or orVar = this.f29567b;
                if (orVar.f29874c < 1.0f) {
                    orVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                or orVar2 = this.f29567b;
                if (orVar2.f29874c > 0.0f) {
                    orVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f29566a) {
            case 0:
                or orVar = this.f29567b;
                if (orVar.f29874c < 1.0f) {
                    orVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                or orVar2 = this.f29567b;
                if (orVar2.f29874c > 0.0f) {
                    orVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
