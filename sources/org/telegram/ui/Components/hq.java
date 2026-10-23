package org.telegram.ui.Components;

import android.content.Context;
public abstract class hq extends z4.h {
    public gq f27018w0;

    public hq(Context context) {
        super(context);
        b(new fq((oi0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof gq) {
            setAdapter((gq) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(gq gqVar) {
        this.f27018w0 = gqVar;
        super.setAdapter((z4.a) gqVar);
        if (gqVar != null) {
            x(gqVar.j(), false);
        }
    }
}
