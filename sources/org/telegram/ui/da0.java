package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class da0 implements Utilities.Callback {
    public final int f36966a;
    public final LaunchActivity f36967b;

    public da0(LaunchActivity launchActivity, int i10) {
        this.f36966a = i10;
        this.f36967b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.m2 lastFragment;
        int i10 = this.f36966a;
        LaunchActivity launchActivity = this.f36967b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33835q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f33835q0.getLastFragment()) != null && !(lastFragment instanceof lc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(lastFragment);
                    org.telegram.ui.Components.aa aaVar = new org.telegram.ui.Components.aa(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.h6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    e90 e90Var = new e90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.d6 d6Var = a02.f24494c;
                    org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(W, d6Var);
                    pcVar.f29710a.setImageDrawable(aaVar);
                    pcVar.f29711b.setText(string);
                    pcVar.f29712c.setText(formatString);
                    org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(a02.W(), d6Var, true);
                    qcVar.e(string2);
                    qcVar.f30123a = e90Var;
                    pcVar.setButton(qcVar);
                    org.telegram.ui.Components.sc b10 = a02.b(pcVar, 2750);
                    b10.f30711j = 5000;
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
