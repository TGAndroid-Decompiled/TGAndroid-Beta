package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final g40 f24178a;

    public f40(g40 g40Var) {
        this.f24178a = g40Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((x51) obj).d;
        g40 g40Var = this.f24178a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(g40Var.f24452a).clearHistory();
            g40Var.f24455f.N(true);
            return;
        }
        Utilities.Callback callback = g40Var.h;
        if (callback != null) {
            callback.run((String) g40Var.f24454c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((x51) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            g40 g40Var = this.f24178a;
            String str = (String) g40Var.f24454c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g40Var.getContext(), 0, g40Var.f24453b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new w2(13, g40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
