package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r3 extends t61 {
    public final AlertDialog$Builder f30343e;

    public r3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (t11) null);
        this.f30343e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f30343e.f20374a.L0.run();
        super.onClick(view);
    }
}
