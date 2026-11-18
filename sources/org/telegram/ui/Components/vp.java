package org.telegram.ui.Components;

import android.content.Context;
public abstract class vp extends c5.l {
    public up f41384x0;

    public vp(Context context) {
        super(context);
        b(new tp((fg0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (aVar instanceof up) {
            setAdapter((up) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(up upVar) {
        this.f41384x0 = upVar;
        super.setAdapter((c5.a) upVar);
        if (upVar != null) {
            x(upVar.j(), false);
        }
    }
}
