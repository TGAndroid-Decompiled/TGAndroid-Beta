package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
public final class gu0 extends vk0 {
    public final Context f28878c;
    public final iu0 d;

    public gu0(iu0 iu0Var, Context context) {
        this.d = iu0Var;
        this.f28878c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return LocationController.getLocationsCount() + 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        TextView textView;
        int i10 = q1Var.f5505f;
        if (i10 != 0) {
            if (i10 == 1 && (textView = this.d.f29526e) != null) {
                textView.setText(LocaleController.formatString("SharingLiveLocationTitle", R.string.SharingLiveLocationTitle, LocaleController.formatPluralString("Chats", LocationController.getLocationsCount(), new Object[0])));
                return;
            }
            return;
        }
        ((org.telegram.ui.Cells.u7) q1Var.f5501a).setDialog(iu0.p(i9 - 1));
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout u7Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = this.f28878c;
        iu0 iu0Var = this.d;
        if (i9 == 0) {
            b6Var = ((org.telegram.ui.ActionBar.f3) iu0Var).resourcesProvider;
            u7Var = new org.telegram.ui.Cells.u7(54, context, b6Var, false);
        } else {
            u7Var = new dh.g(context, 17);
            u7Var.setWillNotDraw(false);
            TextView textView = new TextView(context);
            iu0Var.f29526e = textView;
            textView.setTextColor(iu0Var.getThemedColor(org.telegram.ui.ActionBar.f6.J5));
            iu0Var.f29526e.setTextSize(1, 14.0f);
            iu0Var.f29526e.setGravity(17);
            iu0Var.f29526e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            u7Var.addView(iu0Var.f29526e, g7.e6.c(40.0f, -1));
        }
        return new f2.q1(u7Var);
    }
}
