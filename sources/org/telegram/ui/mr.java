package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class mr implements Drawable.Callback {
    public final int f39643a;
    public final Drawable f39644b;

    public mr(int i10, Drawable drawable) {
        this.f39643a = i10;
        this.f39644b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39643a) {
            case 0:
                ((nr) this.f39644b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((q01) this.f39644b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f39643a) {
            case 0:
                ((nr) this.f39644b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39643a) {
            case 0:
                ((nr) this.f39644b).unscheduleSelf(runnable);
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
