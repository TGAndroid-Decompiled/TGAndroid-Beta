package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m extends TextView implements oe.a {
    public final n f19628a;

    public m(n nVar, Context context) {
        super(context);
        this.f19628a = nVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f19628a.f19644b.s(this);
    }
}
