package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class n4 extends ArrayAdapter {
    public final t4 f20249a;

    public n4(t4 t4Var, Context context) {
        super(context, 0);
        this.f20249a = t4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        t4 t4Var = this.f20249a;
        com.google.firebase.messaging.o oVar = t4Var.f20358q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = t4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = oVar.f6201a;
            if (((t4) oVar.e).Q.f20469j != null) {
                z10 = true;
            }
            v4.e(view, menuItem, z10);
        } else {
            view = v4.b(((t4) oVar.e).Q, (Context) oVar.f6203c, menuItem, true, false, false);
            int i12 = oVar.f6202b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
