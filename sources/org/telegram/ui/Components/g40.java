package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final h40 f27086a;

    public g40(h40 h40Var) {
        this.f27086a = h40Var;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((h51) obj).d;
        h40 h40Var = this.f27086a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(h40Var.f27353a).clearHistory();
            h40Var.f27357f.N(true);
            return;
        }
        Utilities.Callback callback = h40Var.h;
        if (callback != null) {
            callback.run((String) h40Var.f27355c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((h51) obj).d;
        boolean z4 = false;
        if (i10 != 0) {
            h40 h40Var = this.f27086a;
            String str = (String) h40Var.f27355c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h40Var.getContext(), 0, h40Var.f27354b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new o1(20, h40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.show();
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
