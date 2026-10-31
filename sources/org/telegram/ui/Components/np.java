package org.telegram.ui.Components;

import android.content.Context;
public abstract class np extends z4.g {
    public mp f28859w0;

    public np(Context context) {
        super(context);
        b(new lp((ug0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof mp) {
            setAdapter((mp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(mp mpVar) {
        this.f28859w0 = mpVar;
        super.setAdapter((z4.a) mpVar);
        if (mpVar != null) {
            x(mpVar.j(), false);
        }
    }
}
