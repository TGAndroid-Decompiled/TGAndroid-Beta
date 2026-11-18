package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.l41;
public final class o4 implements org.telegram.ui.ActionBar.r1, v10, w10 {
    public final n6 f44701a;

    public o4(n6 n6Var) {
        this.f44701a = n6Var;
    }

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f44701a.c0(l41Var, view));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        n6 n6Var = this.f44701a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
            n6Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f44701a.b0((l41) obj, (View) obj2);
    }
}
