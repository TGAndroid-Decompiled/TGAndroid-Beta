package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class y0 implements org.telegram.ui.ActionBar.r1 {
    public final int f40500a;
    public final LaunchActivity f40501b;

    public y0(LaunchActivity launchActivity, int i7) {
        this.f40500a = i7;
        this.f40501b = launchActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f40500a) {
            case 0:
                this.f40501b.t0(new LanguageSelectActivity());
                return;
            case 1:
                this.f40501b.t0(new org.telegram.ui.y6());
                return;
            default:
                LaunchActivity launchActivity = this.f40501b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25563b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }
}
