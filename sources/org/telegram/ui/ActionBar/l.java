package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l extends TextView implements re.a {
    public final m f22821a;

    public l(m mVar, Context context) {
        super(context);
        this.f22821a = mVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.f22821a.f22858b.v(this);
    }
}
