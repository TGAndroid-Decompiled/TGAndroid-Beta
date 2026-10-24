package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final k40 f27552a;

    public j40(k40 k40Var) {
        this.f27552a = k40Var;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((l61) obj).d;
        k40 k40Var = this.f27552a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(k40Var.f27854a).clearHistory();
            k40Var.f27857f.N(true);
            return;
        }
        Utilities.Callback callback = k40Var.h;
        if (callback != null) {
            callback.run((String) k40Var.f27856c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((l61) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            k40 k40Var = this.f27552a;
            String str = (String) k40Var.f27856c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k40Var.getContext(), 0, k40Var.f27855b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new o2(str, 18, k40Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
