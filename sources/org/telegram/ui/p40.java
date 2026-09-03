package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class p40 implements yu0 {
    public final d60 f39881a;

    public p40(d60 d60Var) {
        this.f39881a = d60Var;
    }

    @Override
    public final void G(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f39881a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView h0() {
        return null;
    }

    @Override
    public final void y0(MessageObject messageObject) {
        ViewGroup viewGroup;
        d60 d60Var = this.f39881a;
        d60Var.N.I0(true);
        d60Var.Z1.f35867f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
    }
}
