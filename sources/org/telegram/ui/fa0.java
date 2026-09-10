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
    public final int f32733a;
    public final LaunchActivity f32734b;

    public fa0(LaunchActivity launchActivity, int i10) {
        this.f32733a = i10;
        this.f32734b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.p2 lastFragment;
        int i10 = this.f32733a;
        LaunchActivity launchActivity = this.f32734b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f29957q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f29957q0.getLastFragment()) != null && !(lastFragment instanceof nc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(lastFragment);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.j6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    f90 f90Var = new f90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.f6 f6Var = a02.f28749c;
                    org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(W, f6Var);
                    mcVar.f25215a.setImageDrawable(y9Var);
                    mcVar.f25216b.setText(string);
                    mcVar.f25217c.setText(formatString);
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(a02.W(), f6Var, true);
                    ncVar.e(string2);
                    ncVar.f25483a = f90Var;
                    mcVar.setButton(ncVar);
                    org.telegram.ui.Components.pc b10 = a02.b(mcVar, 2750);
                    b10.f26081j = 5000;
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
