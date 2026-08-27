package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class k3 extends r41 {

    public final AlertDialog$Builder f29929e;

    public k3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (xz0) null);
        this.f29929e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f29929e.f22702a.H0.run();
        super.onClick(view);
    }
}
