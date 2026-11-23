package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class e4 extends ArrayAdapter {
    public final j4 f28898a;

    public e4(j4 j4Var, Context context) {
        super(context, 0);
        this.f28898a = j4Var;
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        j4 j4Var = this.f28898a;
        ab.v vVar = j4Var.f29030q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = j4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i10 = vVar.f1000a;
            if (((j4) vVar.f1003e).Q.f29192j != null) {
                z10 = true;
            }
            l4.e(view, menuItem, z10);
        } else {
            view = l4.b(((j4) vVar.f1003e).Q, (Context) vVar.f1002c, menuItem, true, false, false);
            int i11 = vVar.f1001b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
