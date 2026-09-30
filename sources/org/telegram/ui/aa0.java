package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class aa0 implements Utilities.Callback {
    public final int f32162a;
    public final LaunchActivity f32163b;

    public aa0(LaunchActivity launchActivity, int i10) {
        this.f32162a = i10;
        this.f32163b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.m2 lastFragment;
        int i10 = this.f32162a;
        LaunchActivity launchActivity = this.f32163b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f31204q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f31204q0.getLastFragment()) != null && !(lastFragment instanceof hc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(lastFragment);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.h6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    b90 b90Var = new b90(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.d6 d6Var = a02.f30693c;
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(W, d6Var);
                    ocVar.f27053a.setImageDrawable(y9Var);
                    ocVar.f27054b.setText(string);
                    ocVar.f27055c.setText(formatString);
                    org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(a02.W(), d6Var, true);
                    pcVar.e(string2);
                    pcVar.f27306a = b90Var;
                    ocVar.setButton(pcVar);
                    org.telegram.ui.Components.rc b10 = a02.b(ocVar, 2750);
                    b10.f27946j = 5000;
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
