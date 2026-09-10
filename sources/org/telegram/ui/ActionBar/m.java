package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m extends TextView implements oe.a {
    public final n f18466a;

    public m(n nVar, Context context) {
        super(context);
        this.f18466a = nVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f18466a.f18480b.s(this);
    }
}
