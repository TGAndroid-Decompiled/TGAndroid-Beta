package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class av0 extends ql0 {
    public final Context f23483c;
    public final cv0 d;

    public av0(cv0 cv0Var, Context context) {
        this.d = cv0Var;
        this.f23483c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
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
    public final void v(f2.l1 l1Var, int i10) {
        TextView textView;
        int i11 = l1Var.f5777f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.t7) l1Var.f5774a).setDialog(cv0.p(i10 - 1));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout t7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f23483c;
        cv0 cv0Var = this.d;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.g3) cv0Var).resourcesProvider;
            t7Var = new org.telegram.ui.Cells.t7(54, context, f6Var, false);
        } else {
            t7Var = new dh.d(context, 18);
            t7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            cv0Var.e = textView;
            textView.setTextColor(cv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.J5));
            cv0Var.e.setTextSize(1, 14.0f);
            cv0Var.e.setGravity(17);
            cv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            t7Var.addView(cv0Var.e, k7.b6.c(40.0f, -1));
        }
        return new f2.l1(t7Var);
    }
}
