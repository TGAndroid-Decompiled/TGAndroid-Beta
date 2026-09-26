package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class b50 extends c50 {
    public final int f22895g;
    public final int h;

    public b50() {
        super(R.raw.round_blur_stage_2_frag);
        this.f22895g = GLES20.glGetUniformLocation(this.f23209a, "bTexture");
        this.h = GLES20.glGetUniformLocation(this.f23209a, "center");
    }
}
