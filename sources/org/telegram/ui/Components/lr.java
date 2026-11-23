package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class lr implements Drawable.Callback {
    public final int f37223a;
    public final mr f37224b;

    public lr(mr mrVar, int i7) {
        this.f37223a = i7;
        this.f37224b = mrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f37223a) {
            case 0:
                mr mrVar = this.f37224b;
                if (mrVar.f37575c < 1.0f) {
                    mrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f37224b;
                if (mrVar2.f37575c > 0.0f) {
                    mrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f37223a) {
            case 0:
                mr mrVar = this.f37224b;
                if (mrVar.f37575c < 1.0f) {
                    mrVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f37224b;
                if (mrVar2.f37575c > 0.0f) {
                    mrVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f37223a) {
            case 0:
                mr mrVar = this.f37224b;
                if (mrVar.f37575c < 1.0f) {
                    mrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f37224b;
                if (mrVar2.f37575c > 0.0f) {
                    mrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
