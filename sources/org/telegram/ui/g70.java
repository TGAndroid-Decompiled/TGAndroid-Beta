package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g70 implements org.telegram.ui.Components.al0, dd0 {
    public final l70 f33775a;

    public g70(l70 l70Var) {
        this.f33775a = l70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        l70 l70Var = this.f33775a;
        Location location = l70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        l70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        l70 l70Var = this.f33775a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(l70Var)) {
                id0 id0Var = new id0(4);
                id0Var.f34619e0 = 0L;
                id0Var.F0 = new g70(l70Var);
                l70Var.presentFragment(id0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && l70Var.P != 5) {
            org.telegram.ui.ActionBar.n1 n1Var = l70Var.f35362w;
            if (n1Var == null || !n1Var.isShowing()) {
                org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(l70Var.getParentActivity(), null, new g(l70Var, 22), true, 1, null);
                m8Var.b(l70Var.W);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(m8Var.f26115a, -2, -2);
                l70Var.f35362w = n1Var2;
                n1Var2.e = true;
                n1Var2.f19421c = 220;
                n1Var2.setOutsideTouchable(true);
                l70Var.f35362w.setClippingEnabled(true);
                l70Var.f35362w.setAnimationStyle(R.style.PopupContextAnimation);
                l70Var.f35362w.setFocusable(true);
                m8Var.f26115a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                l70Var.f35362w.setInputMethodMode(2);
                l70Var.f35362w.getContentView().setFocusableInTouchMode(true);
                l70Var.f35362w.showAtLocation(l70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((m8Var.f26115a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                l70Var.f35362w.b();
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
