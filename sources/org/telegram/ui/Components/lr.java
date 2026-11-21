package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class lr implements Drawable.Callback {
    public final int f37260a;
    public final mr f37261b;

    public lr(mr mrVar, int i7) {
        this.f37260a = i7;
        this.f37261b = mrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f37260a) {
            case 0:
                mr mrVar = this.f37261b;
                if (mrVar.f37622c < 1.0f) {
                    mrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f37261b;
                if (mrVar2.f37622c > 0.0f) {
                    mrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f37260a) {
            case 0:
                mr mrVar = this.f37261b;
                if (mrVar.f37622c < 1.0f) {
                    mrVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f37261b;
                if (mrVar2.f37622c > 0.0f) {
                    mrVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f37260a) {
            case 0:
                mr mrVar = this.f37261b;
                if (mrVar.f37622c < 1.0f) {
                    mrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                mr mrVar2 = this.f37261b;
                if (mrVar2.f37622c > 0.0f) {
                    mrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
