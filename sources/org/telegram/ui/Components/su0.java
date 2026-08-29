package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class su0 extends il0 {
    public final Context f32720c;
    public final uu0 d;

    public su0(uu0 uu0Var, Context context) {
        this.d = uu0Var;
        this.f32720c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
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
    public final void v(f2.n1 n1Var, int i10) {
        TextView textView;
        int i11 = n1Var.f6436f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.f33320e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.s7) n1Var.f6432a).setDialog(uu0.p(i10 - 1));
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout s7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f32720c;
        uu0 uu0Var = this.d;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.f3) uu0Var).resourcesProvider;
            s7Var = new org.telegram.ui.Cells.s7(54, context, c6Var, false);
        } else {
            s7Var = new bh.d(context, 19);
            s7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            uu0Var.f33320e = textView;
            textView.setTextColor(uu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.J5));
            uu0Var.f33320e.setTextSize(1, 14.0f);
            uu0Var.f33320e.setGravity(17);
            uu0Var.f33320e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            s7Var.addView(uu0Var.f33320e, i7.f6.c(40.0f, -1));
        }
        return new f2.n1(s7Var);
    }
}
