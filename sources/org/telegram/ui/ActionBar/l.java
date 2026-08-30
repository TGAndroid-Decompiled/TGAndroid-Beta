package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements ae.a {
    public final m f20417a;

    public l(m mVar, Context context) {
        super(context);
        this.f20417a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f20417a.f20444b.t(this);
    }
}
