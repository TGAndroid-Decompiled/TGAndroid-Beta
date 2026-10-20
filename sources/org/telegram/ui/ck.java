package org.telegram.ui;

import android.content.Context;
public final class ck extends org.telegram.ui.Components.dp {
    public final qn f36000f;

    public ck(qn qnVar, Context context) {
        super(context);
        this.f36000f = qnVar;
    }

    @Override
    public final void a(boolean z10) {
        qn qnVar = this.f36000f;
        qnVar.w7();
        qnVar.u7();
        qnVar.x7();
        qnVar.y7();
        vk vkVar = qnVar.f40636bb;
        if (vkVar != null) {
            vkVar.setTranslationY(qnVar.w9 + getCurrentHeight());
        }
        if (z10) {
            qnVar.D9 = true;
            qnVar.oc();
            return;
        }
        qnVar.t9();
    }
}
