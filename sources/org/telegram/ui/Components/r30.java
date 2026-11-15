package org.telegram.ui.Components;

import android.opengl.GLES20;
public final class r30 extends e4.b {
    public final int f38833g;
    public final int h;

    public r30() {
        super(2131624183);
        this.f38833g = GLES20.glGetUniformLocation(this.f10502a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f10502a, "center");
    }
}
