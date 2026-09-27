package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class e70 implements org.telegram.ui.Components.nl0, ad0 {
    public final j70 f33165a;

    public e70(j70 j70Var) {
        this.f33165a = j70Var;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        j70 j70Var = this.f33165a;
        Location location = j70Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        j70Var.T = messageMedia.address;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ea;
        j70 j70Var = this.f33165a;
        if (z10) {
            if (AndroidUtilities.isMapsInstalled(j70Var)) {
                fd0 fd0Var = new fd0(4);
                fd0Var.f33493e0 = 0L;
                fd0Var.F0 = new e70(j70Var);
                j70Var.presentFragment(fd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.r8) && j70Var.P != 5) {
            org.telegram.ui.ActionBar.o1 o1Var = j70Var.f34651w;
            if (o1Var == null || !o1Var.isShowing()) {
                org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(j70Var.getParentActivity(), null, new g(j70Var, 22), true, 1, null);
                o8Var.b(j70Var.W);
                org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(o8Var.f27037a, -2, -2);
                j70Var.f34651w = o1Var2;
                o1Var2.e = true;
                o1Var2.f19685c = 220;
                o1Var2.setOutsideTouchable(true);
                j70Var.f34651w.setClippingEnabled(true);
                j70Var.f34651w.setAnimationStyle(R.style.PopupContextAnimation);
                j70Var.f34651w.setFocusable(true);
                o8Var.f27037a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                j70Var.f34651w.setInputMethodMode(2);
                j70Var.f34651w.getContentView().setFocusableInTouchMode(true);
                j70Var.f34651w.showAtLocation(j70Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((o8Var.f27037a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
                j70Var.f34651w.b();
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
