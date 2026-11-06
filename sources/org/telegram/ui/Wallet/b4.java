package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.a80;
public final class b4 extends a80 {
    public final Paint M;
    public final d4 N;

    public b4(d4 d4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var);
        this.N = d4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        d4 d4Var = this.N;
        RectF rectF = d4Var.f42346f;
        if (d4Var.f42363o0 != null) {
            canvas.saveLayer(rectF, null);
            d4Var.f42363o0.c((org.telegram.messenger.g0.L(206.0f) - d4Var.f42363o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - d4Var.f42363o0.i(), 1.0f, -1, canvas);
            Shader shader = this.f31742x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f42337a.invalidate();
    }
}
