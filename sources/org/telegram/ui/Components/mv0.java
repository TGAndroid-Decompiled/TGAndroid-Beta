package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class mv0 extends vl0 {
    public final Context f26527c;
    public final ov0 d;

    public mv0(ov0 ov0Var, Context context) {
        this.d = ov0Var;
        this.f26527c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42932f == 0) {
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
        int i11 = c1Var.f42932f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) c1Var.f42929a).setDialog(ov0.p(i10 - 1));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f26527c;
        ov0 ov0Var = this.d;
        if (i10 == 0) {
            e6Var = ((org.telegram.ui.ActionBar.f3) ov0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, e6Var, false);
        } else {
            w7Var = new ai.x5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            ov0Var.e = textView;
            textView.setTextColor(ov0Var.getThemedColor(org.telegram.ui.ActionBar.j6.J5));
            ov0Var.e.setTextSize(1, 14.0f);
            ov0Var.e.setGravity(17);
            ov0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(ov0Var.e, w7.y5.c(40.0f, -1));
        }
        return new s4.c1(w7Var);
    }
}
