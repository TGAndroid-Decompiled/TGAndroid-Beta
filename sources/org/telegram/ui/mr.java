package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class mr implements Drawable.Callback {
    public final int f40506a;
    public final Drawable f40507b;

    public mr(int i9, Drawable drawable) {
        this.f40506a = i9;
        this.f40507b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f40506a) {
            case 0:
                ((nr) this.f40507b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.w0 w0Var = ((g01) this.f40507b).h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f40506a) {
            case 0:
                ((nr) this.f40507b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f40506a) {
            case 0:
                ((nr) this.f40507b).unscheduleSelf(runnable);
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
