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
            org.telegram.messenger.vh.c(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            ly lyVar = new ly(1, this.E);
            lyVar.f41401y = new y0(this, 29);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, lyVar);
                }
            } else if (this.f35502c.getFragmentStack().isEmpty()) {
                this.f35502c.c(-1, lyVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.e.setVisibility(8);
            }
            this.f35502c.e0();
            if (AndroidUtilities.isTablet()) {
                this.d.e0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
