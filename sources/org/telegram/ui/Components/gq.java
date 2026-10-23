package org.telegram.ui.Components;

import android.content.Context;
public abstract class gq extends z4.g {
    public fq f26652w0;

    public gq(Context context) {
        super(context);
        b(new eq((li0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof fq) {
            setAdapter((fq) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(fq fqVar) {
        this.f26652w0 = fqVar;
        super.setAdapter((z4.a) fqVar);
        if (fqVar != null) {
            x(fqVar.j(), false);
        }
    }
}
