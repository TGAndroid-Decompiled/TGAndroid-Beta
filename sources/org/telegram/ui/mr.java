package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class mr implements Drawable.Callback {
    public final int f40627a;
    public final Drawable f40628b;

    public mr(int i10, Drawable drawable) {
        this.f40627a = i10;
        this.f40628b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f40627a) {
            case 0:
                ((nr) this.f40628b).invalidateSelf();
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((h01) this.f40628b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f40627a) {
            case 0:
                ((nr) this.f40628b).scheduleSelf(runnable, j10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f40627a) {
            case 0:
                ((nr) this.f40628b).unscheduleSelf(runnable);
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
