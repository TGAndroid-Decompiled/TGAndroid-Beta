package org.telegram.ui;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class c40 implements ku0 {

    public final s50 f36935a;

    public c40(s50 s50Var) {
        this.f36935a = s50Var;
    }

    @Override
    public final TextureView K() {
        return null;
    }

    @Override
    public final void w0(MessageObject messageObject) {
        s50 s50Var = this.f36935a;
        s50Var.M.I0(true);
        s50Var.Y1.f41173f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        ((org.telegram.ui.ActionBar.e3) s50Var).containerView.invalidate();
    }

    @Override
    public final void y(MessageObject messageObject) {
        ((org.telegram.ui.ActionBar.e3) this.f36935a).containerView.invalidate();
    }
}
