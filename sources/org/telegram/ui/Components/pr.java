package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class pr implements Drawable.Callback {
    public final int f27121a;
    public final qr f27122b;

    public pr(qr qrVar, int i10) {
        this.f27121a = i10;
        this.f27122b = qrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f27121a) {
            case 0:
                qr qrVar = this.f27122b;
                if (qrVar.f27437c < 1.0f) {
                    qrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                qr qrVar2 = this.f27122b;
                if (qrVar2.f27437c > 0.0f) {
                    qrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f27121a) {
            case 0:
                qr qrVar = this.f27122b;
                if (qrVar.f27437c < 1.0f) {
                    qrVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                qr qrVar2 = this.f27122b;
                if (qrVar2.f27437c > 0.0f) {
                    qrVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f27121a) {
            case 0:
                qr qrVar = this.f27122b;
                if (qrVar.f27437c < 1.0f) {
                    qrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                qr qrVar2 = this.f27122b;
                if (qrVar2.f27437c > 0.0f) {
                    qrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
