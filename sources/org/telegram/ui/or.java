package org.telegram.ui;

import android.graphics.drawable.Drawable;

public final class or implements Drawable.Callback {

    public final int f41157a;

    public final Drawable f41158b;

    public or(int i10, Drawable drawable) {
        this.f41157a = i10;
        this.f41158b = drawable;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f41157a) {
            case 0:
                ((pr) this.f41158b).invalidateSelf();
                break;
            default:
                org.telegram.ui.Cells.v0 v0Var = ((h01) this.f41158b).h;
                if (v0Var != null) {
                    v0Var.invalidate();
                }
                break;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f41157a) {
            case 0:
                ((pr) this.f41158b).scheduleSelf(runnable, j10);
                break;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f41157a) {
            case 0:
                ((pr) this.f41158b).unscheduleSelf(runnable);
                break;
        }
    }

    private final void b(Drawable drawable, Runnable runnable) {
    }

    private final void a(Drawable drawable, Runnable runnable, long j10) {
    }
}
