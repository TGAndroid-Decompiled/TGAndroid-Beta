package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d70 implements org.telegram.ui.Components.bl0, yc0 {
    public final i70 f32528a;

    public d70(i70 i70Var) {
        this.f32528a = i70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        i70 i70Var = this.f32528a;
        Location location = i70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        i70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.fa;
        i70 i70Var = this.f32528a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(i70Var)) {
                dd0 dd0Var = new dd0(4);
                dd0Var.f32587e0 = 0L;
                dd0Var.F0 = new d70(i70Var);
                i70Var.presentFragment(dd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.s8) && i70Var.P != 5) {
            org.telegram.ui.ActionBar.n1 n1Var = i70Var.f34050w;
            if (n1Var == null || !n1Var.isShowing()) {
                org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(i70Var.getParentActivity(), null, new g(i70Var, 22), true, 1, null);
                o8Var.b(i70Var.W);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(o8Var.f26678a, -2, -2);
                i70Var.f34050w = n1Var2;
                n1Var2.e = true;
                n1Var2.f19407c = 220;
                n1Var2.setOutsideTouchable(true);
                i70Var.f34050w.setClippingEnabled(true);
                i70Var.f34050w.setAnimationStyle(R.style.PopupContextAnimation);
                i70Var.f34050w.setFocusable(true);
                o8Var.f26678a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                i70Var.f34050w.setInputMethodMode(2);
                i70Var.f34050w.getContentView().setFocusableInTouchMode(true);
                i70Var.f34050w.showAtLocation(i70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.f26678a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                i70Var.f34050w.b();
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
