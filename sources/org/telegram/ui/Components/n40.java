package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final o40 f30830a;

    public n40(o40 o40Var) {
        this.f30830a = o40Var;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((t61) obj).d;
        o40 o40Var = this.f30830a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(o40Var.f31150a).clearHistory();
            o40Var.f31153f.O(true);
            return;
        }
        Utilities.Callback callback = o40Var.h;
        if (callback != null) {
            callback.run((String) o40Var.f31152c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((t61) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            o40 o40Var = this.f30830a;
            String str = (String) o40Var.f31152c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o40Var.getContext(), 0, o40Var.f31151b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new p1(22, o40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            e2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
