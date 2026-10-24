package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o3 extends p61 {
    public final AlertDialog$Builder e;

    public o3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (p11) null);
        this.e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.e.f20679a.N0.run();
        super.onClick(view);
    }
}
