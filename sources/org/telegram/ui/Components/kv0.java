package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class kv0 extends ul0 {
    public final Context f24814c;
    public final mv0 d;

    public kv0(mv0 mv0Var, Context context) {
        this.d = mv0Var;
        this.f24814c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
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
        int i11 = c1Var.f41613f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.x7) c1Var.f41610a).setDialog(mv0.p(i10 - 1));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout x7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f24814c;
        mv0 mv0Var = this.d;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.h3) mv0Var).resourcesProvider;
            x7Var = new org.telegram.ui.Cells.x7(54, context, f6Var, false);
        } else {
            x7Var = new bi.l4(context, 17);
            x7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            mv0Var.e = textView;
            textView.setTextColor(mv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.J5));
            mv0Var.e.setTextSize(1, 14.0f);
            mv0Var.e.setGravity(17);
            mv0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            x7Var.addView(mv0Var.e, w7.a6.c(40.0f, -1));
        }
        return new s4.c1(x7Var);
    }
}
