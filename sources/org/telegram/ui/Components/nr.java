package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class nr implements Drawable.Callback {
    public final int f29614a;
    public final or f29615b;

    public nr(or orVar, int i10) {
        this.f29614a = i10;
        this.f29615b = orVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f29614a) {
            case 0:
                or orVar = this.f29615b;
                if (orVar.f29840c < 1.0f) {
                    orVar.invalidateSelf();
                    return;
                }
                return;
            default:
                or orVar2 = this.f29615b;
                if (orVar2.f29840c > 0.0f) {
                    orVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f29614a) {
            case 0:
                or orVar = this.f29615b;
                if (orVar.f29840c < 1.0f) {
                    orVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                or orVar2 = this.f29615b;
                if (orVar2.f29840c > 0.0f) {
                    orVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f29614a) {
            case 0:
                or orVar = this.f29615b;
                if (orVar.f29840c < 1.0f) {
                    orVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                or orVar2 = this.f29615b;
                if (orVar2.f29840c > 0.0f) {
                    orVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
