package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m3 extends b41 {
    public final AlertDialog$Builder f35829e;

    public m3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (uy0) null);
        this.f35829e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f35829e.f27300a.L0.run();
        super.onClick(view);
    }
}
