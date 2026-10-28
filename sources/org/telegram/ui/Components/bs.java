package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class bs implements Drawable.Callback {
    public final int f26901a;
    public final cs f26902b;

    public bs(cs csVar, int i10) {
        this.f26901a = i10;
        this.f26902b = csVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f26901a) {
            case 0:
                cs csVar = this.f26902b;
                if (csVar.f27241c < 1.0f) {
                    csVar.invalidateSelf();
                    return;
                }
                return;
            default:
                cs csVar2 = this.f26902b;
                if (csVar2.f27241c > 0.0f) {
                    csVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f26901a) {
            case 0:
                cs csVar = this.f26902b;
                if (csVar.f27241c < 1.0f) {
                    csVar.scheduleSelf(runnable, j10);
                    return;
                }
                return;
            default:
                cs csVar2 = this.f26902b;
                if (csVar2.f27241c > 0.0f) {
                    csVar2.scheduleSelf(runnable, j10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f26901a) {
            case 0:
                cs csVar = this.f26902b;
                if (csVar.f27241c < 1.0f) {
                    csVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                cs csVar2 = this.f26902b;
                if (csVar2.f27241c > 0.0f) {
                    csVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
