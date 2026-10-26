package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class l50 extends m50 {
    public final int f30085g;
    public final int h;

    public l50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f30085g = GLES20.glGetUniformLocation(this.f30395a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f30395a, "center");
    }
}
