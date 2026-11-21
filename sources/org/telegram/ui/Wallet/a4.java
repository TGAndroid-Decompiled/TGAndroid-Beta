package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.q30;
public final class a4 extends ShapeDrawable.ShaderFactory {
    public final q30 f43968a;

    public a4(q30 q30Var) {
        this.f43968a = q30Var;
    }

    @Override
    public final Shader resize(int i7, int i10) {
        q30 q30Var = this.f43968a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, q30Var.f38781a, q30Var.f38782b, Shader.TileMode.CLAMP);
    }
}
