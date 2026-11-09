package org.telegram.ui;

import android.view.View;
public final class pp implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.dj0, org.telegram.ui.Components.ej0 {
    public final int f48773a;
    public final qq f48774b;

    public pp(qq qqVar, int i7) {
        this.f48773a = i7;
        this.f48774b = qqVar;
    }

    @Override
    public boolean c(int i7, View view) {
        qq qqVar = this.f48774b;
        if (qqVar.getParentActivity() != null) {
            v4.g0 adapter = qqVar.f49121c.getAdapter();
            mq mqVar = qqVar.f49115a;
            if (adapter == mqVar) {
                return qqVar.m0(mqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        qq.a0(this.f48774b, view, i7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48773a) {
            case 1:
                this.f48774b.z0();
                return;
            default:
                this.f48774b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        qq.Z(this.f48774b, j3);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
