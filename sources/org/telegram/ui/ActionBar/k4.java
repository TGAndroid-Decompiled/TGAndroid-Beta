package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class k4 extends ArrayAdapter {
    public final q4 f20464a;

    public k4(q4 q4Var, Context context) {
        super(context, 0);
        this.f20464a = q4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        q4 q4Var = this.f20464a;
        p4 p4Var = q4Var.f20694q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = q4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = p4Var.f20651a;
            if (((q4) p4Var.e).Q.f20781j != null) {
                z10 = true;
            }
            s4.e(view, menuItem, z10);
        } else {
            view = s4.b(((q4) p4Var.e).Q, (Context) p4Var.d, menuItem, true, false, false);
            int i12 = p4Var.f20652b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
