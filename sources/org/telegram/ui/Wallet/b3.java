package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ia0;
public final class b3 extends ia0 {
    public final Paint M;
    public final d3 N;

    public b3(d3 d3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var);
        this.N = d3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        d3 d3Var = this.N;
        RectF rectF = d3Var.f34782f;
        if (d3Var.f34799o0 != null) {
            canvas.saveLayer(rectF, null);
            d3Var.f34799o0.c((AndroidUtilities.dp(206.0f) - d3Var.f34799o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - d3Var.f34799o0.j(), 1.0f, -1, canvas);
            Shader shader = this.f27340x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f34773a.invalidate();
    }
}
