package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k71 extends View {
    public final Paint f34921a;
    public final LinearGradient f34922b;

    public k71(m71 m71Var, Context context) {
        super(context);
        this.f34921a = new Paint(1);
        float dp = AndroidUtilities.dp(68.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f19128h5;
        this.f34922b = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{org.telegram.ui.ActionBar.i6.l1(0.0f, m71Var.getThemedColor(i10)), m71Var.getThemedColor(i10)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient = this.f34922b;
        Paint paint = this.f34921a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
