package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o3 extends z51 {
    public final AlertDialog$Builder e;

    public o3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (b11) null);
        this.e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.e.f17528a.L0.run();
        super.onClick(view);
    }
}
