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
    public final int f37992a;
    public final LaunchActivity f37993b;

    public ga0(LaunchActivity launchActivity, int i10) {
        this.f37992a = i10;
        this.f37993b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.m2 lastFragment;
        int i10 = this.f37992a;
        LaunchActivity launchActivity = this.f37993b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33644q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f33644q0.getLastFragment()) != null && !(lastFragment instanceof nc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(lastFragment);
                    org.telegram.ui.Components.aa aaVar = new org.telegram.ui.Components.aa(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.h6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    h90 h90Var = new h90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.c6 c6Var = a02.f33323c;
                    org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(W, c6Var);
                    pcVar.f29480a.setImageDrawable(aaVar);
                    pcVar.f29481b.setText(string);
                    pcVar.f29482c.setText(formatString);
                    org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(a02.W(), c6Var, true);
                    qcVar.e(string2);
                    qcVar.f29816a = h90Var;
                    pcVar.setButton(qcVar);
                    org.telegram.ui.Components.sc b10 = a02.b(pcVar, 2750);
                    b10.f30540j = 5000;
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
