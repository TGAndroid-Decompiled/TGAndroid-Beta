package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class c50 extends d50 {
    public final int f23820g;
    public final int h;

    public c50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f23820g = GLES20.glGetUniformLocation(this.f24168a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f24168a, "center");
    }
}
