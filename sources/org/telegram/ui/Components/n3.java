package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n3 extends a41 {
    public final AlertDialog$Builder f36154e;

    public n3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (ty0) null);
        this.f36154e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f36154e.f27292a.L0.run();
        super.onClick(view);
    }
}
