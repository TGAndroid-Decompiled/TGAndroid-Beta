package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class jr implements Drawable.Callback {
    public final int f36515a;
    public final kr f36516b;

    public jr(kr krVar, int i7) {
        this.f36515a = i7;
        this.f36516b = krVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f36515a) {
            case 0:
                kr krVar = this.f36516b;
                if (krVar.f36865c < 1.0f) {
                    krVar.invalidateSelf();
                    return;
                }
                return;
            default:
                kr krVar2 = this.f36516b;
                if (krVar2.f36865c > 0.0f) {
                    krVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f36515a) {
            case 0:
                kr krVar = this.f36516b;
                if (krVar.f36865c < 1.0f) {
                    krVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                kr krVar2 = this.f36516b;
                if (krVar2.f36865c > 0.0f) {
                    krVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f36515a) {
            case 0:
                kr krVar = this.f36516b;
                if (krVar.f36865c < 1.0f) {
                    krVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                kr krVar2 = this.f36516b;
                if (krVar2.f36865c > 0.0f) {
                    krVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
