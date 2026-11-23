package org.telegram.ui.Components;

import android.content.Context;
public abstract class up extends c5.l {
    public tp f40427x0;

    public up(Context context) {
        super(context);
        b(new sp((gg0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (aVar instanceof tp) {
            setAdapter((tp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(tp tpVar) {
        this.f40427x0 = tpVar;
        super.setAdapter((c5.a) tpVar);
        if (tpVar != null) {
            x(tpVar.j(), false);
        }
    }
}
