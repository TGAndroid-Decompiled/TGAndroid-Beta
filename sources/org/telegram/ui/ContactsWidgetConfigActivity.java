package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
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
            org.telegram.messenger.w1.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            dz dzVar = new dz(1, this.E);
            dzVar.f35897y = new z0(this, 27);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, dzVar);
                }
            } else if (this.f33399c.getFragmentStack().isEmpty()) {
                this.f33399c.c(-1, dzVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.f33400e.setVisibility(8);
            }
            this.f33399c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
