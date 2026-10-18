package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p60 implements org.telegram.ui.Components.xl0, kc0 {
    public final u60 f39996a;

    public p60(u60 u60Var) {
        this.f39996a = u60Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        u60 u60Var = this.f39996a;
        Location location = u60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        u60Var.T = messageMedia.address;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ba;
        u60 u60Var = this.f39996a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(u60Var)) {
                pc0 pc0Var = new pc0(4);
                pc0Var.f40063e0 = 0L;
                pc0Var.F0 = new p60(u60Var);
                u60Var.presentFragment(pc0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.q8) && u60Var.P != 5) {
            org.telegram.ui.ActionBar.m1 m1Var = u60Var.f41912w;
            if (m1Var == null || !m1Var.isShowing()) {
                org.telegram.ui.Components.p8 p8Var = new org.telegram.ui.Components.p8(u60Var.getParentActivity(), null, new g(u60Var, 22), true, 1, null);
                p8Var.b(u60Var.W);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(p8Var.f29233a, -2, -2);
                u60Var.f41912w = m1Var2;
                m1Var2.e = true;
                m1Var2.f21580c = 220;
                m1Var2.setOutsideTouchable(true);
                u60Var.f41912w.setClippingEnabled(true);
                u60Var.f41912w.setAnimationStyle(R.style.PopupContextAnimation);
                u60Var.f41912w.setFocusable(true);
                p8Var.f29233a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                u60Var.f41912w.setInputMethodMode(2);
                u60Var.f41912w.getContentView().setFocusableInTouchMode(true);
                u60Var.f41912w.showAtLocation(u60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((p8Var.f29233a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                u60Var.f41912w.b();
            }
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
