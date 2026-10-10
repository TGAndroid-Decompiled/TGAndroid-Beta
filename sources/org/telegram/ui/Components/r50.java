package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class r50 extends t50 {
    public final int f30385g;

    public r50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30385g = GLES20.glGetUniformLocation(this.f30988a, "texOffset");
    }
}
