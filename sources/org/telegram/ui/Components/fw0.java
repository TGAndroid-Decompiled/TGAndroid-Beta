package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class fw0 extends rm0 {
    public final Context f26500c;
    public final hw0 d;

    public fw0(hw0 hw0Var, Context context) {
        this.d = hw0Var;
        this.f26500c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f == 0) {
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
        int i11 = d1Var.f47752f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.f27088e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) d1Var.f47748a).setDialog(hw0.r(i10 - 1));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f26500c;
        hw0 hw0Var = this.d;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) hw0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, d6Var, false);
        } else {
            w7Var = new ai.x5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            hw0Var.f27088e = textView;
            textView.setTextColor(hw0Var.getThemedColor(org.telegram.ui.ActionBar.h6.J5));
            hw0Var.f27088e.setTextSize(1, 14.0f);
            hw0Var.f27088e.setGravity(17);
            hw0Var.f27088e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(hw0Var.f27088e, w7.x5.d(40.0f, -1));
        }
        return new s4.d1(w7Var);
    }
}
