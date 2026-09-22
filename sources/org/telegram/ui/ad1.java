package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ad1 implements org.telegram.ui.Components.lq {
    public final xd1 f32060a;

    public ad1(xd1 xd1Var) {
        this.f32060a = xd1Var;
    }

    @Override
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        xd1 xd1Var = this.f32060a;
        if (xd1Var.f39531n == 3) {
            org.telegram.ui.ActionBar.i6 i6Var = xd1Var.f39508e0;
            if (i6Var.S && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.f18989a0.get(org.telegram.ui.ActionBar.j6.f19287n)) != null) {
                return h6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l(boolean z10) {
        int i10;
        int i11;
        xd1 xd1Var = this.f32060a;
        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f39543s;
        if (z10) {
            if (h6Var.f18956r == null) {
                xd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(h6Var.f18943b, h6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.f18943b, h6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(h6Var.f18956r.slug);
            String sb3 = sb2.toString();
            xd1Var.showDialog(new org.telegram.ui.Components.wq0(xd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.d5.W(xd1Var, 1, null, null);
    }

    @Override
    public final void v0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ad1.v0(int, int, boolean):void");
    }

    @Override
    public final void y() {
        xd1 xd1Var = this.f32060a;
        if (xd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd1Var.getParentActivity());
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ol0(this, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            xd1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(xd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7));
            }
        }
    }
}
