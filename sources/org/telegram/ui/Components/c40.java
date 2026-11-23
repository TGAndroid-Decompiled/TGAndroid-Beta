package org.telegram.ui.Components;

import android.opengl.GLES20;
public final class c40 extends e4.b {
    public final int f34011g;
    public final int h;

    public c40() {
        super(2131624183);
        this.f34011g = GLES20.glGetUniformLocation(this.f10849a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f10849a, "center");
    }
}
