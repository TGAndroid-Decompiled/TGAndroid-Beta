package org.telegram.ui.Components;

import android.content.Context;
public abstract class jq extends a5.m {
    public iq f29690w0;

    public jq(Context context) {
        super(context);
        b(new hq((ni0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(a5.a aVar) {
        if (aVar instanceof iq) {
            setAdapter((iq) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(iq iqVar) {
        this.f29690w0 = iqVar;
        super.setAdapter((a5.a) iqVar);
        if (iqVar != null) {
            x(iqVar.j(), false);
        }
    }
}
