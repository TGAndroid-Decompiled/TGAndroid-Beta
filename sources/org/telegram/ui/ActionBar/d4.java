package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class d4 extends ArrayAdapter {
    public final i4 f27423a;

    public d4(i4 i4Var, Context context) {
        super(context, 0);
        this.f27423a = i4Var;
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        i4 i4Var = this.f27423a;
        ab.v vVar = i4Var.f27556q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = i4Var.I.getWidth();
        boolean z9 = false;
        if (view != null) {
            int i10 = vVar.f1002a;
            if (((i4) vVar.f1005e).Q.f27730j != null) {
                z9 = true;
            }
            k4.e(view, menuItem, z9);
        } else {
            view = k4.b(((i4) vVar.f1005e).Q, (Context) vVar.f1004c, menuItem, true, false, false);
            int i11 = vVar.f1003b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
