package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r3 extends v61 {
    public final AlertDialog$Builder f30316e;

    public r3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (v11) null);
        this.f30316e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f30316e.f20368a.L0.run();
        super.onClick(view);
    }
}
