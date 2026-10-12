package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class bs implements Drawable.Callback {
    public final int f34621a;
    public final Drawable f34622b;

    public bs(int i10, Drawable drawable) {
        this.f34621a = i10;
        this.f34622b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f34621a) {
            case 0:
                ((cs) this.f34622b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.x0 x0Var = ((q11) this.f34622b).h;
                if (x0Var != null) {
                    x0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f34621a) {
            case 0:
                ((cs) this.f34622b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f34621a) {
            case 0:
                ((cs) this.f34622b).unscheduleSelf(runnable);
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
