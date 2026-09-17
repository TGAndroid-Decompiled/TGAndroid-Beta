package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ga0 implements Utilities.Callback {
    public final int f36607a;
    public final LaunchActivity f36608b;

    public ga0(LaunchActivity launchActivity, int i10) {
        this.f36607a = i10;
        this.f36608b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.f36607a;
        LaunchActivity launchActivity = this.f36608b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33454q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f33454q0.getLastFragment()) != null && !(lastFragment instanceof nc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(lastFragment);
                    org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.j6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    g90 g90Var = new g90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.f6 f6Var = a02.f32884c;
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(W, f6Var);
                    ncVar.f28724a.setImageDrawable(z9Var);
                    ncVar.f28725b.setText(string);
                    ncVar.f28726c.setText(formatString);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(a02.W(), f6Var, true);
                    ocVar.e(string2);
                    ocVar.f29030a = g90Var;
                    ncVar.setButton(ocVar);
                    org.telegram.ui.Components.qc b10 = a02.b(ncVar, 2750);
                    b10.f29680j = 5000;
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
