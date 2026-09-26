package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
public final class pr implements Drawable.Callback {
    public final int f27419a;
    public final qr f27420b;

    public pr(qr qrVar, int i10) {
        this.f27419a = i10;
        this.f27420b = qrVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f27419a) {
            case 0:
                qr qrVar = this.f27420b;
                if (qrVar.f27751c < 1.0f) {
                    qrVar.invalidateSelf();
                    return;
                }
                return;
            default:
                qr qrVar2 = this.f27420b;
                if (qrVar2.f27751c > 0.0f) {
                    qrVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f27419a) {
            case 0:
                qr qrVar = this.f27420b;
                if (qrVar.f27751c < 1.0f) {
                    qrVar.scheduleSelf(runnable, j3);
                    return;
                }
                return;
            default:
                qr qrVar2 = this.f27420b;
                if (qrVar2.f27751c > 0.0f) {
                    qrVar2.scheduleSelf(runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f27419a) {
            case 0:
                qr qrVar = this.f27420b;
                if (qrVar.f27751c < 1.0f) {
                    qrVar.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                qr qrVar2 = this.f27420b;
                if (qrVar2.f27751c > 0.0f) {
                    qrVar2.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}
