package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class n4 extends ArrayAdapter {
    public final t4 f21402a;

    public n4(t4 t4Var, Context context) {
        super(context, 0);
        this.f21402a = t4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        t4 t4Var = this.f21402a;
        com.google.firebase.messaging.p pVar = t4Var.f21516q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = t4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = pVar.f7961a;
            if (((t4) pVar.f7964e).Q.f21635j != null) {
                z10 = true;
            }
            v4.e(view, menuItem, z10);
        } else {
            view = v4.b(((t4) pVar.f7964e).Q, (Context) pVar.f7963c, menuItem, true, false, false);
            int i12 = pVar.f7962b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
