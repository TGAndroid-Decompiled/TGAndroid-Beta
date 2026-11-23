package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.q30;
public final class a4 extends ShapeDrawable.ShaderFactory {
    public final q30 f43937a;

    public a4(q30 q30Var) {
        this.f43937a = q30Var;
    }

    @Override
    public final Shader resize(int i7, int i10) {
        q30 q30Var = this.f43937a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, q30Var.f38728a, q30Var.f38729b, Shader.TileMode.CLAMP);
    }
}
