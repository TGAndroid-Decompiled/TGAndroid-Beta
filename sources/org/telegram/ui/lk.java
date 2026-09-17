package org.telegram.ui;

import android.content.Context;
public final class lk extends org.telegram.ui.Components.to {
    public final bo f35579f;

    public lk(bo boVar, Context context) {
        super(context);
        this.f35579f = boVar;
    }

    @Override
    public final void a(boolean z10) {
        bo boVar = this.f35579f;
        boVar.t7();
        boVar.r7();
        boVar.u7();
        boVar.v7();
        dl dlVar = boVar.f32238bb;
        if (dlVar != null) {
            dlVar.setTranslationY(boVar.f32498w9 + getCurrentHeight());
        }
        if (z10) {
            boVar.D9 = true;
            boVar.jc();
            return;
        }
        boVar.o9();
    }
}
