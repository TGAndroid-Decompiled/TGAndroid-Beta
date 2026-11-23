package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t3 extends r41 {
    public final AlertDialog$Builder f39789e;

    public t3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (ez0) null);
        this.f39789e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f39789e.f28835a.M0.run();
        super.onClick(view);
    }
}
