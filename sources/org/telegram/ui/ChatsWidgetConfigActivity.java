package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
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
            org.telegram.messenger.bi.d(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            cz czVar = new cz(0, this.E);
            czVar.f36761y = new z0(this, 25);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, czVar);
                }
            } else if (this.f33753c.getFragmentStack().isEmpty()) {
                this.f33753c.c(-1, czVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.f33754e.setVisibility(8);
            }
            this.f33753c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
