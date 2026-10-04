package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p3 extends k61 {
    public final AlertDialog$Builder f29490e;

    public p3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (m11) null);
        this.f29490e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f29490e.f20367a.L0.run();
        super.onClick(view);
    }
}
