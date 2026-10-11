package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final v40 f31227a;

    public u40(v40 v40Var) {
        this.f31227a = v40Var;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((r61) obj).d;
        v40 v40Var = this.f31227a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(v40Var.f31672a).clearHistory();
            v40Var.f31676f.N(true);
            return;
        }
        Utilities.Callback callback = v40Var.h;
        if (callback != null) {
            callback.run((String) v40Var.f31674c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((r61) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            v40 v40Var = this.f31227a;
            String str = (String) v40Var.f31674c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v40Var.getContext(), 0, v40Var.f31673b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new y2(v40Var, str, false, 14));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
