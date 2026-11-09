package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n3 extends c41 {
    public final AlertDialog$Builder f36236e;

    public n3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (vy0) null);
        this.f36236e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f36236e.f27296a.L0.run();
        super.onClick(view);
    }
}
