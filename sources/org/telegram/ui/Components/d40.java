package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final e40 f23466a;

    public d40(e40 e40Var) {
        this.f23466a = e40Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((v51) obj).d;
        e40 e40Var = this.f23466a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(e40Var.f23831a).clearHistory();
            e40Var.f23834f.N(true);
            return;
        }
        Utilities.Callback callback = e40Var.h;
        if (callback != null) {
            callback.run((String) e40Var.f23833c.get(i10 - 1));
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
            e40 e40Var = this.f23466a;
            String str = (String) e40Var.f23833c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e40Var.getContext(), 0, e40Var.f23832b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new w2(13, e40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
