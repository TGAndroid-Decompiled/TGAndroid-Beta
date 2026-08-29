package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public class ContactsWidgetConfigActivity extends ExternalActionActivity {
    public static final int B = 0;
    public int A = 0;

    @Override
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (!c(intent, z10, z11, z12, i10, i11)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.A = extras.getInt("appWidgetId", 0);
        }
        if (this.A != 0) {
            org.telegram.messenger.x3.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            oy oyVar = new oy(1, this.A);
            oyVar.f41247y = new c1(this, 27);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, oyVar);
                }
            } else if (this.f35536c.getFragmentStack().isEmpty()) {
                this.f35536c.c(-1, oyVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.f35537e.setVisibility(8);
            }
            this.f35536c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
