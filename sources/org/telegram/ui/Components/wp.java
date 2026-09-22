package org.telegram.ui.Components;

import android.content.Context;
public abstract class wp extends z4.g {
    public vp f30091w0;

    public wp(Context context) {
        super(context);
        b(new up((bi0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof vp) {
            setAdapter((vp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(vp vpVar) {
        this.f30091w0 = vpVar;
        super.setAdapter((z4.a) vpVar);
        if (vpVar != null) {
            x(vpVar.j(), false);
        }
    }
}
