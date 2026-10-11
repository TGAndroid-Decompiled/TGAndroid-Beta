package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class gs implements Drawable.Callback {
    public final int f26814a;
    public final hs f26815b;

    public gs(hs hsVar, int i10) {
        this.f26814a = i10;
        this.f26815b = hsVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f26814a) {
            case 0:
                hs hsVar = this.f26815b;
                if (hsVar.f27067c < 1.0f) {
                    hsVar.invalidateSelf();
                    return;
                }
                return;
            default:
                hs hsVar2 = this.f26815b;
                if (hsVar2.f27067c > 0.0f) {
                    hsVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f26814a) {
            case 0:
                hs hsVar = this.f26815b;
                if (hsVar.f27067c < 1.0f) {
                    hsVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                hs hsVar2 = this.f26815b;
                if (hsVar2.f27067c > 0.0f) {
                    hsVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f26814a) {
            case 0:
                hs hsVar = this.f26815b;
                if (hsVar.f27067c < 1.0f) {
                    hsVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                hs hsVar2 = this.f26815b;
                if (hsVar2.f27067c > 0.0f) {
                    hsVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
