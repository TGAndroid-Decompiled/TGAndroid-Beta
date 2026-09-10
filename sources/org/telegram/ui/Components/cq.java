package org.telegram.ui.Components;

import android.content.Context;
public abstract class cq extends z4.g {
    public bq f22213w0;

    public cq(Context context) {
        super(context);
        b(new aq((yh0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof bq) {
            setAdapter((bq) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(bq bqVar) {
        this.f22213w0 = bqVar;
        super.setAdapter((z4.a) bqVar);
        if (bqVar != null) {
            x(bqVar.j(), false);
        }
    }
}
