package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final int G = 0;
    public int F = 0;

    @Override
    public final void e(Intent intent, boolean z10, boolean z11, boolean z12, int i7, int i10) {
        if (!d(intent, z10, z11, z12, i7, i10)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.F = extras.getInt("appWidgetId", 0);
        }
        if (this.F != 0) {
            org.telegram.ui.Cells.c0.l(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            kx kxVar = new kx(1, this.F);
            kxVar.E = new zr(this, 0);
            if (org.telegram.messenger.g0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, kxVar);
                }
            } else if (this.f43086c.getFragmentStack().isEmpty()) {
                this.f43086c.c(-1, kxVar);
            }
            if (!org.telegram.messenger.g0.Q1()) {
                this.f43087e.setVisibility(8);
            }
            this.f43086c.f0();
            if (org.telegram.messenger.g0.Q1()) {
                this.d.f0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
