package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class d50 extends e50 {
    public final int f25558g;
    public final int h;

    public d50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f25558g = GLES20.glGetUniformLocation(this.f25915a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f25915a, "center");
    }
}
