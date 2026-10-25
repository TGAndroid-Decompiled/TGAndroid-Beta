package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da0;
public final class k3 extends da0 {
    public final Paint M;
    public final m3 N;

    public k3(m3 m3Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(u6Var);
        this.N = m3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        m3 m3Var = this.N;
        RectF rectF = m3Var.f36892f;
        if (m3Var.f36909o0 != null) {
            canvas.saveLayer(rectF, null);
            m3Var.f36909o0.c((AndroidUtilities.dp(206.0f) - m3Var.f36909o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - m3Var.f36909o0.j(), 1.0f, -1, canvas);
            Shader shader = this.f27478x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f36884a.invalidate();
    }
}
