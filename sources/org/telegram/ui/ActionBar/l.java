package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements qe.a {
    public final m f20181a;

    public l(m mVar, Context context) {
        super(context);
        this.f20181a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f20181a.f20212b.v(this);
    }
}
