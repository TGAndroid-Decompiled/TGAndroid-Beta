package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class g1 implements org.telegram.ui.ActionBar.q1 {
    public final int f35269a;
    public final LaunchActivity f35270b;

    public g1(LaunchActivity launchActivity, int i7) {
        this.f35269a = i7;
        this.f35270b = launchActivity;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f35269a) {
            case 0:
                this.f35270b.t0(new LanguageSelectActivity());
                return;
            case 1:
                this.f35270b.t0(new org.telegram.ui.y6());
                return;
            default:
                LaunchActivity launchActivity = this.f35270b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }
}
