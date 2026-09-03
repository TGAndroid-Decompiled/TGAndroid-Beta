package org.telegram.ui.Components;

import android.content.Context;
public abstract class wp extends m2.h {
    public vp f32807t0;

    public wp(Context context) {
        super(context);
        b(new up((xh0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (aVar instanceof vp) {
            setAdapter((vp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(vp vpVar) {
        this.f32807t0 = vpVar;
        super.setAdapter((m2.a) vpVar);
        if (vpVar != null) {
            x(vpVar.j(), false);
        }
    }
}
