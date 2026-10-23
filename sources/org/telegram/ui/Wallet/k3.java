package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
public final class k3 extends ca0 {
    public final Paint M;
    public final m3 N;

    public k3(m3 m3Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(g6Var);
        this.N = m3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        m3 m3Var = this.N;
        RectF rectF = m3Var.f34812f;
        if (m3Var.f34829o0 != null) {
            canvas.saveLayer(rectF, null);
            m3Var.f34829o0.c((AndroidUtilities.dp(206.0f) - m3Var.f34829o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - m3Var.f34829o0.j(), 1.0f, -1, canvas);
            Shader shader = this.f25297x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f34804a.invalidate();
    }
}
