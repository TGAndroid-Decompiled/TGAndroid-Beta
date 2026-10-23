package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class s4 extends ArrayAdapter {
    public final y4 f21841a;

    public s4(y4 y4Var, Context context) {
        super(context, 0);
        this.f21841a = y4Var;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        y4 y4Var = this.f21841a;
        com.google.firebase.messaging.n nVar = y4Var.f22004q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = y4Var.I.getWidth();
        boolean z10 = false;
        if (view != null) {
            int i11 = nVar.f7664a;
            if (((y4) nVar.e).Q.f20697j != null) {
                z10 = true;
            }
            a5.e(view, menuItem, z10);
        } else {
            view = a5.b(((y4) nVar.e).Q, (Context) nVar.f7666c, menuItem, true, false, false);
            int i12 = nVar.f7665b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
