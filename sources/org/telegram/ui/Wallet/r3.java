package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.c30;
public final class r3 extends ShapeDrawable.ShaderFactory {
    public final c30 f43092a;

    public r3(c30 c30Var) {
        this.f43092a = c30Var;
    }

    @Override
    public final Shader resize(int i7, int i10) {
        c30 c30Var = this.f43092a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, c30Var.f32443a, c30Var.f32444b, Shader.TileMode.CLAMP);
    }
}
