package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class av0 extends rl0 {
    public final Context f25376c;
    public final cv0 d;

    public av0(cv0 cv0Var, Context context) {
        this.d = cv0Var;
        this.f25376c = context;
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
            if (i11 == 1 && (textView = this.d.f26047e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.u7) m1Var.f5875a).setDialog(cv0.p(i10 - 1));
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout u7Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.f25376c;
        cv0 cv0Var = this.d;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) cv0Var).resourcesProvider;
            u7Var = new org.telegram.ui.Cells.u7(54, context, g6Var, false);
        } else {
            u7Var = new eh.d(context, 18);
            u7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            cv0Var.f26047e = textView;
            textView.setTextColor(cv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.J5));
            cv0Var.f26047e.setTextSize(1, 14.0f);
            cv0Var.f26047e.setGravity(17);
            cv0Var.f26047e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            u7Var.addView(cv0Var.f26047e, k7.c6.c(40.0f, -1));
        }
        return new f2.m1(u7Var);
    }
}
