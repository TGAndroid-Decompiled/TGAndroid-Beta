package org.telegram.ui.Components;

import android.content.Context;
public abstract class jq extends z4.g {
    public iq f26120w0;

    public jq(Context context) {
        super(context);
        b(new hq((pi0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof iq) {
            setAdapter((iq) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(iq iqVar) {
        this.f26120w0 = iqVar;
        super.setAdapter((z4.a) iqVar);
        if (iqVar != null) {
            x(iqVar.j(), false);
        }
    }
}
