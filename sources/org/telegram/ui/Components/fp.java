package org.telegram.ui.Components;

import android.content.Context;
public abstract class fp extends c5.k {
    public ep f33620w0;

    public fp(Context context) {
        super(context);
        b(new dp((sf0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (aVar instanceof ep) {
            setAdapter((ep) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(ep epVar) {
        this.f33620w0 = epVar;
        super.setAdapter((c5.a) epVar);
        if (epVar != null) {
            x(epVar.j(), false);
        }
    }
}
