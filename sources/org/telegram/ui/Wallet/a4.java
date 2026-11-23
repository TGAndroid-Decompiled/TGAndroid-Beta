package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.q30;
public final class a4 extends ShapeDrawable.ShaderFactory {
    public final q30 f43972a;

    public a4(q30 q30Var) {
        this.f43972a = q30Var;
    }

    @Override
    public final Shader resize(int i7, int i10) {
        q30 q30Var = this.f43972a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, q30Var.f38775a, q30Var.f38776b, Shader.TileMode.CLAMP);
    }
}
