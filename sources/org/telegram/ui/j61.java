package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j61 extends View {
    public final Paint f39384a;
    public final LinearGradient f39385b;

    public j61(l61 l61Var, Context context) {
        super(context);
        this.f39384a = new Paint(1);
        float dp = AndroidUtilities.dp(68.0f);
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        this.f39385b = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, l61Var.getThemedColor(i9)), l61Var.getThemedColor(i9)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient = this.f39385b;
        Paint paint = this.f39384a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
