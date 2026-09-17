package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h70 implements org.telegram.ui.Components.al0, dd0 {
    public final l70 f36923a;

    public h70(l70 l70Var) {
        this.f36923a = l70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        l70 l70Var = this.f36923a;
        Location location = l70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        l70Var.T = messageMedia.address;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        l70 l70Var = this.f36923a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(l70Var)) {
                id0 id0Var = new id0(4);
                id0Var.f37339e0 = 0L;
                id0Var.F0 = new h70(l70Var);
                l70Var.presentFragment(id0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && l70Var.P != 5) {
            org.telegram.ui.ActionBar.n1 n1Var = l70Var.f38243w;
            if (n1Var == null || !n1Var.isShowing()) {
                org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(l70Var.getParentActivity(), null, new g(l70Var, 22), true, 1, null);
                q8Var.b(l70Var.W);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(q8Var.f29645a, -2, -2);
                l70Var.f38243w = n1Var2;
                n1Var2.f21239e = true;
                n1Var2.f21238c = 220;
                n1Var2.setOutsideTouchable(true);
                l70Var.f38243w.setClippingEnabled(true);
                l70Var.f38243w.setAnimationStyle(R.style.PopupContextAnimation);
                l70Var.f38243w.setFocusable(true);
                q8Var.f29645a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                l70Var.f38243w.setInputMethodMode(2);
                l70Var.f38243w.getContentView().setFocusableInTouchMode(true);
                l70Var.f38243w.showAtLocation(l70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((q8Var.f29645a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                l70Var.f38243w.b();
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
