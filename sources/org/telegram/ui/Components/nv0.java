package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class nv0 extends xl0 {
    public final Context f26864c;
    public final pv0 d;

    public nv0(pv0 pv0Var, Context context) {
        this.d = pv0Var;
        this.f26864c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42963f == 0) {
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
    public final void v(s4.c1 c1Var, int i10) {
        TextView textView;
        int i11 = c1Var.f42963f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) c1Var.f42960a).setDialog(pv0.p(i10 - 1));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f26864c;
        pv0 pv0Var = this.d;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) pv0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, d6Var, false);
        } else {
            w7Var = new ai.w5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            pv0Var.e = textView;
            textView.setTextColor(pv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.J5));
            pv0Var.e.setTextSize(1, 14.0f);
            pv0Var.e.setGravity(17);
            pv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(pv0Var.e, w7.y5.c(40.0f, -1));
        }
        return new s4.c1(w7Var);
    }
}
