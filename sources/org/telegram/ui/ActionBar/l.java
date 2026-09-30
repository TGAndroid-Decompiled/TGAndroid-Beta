package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements oe.a {
    public final m f19610a;

    public l(m mVar, Context context) {
        super(context);
        this.f19610a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f19610a.f19643b.s(this);
    }
}
