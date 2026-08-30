package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final f40 f24460a;

    public e40(f40 f40Var) {
        this.f24460a = f40Var;
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((i51) obj).d;
        f40 f40Var = this.f24460a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(f40Var.f24773a).clearHistory();
            f40Var.f24776f.N(true);
            return;
        }
        Utilities.Callback callback = f40Var.h;
        if (callback != null) {
            callback.run((String) f40Var.f24775c.get(i10 - 1));
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
            f40 f40Var = this.f24460a;
            String str = (String) f40Var.f24775c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f40Var.getContext(), 0, f40Var.f24774b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new o1(20, f40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.show();
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
