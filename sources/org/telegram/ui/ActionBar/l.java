package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements wd.a {
    public final m f23615a;

    public l(m mVar, Context context) {
        super(context);
        this.f23615a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f23615a.f23649b.q(this);
    }
}
