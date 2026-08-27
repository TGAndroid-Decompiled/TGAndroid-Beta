package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class q60 implements org.telegram.ui.Components.qk0, oc0 {

    public final u60 f41531a;

    public q60(u60 u60Var) {
        this.f41531a = u60Var;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x9;
        u60 u60Var = this.f41531a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(u60Var)) {
                return;
            }
            tc0 tc0Var = new tc0(4);
            tc0Var.f42856a0 = 0L;
            tc0Var.B0 = new q60(u60Var);
            u60Var.presentFragment(tc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.l8) || u60Var.L == 5) {
            return;
        }
        org.telegram.ui.ActionBar.n1 n1Var = u60Var.f43141w;
        if (n1Var == null || !n1Var.isShowing()) {
            org.telegram.ui.Components.g8 g8Var = new org.telegram.ui.Components.g8(u60Var.getParentActivity(), null, new g(u60Var, 22), true, 1, null);
            g8Var.b(u60Var.S);
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(g8Var.f28544a, -2, -2);
            u60Var.f43141w = n1Var2;
            n1Var2.f23684e = true;
            n1Var2.f23683c = 220;
            n1Var2.setOutsideTouchable(true);
            u60Var.f43141w.setClippingEnabled(true);
            u60Var.f43141w.setAnimationStyle(R.style.PopupContextAnimation);
            u60Var.f43141w.setFocusable(true);
            g8Var.f28544a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            u60Var.f43141w.setInputMethodMode(2);
            u60Var.f43141w.getContentView().setFocusableInTouchMode(true);
            u60Var.f43141w.showAtLocation(u60Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((g8Var.f28544a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
            u60Var.f43141w.b();
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        u60 u60Var = this.f41531a;
        Location location = u60Var.Q;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        u60Var.P = messageMedia.address;
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
