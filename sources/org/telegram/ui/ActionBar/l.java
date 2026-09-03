package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements ae.a {
    public final m f22063a;

    public l(m mVar, Context context) {
        super(context);
        this.f22063a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f22063a.f22127b.t(this);
    }
}
