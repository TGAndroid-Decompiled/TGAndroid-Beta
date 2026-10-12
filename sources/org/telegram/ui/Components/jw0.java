package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class jw0 extends vm0 {
    public final Context f27655c;
    public final lw0 d;

    public jw0(lw0 lw0Var, Context context) {
        this.d = lw0Var;
        this.f27655c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f == 0) {
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
    public final void v(s4.d1 d1Var, int i10) {
        TextView textView;
        int i11 = d1Var.f47893f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.f28304e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) d1Var.f47889a).setDialog(lw0.r(i10 - 1));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f27655c;
        lw0 lw0Var = this.d;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.e3) lw0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, c6Var, false);
        } else {
            w7Var = new ai.x5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            lw0Var.f28304e = textView;
            textView.setTextColor(lw0Var.getThemedColor(org.telegram.ui.ActionBar.h6.J5));
            lw0Var.f28304e.setTextSize(1, 14.0f);
            lw0Var.f28304e.setGravity(17);
            lw0Var.f28304e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(lw0Var.f28304e, w7.w5.d(40.0f, -1));
        }
        return new s4.d1(w7Var);
    }
}
