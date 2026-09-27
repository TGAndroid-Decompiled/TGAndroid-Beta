package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ca0 implements Utilities.Callback {
    public final int f32645a;
    public final LaunchActivity f32646b;

    public ca0(LaunchActivity launchActivity, int i10) {
        this.f32645a = i10;
        this.f32646b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.o2 lastFragment;
        int i10 = this.f32645a;
        LaunchActivity launchActivity = this.f32646b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f31132q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f31132q0.getLastFragment()) != null && !(lastFragment instanceof kc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lastFragment);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.i6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    d90 d90Var = new d90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.e6 e6Var = a02.f30391c;
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(W, e6Var);
                    ncVar.f26777a.setImageDrawable(y9Var);
                    ncVar.f26778b.setText(string);
                    ncVar.f26779c.setText(formatString);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(a02.W(), e6Var, true);
                    ocVar.e(string2);
                    ocVar.f27063a = d90Var;
                    ncVar.setButton(ocVar);
                    org.telegram.ui.Components.qc b10 = a02.b(ncVar, 2750);
                    b10.f27691j = 5000;
                    b10.j();
                    return;
                }
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity.O).openApp((TLRPC.User) obj, 0);
                return;
        }
    }
}
