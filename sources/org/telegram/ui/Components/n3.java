package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n3 extends m51 {
    public final AlertDialog$Builder e;

    public n3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (o01) null);
        this.e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.e.f18437a.L0.run();
        super.onClick(view);
    }
}
