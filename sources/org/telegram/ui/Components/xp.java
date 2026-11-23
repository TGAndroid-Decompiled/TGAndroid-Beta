package org.telegram.ui.Components;

import android.content.Context;
public abstract class xp extends c5.l {
    public wp f42163x0;

    public xp(Context context) {
        super(context);
        b(new vp((hg0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (aVar instanceof wp) {
            setAdapter((wp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(wp wpVar) {
        this.f42163x0 = wpVar;
        super.setAdapter((c5.a) wpVar);
        if (wpVar != null) {
            x(wpVar.j(), false);
        }
    }
}
