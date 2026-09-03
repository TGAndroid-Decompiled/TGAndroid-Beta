package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class q4 extends ArrayAdapter {
    public final w4 f20513a;

    public q4(w4 w4Var, Context context) {
        super(context, 0);
        this.f20513a = w4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        w4 w4Var = this.f20513a;
        com.google.firebase.messaging.n nVar = w4Var.f20684q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = w4Var.I.getWidth();
        boolean z4 = false;
        if (view != null) {
            int i11 = nVar.f3998a;
            if (((w4) nVar.e).Q.f20738j != null) {
                z4 = true;
            }
            y4.e(view, menuItem, z4);
        } else {
            view = y4.b(((w4) nVar.e).Q, (Context) nVar.f4000c, menuItem, true, false, false);
            int i12 = nVar.f3999b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
