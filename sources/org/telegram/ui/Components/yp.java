package org.telegram.ui.Components;

import android.content.Context;
public abstract class yp extends z4.g {
    public xp f30685w0;

    public yp(Context context) {
        super(context);
        b(new wp((ai0) this));
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
        this.f30685w0 = xpVar;
        super.setAdapter((z4.a) xpVar);
        if (xpVar != null) {
            x(xpVar.j(), false);
        }
    }
}
