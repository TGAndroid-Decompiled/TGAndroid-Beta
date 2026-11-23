package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class h1 implements org.telegram.ui.ActionBar.q1 {
    public final int f35692a;
    public final LaunchActivity f35693b;

    public h1(LaunchActivity launchActivity, int i7) {
        this.f35692a = i7;
        this.f35693b = launchActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f35692a) {
            case 0:
                this.f35693b.t0(new LanguageSelectActivity());
                return;
            case 1:
                this.f35693b.t0(new org.telegram.ui.x6());
                return;
            default:
                LaunchActivity launchActivity = this.f35693b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26895b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }
}
