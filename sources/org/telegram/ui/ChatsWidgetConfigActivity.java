package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

public class ChatsWidgetConfigActivity extends ExternalActionActivity {
    public static final int B = 0;
    public int A = 0;

    @Override
    public final void d(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (c(intent, z10, z11, z12, i10, i11)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.A = extras.getInt("appWidgetId", 0);
            }
            if (this.A == 0) {
                finish();
                return;
            }
            org.telegram.messenger.y1.e(10, "onlySelect", "dialogsType", true).putBoolean("allowSwitchAccount", true);
            py pyVar = new py(0, this.A);
            pyVar.f41452y = new c1(this, 25);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, pyVar);
                }
            } else if (this.f35472c.getFragmentStack().isEmpty()) {
                this.f35472c.c(-1, pyVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.f35473e.setVisibility(8);
            }
            this.f35472c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
        }
    }
}
