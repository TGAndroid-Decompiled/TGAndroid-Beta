package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.a80;
public final class a4 extends a80 {
    public final Paint M;
    public final c4 N;

    public a4(c4 c4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var);
        this.N = c4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        c4 c4Var = this.N;
        RectF rectF = c4Var.f42317f;
        if (c4Var.f42334o0 != null) {
            canvas.saveLayer(rectF, null);
            c4Var.f42334o0.c((org.telegram.messenger.g0.L(206.0f) - c4Var.f42334o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - c4Var.f42334o0.i(), 1.0f, -1, canvas);
            Shader shader = this.f31751x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f42308a.invalidate();
    }
}
