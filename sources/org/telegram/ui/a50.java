package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a50 implements org.telegram.ui.Components.rj0, ma0 {
    public final e50 f45590a;

    public a50(e50 e50Var) {
        this.f45590a = e50Var;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        e50 e50Var = this.f45590a;
        Location location = e50Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        e50Var.U = messageMedia.address;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w9;
        e50 e50Var = this.f45590a;
        if (z10) {
            if (org.telegram.messenger.g0.J1(e50Var)) {
                pa0 pa0Var = new pa0(4);
                pa0Var.m0 = 0L;
                pa0Var.M0 = new a50(e50Var);
                e50Var.presentFragment(pa0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.m8) && e50Var.Q != 5) {
            org.telegram.ui.ActionBar.g1 g1Var = e50Var.f47445x;
            if (g1Var == null || !g1Var.isShowing()) {
                org.telegram.messenger.pe peVar = new org.telegram.messenger.pe(e50Var.getParentActivity(), null, new f(e50Var, 19), true, 1, null);
                peVar.u(e50Var.X);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.f26326b, -2, -2);
                e50Var.f47445x = g1Var2;
                g1Var2.f29036e = true;
                g1Var2.f29035c = 220;
                g1Var2.setOutsideTouchable(true);
                e50Var.f47445x.setClippingEnabled(true);
                e50Var.f47445x.setAnimationStyle(2131755192);
                e50Var.f47445x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.f26326b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                e50Var.f47445x.setInputMethodMode(2);
                e50Var.f47445x.getContentView().setFocusableInTouchMode(true);
                e50Var.f47445x.showAtLocation(e50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) peVar.f26326b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
                e50Var.f47445x.b();
            }
        }
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
