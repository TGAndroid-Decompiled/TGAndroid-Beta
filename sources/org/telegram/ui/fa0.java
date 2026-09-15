package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fa0 implements Utilities.Callback {
    public final int f33524a;
    public final LaunchActivity f33525b;

    public fa0(LaunchActivity launchActivity, int i10) {
        this.f33524a = i10;
        this.f33525b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.f33524a;
        LaunchActivity launchActivity = this.f33525b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f30844q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f30844q0.getLastFragment()) != null && !(lastFragment instanceof nc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(lastFragment);
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.i6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    f90 f90Var = new f90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.e6 e6Var = a02.f28690c;
                    org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(W, e6Var);
                    lcVar.f25902a.setImageDrawable(w9Var);
                    lcVar.f25903b.setText(string);
                    lcVar.f25904c.setText(formatString);
                    org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(a02.W(), e6Var, true);
                    mcVar.e(string2);
                    mcVar.f26137a = f90Var;
                    lcVar.setButton(mcVar);
                    org.telegram.ui.Components.oc b10 = a02.b(lcVar, 2750);
                    b10.f26754j = 5000;
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
