package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p3 extends l51 {
    public final AlertDialog$Builder f29267e;

    public p3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (n01) null);
        this.f29267e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f29267e.f20198a.L0.run();
        super.onClick(view);
    }
}
