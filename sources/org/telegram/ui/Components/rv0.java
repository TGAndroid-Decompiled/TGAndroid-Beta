package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class rv0 extends yl0 {
    public final Context f30522c;
    public final tv0 d;

    public rv0(tv0 tv0Var, Context context) {
        this.d = tv0Var;
        this.f30522c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46535f == 0) {
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
        int i11 = c1Var.f46535f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.f31183e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) c1Var.f46531a).setDialog(tv0.p(i10 - 1));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f30522c;
        tv0 tv0Var = this.d;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.f3) tv0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, d6Var, false);
        } else {
            w7Var = new ai.w5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            tv0Var.f31183e = textView;
            textView.setTextColor(tv0Var.getThemedColor(org.telegram.ui.ActionBar.i6.J5));
            tv0Var.f31183e.setTextSize(1, 14.0f);
            tv0Var.f31183e.setGravity(17);
            tv0Var.f31183e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(tv0Var.f31183e, w7.z5.c(40.0f, -1));
        }
        return new s4.c1(w7Var);
    }
}
