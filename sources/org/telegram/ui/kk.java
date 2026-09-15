package org.telegram.ui;

import android.content.Context;
public final class kk extends org.telegram.ui.Components.to {
    public final bo f35181f;

    public kk(bo boVar, Context context) {
        super(context);
        this.f35181f = boVar;
    }

    @Override
    public final void a(boolean z10) {
        bo boVar = this.f35181f;
        boVar.t7();
        boVar.r7();
        boVar.u7();
        boVar.v7();
        dl dlVar = boVar.f32260bb;
        if (dlVar != null) {
            dlVar.setTranslationY(boVar.f32520w9 + getCurrentHeight());
        }
        if (z10) {
            boVar.D9 = true;
            boVar.jc();
            return;
        }
        boVar.o9();
    }
}
