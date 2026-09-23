package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final e40 f23237a;

    public d40(e40 e40Var) {
        this.f23237a = e40Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((h51) obj).d;
        e40 e40Var = this.f23237a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(e40Var.f23556a).clearHistory();
            e40Var.f23559f.N(true);
            return;
        }
        Utilities.Callback callback = e40Var.h;
        if (callback != null) {
            callback.run((String) e40Var.f23558c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((h51) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            e40 e40Var = this.f23237a;
            String str = (String) e40Var.f23558c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e40Var.getContext(), 0, e40Var.f23557b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new b3(12, e40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
