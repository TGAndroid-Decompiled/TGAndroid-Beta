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
    public final int f37212a;
    public final LaunchActivity f37213b;

    public ea0(LaunchActivity launchActivity, int i10) {
        this.f37212a = i10;
        this.f37213b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.f37212a;
        LaunchActivity launchActivity = this.f37213b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33807q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f33807q0.getLastFragment()) != null && !(lastFragment instanceof mc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(lastFragment);
                    org.telegram.ui.Components.aa aaVar = new org.telegram.ui.Components.aa(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.i6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    f90 f90Var = new f90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.e6 e6Var = a02.f24664c;
                    org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(W, e6Var);
                    qcVar.f30140a.setImageDrawable(aaVar);
                    qcVar.f30141b.setText(string);
                    qcVar.f30142c.setText(formatString);
                    org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc(a02.W(), e6Var, true);
                    rcVar.e(string2);
                    rcVar.f30421a = f90Var;
                    qcVar.setButton(rcVar);
                    org.telegram.ui.Components.tc b10 = a02.b(qcVar, 2750);
                    b10.f31130j = 5000;
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
