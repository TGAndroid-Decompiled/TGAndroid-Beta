package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
public final class oh extends y90 {
    public final int V;
    public final KeyEvent.Callback W;

    public oh(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, j10, 0L, k2Var, p6Var);
        this.V = i10;
        this.W = callback;
    }

    @Override
    public void f(Canvas canvas, Rect rect, float f7) {
        switch (this.V) {
            case 1:
                vh.k kVar = (vh.k) this.W;
                Paint paint = kVar.e;
                RectF rectF = kVar.f51365y0;
                rectF.set(rect);
                if (kVar.g()) {
                    kVar.h(kVar.T, canvas, kVar.f51365y0, f7, false, -kVar.M.getX(), -kVar.M.getY(), false);
                    return;
                }
                Paint c10 = kVar.T.c(1.0f);
                if (c10 == null) {
                    paint.setAlpha(128);
                    canvas.drawRoundRect(rectF, f7, f7, paint);
                    return;
                }
                canvas.drawRoundRect(rectF, f7, f7, c10);
                paint.setAlpha(80);
                canvas.drawRoundRect(rectF, f7, f7, paint);
                return;
            default:
                super.f(canvas, rect, f7);
                return;
        }
    }

    @Override
    public boolean h() {
        switch (this.V) {
            case 1:
                return true;
            default:
                return super.h();
        }
    }

    @Override
    public void i() {
        switch (this.V) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bi) this.W).a2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void n(boolean z10) {
        switch (this.V) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bi) this.W).a2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
