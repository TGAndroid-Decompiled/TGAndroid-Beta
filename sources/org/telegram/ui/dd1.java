package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dd1 implements org.telegram.ui.Components.rq {
    public final ae1 f31887a;

    public dd1(ae1 ae1Var) {
        this.f31887a = ae1Var;
    }

    @Override
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        ae1 ae1Var = this.f31887a;
        if (ae1Var.f30951n == 3) {
            org.telegram.ui.ActionBar.i6 i6Var = ae1Var.f30928e0;
            if (i6Var.S && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.f17835a0.get(org.telegram.ui.ActionBar.j6.f18103n)) != null) {
                return h6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void k(boolean z10) {
        int i10;
        int i11;
        ae1 ae1Var = this.f31887a;
        org.telegram.ui.ActionBar.h6 h6Var = ae1Var.f30963s;
        if (z10) {
            if (h6Var.f17806r == null) {
                ae1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.p2) ae1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(h6Var.f17793b, h6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.f17793b, h6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) ae1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(h6Var.f17806r.slug);
            String sb3 = sb2.toString();
            ae1Var.showDialog(new org.telegram.ui.Components.sq0(ae1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.d5.W(ae1Var, 1, null, null);
    }

    @Override
    public final void t0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dd1.t0(int, int, boolean):void");
    }

    @Override
    public final void x() {
        ae1 ae1Var = this.f31887a;
        if (ae1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ae1Var.getParentActivity());
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ul0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            ae1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(ae1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
            }
        }
    }
}
