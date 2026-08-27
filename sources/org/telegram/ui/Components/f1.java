package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;

public final class f1 implements org.telegram.ui.ActionBar.a2 {

    public final int f28225a;

    public final LaunchActivity f28226b;

    public f1(LaunchActivity launchActivity, int i10) {
        this.f28225a = i10;
        this.f28226b = launchActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28225a) {
            case 0:
                this.f28226b.p0(new LanguageSelectActivity());
                break;
            case 1:
                this.f28226b.p0(new org.telegram.ui.z6());
                break;
            default:
                LaunchActivity launchActivity = this.f28226b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                break;
        }
    }
}
