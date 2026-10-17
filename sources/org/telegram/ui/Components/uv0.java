package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class uv0 extends hm0 {
    public final Context f31088c;
    public final wv0 d;

    public uv0(wv0 wv0Var, Context context) {
        this.d = wv0Var;
        this.f31088c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45941f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        TextView textView;
        int i11 = b1Var.f45941f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.v7) b1Var.f45938a).setDialog(wv0.q(i10 - 1));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout v7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f31088c;
        wv0 wv0Var = this.d;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.f3) wv0Var).resourcesProvider;
            v7Var = new org.telegram.ui.Cells.v7(54, context, d6Var, false);
        } else {
            v7Var = new ci.i4(context, 18);
            v7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            wv0Var.e = textView;
            textView.setTextColor(wv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.J5));
            wv0Var.e.setTextSize(1, 14.0f);
            wv0Var.e.setGravity(17);
            wv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            v7Var.addView(wv0Var.e, w7.z5.d(40.0f, -1));
        }
        return new s4.b1(v7Var);
    }
}
