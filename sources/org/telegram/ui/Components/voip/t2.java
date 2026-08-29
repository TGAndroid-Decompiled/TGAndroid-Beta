package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class t2 extends TextureViewRenderer {
    public final u2 f34013a;

    public t2(u2 u2Var, Context context) {
        super(context);
        this.f34013a = u2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f34013a.b();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
