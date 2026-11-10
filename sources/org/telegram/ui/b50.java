package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b50 implements org.telegram.ui.Components.cj0, pa0 {
    public final g50 f43929a;

    public b50(g50 g50Var) {
        this.f43929a = g50Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        g50 g50Var = this.f43929a;
        Location location = g50Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        g50Var.T = messageMedia.address;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w9;
        g50 g50Var = this.f43929a;
        if (z9) {
            if (org.telegram.messenger.g0.J1(g50Var)) {
                sa0 sa0Var = new sa0(4);
                sa0Var.f49783l0 = 0L;
                sa0Var.G0 = new b50(g50Var);
                g50Var.presentFragment(sa0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.m8) && g50Var.P != 5) {
            org.telegram.ui.ActionBar.g1 g1Var = g50Var.f45987x;
            if (g1Var == null || !g1Var.isShowing()) {
                org.telegram.messenger.re reVar = new org.telegram.messenger.re(g50Var.getParentActivity(), null, new f(g50Var, 19), true, 1, null);
                reVar.u(g50Var.W);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25287b, -2, -2);
                g50Var.f45987x = g1Var2;
                g1Var2.f27493e = true;
                g1Var2.f27492c = 220;
                g1Var2.setOutsideTouchable(true);
                g50Var.f45987x.setClippingEnabled(true);
                g50Var.f45987x.setAnimationStyle(2131755192);
                g50Var.f45987x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25287b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                g50Var.f45987x.setInputMethodMode(2);
                g50Var.f45987x.getContentView().setFocusableInTouchMode(true);
                g50Var.f45987x.showAtLocation(g50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25287b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
                g50Var.f45987x.b();
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
