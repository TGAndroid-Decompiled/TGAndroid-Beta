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
    public final int f33841a;
    public final LaunchActivity f33842b;

    public ga0(LaunchActivity launchActivity, int i10) {
        this.f33841a = i10;
        this.f33842b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.f33841a;
        LaunchActivity launchActivity = this.f33842b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f31128q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f31128q0.getLastFragment()) != null && !(lastFragment instanceof pc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lastFragment);
                    org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.j6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    g90 g90Var = new g90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.f6 f6Var = a02.f30239c;
                    org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(W, f6Var);
                    mcVar.f26377a.setImageDrawable(x9Var);
                    mcVar.f26378b.setText(string);
                    mcVar.f26379c.setText(formatString);
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(a02.W(), f6Var, true);
                    ncVar.e(string2);
                    ncVar.f26616a = g90Var;
                    mcVar.setButton(ncVar);
                    org.telegram.ui.Components.pc b10 = a02.b(mcVar, 2750);
                    b10.f27252j = 5000;
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
