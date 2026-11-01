package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
public class ChatsWidgetConfigActivity extends ExternalActionActivity {
    public static final int F = 0;
    public int E = 0;

    @Override
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (!c(intent, z10, z11, z12, i10, i11)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.E = extras.getInt("appWidgetId", 0);
        }
        if (this.E != 0) {
            org.telegram.ui.Cells.f1.j(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            hy hyVar = new hy(0, this.E);
            hyVar.D = new y0(this, 27);
            if (org.telegram.messenger.i0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, hyVar);
                }
            } else if (this.f33331c.getFragmentStack().isEmpty()) {
                this.f33331c.c(-1, hyVar);
            }
            if (!org.telegram.messenger.i0.Q1()) {
                this.e.setVisibility(8);
            }
            this.f33331c.e0();
            if (org.telegram.messenger.i0.Q1()) {
                this.d.e0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
