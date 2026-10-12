package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final x40 f32260a;

    public w40(x40 x40Var) {
        this.f32260a = x40Var;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((u61) obj).d;
        x40 x40Var = this.f32260a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(x40Var.f32645a).clearHistory();
            x40Var.f32649f.N(true);
            return;
        }
        Utilities.Callback callback = x40Var.h;
        if (callback != null) {
            callback.run((String) x40Var.f32647c.get(i10 - 1));
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((u61) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            x40 x40Var = this.f32260a;
            String str = (String) x40Var.f32647c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x40Var.getContext(), 0, x40Var.f32646b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new y2(13, x40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
