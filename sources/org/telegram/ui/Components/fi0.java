package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_fragment;
public final class fi0 implements View.OnClickListener {
    public final int f28407a;
    public final Object f28408b;
    public final Object f28409c;

    public fi0(int i10, Object obj, Object obj2) {
        this.f28407a = i10;
        this.f28409c = obj;
        this.f28408b = obj2;
    }

    @Override
    public final void onClick(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fi0.onClick(android.view.View):void");
    }

    public fi0(Context context, TL_fragment.TL_collectibleInfo tL_collectibleInfo) {
        this.f28407a = 25;
        this.f28408b = context;
        this.f28409c = tL_collectibleInfo;
    }
}
