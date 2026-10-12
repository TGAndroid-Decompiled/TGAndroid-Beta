package org.telegram.ui.Components;

import android.content.Context;
public abstract class oq extends z4.g {
    public nq f29272w0;

    public oq(Context context) {
        super(context);
        b(new mq((wi0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof nq) {
            setAdapter((nq) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(nq nqVar) {
        this.f29272w0 = nqVar;
        super.setAdapter((z4.a) nqVar);
        if (nqVar != null) {
            x(nqVar.j(), false);
        }
    }
}
