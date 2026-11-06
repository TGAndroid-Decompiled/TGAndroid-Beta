package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.c30;
public final class s3 extends ShapeDrawable.ShaderFactory {
    public final c30 f43129a;

    public s3(c30 c30Var) {
        this.f43129a = c30Var;
    }

    @Override
    public final Shader resize(int i7, int i10) {
        c30 c30Var = this.f43129a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, c30Var.f32412a, c30Var.f32413b, Shader.TileMode.CLAMP);
    }
}
