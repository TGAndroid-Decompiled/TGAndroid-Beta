package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class lv0 extends vl0 {
    public final Context f26195c;
    public final nv0 d;

    public lv0(nv0 nv0Var, Context context) {
        this.d = nv0Var;
        this.f26195c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42949f == 0) {
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
        int i11 = c1Var.f42949f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) c1Var.f42946a).setDialog(nv0.p(i10 - 1));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f26195c;
        nv0 nv0Var = this.d;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) nv0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, d6Var, false);
        } else {
            w7Var = new ai.w5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            nv0Var.e = textView;
            textView.setTextColor(nv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.J5));
            nv0Var.e.setTextSize(1, 14.0f);
            nv0Var.e.setGravity(17);
            nv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(nv0Var.e, w7.y5.c(40.0f, -1));
        }
        return new s4.c1(w7Var);
    }
}
