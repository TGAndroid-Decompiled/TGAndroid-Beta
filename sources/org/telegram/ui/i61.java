package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i61 extends View {
    public final Paint f38156a;
    public int f38157b;
    public LinearGradient f38158c;
    public final k61 d;

    public i61(k61 k61Var, Context context) {
        super(context);
        this.d = k61Var;
        this.f38156a = new Paint(1);
        this.f38157b = k61Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
        this.f38158c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, this.f38157b), this.f38157b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
        if (themedColor != this.f38157b) {
            this.f38157b = themedColor;
            this.f38158c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f38158c;
        Paint paint = this.f38156a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
