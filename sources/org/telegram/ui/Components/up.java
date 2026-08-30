package org.telegram.ui.Components;

import android.content.Context;
public abstract class up extends m2.h {
    public tp f29268t0;

    public up(Context context) {
        super(context);
        b(new sp((vh0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (aVar instanceof tp) {
            setAdapter((tp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(tp tpVar) {
        this.f29268t0 = tpVar;
        super.setAdapter((m2.a) tpVar);
        if (tpVar != null) {
            x(tpVar.j(), false);
        }
    }
}
