package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class zu0 extends kl0 {
    public final Context f33234c;
    public final bv0 d;

    public zu0(bv0 bv0Var, Context context) {
        this.d = bv0Var;
        this.f33234c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 0) {
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
        int i11 = c1Var.f45742f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.f24801e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) c1Var.f45738a).setDialog(bv0.p(i10 - 1));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f33234c;
        bv0 bv0Var = this.d;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.f3) bv0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, f6Var, false);
        } else {
            w7Var = new bi.g5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            bv0Var.f24801e = textView;
            textView.setTextColor(bv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.J5));
            bv0Var.f24801e.setTextSize(1, 14.0f);
            bv0Var.f24801e.setGravity(17);
            bv0Var.f24801e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(bv0Var.f24801e, w7.x5.c(40.0f, -1));
        }
        return new s4.c1(w7Var);
    }
}
