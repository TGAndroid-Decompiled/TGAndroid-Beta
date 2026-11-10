package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rk extends v4.c0 {
    public final kg.c0 f37678r;

    public rk(kg.c0 c0Var, Context context) {
        super(context);
        this.f37678r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        int k10 = super.k(i7, view);
        vk vkVar = (vk) this.f37678r.V;
        return k10 - (vkVar.L.getPaddingTop() - (vkVar.f39032q0 - vkVar.f39031p0));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 4;
    }
}
