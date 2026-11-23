package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b50 implements org.telegram.ui.Components.rj0, na0 {
    public final f50 f45741a;

    public b50(f50 f50Var) {
        this.f45741a = f50Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        f50 f50Var = this.f45741a;
        Location location = f50Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        f50Var.U = messageMedia.address;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x9;
        f50 f50Var = this.f45741a;
        if (z10) {
            if (org.telegram.messenger.g0.J1(f50Var)) {
                qa0 qa0Var = new qa0(4);
                qa0Var.m0 = 0L;
                qa0Var.M0 = new b50(f50Var);
                f50Var.presentFragment(qa0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.n8) && f50Var.Q != 5) {
            org.telegram.ui.ActionBar.g1 g1Var = f50Var.f47564x;
            if (g1Var == null || !g1Var.isShowing()) {
                org.telegram.messenger.qe qeVar = new org.telegram.messenger.qe(f50Var.getParentActivity(), null, new f(f50Var, 19), true, 1, null);
                qeVar.u(f50Var.X);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.f26405b, -2, -2);
                f50Var.f47564x = g1Var2;
                g1Var2.f28943e = true;
                g1Var2.f28942c = 220;
                g1Var2.setOutsideTouchable(true);
                f50Var.f47564x.setClippingEnabled(true);
                f50Var.f47564x.setAnimationStyle(2131755192);
                f50Var.f47564x.setFocusable(true);
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.f26405b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                f50Var.f47564x.setInputMethodMode(2);
                f50Var.f47564x.getContentView().setFocusableInTouchMode(true);
                f50Var.f47564x.showAtLocation(f50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.f26405b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
                f50Var.f47564x.b();
            }
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
