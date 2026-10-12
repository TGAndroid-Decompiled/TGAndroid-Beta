package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r3 extends y61 {
    public final AlertDialog$Builder f30023e;

    public r3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (z11) null);
        this.f30023e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f30023e.f20142a.L0.run();
        super.onClick(view);
    }
}
