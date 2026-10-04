package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k71 extends View {
    public final Paint f37856a;
    public final LinearGradient f37857b;

    public k71(m71 m71Var, Context context) {
        super(context);
        this.f37856a = new Paint(1);
        float dp = AndroidUtilities.dp(68.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f20894h5;
        this.f37857b = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{org.telegram.ui.ActionBar.i6.l1(0.0f, m71Var.getThemedColor(i10)), m71Var.getThemedColor(i10)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient = this.f37857b;
        Paint paint = this.f37856a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
