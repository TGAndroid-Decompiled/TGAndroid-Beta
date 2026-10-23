package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p3 extends q61 {
    public final AlertDialog$Builder e;

    public p3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (q11) null);
        this.e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.e.f20678a.N0.run();
        super.onClick(view);
    }
}
