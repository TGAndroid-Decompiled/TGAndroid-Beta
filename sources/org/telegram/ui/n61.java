package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n61 extends View {
    public final Paint f41640a;
    public int f41641b;
    public LinearGradient f41642c;
    public final p61 d;

    public n61(p61 p61Var, Context context) {
        super(context);
        this.d = p61Var;
        this.f41640a = new Paint(1);
        this.f41641b = p61Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5);
        this.f41642c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, this.f41641b), this.f41641b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5);
        if (themedColor != this.f41641b) {
            this.f41641b = themedColor;
            this.f41642c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f41642c;
        Paint paint = this.f41640a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
