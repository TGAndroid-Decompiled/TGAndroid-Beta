package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class o90 implements Utilities.Callback {

    public final int f41039a;

    public final LaunchActivity f41040b;

    public o90(LaunchActivity launchActivity, int i10) {
        this.f41039a = i10;
        this.f41040b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 lastFragment;
        int i10 = this.f41039a;
        LaunchActivity launchActivity = this.f41040b;
        switch (i10) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.m0 != null && zBooleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.m0.getLastFragment()) != null && !(lastFragment instanceof xb0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(lastFragment);
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.g6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String string2 = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string3 = LocaleController.getString(R.string.Disable);
                    p80 p80Var = new p80(launchActivity, 8);
                    mcVarA0.getClass();
                    Context contextW = mcVarA0.W();
                    org.telegram.ui.ActionBar.c6 c6Var = mcVarA0.f30645c;
                    org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(contextW, c6Var);
                    bcVar.f27063a.setImageDrawable(p9Var);
                    bcVar.f27064b.setText(string);
                    bcVar.f27065c.setText(string2);
                    org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(mcVarA0.W(), c6Var, true);
                    ccVar.e(string3);
                    ccVar.f27402a = p80Var;
                    bcVar.setButton(ccVar);
                    org.telegram.ui.Components.ec ecVarB = mcVarA0.b(bcVar, 2750);
                    ecVarB.f28020j = 5000;
                    ecVarB.j();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                MessagesController.getInstance(launchActivity.K).openApp((TLRPC.User) obj, 0);
                break;
        }
    }
}
