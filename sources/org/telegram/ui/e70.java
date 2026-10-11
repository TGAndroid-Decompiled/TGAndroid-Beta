package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class e70 implements org.telegram.ui.Components.gm0, bd0 {
    public final j70 f37258a;

    public e70(j70 j70Var) {
        this.f37258a = j70Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        j70 j70Var = this.f37258a;
        Location location = j70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        j70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ca;
        j70 j70Var = this.f37258a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(j70Var)) {
                gd0 gd0Var = new gd0(4);
                gd0Var.f38055e0 = 0L;
                gd0Var.F0 = new e70(j70Var);
                j70Var.presentFragment(gd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && j70Var.P != 5) {
            org.telegram.ui.ActionBar.m1 m1Var = j70Var.f38904w;
            if (m1Var == null || !m1Var.isShowing()) {
                org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(j70Var.getParentActivity(), null, new g(j70Var, 22), true, 1, null);
                q8Var.b(j70Var.W);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(q8Var.f30190a, -2, -2);
                j70Var.f38904w = m1Var2;
                m1Var2.f21408e = true;
                m1Var2.f21407c = 220;
                m1Var2.setOutsideTouchable(true);
                j70Var.f38904w.setClippingEnabled(true);
                j70Var.f38904w.setAnimationStyle(R.style.PopupContextAnimation);
                j70Var.f38904w.setFocusable(true);
                q8Var.f30190a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                j70Var.f38904w.setInputMethodMode(2);
                j70Var.f38904w.getContentView().setFocusableInTouchMode(true);
                j70Var.f38904w.showAtLocation(j70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((q8Var.f30190a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                j70Var.f38904w.b();
            }
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
