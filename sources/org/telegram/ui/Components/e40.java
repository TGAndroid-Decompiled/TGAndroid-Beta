package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final f40 f23839a;

    public e40(f40 f40Var) {
        this.f23839a = f40Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((w51) obj).d;
        f40 f40Var = this.f23839a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(f40Var.f24134a).clearHistory();
            f40Var.f24137f.N(true);
            return;
        }
        Utilities.Callback callback = f40Var.h;
        if (callback != null) {
            callback.run((String) f40Var.f24136c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((w51) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            f40 f40Var = this.f23839a;
            String str = (String) f40Var.f24136c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f40Var.getContext(), 0, f40Var.f24135b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new w2(13, f40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
