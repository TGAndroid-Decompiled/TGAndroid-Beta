package org.telegram.ui.Components;

import android.content.Context;
public abstract class mq extends z4.g {
    public lq f28911w0;

    public mq(Context context) {
        super(context);
        b(new kq((ui0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof lq) {
            setAdapter((lq) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(lq lqVar) {
        this.f28911w0 = lqVar;
        super.setAdapter((z4.a) lqVar);
        if (lqVar != null) {
            x(lqVar.j(), false);
        }
    }
}
