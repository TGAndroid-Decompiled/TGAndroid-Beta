package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements qe.a {
    public final m f21600a;

    public l(m mVar, Context context) {
        super(context);
        this.f21600a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f21600a.f21623b.v(this);
    }
}
