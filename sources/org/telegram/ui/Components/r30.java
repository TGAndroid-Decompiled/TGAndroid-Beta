package org.telegram.ui.Components;

import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class r30 implements Utilities.Callback5, Utilities.Callback5Return {

    public final s30 f32070a;

    public r30(s30 s30Var) {
        this.f32070a = s30Var;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((n41) obj).d;
        s30 s30Var = this.f32070a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(s30Var.f32324a).clearHistory();
            s30Var.f32328f.N(true);
        } else {
            Utilities.Callback callback = s30Var.h;
            if (callback != null) {
                callback.run((String) s30Var.f32326c.get(i10 - 1));
            }
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((n41) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            s30 s30Var = this.f32070a;
            String str = (String) s30Var.f32326c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s30Var.getContext(), 0, s30Var.f32325b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new g1(21, s30Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
