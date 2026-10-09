package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class dw0 extends pm0 {
    public final Context f25830c;
    public final fw0 d;

    public dw0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.f25830c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47660f == 0) {
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
        int i11 = d1Var.f47660f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.f26501e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) d1Var.f47656a).setDialog(fw0.r(i10 - 1));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f25830c;
        fw0 fw0Var = this.d;
        if (i10 == 0) {
            e6Var = ((org.telegram.ui.ActionBar.f3) fw0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, e6Var, false);
        } else {
            w7Var = new ai.x5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            fw0Var.f26501e = textView;
            textView.setTextColor(fw0Var.getThemedColor(org.telegram.ui.ActionBar.i6.J5));
            fw0Var.f26501e.setTextSize(1, 14.0f);
            fw0Var.f26501e.setGravity(17);
            fw0Var.f26501e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(fw0Var.f26501e, w7.x5.d(40.0f, -1));
        }
        return new s4.d1(w7Var);
    }
}
