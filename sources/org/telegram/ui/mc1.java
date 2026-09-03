package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mc1 implements org.telegram.ui.Components.iq {
    public final jd1 f36030a;

    public mc1(jd1 jd1Var) {
        this.f36030a = jd1Var;
    }

    @Override
    public final int H0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        jd1 jd1Var = this.f36030a;
        if (jd1Var.f35213n == 3) {
            org.telegram.ui.ActionBar.i6 i6Var = jd1Var.f35183b0;
            if (i6Var.P && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.X.get(org.telegram.ui.ActionBar.j6.f20053n)) != null) {
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
        jd1 jd1Var = this.f36030a;
        org.telegram.ui.ActionBar.h6 h6Var = jd1Var.f35225s;
        if (z4) {
            if (h6Var.f19750r == null) {
                jd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.p2) jd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(h6Var.f19737b, h6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.f19737b, h6Var);
                return;
            }
            StringBuilder sb = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) jd1Var).currentAccount;
            sb.append(MessagesController.getInstance(i10).linkPrefix);
            sb.append("/addtheme/");
            sb.append(h6Var.f19750r.slug);
            String sb2 = sb.toString();
            jd1Var.showDialog(new org.telegram.ui.Components.lq0(jd1Var.getParentActivity(), null, sb2, false, sb2, false, null));
            return;
        }
        org.telegram.ui.Components.z4.W(jd1Var, 1, null, null);
    }

    @Override
    public final void r0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc1.r0(int, int, boolean):void");
    }

    @Override
    public final void z() {
        jd1 jd1Var = this.f36030a;
        if (jd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jd1Var.getParentActivity());
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            jd1Var.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(jd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
            }
        }
    }
}
