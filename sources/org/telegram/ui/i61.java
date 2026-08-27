package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class i61 extends View {

    public final Paint f38986a;

    public final LinearGradient f38987b;

    public i61(k61 k61Var, Context context) {
        super(context);
        this.f38986a = new Paint(1);
        float fDp = AndroidUtilities.dp(68.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        this.f38987b = new LinearGradient(0.0f, 0.0f, 0.0f, fDp, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, k61Var.getThemedColor(i10)), k61Var.getThemedColor(i10)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient = this.f38987b;
        Paint paint = this.f38986a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
