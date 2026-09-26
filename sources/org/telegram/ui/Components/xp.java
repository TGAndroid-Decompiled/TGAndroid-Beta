package org.telegram.ui.Components;

import android.content.Context;
public abstract class xp extends z4.g {
    public wp f30383w0;

    public xp(Context context) {
        super(context);
        b(new vp((zh0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (aVar instanceof wp) {
            setAdapter((wp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(wp wpVar) {
        this.f30383w0 = wpVar;
        super.setAdapter((z4.a) wpVar);
        if (wpVar != null) {
            x(wpVar.j(), false);
        }
    }
}
