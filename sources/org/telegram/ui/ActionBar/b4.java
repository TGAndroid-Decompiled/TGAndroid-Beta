package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class b4 extends ArrayAdapter {
    public final i4 f27410a;

    public b4(i4 i4Var, Context context) {
        super(context, 0);
        this.f27410a = i4Var;
    }

    @Override
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        i4 i4Var = this.f27410a;
        h4 h4Var = i4Var.f27622q;
        MenuItem menuItem = (MenuItem) getItem(i3);
        int width = i4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i10 = h4Var.f27573a;
            if (((i4) h4Var.f27576e).Q.f27774j != null) {
                z10 = true;
            }
            k4.e(view, menuItem, z10);
        } else {
            view = k4.b(((i4) h4Var.f27576e).Q, (Context) h4Var.d, menuItem, true, false, false);
            int i11 = h4Var.f27574b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
