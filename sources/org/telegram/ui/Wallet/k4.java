package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.q80;
public final class k4 extends q80 {
    public final Paint M;
    public final m4 N;

    public k4(m4 m4Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(h6Var);
        this.N = m4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        m4 m4Var = this.N;
        RectF rectF = m4Var.f44534f;
        if (m4Var.f44551o0 != null) {
            canvas.saveLayer(rectF, null);
            m4Var.f44551o0.c((org.telegram.messenger.g0.L(206.0f) - m4Var.f44551o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - m4Var.f44551o0.i(), 1.0f, -1, canvas);
            Shader shader = this.f38786x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f44525a.invalidate();
    }
}
