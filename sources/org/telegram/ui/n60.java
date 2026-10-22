package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class n60 implements org.telegram.ui.Components.yl0, ic0 {
    public final s60 f39439a;

    public n60(s60 s60Var) {
        this.f39439a = s60Var;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        s60 s60Var = this.f39439a;
        Location location = s60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        s60Var.T = messageMedia.address;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ba;
        s60 s60Var = this.f39439a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(s60Var)) {
                nc0 nc0Var = new nc0(4);
                nc0Var.f39508e0 = 0L;
                nc0Var.F0 = new n60(s60Var);
                s60Var.presentFragment(nc0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.q8) && s60Var.P != 5) {
            org.telegram.ui.ActionBar.m1 m1Var = s60Var.f41384w;
            if (m1Var == null || !m1Var.isShowing()) {
                org.telegram.ui.Components.p8 p8Var = new org.telegram.ui.Components.p8(s60Var.getParentActivity(), null, new g(s60Var, 22), true, 1, null);
                p8Var.b(s60Var.W);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(p8Var.f29260a, -2, -2);
                s60Var.f41384w = m1Var2;
                m1Var2.e = true;
                m1Var2.f21580c = 220;
                m1Var2.setOutsideTouchable(true);
                s60Var.f41384w.setClippingEnabled(true);
                s60Var.f41384w.setAnimationStyle(R.style.PopupContextAnimation);
                s60Var.f41384w.setFocusable(true);
                p8Var.f29260a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                s60Var.f41384w.setInputMethodMode(2);
                s60Var.f41384w.getContentView().setFocusableInTouchMode(true);
                s60Var.f41384w.showAtLocation(s60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((p8Var.f29260a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                s60Var.f41384w.b();
            }
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
