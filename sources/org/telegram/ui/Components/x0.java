package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class x0 implements org.telegram.ui.ActionBar.p1 {
    public final int f40185a;
    public final LaunchActivity f40186b;

    public x0(LaunchActivity launchActivity, int i3) {
        this.f40185a = i3;
        this.f40186b = launchActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f40185a) {
            case 0:
                this.f40186b.t0(new LanguageSelectActivity());
                return;
            case 1:
                this.f40186b.t0(new org.telegram.ui.z6());
                return;
            default:
                LaunchActivity launchActivity = this.f40186b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }
}
