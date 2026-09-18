package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g70 implements org.telegram.ui.Components.ll0, ed0 {
    public final l70 f33707a;

    public g70(l70 l70Var) {
        this.f33707a = l70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        l70 l70Var = this.f33707a;
        Location location = l70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        l70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        l70 l70Var = this.f33707a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(l70Var)) {
                jd0 jd0Var = new jd0(4);
                jd0Var.f34818e0 = 0L;
                jd0Var.F0 = new g70(l70Var);
                l70Var.presentFragment(jd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && l70Var.P != 5) {
            org.telegram.ui.ActionBar.n1 n1Var = l70Var.f35274w;
            if (n1Var == null || !n1Var.isShowing()) {
                org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(l70Var.getParentActivity(), null, new g(l70Var, 22), true, 1, null);
                o8Var.b(l70Var.W);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(o8Var.f26898a, -2, -2);
                l70Var.f35274w = n1Var2;
                n1Var2.e = true;
                n1Var2.f19609c = 220;
                n1Var2.setOutsideTouchable(true);
                l70Var.f35274w.setClippingEnabled(true);
                l70Var.f35274w.setAnimationStyle(R.style.PopupContextAnimation);
                l70Var.f35274w.setFocusable(true);
                o8Var.f26898a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                l70Var.f35274w.setInputMethodMode(2);
                l70Var.f35274w.getContentView().setFocusableInTouchMode(true);
                l70Var.f35274w.showAtLocation(l70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.f26898a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                l70Var.f35274w.b();
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
