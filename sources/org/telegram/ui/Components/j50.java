package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class j50 extends k50 {
    public final int f27419g;
    public final int h;

    public j50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f27419g = GLES20.glGetUniformLocation(this.f27753a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f27753a, "center");
    }
}
