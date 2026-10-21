package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m90 implements Utilities.Callback {
    public final int f39160a;
    public final LaunchActivity f39161b;

    public m90(LaunchActivity launchActivity, int i10) {
        this.f39160a = i10;
        this.f39161b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.f39160a;
        LaunchActivity launchActivity = this.f39161b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33186q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f33186q0.getLastFragment()) != null && !(lastFragment instanceof qb0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lastFragment);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.h6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    j80 j80Var = new j80(launchActivity, 9);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.d6 d6Var = a02.f32390c;
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(W, d6Var);
                    ncVar.f28774a.setImageDrawable(y9Var);
                    ncVar.f28775b.setText(string);
                    ncVar.f28776c.setText(formatString);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(a02.W(), d6Var, true);
                    ocVar.e(string2);
                    ocVar.f28983a = j80Var;
                    ncVar.setButton(ocVar);
                    org.telegram.ui.Components.qc b10 = a02.b(ncVar, 2750);
                    b10.f29531j = 5000;
                    b10.j();
                    return;
                }
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                MessagesController.getInstance(launchActivity.O).openApp((TLRPC.User) obj, 0);
                return;
        }
    }
}
