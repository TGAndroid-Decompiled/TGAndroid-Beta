package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b70 implements org.telegram.ui.Components.ml0, xc0 {
    public final g70 f32342a;

    public b70(g70 g70Var) {
        this.f32342a = g70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        g70 g70Var = this.f32342a;
        Location location = g70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        g70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        g70 g70Var = this.f32342a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(g70Var)) {
                cd0 cd0Var = new cd0(4);
                cd0Var.f32661e0 = 0L;
                cd0Var.F0 = new b70(g70Var);
                g70Var.presentFragment(cd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && g70Var.P != 5) {
            org.telegram.ui.ActionBar.m1 m1Var = g70Var.f33841w;
            if (m1Var == null || !m1Var.isShowing()) {
                org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(g70Var.getParentActivity(), null, new g(g70Var, 22), true, 1, null);
                o8Var.b(g70Var.W);
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(o8Var.f26993a, -2, -2);
                g70Var.f33841w = m1Var2;
                m1Var2.e = true;
                m1Var2.f19635c = 220;
                m1Var2.setOutsideTouchable(true);
                g70Var.f33841w.setClippingEnabled(true);
                g70Var.f33841w.setAnimationStyle(R.style.PopupContextAnimation);
                g70Var.f33841w.setFocusable(true);
                o8Var.f26993a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                g70Var.f33841w.setInputMethodMode(2);
                g70Var.f33841w.getContentView().setFocusableInTouchMode(true);
                g70Var.f33841w.showAtLocation(g70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.f26993a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                g70Var.f33841w.b();
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
