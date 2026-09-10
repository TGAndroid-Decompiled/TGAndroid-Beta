package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class r4 extends ArrayAdapter {
    public final x4 f18615a;

    public r4(x4 x4Var, Context context) {
        super(context, 0);
        this.f18615a = x4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        x4 x4Var = this.f18615a;
        com.google.firebase.messaging.p pVar = x4Var.f18745q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = x4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = pVar.f6110a;
            if (((x4) pVar.e).Q.f18830j != null) {
                z10 = true;
            }
            z4.e(view, menuItem, z10);
        } else {
            view = z4.b(((x4) pVar.e).Q, (Context) pVar.f6112c, menuItem, true, false, false);
            int i12 = pVar.f6111b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
