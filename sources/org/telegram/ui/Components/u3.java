package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u3 extends s41 {
    public final AlertDialog$Builder f40225e;

    public u3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (fz0) null);
        this.f40225e = alertDialog$Builder;
    }

    @Override
    public final void onClick(View view) {
        this.f40225e.f28774a.M0.run();
        super.onClick(view);
    }
}
