package org.telegram.ui.Wallet;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.u30;
public final class s3 extends ShapeDrawable.ShaderFactory {
    public final u30 f35183a;

    public s3(u30 u30Var) {
        this.f35183a = u30Var;
    }

    @Override
    public final Shader resize(int i10, int i11) {
        u30 u30Var = this.f35183a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i11, u30Var.f30851a, u30Var.f30852b, Shader.TileMode.CLAMP);
    }
}
