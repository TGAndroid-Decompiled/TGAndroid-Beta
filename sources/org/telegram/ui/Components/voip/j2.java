package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class j2 extends TextureViewRenderer {
    public final k2 f39288a;

    public j2(k2 k2Var, Context context) {
        super(context);
        this.f39288a = k2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f39288a.b();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
    }
}
