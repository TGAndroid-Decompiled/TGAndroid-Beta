package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements ae.a {
    public final m f20392a;

    public l(m mVar, Context context) {
        super(context);
        this.f20392a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f20392a.f20419b.t(this);
    }
}
