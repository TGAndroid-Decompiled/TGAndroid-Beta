package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public final class k11 implements org.telegram.ui.ActionBar.a2, r0.o {

    public final y11 f39572a;

    public k11(y11 y11Var) {
        this.f39572a = y11Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        y11 y11Var = this.f39572a;
        y11Var.M = defaultWindowInsets;
        y11Var.fragmentView.requestLayout();
        return r0.m1.f46618b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        y11 y11Var = this.f39572a;
        y11Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            y11Var.getParentActivity().startActivity(intent);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
