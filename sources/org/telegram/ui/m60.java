package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class m60 implements org.telegram.ui.Components.nk0, kc0 {
    public final r60 f40339a;

    public m60(r60 r60Var) {
        this.f40339a = r60Var;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ba;
        r60 r60Var = this.f40339a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(r60Var)) {
                pc0 pc0Var = new pc0(4);
                pc0Var.f41442a0 = 0L;
                pc0Var.B0 = new m60(r60Var);
                r60Var.presentFragment(pc0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.p8) && r60Var.L != 5) {
            org.telegram.ui.ActionBar.o1 o1Var = r60Var.f42285w;
            if (o1Var == null || !o1Var.isShowing()) {
                org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8(r60Var.getParentActivity(), null, new g(r60Var, 22), true, 1, null);
                h8Var.b(r60Var.S);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(h8Var.f28988a, -2, -2);
                r60Var.f42285w = o1Var2;
                o1Var2.f23690e = true;
                o1Var2.f23689c = 220;
                o1Var2.setOutsideTouchable(true);
                r60Var.f42285w.setClippingEnabled(true);
                r60Var.f42285w.setAnimationStyle(R.style.PopupContextAnimation);
                r60Var.f42285w.setFocusable(true);
                h8Var.f28988a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                r60Var.f42285w.setInputMethodMode(2);
                r60Var.f42285w.getContentView().setFocusableInTouchMode(true);
                r60Var.f42285w.showAtLocation(r60Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((h8Var.f28988a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
                r60Var.f42285w.b();
            }
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        r60 r60Var = this.f40339a;
        Location location = r60Var.Q;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        r60Var.P = messageMedia.address;
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
