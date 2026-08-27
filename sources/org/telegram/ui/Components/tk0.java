package org.telegram.ui.Components;

import android.view.View;

public final class tk0 implements Runnable {

    public final View f32829a;

    public final int f32830b;

    public final float f32831c;
    public final float d;

    public final uk0 f32832e;

    public tk0(uk0 uk0Var, View view, int i10, float f10, float f11) {
        this.f32832e = uk0Var;
        this.f32829a = view;
        this.f32830b = i10;
        this.f32831c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        f2.z zVar = this.f32832e.f33113b;
        zk0 zk0Var = (zk0) zVar.f5868b;
        if (this == zk0Var.O1) {
            zk0Var.O1 = null;
        }
        View view = this.f32829a;
        if (view != null) {
            zk0Var.h1(view, 0.0f, 0.0f, false);
            if (((zk0) zVar.f5868b).N1) {
                return;
            }
            try {
                view.playSoundEffect(0);
            } catch (Exception unused) {
            }
            view.sendAccessibilityEvent(1);
            int i10 = this.f32830b;
            if (i10 != -1) {
                zk0 zk0Var2 = (zk0) zVar.f5868b;
                pk0 pk0Var = zk0Var2.R0;
                if (pk0Var != null) {
                    pk0Var.a(i10, view);
                    return;
                }
                qk0 qk0Var = zk0Var2.S0;
                if (qk0Var != null) {
                    qk0Var.c(this.f32831c - view.getX(), this.d - view.getY(), i10, view);
                }
            }
        }
    }
}
