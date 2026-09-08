package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final d40 f24913a;

    public c40(d40 d40Var) {
        this.f24913a = d40Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((h51) obj).d;
        d40 d40Var = this.f24913a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(d40Var.f25249a).clearHistory();
            d40Var.f25253f.N(true);
            return;
        }
        Utilities.Callback callback = d40Var.h;
        if (callback != null) {
            callback.run((String) d40Var.f25251c.get(i10 - 1));
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
            d40 d40Var = this.f24913a;
            String str = (String) d40Var.f25251c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d40Var.getContext(), 0, d40Var.f25250b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new b3(12, d40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
