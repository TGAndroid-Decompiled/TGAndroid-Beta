package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class n4 extends ArrayAdapter {
    public final t4 f23699a;

    public n4(t4 t4Var, Context context) {
        super(context, 0);
        this.f23699a = t4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        t4 t4Var = this.f23699a;
        com.google.firebase.messaging.n nVar = t4Var.f23806q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = t4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = nVar.f5176a;
            if (((t4) nVar.f5179e).Q.f23900j != null) {
                z10 = true;
            }
            v4.e(view, menuItem, z10);
        } else {
            view = v4.b(((t4) nVar.f5179e).Q, nVar.f5178c, menuItem, true, false, false);
            int i12 = nVar.f5177b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
