package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class zv0 extends lm0 {
    public final Context f33342c;
    public final bw0 d;

    public zv0(bw0 bw0Var, Context context) {
        this.d = bw0Var;
        this.f33342c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 0) {
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
        int i11 = b1Var.f46346f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.v7) b1Var.f46343a).setDialog(bw0.r(i10 - 1));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout v7Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        Context context = this.f33342c;
        bw0 bw0Var = this.d;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) bw0Var).resourcesProvider;
            v7Var = new org.telegram.ui.Cells.v7(54, context, g6Var, false);
        } else {
            v7Var = new ci.h4(context, 18);
            v7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            bw0Var.e = textView;
            int i11 = org.telegram.ui.ActionBar.k6.J5;
            g6Var2 = ((org.telegram.ui.ActionBar.h3) bw0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var2);
            bw0Var.e.setTextSize(1, 14.0f);
            bw0Var.e.setGravity(17);
            bw0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            v7Var.addView(bw0Var.e, w7.z5.c(40.0f, -1));
        }
        return new s4.b1(v7Var);
    }
}
