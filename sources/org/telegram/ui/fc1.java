package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fc1 implements org.telegram.ui.Components.jq {
    public final cd1 f34217a;

    public fc1(cd1 cd1Var) {
        this.f34217a = cd1Var;
    }

    @Override
    public final int I0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        cd1 cd1Var = this.f34217a;
        if (cd1Var.f33321n == 3) {
            org.telegram.ui.ActionBar.i6 i6Var = cd1Var.f33291b0;
            if (i6Var.P && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.X.get(org.telegram.ui.ActionBar.j6.f20078n)) != null) {
                return h6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void k(boolean z4) {
        int i10;
        int i11;
        cd1 cd1Var = this.f34217a;
        org.telegram.ui.ActionBar.h6 h6Var = cd1Var.f33333s;
        if (z4) {
            if (h6Var.f19775r == null) {
                cd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(h6Var.f19762b, h6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.f19762b, h6Var);
                return;
            }
            StringBuilder sb = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            sb.append(MessagesController.getInstance(i10).linkPrefix);
            sb.append("/addtheme/");
            sb.append(h6Var.f19775r.slug);
            String sb2 = sb.toString();
            cd1Var.showDialog(new org.telegram.ui.Components.lq0(cd1Var.getParentActivity(), null, sb2, false, sb2, false, null));
            return;
        }
        org.telegram.ui.Components.z4.W(cd1Var, 1, null, null);
    }

    @Override
    public final void u0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fc1.u0(int, int, boolean):void");
    }

    @Override
    public final void z() {
        cd1 cd1Var = this.f34217a;
        if (cd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cd1Var.getParentActivity());
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new il0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            cd1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(cd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
            }
        }
    }
}
