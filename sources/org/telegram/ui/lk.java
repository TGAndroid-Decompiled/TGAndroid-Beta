package org.telegram.ui;

import android.content.Context;
public final class lk extends org.telegram.ui.Components.to {
    public final bo f35584f;

    public lk(bo boVar, Context context) {
        super(context);
        this.f35584f = boVar;
    }

    @Override
    public final void a(boolean z10) {
        bo boVar = this.f35584f;
        boVar.t7();
        boVar.r7();
        boVar.u7();
        boVar.v7();
        dl dlVar = boVar.f32228ab;
        if (dlVar != null) {
            dlVar.setTranslationY(boVar.f32502w9 + getCurrentHeight());
        }
        if (z10) {
            boVar.D9 = true;
            boVar.jc();
            return;
        }
        boVar.o9();
    }
}
