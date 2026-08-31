package org.telegram.ui;

import android.content.Intent;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
public class ChatsWidgetConfigActivity extends ExternalActionActivity {
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
            yy yyVar = new yy(0, this.B);
            yyVar.f43740y = new a1(this, 25);
            if (AndroidUtilities.isTablet()) {
                if (this.d.getFragmentStack().isEmpty()) {
                    this.d.c(-1, yyVar);
                }
            } else if (this.f34110c.getFragmentStack().isEmpty()) {
                this.f34110c.c(-1, yyVar);
            }
            if (!AndroidUtilities.isTablet()) {
                this.f34111e.setVisibility(8);
            }
            this.f34110c.c0();
            if (AndroidUtilities.isTablet()) {
                this.d.c0();
            }
            intent.setAction(null);
            return;
        }
        finish();
    }
}
