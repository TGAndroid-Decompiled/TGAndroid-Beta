package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
public class ChatsWidgetConfigActivity extends ExternalActionActivity {
    public static final int G = 0;
    public int F = 0;

    @Override
    public final void d(Intent intent, boolean z, boolean z2, boolean z3, int i, int i2) {
        if (!c(intent, z, z2, z3, i, i2)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.F = extras.getInt("appWidgetId", 0);
        }
        if (this.F != 0) {
            td4.j(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            kv3 kv3Var = new kv3(0, this.F);
            kv3Var.E = new cd1(this, (byte) 29);
            if (gm.O1()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.b(-1, kv3Var);
                }
            } else if (this.c.getFragmentStack().isEmpty()) {
                this.c.b(-1, kv3Var);
            }
            if (!gm.O1()) {
                this.e.setVisibility(8);
            }
            this.c.e0();
            if (gm.O1()) {
                this.d.e0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
