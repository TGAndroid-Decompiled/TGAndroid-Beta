package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public final class n4 extends ArrayAdapter {

    public final t4 f23691a;

    public n4(t4 t4Var, Context context) {
        super(context, 0);
        this.f23691a = t4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        t4 t4Var = this.f23691a;
        com.google.firebase.messaging.o oVar = t4Var.f23796q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = t4Var.I.getWidth();
        if (view != null) {
            int i11 = oVar.f4610a;
            v4.e(view, menuItem, ((t4) oVar.f4613e).Q.f23910j != null);
        } else {
            view = v4.b(((t4) oVar.f4613e).Q, oVar.f4612c, menuItem, true, false, false);
            int i12 = oVar.f4611b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
