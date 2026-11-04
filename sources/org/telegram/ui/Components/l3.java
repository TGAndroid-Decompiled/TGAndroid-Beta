package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l3 extends v31 {
    public final AlertDialog$Builder f35581e;

    public l3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (ty0) null);
        this.f35581e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f35581e.f27343a.O0.run();
        super.onClick(view);
    }
}
