package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class s50 extends t50 {
    public final int f30745g;
    public final int h;

    public s50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f30745g = GLES20.glGetUniformLocation(this.f31068a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f31068a, "center");
    }
}
