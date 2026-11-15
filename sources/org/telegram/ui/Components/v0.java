package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class v0 implements org.telegram.ui.ActionBar.q1 {
    public final int f40194a;
    public final LaunchActivity f40195b;

    public v0(LaunchActivity launchActivity, int i7) {
        this.f40194a = i7;
        this.f40195b = launchActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f40194a) {
            case 0:
                this.f40195b.t0(new LanguageSelectActivity());
                return;
            case 1:
                this.f40195b.t0(new org.telegram.ui.y6());
                return;
            default:
                LaunchActivity launchActivity = this.f40195b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }
}
