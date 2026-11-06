package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
public class ChatsWidgetConfigActivity extends ExternalActionActivity {
    public static final int F = 0;
    public int E = 0;

    @Override
    public final void d(Intent intent, boolean z9, boolean z10, boolean z11, int i7, int i10) {
        if (!c(intent, z9, z10, z11, i7, i10)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.E = extras.getInt("appWidgetId", 0);
        }
        if (this.E != 0) {
            org.telegram.ui.Cells.f1.h(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            ex exVar = new ex(0, this.E);
            exVar.D = new w0(this, 28);
            if (org.telegram.messenger.g0.Q1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, exVar);
                }
            } else if (this.f41200c.getFragmentStack().isEmpty()) {
                this.f41200c.c(-1, exVar);
            }
            if (!org.telegram.messenger.g0.Q1()) {
                this.f41201e.setVisibility(8);
            }
            this.f41200c.f0();
            if (org.telegram.messenger.g0.Q1()) {
                this.d.f0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
