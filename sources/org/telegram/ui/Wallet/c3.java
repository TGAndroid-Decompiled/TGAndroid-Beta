package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ja0;
public final class c3 extends ja0 {
    public final Paint M;
    public final e3 N;

    public c3(e3 e3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var);
        this.N = e3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        e3 e3Var = this.N;
        RectF rectF = e3Var.f34873f;
        if (e3Var.f34890o0 != null) {
            canvas.saveLayer(rectF, null);
            e3Var.f34890o0.c((AndroidUtilities.dp(206.0f) - e3Var.f34890o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - e3Var.f34890o0.j(), 1.0f, -1, canvas);
            Shader shader = this.f27651x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f34864a.invalidate();
    }
}
