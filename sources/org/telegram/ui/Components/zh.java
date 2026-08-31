package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
public final class zh extends ra0 {
    public final int S;
    public final KeyEvent.Callback T;

    public zh(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, j10, 0L, p2Var, g6Var);
        this.S = i10;
        this.T = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.S) {
            case 1:
                qh.k kVar = (qh.k) this.T;
                Paint paint = kVar.f45515e;
                RectF rectF = kVar.f45538w0;
                rectF.set(rect);
                if (kVar.g()) {
                    kVar.h(kVar.Q, canvas, kVar.f45538w0, f10, false, -kVar.J.getX(), -kVar.J.getY(), false);
                    return;
                }
                Paint c3 = kVar.Q.c(1.0f);
                if (c3 == null) {
                    paint.setAlpha(128);
                    canvas.drawRoundRect(rectF, f10, f10, paint);
                    return;
                }
                canvas.drawRoundRect(rectF, f10, f10, c3);
                paint.setAlpha(80);
                canvas.drawRoundRect(rectF, f10, f10, paint);
                return;
            default:
                super.f(canvas, rect, f10);
                return;
        }
    }

    @Override
    public boolean h() {
        switch (this.S) {
            case 1:
                return true;
            default:
                return super.h();
        }
    }

    @Override
    public void i() {
        switch (this.S) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((mi) this.T).f29054g0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void n(boolean z4) {
        switch (this.S) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((mi) this.T).f29054g0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
