package org.telegram.ui;

import android.content.Context;
public final class ck extends org.telegram.ui.Components.dp {
    public final qn f36004f;

    public ck(qn qnVar, Context context) {
        super(context);
        this.f36004f = qnVar;
    }

    @Override
    public final void a(boolean z10) {
        qn qnVar = this.f36004f;
        qnVar.w7();
        qnVar.u7();
        qnVar.x7();
        qnVar.y7();
        vk vkVar = qnVar.f40639bb;
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
