package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.ui.Components.x31;
public final class h4 implements org.telegram.ui.ActionBar.r1, a20, b20 {
    public final x5 f42583a;

    public h4(x5 x5Var) {
        this.f42583a = x5Var;
    }

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f42583a.c0(x31Var, view));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        x5 x5Var = this.f42583a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
            x5Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f42583a.b0((x31) obj, (View) obj2);
    }
}
