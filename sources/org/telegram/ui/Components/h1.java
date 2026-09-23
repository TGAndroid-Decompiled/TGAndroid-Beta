package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class h1 implements org.telegram.ui.ActionBar.a2 {
    public final int f24474a;
    public final LaunchActivity f24475b;

    public h1(LaunchActivity launchActivity, int i10) {
        this.f24474a = i10;
        this.f24475b = launchActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f24474a) {
            case 0:
                this.f24475b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f24475b.p0(new org.telegram.ui.z6());
                return;
            default:
                LaunchActivity launchActivity = this.f24475b;
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
