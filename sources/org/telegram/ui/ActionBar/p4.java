package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class p4 extends ArrayAdapter {
    public final v4 f19499a;

    public p4(v4 v4Var, Context context) {
        super(context, 0);
        this.f19499a = v4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        v4 v4Var = this.f19499a;
        com.google.firebase.messaging.p pVar = v4Var.f19619q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = v4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = pVar.f7340a;
            if (((v4) pVar.e).Q.f19702j != null) {
                z10 = true;
            }
            x4.e(view, menuItem, z10);
        } else {
            view = x4.b(((v4) pVar.e).Q, (Context) pVar.f7342c, menuItem, true, false, false);
            int i12 = pVar.f7341b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
