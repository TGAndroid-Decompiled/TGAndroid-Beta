package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class b4 extends ArrayAdapter {
    public final g4 f28447a;

    public b4(g4 g4Var, Context context) {
        super(context, 0);
        this.f28447a = g4Var;
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        g4 g4Var = this.f28447a;
        ab.v vVar = g4Var.f28576q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = g4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i10 = vVar.f1001a;
            if (((g4) vVar.f1004e).Q.f28692j != null) {
                z10 = true;
            }
            i4.e(view, menuItem, z10);
        } else {
            view = i4.b(((g4) vVar.f1004e).Q, (Context) vVar.f1003c, menuItem, true, false, false);
            int i11 = vVar.f1002b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
