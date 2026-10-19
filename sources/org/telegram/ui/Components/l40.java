package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final m40 f28074a;

    public l40(m40 m40Var) {
        this.f28074a = m40Var;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((g61) obj).d;
        m40 m40Var = this.f28074a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(m40Var.f28384a).clearHistory();
            m40Var.f28387f.N(true);
            return;
        }
        Utilities.Callback callback = m40Var.h;
        if (callback != null) {
            callback.run((String) m40Var.f28386c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((g61) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            m40 m40Var = this.f28074a;
            String str = (String) m40Var.f28386c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m40Var.getContext(), 0, m40Var.f28385b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new q2(str, 17, m40Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
