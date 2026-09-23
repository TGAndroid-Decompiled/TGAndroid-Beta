package org.telegram.ui;

import android.view.TextureView;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class q40 implements ev0 {
    public final f60 f36284a;

    public q40(f60 f60Var) {
        this.f36284a = f60Var;
    }

    @Override
    public final void E0(MessageObject messageObject) {
        ViewGroup viewGroup;
        f60 f60Var = this.f36284a;
        f60Var.Q.I0(true);
        f60Var.f33109c2.f34255f.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void H(MessageObject messageObject) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f36284a).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final TextureView j0() {
        return null;
    }
}
