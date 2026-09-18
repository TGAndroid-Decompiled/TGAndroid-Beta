package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p3 extends b61 {
    public final AlertDialog$Builder e;

    public p3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (d11) null);
        this.e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.e.f18622a.L0.run();
        super.onClick(view);
    }
}
