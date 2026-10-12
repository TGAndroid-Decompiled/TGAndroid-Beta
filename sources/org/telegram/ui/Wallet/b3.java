package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ha0;
public final class b3 extends ha0 {
    public final Paint M;
    public final d3 N;

    public b3(d3 d3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(c6Var);
        this.N = d3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        d3 d3Var = this.N;
        RectF rectF = d3Var.f33053f;
        if (d3Var.f33070o0 != null) {
            canvas.saveLayer(rectF, null);
            d3Var.f33070o0.c((AndroidUtilities.dp(206.0f) - d3Var.f33070o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - d3Var.f33070o0.j(), 1.0f, -1, canvas);
            Shader shader = this.f25624x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f33045a.invalidate();
    }
}
