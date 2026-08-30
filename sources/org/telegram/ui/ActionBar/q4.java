package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class q4 extends ArrayAdapter {
    public final w4 f20538a;

    public q4(w4 w4Var, Context context) {
        super(context, 0);
        this.f20538a = w4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        w4 w4Var = this.f20538a;
        com.google.firebase.messaging.n nVar = w4Var.f20709q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = w4Var.I.getWidth();
        boolean z4 = false;
        if (view != null) {
            int i11 = nVar.f4020a;
            if (((w4) nVar.e).Q.f20763j != null) {
                z4 = true;
            }
            y4.e(view, menuItem, z4);
        } else {
            view = y4.b(((w4) nVar.e).Q, nVar.f4022c, menuItem, true, false, false);
            int i12 = nVar.f4021b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
