package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r3 extends u61 {
    public final AlertDialog$Builder f30385e;

    public r3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (u11) null);
        this.f30385e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f30385e.f20404a.L0.run();
        super.onClick(view);
    }
}
