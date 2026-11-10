package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class e4 extends ArrayAdapter {
    public final j4 f27443a;

    public e4(j4 j4Var, Context context) {
        super(context, 0);
        this.f27443a = j4Var;
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        j4 j4Var = this.f27443a;
        ab.v vVar = j4Var.f27584q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = j4Var.I.getWidth();
        boolean z9 = false;
        if (view != null) {
            int i10 = vVar.f1002a;
            if (((j4) vVar.f1005e).Q.f27759j != null) {
                z9 = true;
            }
            l4.e(view, menuItem, z9);
        } else {
            view = l4.b(((j4) vVar.f1005e).Q, (Context) vVar.f1004c, menuItem, true, false, false);
            int i11 = vVar.f1003b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
