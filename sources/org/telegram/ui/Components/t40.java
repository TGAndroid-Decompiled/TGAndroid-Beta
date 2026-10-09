package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final u40 f30985a;

    public t40(u40 u40Var) {
        this.f30985a = u40Var;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((p61) obj).d;
        u40 u40Var = this.f30985a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(u40Var.f31364a).clearHistory();
            u40Var.f31368f.N(true);
            return;
        }
        Utilities.Callback callback = u40Var.h;
        if (callback != null) {
            callback.run((String) u40Var.f31366c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((p61) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            u40 u40Var = this.f30985a;
            String str = (String) u40Var.f31366c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u40Var.getContext(), 0, u40Var.f31365b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new y2(13, u40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
