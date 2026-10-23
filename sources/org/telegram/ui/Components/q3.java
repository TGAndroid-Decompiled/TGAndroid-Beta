package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class q3 extends l61 {
    public final AlertDialog$Builder e;

    public q3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (n11) null);
        this.e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.e.f20609a.L0.run();
        super.onClick(view);
    }
}
