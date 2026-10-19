package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class kr implements Drawable.Callback {
    public final int f38651a;
    public final Drawable f38652b;

    public kr(int i10, Drawable drawable) {
        this.f38651a = i10;
        this.f38652b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f38651a) {
            case 0:
                ((lr) this.f38652b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((n01) this.f38652b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f38651a) {
            case 0:
                ((lr) this.f38652b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f38651a) {
            case 0:
                ((lr) this.f38652b).unscheduleSelf(runnable);
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
