package org.telegram.ui.Components;

import android.content.Context;
public abstract class zp extends z4.g {
    public yp f31047w0;

    public zp(Context context) {
        super(context);
        b(new xp((ci0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof yp) {
            setAdapter((yp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(yp ypVar) {
        this.f31047w0 = ypVar;
        super.setAdapter((z4.a) ypVar);
        if (ypVar != null) {
            x(ypVar.j(), false);
        }
    }
}
