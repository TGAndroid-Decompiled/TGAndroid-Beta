package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final h40 f24416a;

    public g40(h40 h40Var) {
        this.f24416a = h40Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((y51) obj).d;
        h40 h40Var = this.f24416a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(h40Var.f24734a).clearHistory();
            h40Var.f24737f.N(true);
            return;
        }
        Utilities.Callback callback = h40Var.h;
        if (callback != null) {
            callback.run((String) h40Var.f24736c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((y51) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            h40 h40Var = this.f24416a;
            String str = (String) h40Var.f24736c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h40Var.getContext(), 0, h40Var.f24735b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new w2(13, h40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
