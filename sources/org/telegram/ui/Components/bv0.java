package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class bv0 extends sl0 {
    public final Context f25716c;
    public final dv0 d;

    public bv0(dv0 dv0Var, Context context) {
        this.d = dv0Var;
        this.f25716c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
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
    public final void v(f2.m1 m1Var, int i10) {
        TextView textView;
        int i11 = m1Var.f5879f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.f26326e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.u7) m1Var.f5875a).setDialog(dv0.p(i10 - 1));
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout u7Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.f25716c;
        dv0 dv0Var = this.d;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) dv0Var).resourcesProvider;
            u7Var = new org.telegram.ui.Cells.u7(54, context, g6Var, false);
        } else {
            u7Var = new eh.d(context, 18);
            u7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            dv0Var.f26326e = textView;
            textView.setTextColor(dv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.J5));
            dv0Var.f26326e.setTextSize(1, 14.0f);
            dv0Var.f26326e.setGravity(17);
            dv0Var.f26326e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            u7Var.addView(dv0Var.f26326e, k7.c6.c(40.0f, -1));
        }
        return new f2.m1(u7Var);
    }
}
