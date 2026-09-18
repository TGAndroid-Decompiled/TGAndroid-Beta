package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class i70 implements org.telegram.ui.Components.bl0, fd0 {
    public final n70 f34445a;

    public i70(n70 n70Var) {
        this.f34445a = n70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        n70 n70Var = this.f34445a;
        Location location = n70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        n70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        n70 n70Var = this.f34445a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(n70Var)) {
                kd0 kd0Var = new kd0(4);
                kd0Var.f35226e0 = 0L;
                kd0Var.F0 = new i70(n70Var);
                n70Var.presentFragment(kd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && n70Var.P != 5) {
            org.telegram.ui.ActionBar.o1 o1Var = n70Var.f35968w;
            if (o1Var == null || !o1Var.isShowing()) {
                org.telegram.ui.Components.m8 m8Var = new org.telegram.ui.Components.m8(n70Var.getParentActivity(), null, new g(n70Var, 22), true, 1, null);
                m8Var.b(n70Var.W);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(m8Var.f26099a, -2, -2);
                n70Var.f35968w = o1Var2;
                o1Var2.e = true;
                o1Var2.f19449c = 220;
                o1Var2.setOutsideTouchable(true);
                n70Var.f35968w.setClippingEnabled(true);
                n70Var.f35968w.setAnimationStyle(R.style.PopupContextAnimation);
                n70Var.f35968w.setFocusable(true);
                m8Var.f26099a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                n70Var.f35968w.setInputMethodMode(2);
                n70Var.f35968w.getContentView().setFocusableInTouchMode(true);
                n70Var.f35968w.showAtLocation(n70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((m8Var.f26099a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                n70Var.f35968w.b();
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
