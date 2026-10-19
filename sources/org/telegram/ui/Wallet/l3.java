package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
public final class l3 extends ba0 {
    public final Paint M;
    public final n3 N;

    public l3(n3 n3Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(d6Var);
        this.N = n3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        n3 n3Var = this.N;
        RectF rectF = n3Var.f34556f;
        if (n3Var.f34573o0 != null) {
            canvas.saveLayer(rectF, null);
            n3Var.f34573o0.c((AndroidUtilities.dp(206.0f) - n3Var.f34573o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - n3Var.f34573o0.j(), 1.0f, -1, canvas);
            Shader shader = this.f24891x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.f34548a.invalidate();
    }
}
