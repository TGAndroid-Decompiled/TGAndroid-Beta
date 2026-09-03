package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final g40 f24791a;

    public f40(g40 g40Var) {
        this.f24791a = g40Var;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((i51) obj).d;
        g40 g40Var = this.f24791a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(g40Var.f25038a).clearHistory();
            g40Var.f25041f.N(true);
            return;
        }
        Utilities.Callback callback = g40Var.h;
        if (callback != null) {
            callback.run((String) g40Var.f25040c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((i51) obj).d;
        boolean z4 = false;
        if (i10 != 0) {
            g40 g40Var = this.f24791a;
            String str = (String) g40Var.f25040c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g40Var.getContext(), 0, g40Var.f25039b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new o1(20, g40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.show();
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
