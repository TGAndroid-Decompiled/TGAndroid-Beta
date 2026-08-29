package org.telegram.ui.Components;

import android.content.Context;
public abstract class qp extends m2.g {
    public pp f32025s0;

    public qp(Context context) {
        super(context);
        b(new op((kh0) this));
    }

    @Override
    @Deprecated
    public void setAdapter(m2.a aVar) {
        if (aVar instanceof pp) {
            setAdapter((pp) aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(pp ppVar) {
        this.f32025s0 = ppVar;
        super.setAdapter((m2.a) ppVar);
        if (ppVar != null) {
            x(ppVar.j(), false);
        }
    }
}
