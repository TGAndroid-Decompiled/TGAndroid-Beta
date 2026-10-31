package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l3 extends e51 {
    public final AlertDialog$Builder e;

    public l3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (yz0) null);
        this.e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.e.f20134a.N0.run();
        super.onClick(view);
    }
}
