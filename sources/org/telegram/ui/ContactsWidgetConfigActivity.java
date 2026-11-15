package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final int G = 0;
    public int F = 0;

    @Override
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i7, int i10) {
        if (!c(intent, z10, z11, z12, i7, i10)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.F = extras.getInt("appWidgetId", 0);
        }
        if (this.F != 0) {
            org.telegram.ui.Cells.y0.j(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            gx gxVar = new gx(1, this.F);
            gxVar.E = new zr(this, 0);
            if (org.telegram.messenger.g0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, gxVar);
                }
            } else if (this.f42596c.getFragmentStack().isEmpty()) {
                this.f42596c.c(-1, gxVar);
            }
            if (!org.telegram.messenger.g0.Q1()) {
                this.f42597e.setVisibility(8);
            }
            this.f42596c.f0();
            if (org.telegram.messenger.g0.Q1()) {
                this.d.f0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
