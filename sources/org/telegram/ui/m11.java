package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class m11 implements org.telegram.ui.ActionBar.b2, r0.o {
    public final a21 f40343a;

    public m11(a21 a21Var) {
        this.f40343a = a21Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        a21 a21Var = this.f40343a;
        a21Var.M = defaultWindowInsets;
        a21Var.fragmentView.requestLayout();
        return r0.m1.f46842b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        a21 a21Var = this.f40343a;
        a21Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            a21Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
