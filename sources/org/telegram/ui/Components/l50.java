package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class l50 extends m50 {
    public final int f30083g;
    public final int h;

    public l50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f30083g = GLES20.glGetUniformLocation(this.f30393a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f30393a, "center");
    }
}
