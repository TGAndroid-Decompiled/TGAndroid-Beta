package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class y0 implements org.telegram.ui.ActionBar.r1 {
    public final int f40526a;
    public final LaunchActivity f40527b;

    public y0(LaunchActivity launchActivity, int i7) {
        this.f40526a = i7;
        this.f40527b = launchActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f40526a) {
            case 0:
                this.f40527b.t0(new LanguageSelectActivity());
                return;
            case 1:
                this.f40527b.t0(new org.telegram.ui.y6());
                return;
            default:
                LaunchActivity launchActivity = this.f40527b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }
}
