package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o60 implements org.telegram.ui.Components.al0, mc0 {
    public final t60 f40991a;

    public o60(t60 t60Var) {
        this.f40991a = t60Var;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.y9;
        t60 t60Var = this.f40991a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(t60Var)) {
                rc0 rc0Var = new rc0(4);
                rc0Var.f42033a0 = 0L;
                rc0Var.B0 = new o60(t60Var);
                t60Var.presentFragment(rc0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.m8) && t60Var.L != 5) {
            org.telegram.ui.ActionBar.o1 o1Var = t60Var.f42565w;
            if (o1Var == null || !o1Var.isShowing()) {
                org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(t60Var.getParentActivity(), null, new h(t60Var, 22), true, 1, null);
                m8Var.b(t60Var.S);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(m8Var.f30594a, -2, -2);
                t60Var.f42565w = o1Var2;
                o1Var2.f23712e = true;
                o1Var2.f23711c = 220;
                o1Var2.setOutsideTouchable(true);
                t60Var.f42565w.setClippingEnabled(true);
                t60Var.f42565w.setAnimationStyle(R.style.PopupContextAnimation);
                t60Var.f42565w.setFocusable(true);
                m8Var.f30594a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                t60Var.f42565w.setInputMethodMode(2);
                t60Var.f42565w.getContentView().setFocusableInTouchMode(true);
                t60Var.f42565w.showAtLocation(t60Var.getFragmentView(), 0, (int) (view.getX() + f9), (int) ((m8Var.f30594a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                t60Var.f42565w.b();
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        t60 t60Var = this.f40991a;
        Location location = t60Var.Q;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        t60Var.P = messageMedia.address;
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
