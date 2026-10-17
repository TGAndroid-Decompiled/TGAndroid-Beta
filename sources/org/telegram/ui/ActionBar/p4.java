package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class p4 extends ArrayAdapter {
    public final v4 f21666a;

    public p4(v4 v4Var, Context context) {
        super(context, 0);
        this.f21666a = v4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        v4 v4Var = this.f21666a;
        com.google.firebase.messaging.n nVar = v4Var.f21810q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = v4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = nVar.f7654a;
            if (((v4) nVar.e).Q.f21880j != null) {
                z10 = true;
            }
            x4.e(view, menuItem, z10);
        } else {
            view = x4.b(((v4) nVar.e).Q, (Context) nVar.f7656c, menuItem, true, false, false);
            int i12 = nVar.f7655b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
