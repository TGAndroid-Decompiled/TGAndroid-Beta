package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a50 implements org.telegram.ui.Components.dj0, oa0 {
    public final f50 f43587a;

    public a50(f50 f50Var) {
        this.f43587a = f50Var;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        f50 f50Var = this.f43587a;
        Location location = f50Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        f50Var.T = messageMedia.address;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w9;
        f50 f50Var = this.f43587a;
        if (z9) {
            if (org.telegram.messenger.g0.J1(f50Var)) {
                ra0 ra0Var = new ra0(4);
                ra0Var.f49374l0 = 0L;
                ra0Var.G0 = new a50(f50Var);
                f50Var.presentFragment(ra0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.m8) && f50Var.P != 5) {
            org.telegram.ui.ActionBar.g1 g1Var = f50Var.f45593x;
            if (g1Var == null || !g1Var.isShowing()) {
                org.telegram.messenger.re reVar = new org.telegram.messenger.re(f50Var.getParentActivity(), null, new f(f50Var, 19), true, 1, null);
                reVar.u(f50Var.W);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25283b, -2, -2);
                f50Var.f45593x = g1Var2;
                g1Var2.f27487e = true;
                g1Var2.f27486c = 220;
                g1Var2.setOutsideTouchable(true);
                f50Var.f45593x.setClippingEnabled(true);
                f50Var.f45593x.setAnimationStyle(2131755192);
                f50Var.f45593x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25283b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                f50Var.f45593x.setInputMethodMode(2);
                f50Var.f45593x.getContentView().setFocusableInTouchMode(true);
                f50Var.f45593x.showAtLocation(f50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.f25283b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
                f50Var.f45593x.b();
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
