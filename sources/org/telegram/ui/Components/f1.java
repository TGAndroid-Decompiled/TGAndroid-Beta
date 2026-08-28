package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class f1 implements org.telegram.ui.ActionBar.b2 {
    public final int f28226a;
    public final LaunchActivity f28227b;

    public f1(LaunchActivity launchActivity, int i9) {
        this.f28226a = i9;
        this.f28227b = launchActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f28226a) {
            case 0:
                this.f28227b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f28227b.p0(new org.telegram.ui.y6());
                return;
            default:
                LaunchActivity launchActivity = this.f28227b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
