package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class e70 implements org.telegram.ui.Components.fm0, cd0 {
    public final j70 f37176a;

    public e70(j70 j70Var) {
        this.f37176a = j70Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        j70 j70Var = this.f37176a;
        Location location = j70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        j70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ca;
        j70 j70Var = this.f37176a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(j70Var)) {
                hd0 hd0Var = new hd0(4);
                hd0Var.f38263e0 = 0L;
                hd0Var.F0 = new e70(j70Var);
                j70Var.presentFragment(hd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && j70Var.P != 5) {
            org.telegram.ui.ActionBar.n1 n1Var = j70Var.f38853w;
            if (n1Var == null || !n1Var.isShowing()) {
                org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(j70Var.getParentActivity(), null, new g(j70Var, 22), true, 1, null);
                q8Var.b(j70Var.W);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(q8Var.f30101a, -2, -2);
                j70Var.f38853w = n1Var2;
                n1Var2.f21415e = true;
                n1Var2.f21414c = 220;
                n1Var2.setOutsideTouchable(true);
                j70Var.f38853w.setClippingEnabled(true);
                j70Var.f38853w.setAnimationStyle(R.style.PopupContextAnimation);
                j70Var.f38853w.setFocusable(true);
                q8Var.f30101a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                j70Var.f38853w.setInputMethodMode(2);
                j70Var.f38853w.getContentView().setFocusableInTouchMode(true);
                j70Var.f38853w.showAtLocation(j70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((q8Var.f30101a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                j70Var.f38853w.b();
            }
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
