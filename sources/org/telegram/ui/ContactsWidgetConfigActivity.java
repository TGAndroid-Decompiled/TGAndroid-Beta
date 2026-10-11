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
            org.telegram.messenger.ai.d(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            bz bzVar = new bz(1, this.E);
            bzVar.f36513y = new y0(this, 27);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, bzVar);
                }
            } else if (this.f33815c.getFragmentStack().isEmpty()) {
                this.f33815c.c(-1, bzVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.f33816e.setVisibility(8);
            }
            this.f33815c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
