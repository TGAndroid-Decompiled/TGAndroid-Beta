package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final int C = 0;
    public int B = 0;

    @Override
    public final void d(Intent intent, boolean z4, boolean z10, boolean z11, int i10, int i11) {
        if (!c(intent, z4, z10, z11, i10, i11)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.B = extras.getInt("appWidgetId", 0);
        }
        if (this.B != 0) {
            org.telegram.messenger.y3.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            zy zyVar = new zy(1, this.B);
            zyVar.f40901y = new c1(this, 27);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, zyVar);
                }
            } else if (this.f31565c.getFragmentStack().isEmpty()) {
                this.f31565c.c(-1, zyVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.e.setVisibility(8);
            }
            this.f31565c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
