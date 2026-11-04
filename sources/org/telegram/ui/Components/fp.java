package org.telegram.ui.Components;

import android.content.Context;
public abstract class fp extends b5.l {
    public ep f33833x0;

    public fp(Context context) {
        super(context);
        b(new dp((vf0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(b5.a aVar) {
        if (aVar instanceof ep) {
            setAdapter((ep) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(ep epVar) {
        this.f33833x0 = epVar;
        super.setAdapter((b5.a) epVar);
        if (epVar != null) {
            x(epVar.j(), false);
        }
    }
}
