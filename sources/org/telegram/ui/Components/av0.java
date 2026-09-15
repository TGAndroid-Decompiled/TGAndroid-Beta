package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class av0 extends kl0 {
    public final Context f22491c;
    public final cv0 d;

    public av0(cv0 cv0Var, Context context) {
        this.d = cv0Var;
        this.f22491c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42678f == 0) {
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
        int i11 = c1Var.f42678f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) c1Var.f42675a).setDialog(cv0.p(i10 - 1));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f22491c;
        cv0 cv0Var = this.d;
        if (i10 == 0) {
            e6Var = ((org.telegram.ui.ActionBar.f3) cv0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, e6Var, false);
        } else {
            w7Var = new ai.x5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            cv0Var.e = textView;
            textView.setTextColor(cv0Var.getThemedColor(org.telegram.ui.ActionBar.i6.J5));
            cv0Var.e.setTextSize(1, 14.0f);
            cv0Var.e.setGravity(17);
            cv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(cv0Var.e, w7.x5.c(40.0f, -1));
        }
        return new s4.c1(w7Var);
    }
}
