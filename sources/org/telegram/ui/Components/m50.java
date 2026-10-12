package org.telegram.ui.Components;

import android.opengl.GLES20;
import org.telegram.messenger.R;
public final class m50 extends o50 {
    public final int f27208g;

    public m50() {
        super(R.raw.round_blur_stage_1_frag);
        this.f27208g = GLES20.glGetUniformLocation(this.f27844a, "texOffset");
    }
}
