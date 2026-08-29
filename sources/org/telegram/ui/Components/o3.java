package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o3 extends a51 {
    public final AlertDialog$Builder f31244e;

    public o3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (h01) null);
        this.f31244e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f31244e.f22714a.H0.run();
        super.onClick(view);
    }
}
