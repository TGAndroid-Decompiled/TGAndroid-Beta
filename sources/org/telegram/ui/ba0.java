package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ba0 implements Utilities.Callback {
    public final int f32032a;
    public final LaunchActivity f32033b;

    public ba0(LaunchActivity launchActivity, int i10) {
        this.f32032a = i10;
        this.f32033b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.f32032a;
        LaunchActivity launchActivity = this.f32033b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f30815q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f30815q0.getLastFragment()) != null && !(lastFragment instanceof ic0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lastFragment);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.h6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    c90 c90Var = new c90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.d6 d6Var = a02.f29981c;
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(W, d6Var);
                    ncVar.f26407a.setImageDrawable(y9Var);
                    ncVar.f26408b.setText(string);
                    ncVar.f26409c.setText(formatString);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(a02.W(), d6Var, true);
                    ocVar.e(string2);
                    ocVar.f26716a = c90Var;
                    ncVar.setButton(ocVar);
                    org.telegram.ui.Components.qc b10 = a02.b(ncVar, 2750);
                    b10.f27306j = 5000;
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
