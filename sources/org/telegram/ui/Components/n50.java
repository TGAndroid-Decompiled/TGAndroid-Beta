package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class n50 extends o50 {
    public final int f27586g;
    public final int h;

    public n50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f27586g = GLES20.glGetUniformLocation(this.f27844a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f27844a, "center");
    }
}
