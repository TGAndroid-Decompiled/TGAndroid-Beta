package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;

public final class ju0 extends yk0 {

    public final Context f29814c;
    public final lu0 d;

    public ju0(lu0 lu0Var, Context context) {
        this.d = lu0Var;
        this.f29814c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    @Override
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TextView textView;
        int i11 = o1Var.f5793f;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.r7) o1Var.f5789a).setDialog(lu0.q(i10 - 1));
        } else if (i11 == 1 && (textView = this.d.f30468e) != null) {
            textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout r7Var;
        Context context = this.f29814c;
        lu0 lu0Var = this.d;
        if (i10 != 0) {
            r7Var = new ag.d(context, 17);
            r7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            lu0Var.f30468e = textView;
            textView.setTextColor(lu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.J5));
            lu0Var.f30468e.setTextSize(1, 14.0f);
            lu0Var.f30468e.setGravity(17);
            lu0Var.f30468e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            r7Var.addView(lu0Var.f30468e, h7.z5.c(40.0f, -1));
        } else {
            r7Var = new org.telegram.ui.Cells.r7(54, context, ((org.telegram.ui.ActionBar.e3) lu0Var).resourcesProvider, false);
        }
        return new lk0(r7Var);
    }
}
