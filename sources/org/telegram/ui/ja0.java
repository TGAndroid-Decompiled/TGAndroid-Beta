package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ja0 implements Utilities.Callback {
    public final int f37335a;
    public final LaunchActivity f37336b;

    public ja0(LaunchActivity launchActivity, int i10) {
        this.f37335a = i10;
        this.f37336b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.m2 lastFragment;
        int i10 = this.f37335a;
        LaunchActivity launchActivity = this.f37336b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f32133q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f32133q0.getLastFragment()) != null && !(lastFragment instanceof rc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(lastFragment);
                    org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.g6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    k90 k90Var = new k90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.c6 c6Var = a02.f31837c;
                    org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(W, c6Var);
                    pcVar.f28278a.setImageDrawable(baVar);
                    pcVar.f28279b.setText(string);
                    pcVar.f28280c.setText(formatString);
                    org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(a02.W(), c6Var, true);
                    qcVar.e(string2);
                    qcVar.f28576a = k90Var;
                    pcVar.setButton(qcVar);
                    org.telegram.ui.Components.sc b10 = a02.b(pcVar, 2750);
                    b10.f29102j = 5000;
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
