package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class m50 extends o50 {
    public final int f26926g;

    public m50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f26926g = GLES20.glGetUniformLocation(this.f27543a, "texOffset");
    }
}
