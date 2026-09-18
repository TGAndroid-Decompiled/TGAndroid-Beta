package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class q4 extends ArrayAdapter {
    public final w4 f19531a;

    public q4(w4 w4Var, Context context) {
        super(context, 0);
        this.f19531a = w4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        w4 w4Var = this.f19531a;
        com.google.firebase.messaging.p pVar = w4Var.f19651q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = w4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = pVar.f7343a;
            if (((w4) pVar.e).Q.f19734j != null) {
                z10 = true;
            }
            y4.e(view, menuItem, z10);
        } else {
            view = y4.b(((w4) pVar.e).Q, (Context) pVar.f7345c, menuItem, true, false, false);
            int i12 = pVar.f7344b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
