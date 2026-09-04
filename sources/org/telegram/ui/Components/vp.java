package org.telegram.ui.Components;

import android.content.Context;
public abstract class vp extends z4.g {
    public up f31958w0;

    public vp(Context context) {
        super(context);
        b(new tp((oh0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof up) {
            setAdapter((up) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(up upVar) {
        this.f31958w0 = upVar;
        super.setAdapter((z4.a) upVar);
        if (upVar != null) {
            x(upVar.j(), false);
        }
    }
}
