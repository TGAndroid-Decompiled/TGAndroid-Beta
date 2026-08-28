package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class n4 extends ArrayAdapter {
    public final t4 f23679a;

    public n4(t4 t4Var, Context context) {
        super(context, 0);
        this.f23679a = t4Var;
    }

    @Override
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        t4 t4Var = this.f23679a;
        com.google.firebase.messaging.o oVar = t4Var.f23784q;
        MenuItem menuItem = (MenuItem) getItem(i9);
        int width = t4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i10 = oVar.f4168a;
            if (((t4) oVar.f4171e).Q.f23880j != null) {
                z10 = true;
            }
            v4.e(view, menuItem, z10);
        } else {
            view = v4.b(((t4) oVar.f4171e).Q, oVar.f4170c, menuItem, true, false, false);
            int i11 = oVar.f4169b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
