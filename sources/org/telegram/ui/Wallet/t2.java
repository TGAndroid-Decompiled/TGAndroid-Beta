package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.d50;
public final class t2 extends ShapeDrawable.ShaderFactory {
    public final d50 f35473a;

    public t2(d50 d50Var) {
        this.f35473a = d50Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        d50 d50Var = this.f35473a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, d50Var.f25602a, d50Var.f25603b, Shader.TileMode.CLAMP);
    }
}
