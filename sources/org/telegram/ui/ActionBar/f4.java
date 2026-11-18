package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class f4 extends ArrayAdapter {
    public final k4 f28948a;

    public f4(k4 k4Var, Context context) {
        super(context, 0);
        this.f28948a = k4Var;
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        k4 k4Var = this.f28948a;
        ab.v vVar = k4Var.f29136q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = k4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i10 = vVar.f1000a;
            if (((k4) vVar.f1003e).Q.f29241j != null) {
                z10 = true;
            }
            m4.e(view, menuItem, z10);
        } else {
            view = m4.b(((k4) vVar.f1003e).Q, (Context) vVar.f1002c, menuItem, true, false, false);
            int i11 = vVar.f1001b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
