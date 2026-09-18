package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ha0 implements Utilities.Callback {
    public final int f34225a;
    public final LaunchActivity f34226b;

    public ha0(LaunchActivity launchActivity, int i10) {
        this.f34225a = i10;
        this.f34226b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.o2 lastFragment;
        int i10 = this.f34225a;
        LaunchActivity launchActivity = this.f34226b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f30861q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f30861q0.getLastFragment()) != null && !(lastFragment instanceof pc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(lastFragment);
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.j6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    h90 h90Var = new h90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.f6 f6Var = a02.f28686c;
                    org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(W, f6Var);
                    lcVar.f25890a.setImageDrawable(w9Var);
                    lcVar.f25891b.setText(string);
                    lcVar.f25892c.setText(formatString);
                    org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(a02.W(), f6Var, true);
                    mcVar.e(string2);
                    mcVar.f26125a = h90Var;
                    lcVar.setButton(mcVar);
                    org.telegram.ui.Components.oc b10 = a02.b(lcVar, 2750);
                    b10.f26705j = 5000;
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
