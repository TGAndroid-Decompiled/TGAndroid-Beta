package org.telegram.ui.Components;

import android.content.Context;
public abstract class tp extends m2.h {
    public sp f29013t0;

    public tp(Context context) {
        super(context);
        b(new rp((wh0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (aVar instanceof sp) {
            setAdapter((sp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(sp spVar) {
        this.f29013t0 = spVar;
        super.setAdapter((m2.a) spVar);
        if (spVar != null) {
            x(spVar.j(), false);
        }
    }
}
