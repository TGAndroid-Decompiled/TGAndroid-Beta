package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.b41;
public final class h4 implements org.telegram.ui.ActionBar.q1, x10, y10 {
    public final y5 f43911a;

    public h4(y5 y5Var) {
        this.f43911a = y5Var;
    }

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f43911a.c0(b41Var, view));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        y5 y5Var = this.f43911a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
            y5Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f43911a.b0((b41) obj, (View) obj2);
    }
}
