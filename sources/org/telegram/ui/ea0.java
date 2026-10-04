package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ea0 implements Utilities.Callback {
    public final int f35968a;
    public final LaunchActivity f35969b;

    public ea0(LaunchActivity launchActivity, int i10) {
        this.f35968a = i10;
        this.f35969b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.f35968a;
        LaunchActivity launchActivity = this.f35969b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33798q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f33798q0.getLastFragment()) != null && !(lastFragment instanceof lc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(lastFragment);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.i6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    e90 e90Var = new e90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.d6 d6Var = a02.f33131c;
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(W, d6Var);
                    ocVar.f29328a.setImageDrawable(y9Var);
                    ocVar.f29329b.setText(string);
                    ocVar.f29330c.setText(formatString);
                    org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(a02.W(), d6Var, true);
                    pcVar.e(string2);
                    pcVar.f29595a = e90Var;
                    ocVar.setButton(pcVar);
                    org.telegram.ui.Components.rc b10 = a02.b(ocVar, 2750);
                    b10.f30339j = 5000;
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
