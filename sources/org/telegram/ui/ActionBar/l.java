package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements oe.a {
    public final m f21140a;

    public l(m mVar, Context context) {
        super(context);
        this.f21140a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f21140a.f21188b.s(this);
    }
}
