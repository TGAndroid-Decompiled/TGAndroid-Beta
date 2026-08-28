package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m30 implements Utilities.Callback5, Utilities.Callback5Return {
    public final n30 f30682a;

    public m30(n30 n30Var) {
        this.f30682a = n30Var;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i9 = ((l41) obj).d;
        n30 n30Var = this.f30682a;
        if (i9 == 0) {
            HashtagSearchController.getInstance(n30Var.f31007a).clearHistory();
            n30Var.f31011f.N(true);
            return;
        }
        Utilities.Callback callback = n30Var.h;
        if (callback != null) {
            callback.run((String) n30Var.f31009c.get(i9 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i9 = ((l41) obj).d;
        boolean z10 = false;
        if (i9 != 0) {
            n30 n30Var = this.f30682a;
            String str = (String) n30Var.f31009c.get(i9 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n30Var.getContext(), 0, n30Var.f31008b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new g1(21, n30Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
