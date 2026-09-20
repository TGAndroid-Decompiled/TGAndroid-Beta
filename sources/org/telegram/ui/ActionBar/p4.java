package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class p4 extends ArrayAdapter {
    public final v4 f19722a;

    public p4(v4 v4Var, Context context) {
        super(context, 0);
        this.f19722a = v4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        v4 v4Var = this.f19722a;
        com.google.firebase.messaging.p pVar = v4Var.f19842q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = v4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = pVar.f7337a;
            if (((v4) pVar.e).Q.f19925j != null) {
                z10 = true;
            }
            x4.e(view, menuItem, z10);
        } else {
            view = x4.b(((v4) pVar.e).Q, (Context) pVar.f7339c, menuItem, true, false, false);
            int i12 = pVar.f7338b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
