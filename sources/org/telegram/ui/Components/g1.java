package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class g1 implements org.telegram.ui.ActionBar.r1 {
    public final int f35284a;
    public final LaunchActivity f35285b;

    public g1(LaunchActivity launchActivity, int i7) {
        this.f35284a = i7;
        this.f35285b = launchActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f35284a) {
            case 0:
                this.f35285b.t0(new LanguageSelectActivity());
                return;
            case 1:
                this.f35285b.t0(new org.telegram.ui.x6());
                return;
            default:
                LaunchActivity launchActivity = this.f35285b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }
}
