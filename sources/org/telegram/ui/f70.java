package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class f70 implements org.telegram.ui.Components.nl0, bd0 {
    public final k70 f36207a;

    public f70(k70 k70Var) {
        this.f36207a = k70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        k70 k70Var = this.f36207a;
        Location location = k70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        k70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        k70 k70Var = this.f36207a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(k70Var)) {
                gd0 gd0Var = new gd0(4);
                gd0Var.f36569e0 = 0L;
                gd0Var.F0 = new f70(k70Var);
                k70Var.presentFragment(gd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && k70Var.P != 5) {
            org.telegram.ui.ActionBar.n1 n1Var = k70Var.f37847w;
            if (n1Var == null || !n1Var.isShowing()) {
                org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(k70Var.getParentActivity(), null, new g(k70Var, 22), true, 1, null);
                o8Var.b(k70Var.W);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(o8Var.f29274a, -2, -2);
                k70Var.f37847w = n1Var2;
                n1Var2.f21408e = true;
                n1Var2.f21407c = 220;
                n1Var2.setOutsideTouchable(true);
                k70Var.f37847w.setClippingEnabled(true);
                k70Var.f37847w.setAnimationStyle(R.style.PopupContextAnimation);
                k70Var.f37847w.setFocusable(true);
                o8Var.f29274a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                k70Var.f37847w.setInputMethodMode(2);
                k70Var.f37847w.getContentView().setFocusableInTouchMode(true);
                k70Var.f37847w.showAtLocation(k70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.f29274a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                k70Var.f37847w.b();
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
