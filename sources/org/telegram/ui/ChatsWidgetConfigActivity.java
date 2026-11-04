package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
public class ChatsWidgetConfigActivity extends ExternalActionActivity {
    public static final int G = 0;
    public int F = 0;

    @Override
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i3, int i10) {
        if (!c(intent, z10, z11, z12, i3, i10)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.F = extras.getInt("appWidgetId", 0);
        }
        if (this.F != 0) {
            org.telegram.ui.Cells.f1.l(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            cx cxVar = new cx(0, this.F);
            cxVar.E = new x0(this, 28);
            if (org.telegram.messenger.g0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, cxVar);
                }
            } else if (this.f41257c.getFragmentStack().isEmpty()) {
                this.f41257c.c(-1, cxVar);
            }
            if (!org.telegram.messenger.g0.Q1()) {
                this.f41258e.setVisibility(8);
            }
            this.f41257c.f0();
            if (org.telegram.messenger.g0.Q1()) {
                this.d.f0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
