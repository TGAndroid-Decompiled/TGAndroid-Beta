package org.telegram.ui.Components;

import android.content.Context;
public abstract class fq extends z4.h {
    public eq f26405w0;

    public fq(Context context) {
        super(context);
        b(new dq((ni0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof eq) {
            setAdapter((eq) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(eq eqVar) {
        this.f26405w0 = eqVar;
        super.setAdapter((z4.a) eqVar);
        if (eqVar != null) {
            x(eqVar.j(), false);
        }
    }
}
