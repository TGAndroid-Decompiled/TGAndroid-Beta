package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final b40 f26657a;

    public a40(b40 b40Var) {
        this.f26657a = b40Var;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((w41) obj).d;
        b40 b40Var = this.f26657a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(b40Var.f26972a).clearHistory();
            b40Var.f26976f.N(true);
            return;
        }
        Utilities.Callback callback = b40Var.h;
        if (callback != null) {
            callback.run((String) b40Var.f26974c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((w41) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            b40 b40Var = this.f26657a;
            String str = (String) b40Var.f26974c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b40Var.getContext(), 0, b40Var.f26973b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new j1(21, b40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
