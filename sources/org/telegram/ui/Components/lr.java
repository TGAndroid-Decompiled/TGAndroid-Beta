package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class lr implements Drawable.Callback {
    public final int f26876a;
    public final mr f26877b;

    public lr(mr mrVar, int i10) {
        this.f26876a = i10;
        this.f26877b = mrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f26876a) {
            case 0:
                mr mrVar = this.f26877b;
                if (mrVar.f27111c < 1.0f) {
                    mrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f26877b;
                if (mrVar2.f27111c > 0.0f) {
                    mrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f26876a) {
            case 0:
                mr mrVar = this.f26877b;
                if (mrVar.f27111c < 1.0f) {
                    mrVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f26877b;
                if (mrVar2.f27111c > 0.0f) {
                    mrVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f26876a) {
            case 0:
                mr mrVar = this.f26877b;
                if (mrVar.f27111c < 1.0f) {
                    mrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f26877b;
                if (mrVar2.f27111c > 0.0f) {
                    mrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
