package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p3 extends l61 {
    public final AlertDialog$Builder f29575e;

    public p3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (n11) null);
        this.f29575e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f29575e.f20377a.L0.run();
        super.onClick(view);
    }
}
