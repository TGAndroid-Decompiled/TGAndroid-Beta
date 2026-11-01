package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class y0 implements org.telegram.ui.ActionBar.u1 {
    public final int f32677a;
    public final LaunchActivity f32678b;

    public y0(LaunchActivity launchActivity, int i10) {
        this.f32677a = i10;
        this.f32678b = launchActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f32677a) {
            case 0:
                this.f32678b.t0(new LanguageSelectActivity());
                return;
            case 1:
                this.f32678b.t0(new org.telegram.ui.y6());
                return;
            default:
                LaunchActivity launchActivity = this.f32678b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
        }
    }
}
