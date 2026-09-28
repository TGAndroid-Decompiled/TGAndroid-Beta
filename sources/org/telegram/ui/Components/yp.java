package org.telegram.ui.Components;

import android.content.Context;
public abstract class yp extends z4.g {
    public xp f30737w0;

    public yp(Context context) {
        super(context);
        b(new wp((bi0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof xp) {
            setAdapter((xp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(xp xpVar) {
        this.f30737w0 = xpVar;
        super.setAdapter((z4.a) xpVar);
        if (xpVar != null) {
            x(xpVar.j(), false);
        }
    }
}
