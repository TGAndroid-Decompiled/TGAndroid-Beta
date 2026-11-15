package org.telegram.ui.Components.voip;

import android.content.Context;
import org.webrtc.TextureViewRenderer;
public final class n2 extends TextureViewRenderer {
    public final o2 f40812a;

    public n2(o2 o2Var, Context context) {
        super(context);
        this.f40812a = o2Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        super.onFirstFrameRendered();
        this.f40812a.b();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
    }
}
