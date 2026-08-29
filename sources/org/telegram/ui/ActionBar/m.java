package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m extends TextView implements yd.a {
    public final n f23670a;

    public m(n nVar, Context context) {
        super(context);
        this.f23670a = nVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f23670a.f23693b.q(this);
    }
}
