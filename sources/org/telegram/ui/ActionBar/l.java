package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements pe.a {
    public final m f21326a;

    public l(m mVar, Context context) {
        super(context);
        this.f21326a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f21326a.f21362b.v(this);
    }
}
