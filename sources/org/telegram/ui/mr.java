package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class mr implements Drawable.Callback {
    public final int f39220a;
    public final Drawable f39221b;

    public mr(int i10, Drawable drawable) {
        this.f39220a = i10;
        this.f39221b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f39220a) {
            case 0:
                ((nr) this.f39221b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((p01) this.f39221b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f39220a) {
            case 0:
                ((nr) this.f39221b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f39220a) {
            case 0:
                ((nr) this.f39221b).unscheduleSelf(runnable);
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
