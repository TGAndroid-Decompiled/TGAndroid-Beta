package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class yv0 extends km0 {
    public final Context f33057c;
    public final aw0 d;

    public yv0(aw0 aw0Var, Context context) {
        this.d = aw0Var;
        this.f33057c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 0) {
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
        int i11 = b1Var.f46345f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.v7) b1Var.f46342a).setDialog(aw0.r(i10 - 1));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout v7Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        Context context = this.f33057c;
        aw0 aw0Var = this.d;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) aw0Var).resourcesProvider;
            v7Var = new org.telegram.ui.Cells.v7(54, context, g6Var, false);
        } else {
            v7Var = new ci.h4(context, 18);
            v7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            aw0Var.e = textView;
            int i11 = org.telegram.ui.ActionBar.k6.J5;
            g6Var2 = ((org.telegram.ui.ActionBar.h3) aw0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var2);
            aw0Var.e.setTextSize(1, 14.0f);
            aw0Var.e.setGravity(17);
            aw0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            v7Var.addView(aw0Var.e, w7.z5.c(40.0f, -1));
        }
        return new s4.b1(v7Var);
    }
}
