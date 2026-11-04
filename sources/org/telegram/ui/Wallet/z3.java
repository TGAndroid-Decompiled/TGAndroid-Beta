package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.w70;
public final class z3 extends w70 {
    public final Paint M;
    public final b4 N;

    public z3(b4 b4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var);
        this.N = b4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        b4 b4Var = this.N;
        RectF rectF = b4Var.f42241f;
        if (b4Var.f42258o0 != null) {
            canvas.saveLayer(rectF, null);
            b4Var.f42258o0.c((org.telegram.messenger.g0.L(206.0f) - b4Var.f42258o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - b4Var.f42258o0.i(), 1.0f, -1, canvas);
            Shader shader = this.f39944x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f42232a.invalidate();
    }
}
