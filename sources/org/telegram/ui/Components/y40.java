package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class y40 extends a50 {
    public final int f30118g;

    public y40() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30118g = GLES20.glGetUniformLocation(this.f22321a, "texOffset");
    }
}
