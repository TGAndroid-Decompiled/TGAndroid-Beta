package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class ew0 extends qm0 {
    public final Context f26226c;
    public final gw0 d;

    public ew0(gw0 gw0Var, Context context) {
        this.d = gw0Var;
        this.f26226c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47786f == 0) {
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
        int i11 = d1Var.f47786f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.f26889e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) d1Var.f47782a).setDialog(gw0.r(i10 - 1));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f26226c;
        gw0 gw0Var = this.d;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) gw0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, d6Var, false);
        } else {
            w7Var = new ai.x5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            gw0Var.f26889e = textView;
            textView.setTextColor(gw0Var.getThemedColor(org.telegram.ui.ActionBar.h6.J5));
            gw0Var.f26889e.setTextSize(1, 14.0f);
            gw0Var.f26889e.setGravity(17);
            gw0Var.f26889e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(gw0Var.f26889e, w7.x5.d(40.0f, -1));
        }
        return new s4.d1(w7Var);
    }
}
