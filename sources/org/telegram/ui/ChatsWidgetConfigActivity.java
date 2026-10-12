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
            org.telegram.messenger.v0.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            ez ezVar = new ez(0, this.E);
            ezVar.f37580y = new z0(this, 25);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, ezVar);
                }
            } else if (this.f33592c.getFragmentStack().isEmpty()) {
                this.f33592c.c(-1, ezVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.f33593e.setVisibility(8);
            }
            this.f33592c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
