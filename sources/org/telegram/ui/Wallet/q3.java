package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.y20;
public final class q3 extends ShapeDrawable.ShaderFactory {
    public final y20 f43082a;

    public q3(y20 y20Var) {
        this.f43082a = y20Var;
    }

    @Override
    public final Shader resize(int i3, int i10) {
        y20 y20Var = this.f43082a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i10, y20Var.f40592a, y20Var.f40593b, Shader.TileMode.CLAMP);
    }
}
