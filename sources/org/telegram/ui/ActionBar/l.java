package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements oe.a {
    public final m f19574a;

    public l(m mVar, Context context) {
        super(context);
        this.f19574a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f19574a.f19619b.s(this);
    }
}
