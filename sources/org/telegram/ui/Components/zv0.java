package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class zv0 extends lm0 {
    public final Context f31698c;
    public final bw0 d;

    public zv0(bw0 bw0Var, Context context) {
        this.d = bw0Var;
        this.f31698c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
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
    public final void v(s4.b1 b1Var, int i10) {
        TextView textView;
        int i11 = b1Var.f44841f;
        if (i11 != 0) {
            if (i11 == 1 && (textView = this.d.e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.w7) b1Var.f44838a).setDialog(bw0.r(i10 - 1));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout w7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f31698c;
        bw0 bw0Var = this.d;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.e3) bw0Var).resourcesProvider;
            w7Var = new org.telegram.ui.Cells.w7(54, context, c6Var, false);
        } else {
            w7Var = new bi.i5(context, 18);
            w7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            bw0Var.e = textView;
            textView.setTextColor(bw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.J5));
            bw0Var.e.setTextSize(1, 14.0f);
            bw0Var.e.setGravity(17);
            bw0Var.e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            w7Var.addView(bw0Var.e, w7.z5.d(40.0f, -1));
        }
        return new s4.b1(w7Var);
    }
}
