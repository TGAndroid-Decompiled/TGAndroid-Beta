package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final n40 f25160a;

    public m40(n40 n40Var) {
        this.f25160a = n40Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((v51) obj).d;
        n40 n40Var = this.f25160a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(n40Var.f25405a).clearHistory();
            n40Var.f25408f.N(true);
            return;
        }
        Utilities.Callback callback = n40Var.h;
        if (callback != null) {
            callback.run((String) n40Var.f25407c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((v51) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            n40 n40Var = this.f25160a;
            String str = (String) n40Var.f25407c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n40Var.getContext(), 0, n40Var.f25406b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            d2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new km(7, n40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
