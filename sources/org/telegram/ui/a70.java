package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a70 implements org.telegram.ui.Components.jl0, vc0 {
    public final e70 f32475a;

    public a70(e70 e70Var) {
        this.f32475a = e70Var;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.aa;
        e70 e70Var = this.f32475a;
        if (z4) {
            if (AndroidUtilities.isMapsInstalled(e70Var)) {
                ad0 ad0Var = new ad0(4);
                ad0Var.f32524b0 = 0L;
                ad0Var.C0 = new a70(e70Var);
                e70Var.presentFragment(ad0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.o8) && e70Var.M != 5) {
            org.telegram.ui.ActionBar.p1 p1Var = e70Var.f33922w;
            if (p1Var == null || !p1Var.isShowing()) {
                org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8(e70Var.getParentActivity(), null, new h(e70Var, 22), true, 1, null);
                h8Var.b(e70Var.T);
                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(h8Var.f25346a, -2, -2);
                e70Var.f33922w = p1Var2;
                p1Var2.e = true;
                p1Var2.f20517c = 220;
                p1Var2.setOutsideTouchable(true);
                e70Var.f33922w.setClippingEnabled(true);
                e70Var.f33922w.setAnimationStyle(R.style.PopupContextAnimation);
                e70Var.f33922w.setFocusable(true);
                h8Var.f25346a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                e70Var.f33922w.setInputMethodMode(2);
                e70Var.f33922w.getContentView().setFocusableInTouchMode(true);
                e70Var.f33922w.showAtLocation(e70Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((h8Var.f25346a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
                e70Var.f33922w.b();
            }
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        e70 e70Var = this.f32475a;
        Location location = e70Var.R;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        e70Var.Q = messageMedia.address;
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
