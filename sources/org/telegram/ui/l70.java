package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class l70 implements org.telegram.ui.Components.bm0, gd0 {
    public final p70 f37628a;

    public l70(p70 p70Var) {
        this.f37628a = p70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        p70 p70Var = this.f37628a;
        Location location = p70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        p70Var.T = messageMedia.address;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ca;
        p70 p70Var = this.f37628a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(p70Var)) {
                ld0 ld0Var = new ld0(4);
                ld0Var.f37690e0 = 0L;
                ld0Var.F0 = new l70(p70Var);
                p70Var.presentFragment(ld0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && p70Var.P != 5) {
            org.telegram.ui.ActionBar.m1 m1Var = p70Var.f38831w;
            if (m1Var == null || !m1Var.isShowing()) {
                org.telegram.ui.Components.s8 s8Var = new org.telegram.ui.Components.s8(p70Var.getParentActivity(), null, new g(p70Var, 22), true, 1, null);
                s8Var.b(p70Var.W);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(s8Var.f28761a, -2, -2);
                p70Var.f38831w = m1Var2;
                m1Var2.e = true;
                m1Var2.f20221c = 220;
                m1Var2.setOutsideTouchable(true);
                p70Var.f38831w.setClippingEnabled(true);
                p70Var.f38831w.setAnimationStyle(R.style.PopupContextAnimation);
                p70Var.f38831w.setFocusable(true);
                s8Var.f28761a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                p70Var.f38831w.setInputMethodMode(2);
                p70Var.f38831w.getContentView().setFocusableInTouchMode(true);
                p70Var.f38831w.showAtLocation(p70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((s8Var.f28761a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                p70Var.f38831w.b();
            }
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
