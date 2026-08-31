package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class r4 extends ArrayAdapter {
    public final x4 f22274a;

    public r4(x4 x4Var, Context context) {
        super(context, 0);
        this.f22274a = x4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        x4 x4Var = this.f22274a;
        com.google.firebase.messaging.n nVar = x4Var.f22437q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = x4Var.I.getWidth();
        boolean z4 = false;
        if (view != null) {
            int i11 = nVar.f4071a;
            if (((x4) nVar.f4074e).Q.f22497j != null) {
                z4 = true;
            }
            z4.e(view, menuItem, z4);
        } else {
            view = z4.b(((x4) nVar.f4074e).Q, nVar.f4073c, menuItem, true, false, false);
            int i12 = nVar.f4072b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
