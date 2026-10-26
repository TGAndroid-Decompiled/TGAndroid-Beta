package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class pr implements Drawable.Callback {
    public final int f42645a;
    public final Drawable f42646b;

    public pr(int i10, Drawable drawable) {
        this.f42645a = i10;
        this.f42646b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f42645a) {
            case 0:
                ((qr) this.f42646b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((v01) this.f42646b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f42645a) {
            case 0:
                ((qr) this.f42646b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f42645a) {
            case 0:
                ((qr) this.f42646b).unscheduleSelf(runnable);
                return;
            default:
                return;
        }
    }

    private final void b(Drawable drawable, Runnable runnable) {
    }

    private final void a(Drawable drawable, Runnable runnable, long j10) {
    }
}
