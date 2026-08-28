package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class l11 implements org.telegram.ui.ActionBar.b2, r0.o {
    public final z11 f39969a;

    public l11(z11 z11Var) {
        this.f39969a = z11Var;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        z11 z11Var = this.f39969a;
        z11Var.M = defaultWindowInsets;
        z11Var.fragmentView.requestLayout();
        return r0.m1.f46928b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        z11 z11Var = this.f39969a;
        z11Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            z11Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
