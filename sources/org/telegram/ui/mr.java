package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class mr implements Drawable.Callback {
    public final int f39235a;
    public final Drawable f39236b;

    public mr(int i10, Drawable drawable) {
        this.f39235a = i10;
        this.f39236b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39235a) {
            case 0:
                ((nr) this.f39236b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.x0 x0Var = ((p01) this.f39236b).h;
                if (x0Var != null) {
                    x0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f39235a) {
            case 0:
                ((nr) this.f39236b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39235a) {
            case 0:
                ((nr) this.f39236b).unscheduleSelf(runnable);
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
