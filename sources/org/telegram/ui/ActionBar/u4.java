package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class u4 extends ArrayAdapter {
    public final a5 f23128a;

    public u4(a5 a5Var, Context context) {
        super(context, 0);
        this.f23128a = a5Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        a5 a5Var = this.f23128a;
        com.google.firebase.messaging.m mVar = a5Var.f22408q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = a5Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = mVar.f7751a;
            if (((a5) mVar.e).Q.f22509j != null) {
                z10 = true;
            }
            c5.e(view, menuItem, z10);
        } else {
            view = c5.b(((a5) mVar.e).Q, (Context) mVar.f7753c, menuItem, true, false, false);
            int i12 = mVar.f7752b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
