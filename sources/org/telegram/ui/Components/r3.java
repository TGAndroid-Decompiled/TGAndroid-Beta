package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r3 extends y61 {
    public final AlertDialog$Builder f30022e;

    public r3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (z11) null);
        this.f30022e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f30022e.f20141a.L0.run();
        super.onClick(view);
    }
}
