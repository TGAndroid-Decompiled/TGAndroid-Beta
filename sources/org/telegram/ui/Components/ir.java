package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class ir implements Drawable.Callback {
    public final int f36078a;
    public final jr f36079b;

    public ir(jr jrVar, int i7) {
        this.f36078a = i7;
        this.f36079b = jrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f36078a) {
            case 0:
                jr jrVar = this.f36079b;
                if (jrVar.f36498c < 1.0f) {
                    jrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                jr jrVar2 = this.f36079b;
                if (jrVar2.f36498c > 0.0f) {
                    jrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f36078a) {
            case 0:
                jr jrVar = this.f36079b;
                if (jrVar.f36498c < 1.0f) {
                    jrVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                jr jrVar2 = this.f36079b;
                if (jrVar2.f36498c > 0.0f) {
                    jrVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f36078a) {
            case 0:
                jr jrVar = this.f36079b;
                if (jrVar.f36498c < 1.0f) {
                    jrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                jr jrVar2 = this.f36079b;
                if (jrVar2.f36498c > 0.0f) {
                    jrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
