package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j61 extends View {
    public final Paint f38469a;
    public int f38470b;
    public LinearGradient f38471c;
    public final l61 d;

    public j61(l61 l61Var, Context context) {
        super(context);
        this.d = l61Var;
        this.f38469a = new Paint(1);
        this.f38470b = l61Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
        this.f38471c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, this.f38470b), this.f38470b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
        if (themedColor != this.f38470b) {
            this.f38470b = themedColor;
            this.f38471c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f38471c;
        Paint paint = this.f38469a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
