package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class mr implements Drawable.Callback {
    public final int f39676a;
    public final Drawable f39677b;

    public mr(int i10, Drawable drawable) {
        this.f39676a = i10;
        this.f39677b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39676a) {
            case 0:
                ((nr) this.f39677b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((r01) this.f39677b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f39676a) {
            case 0:
                ((nr) this.f39677b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39676a) {
            case 0:
                ((nr) this.f39677b).unscheduleSelf(runnable);
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
