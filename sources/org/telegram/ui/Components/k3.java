package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k3 extends p41 {
    public final AlertDialog$Builder f29920e;

    public k3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (vz0) null);
        this.f29920e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f29920e.f22702a.H0.run();
        super.onClick(view);
    }
}
