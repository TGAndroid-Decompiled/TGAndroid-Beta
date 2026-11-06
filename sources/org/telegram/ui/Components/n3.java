package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n3 extends b41 {
    public final AlertDialog$Builder f36190e;

    public n3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (uy0) null);
        this.f36190e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f36190e.f27293a.L0.run();
        super.onClick(view);
    }
}
