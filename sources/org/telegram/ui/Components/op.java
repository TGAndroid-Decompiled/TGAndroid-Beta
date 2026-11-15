package org.telegram.ui.Components;

import android.content.Context;
public abstract class op extends c5.l {
    public np f38036x0;

    public op(Context context) {
        super(context);
        b(new mp((vf0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (aVar instanceof np) {
            setAdapter((np) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(np npVar) {
        this.f38036x0 = npVar;
        super.setAdapter((c5.a) npVar);
        if (npVar != null) {
            x(npVar.j(), false);
        }
    }
}
