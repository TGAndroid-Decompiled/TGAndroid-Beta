package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l61 extends View {
    public final Paint f40108a;
    public final LinearGradient f40109b;

    public l61(n61 n61Var, Context context) {
        super(context);
        this.f40108a = new Paint(1);
        float dp = AndroidUtilities.dp(68.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        this.f40109b = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, n61Var.getThemedColor(i10)), n61Var.getThemedColor(i10)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient = this.f40109b;
        Paint paint = this.f40108a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
