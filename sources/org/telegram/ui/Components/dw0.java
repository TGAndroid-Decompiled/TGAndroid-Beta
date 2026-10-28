package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class dw0 extends mm0 {
    public final Context f27559c;
    public final fw0 d;

    public dw0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.f27559c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 0) {
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
    public final void v(s4.e1 e1Var, int i10) {
        TextView textView;
        int i11 = e1Var.f47776f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.z7) e1Var.f47773a).setDialog(fw0.q(i10 - 1));
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout z7Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        Context context = this.f27559c;
        fw0 fw0Var = this.d;
        if (i10 == 0) {
            u6Var = ((org.telegram.ui.ActionBar.k3) fw0Var).resourcesProvider;
            z7Var = new org.telegram.ui.Cells.z7(54, context, u6Var, false);
        } else {
            z7Var = new di.i4(context, 17);
            z7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            fw0Var.e = textView;
            int i11 = org.telegram.ui.ActionBar.y6.J5;
            u6Var2 = ((org.telegram.ui.ActionBar.k3) fw0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var2);
            fw0Var.e.setTextSize(1, 14.0f);
            fw0Var.e.setGravity(17);
            fw0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            z7Var.addView(fw0Var.e, kb1.g(40.0f, -1));
        }
        return new s4.e1(z7Var);
    }
}
