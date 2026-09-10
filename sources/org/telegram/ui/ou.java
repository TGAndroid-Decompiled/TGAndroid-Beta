package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ou implements View.OnClickListener {
    public final int f35599a;
    public final boolean f35600b;
    public final Object f35601c;
    public final Object d;
    public final Object e;

    public ou(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f35599a = i10;
        this.f35601c = obj;
        this.d = obj2;
        this.f35600b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ou.onClick(android.view.View):void");
    }

    public ou(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, on0 on0Var, boolean z10) {
        this.f35599a = 1;
        this.f35601c = on0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f35600b = z10;
    }
}
