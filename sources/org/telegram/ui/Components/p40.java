package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final q40 f27835a;

    public p40(q40 q40Var) {
        this.f27835a = q40Var;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((m61) obj).d;
        q40 q40Var = this.f27835a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(q40Var.f28190a).clearHistory();
            q40Var.f28193f.N(true);
            return;
        }
        Utilities.Callback callback = q40Var.h;
        if (callback != null) {
            callback.run((String) q40Var.f28192c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((m61) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            q40 q40Var = this.f27835a;
            String str = (String) q40Var.f28192c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q40Var.getContext(), 0, q40Var.f28191b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new u2(15, q40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
