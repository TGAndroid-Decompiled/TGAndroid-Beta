package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class h1 implements org.telegram.ui.ActionBar.z1 {
    public final int f25147a;
    public final LaunchActivity f25148b;

    public h1(LaunchActivity launchActivity, int i10) {
        this.f25147a = i10;
        this.f25148b = launchActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25147a) {
            case 0:
                this.f25148b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f25148b.p0(new org.telegram.ui.d7());
                return;
            default:
                LaunchActivity launchActivity = this.f25148b;
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
