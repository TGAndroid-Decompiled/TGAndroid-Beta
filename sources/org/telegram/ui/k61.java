package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k61 extends View {
    public final Paint f40806a;
    public int f40807b;
    public LinearGradient f40808c;
    public final m61 d;

    public k61(m61 m61Var, Context context) {
        super(context);
        this.d = m61Var;
        this.f40806a = new Paint(1);
        this.f40807b = m61Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5);
        this.f40808c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, this.f40807b), this.f40807b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5);
        if (themedColor != this.f40807b) {
            this.f40807b = themedColor;
            this.f40808c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f40808c;
        Paint paint = this.f40806a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
