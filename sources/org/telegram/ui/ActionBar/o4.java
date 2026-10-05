package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class o4 extends ArrayAdapter {
    public final u4 f21447a;

    public o4(u4 u4Var, Context context) {
        super(context, 0);
        this.f21447a = u4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        u4 u4Var = this.f21447a;
        com.google.firebase.messaging.p pVar = u4Var.f21560q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = u4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = pVar.f7913a;
            if (((u4) pVar.f7916e).Q.f21679j != null) {
                z10 = true;
            }
            w4.e(view, menuItem, z10);
        } else {
            view = w4.b(((u4) pVar.f7916e).Q, (Context) pVar.f7915c, menuItem, true, false, false);
            int i12 = pVar.f7914b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
