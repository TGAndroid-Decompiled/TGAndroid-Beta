package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l3 extends n51 {
    public final AlertDialog$Builder f28581e;

    public l3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (t01) null);
        this.f28581e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f28581e.f21166a.I0.run();
        super.onClick(view);
    }
}
