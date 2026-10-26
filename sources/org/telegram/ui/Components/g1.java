package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class g1 implements org.telegram.ui.ActionBar.b2 {
    public final int f28382a;
    public final LaunchActivity f28383b;

    public g1(LaunchActivity launchActivity, int i10) {
        this.f28382a = i10;
        this.f28383b = launchActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f28382a) {
            case 0:
                this.f28383b.u0(new LanguageSelectActivity());
                return;
            case 1:
                this.f28383b.u0(new org.telegram.ui.c7());
                return;
            default:
                LaunchActivity launchActivity = this.f28383b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
