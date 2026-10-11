package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class r50 extends t50 {
    public final int f30419g;

    public r50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f30419g = GLES20.glGetUniformLocation(this.f31068a, "texOffset");
    }
}
