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
public final class d3 extends ja0 {
    public final Paint M;
    public final f3 N;

    public d3(f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(d6Var);
        this.N = f3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        f3 f3Var = this.N;
        RectF rectF = f3Var.f34905f;
        if (f3Var.f34922o0 != null) {
            canvas.saveLayer(rectF, null);
            f3Var.f34922o0.c((AndroidUtilities.dp(206.0f) - f3Var.f34922o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - f3Var.f34922o0.j(), 1.0f, -1, canvas);
            Shader shader = this.f27659x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f34896a.invalidate();
    }
}
