package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b70 implements org.telegram.ui.Components.kl0, wc0 {
    public final f70 f35370a;

    public b70(f70 f70Var) {
        this.f35370a = f70Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.aa;
        f70 f70Var = this.f35370a;
        if (z4) {
            if (AndroidUtilities.isMapsInstalled(f70Var)) {
                bd0 bd0Var = new bd0(4);
                bd0Var.f35455b0 = 0L;
                bd0Var.C0 = new b70(f70Var);
                f70Var.presentFragment(bd0Var);
            } else {
                return;
            }
        }
        if ((view instanceof org.telegram.ui.Cells.o8) && f70Var.M != 5) {
            org.telegram.ui.ActionBar.p1 p1Var = f70Var.f36779w;
            if (p1Var == null || !p1Var.isShowing()) {
                org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8(f70Var.getParentActivity(), null, new h(f70Var, 22), true, 1, null);
                h8Var.b(f70Var.T);
                org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(h8Var.f27404a, -2, -2);
                f70Var.f36779w = p1Var2;
                p1Var2.f22218e = true;
                p1Var2.f22217c = 220;
                p1Var2.setOutsideTouchable(true);
                f70Var.f36779w.setClippingEnabled(true);
                f70Var.f36779w.setAnimationStyle(R.style.PopupContextAnimation);
                f70Var.f36779w.setFocusable(true);
                h8Var.f27404a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                f70Var.f36779w.setInputMethodMode(2);
                f70Var.f36779w.getContentView().setFocusableInTouchMode(true);
                f70Var.f36779w.showAtLocation(f70Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((h8Var.f27404a.getMeasuredHeight() / 2.0f) + view.getY() + f11));
                f70Var.f36779w.b();
            }
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        f70 f70Var = this.f35370a;
        Location location = f70Var.R;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        f70Var.Q = messageMedia.address;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
