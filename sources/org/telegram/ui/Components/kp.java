package org.telegram.ui.Components;

import android.content.Context;

public abstract class kp extends m2.g {

    public jp f30163s0;

    public kp(Context context) {
        super(context);
        b(new ip((ch0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (!(aVar instanceof jp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((jp) aVar);
    }

    public void setAdapter(jp jpVar) {
        this.f30163s0 = jpVar;
        super.setAdapter((m2.a) jpVar);
        if (jpVar != null) {
            x(jpVar.j(), false);
        }
    }
}
