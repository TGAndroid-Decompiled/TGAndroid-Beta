package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t3 extends p41 {
    public final AlertDialog$Builder f39898e;

    public t3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (dz0) null);
        this.f39898e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f39898e.f28746a.M0.run();
        super.onClick(view);
    }
}
