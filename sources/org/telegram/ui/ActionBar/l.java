package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class l extends TextView implements xd.a {

    public final m f23616a;

    public l(m mVar, Context context) {
        super(context);
        this.f23616a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f23616a.f23653b.q(this);
    }
}
