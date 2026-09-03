package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class c70 implements org.telegram.ui.Components.il0, xc0 {
    public final g70 f33036a;

    public c70(g70 g70Var) {
        this.f33036a = g70Var;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        g70 g70Var = this.f33036a;
        Location location = g70Var.R;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        g70Var.Q = messageMedia.address;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.z9;
        g70 g70Var = this.f33036a;
        if (z4) {
            if (AndroidUtilities.isMapsInstalled(g70Var)) {
                cd0 cd0Var = new cd0(4);
                cd0Var.f33086b0 = 0L;
                cd0Var.C0 = new c70(g70Var);
                g70Var.presentFragment(cd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.n8) && g70Var.M != 5) {
            org.telegram.ui.ActionBar.p1 p1Var = g70Var.f34347w;
            if (p1Var == null || !p1Var.isShowing()) {
                org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8(g70Var.getParentActivity(), null, new h(g70Var, 22), true, 1, null);
                h8Var.b(g70Var.T);
                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(h8Var.f25333a, -2, -2);
                g70Var.f34347w = p1Var2;
                p1Var2.e = true;
                p1Var2.f20492c = 220;
                p1Var2.setOutsideTouchable(true);
                g70Var.f34347w.setClippingEnabled(true);
                g70Var.f34347w.setAnimationStyle(R.style.PopupContextAnimation);
                g70Var.f34347w.setFocusable(true);
                h8Var.f25333a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                g70Var.f34347w.setInputMethodMode(2);
                g70Var.f34347w.getContentView().setFocusableInTouchMode(true);
                g70Var.f34347w.showAtLocation(g70Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((h8Var.f25333a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
                g70Var.f34347w.b();
            }
        }
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
