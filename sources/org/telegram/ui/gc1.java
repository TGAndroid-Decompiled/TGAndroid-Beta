package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gc1 implements org.telegram.ui.Components.lq {
    public final ed1 f37158a;

    public gc1(ed1 ed1Var) {
        this.f37158a = ed1Var;
    }

    @Override
    public final int H0(int i10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        ed1 ed1Var = this.f37158a;
        if (ed1Var.f36521n == 3) {
            org.telegram.ui.ActionBar.j6 j6Var = ed1Var.f36490b0;
            if (j6Var.P && i10 == 0 && (i6Var = (org.telegram.ui.ActionBar.i6) j6Var.X.get(org.telegram.ui.ActionBar.k6.f21832n)) != null) {
                return i6Var.f21470e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void k(boolean z4) {
        int i10;
        int i11;
        ed1 ed1Var = this.f37158a;
        org.telegram.ui.ActionBar.i6 i6Var = ed1Var.f36533s;
        if (z4) {
            if (i6Var.f21482r == null) {
                ed1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.p2) ed1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(i6Var.f21468b, i6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var.f21468b, i6Var);
                return;
            }
            StringBuilder sb = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) ed1Var).currentAccount;
            sb.append(MessagesController.getInstance(i10).linkPrefix);
            sb.append("/addtheme/");
            sb.append(i6Var.f21482r.slug);
            String sb2 = sb.toString();
            ed1Var.showDialog(new org.telegram.ui.Components.mq0(ed1Var.getParentActivity(), null, sb2, false, sb2, false, null));
            return;
        }
        org.telegram.ui.Components.z4.W(ed1Var, 1, null, null);
    }

    @Override
    public final void v0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc1.v0(int, int, boolean):void");
    }

    @Override
    public final void x() {
        ed1 ed1Var = this.f37158a;
        if (ed1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ed1Var.getParentActivity());
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            ed1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(ed1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
            }
        }
    }
}
