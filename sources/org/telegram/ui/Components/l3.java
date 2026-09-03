package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l3 extends l51 {
    public final AlertDialog$Builder f28611e;

    public l3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (s01) null);
        this.f28611e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f28611e.f21168a.I0.run();
        super.onClick(view);
    }
}
