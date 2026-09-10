package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g70 implements org.telegram.ui.Components.kl0, dd0 {
    public final k70 f33030a;

    public g70(k70 k70Var) {
        this.f33030a = k70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        k70 k70Var = this.f33030a;
        Location location = k70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        k70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ga;
        k70 k70Var = this.f33030a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(k70Var)) {
                id0 id0Var = new id0(4);
                id0Var.f33621e0 = 0L;
                id0Var.F0 = new g70(k70Var);
                k70Var.presentFragment(id0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.s8) && k70Var.P != 5) {
            org.telegram.ui.ActionBar.p1 p1Var = k70Var.f34254w;
            if (p1Var == null || !p1Var.isShowing()) {
                org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(k70Var.getParentActivity(), null, new g(k70Var, 22), true, 1, null);
                o8Var.b(k70Var.W);
                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(o8Var.f25692a, -2, -2);
                k70Var.f34254w = p1Var2;
                p1Var2.e = true;
                p1Var2.f18535c = 220;
                p1Var2.setOutsideTouchable(true);
                k70Var.f34254w.setClippingEnabled(true);
                k70Var.f34254w.setAnimationStyle(R.style.PopupContextAnimation);
                k70Var.f34254w.setFocusable(true);
                o8Var.f25692a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                k70Var.f34254w.setInputMethodMode(2);
                k70Var.f34254w.getContentView().setFocusableInTouchMode(true);
                k70Var.f34254w.showAtLocation(k70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.f25692a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                k70Var.f34254w.b();
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
