package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l3 extends f41 {
    public final AlertDialog$Builder f36719e;

    public l3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (wy0) null);
        this.f36719e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f36719e.f28392a.M0.run();
        super.onClick(view);
    }
}
