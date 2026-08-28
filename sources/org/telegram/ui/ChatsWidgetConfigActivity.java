package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public class ChatsWidgetConfigActivity extends ExternalActionActivity {
    public static final int B = 0;
    public int A = 0;

    @Override
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i9, int i10) {
        if (!c(intent, z10, z11, z12, i9, i10)) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.A = extras.getInt("appWidgetId", 0);
        }
        if (this.A != 0) {
            org.telegram.messenger.l0.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            my myVar = new my(0, this.A);
            myVar.f40556y = new b1(this, 25);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, myVar);
                }
            } else if (this.f35469c.getFragmentStack().isEmpty()) {
                this.f35469c.c(-1, myVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.f35470e.setVisibility(8);
            }
            this.f35469c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
