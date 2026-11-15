package org.telegram.ui;

import android.view.View;
public final class pp implements org.telegram.messenger.qr, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.hj0, org.telegram.ui.Components.ij0 {
    public final int f50322a;
    public final qq f50323b;

    public pp(qq qqVar, int i7) {
        this.f50322a = i7;
        this.f50323b = qqVar;
    }

    @Override
    public boolean b(int i7, View view) {
        qq qqVar = this.f50323b;
        if (qqVar.getParentActivity() != null) {
            v4.h0 adapter = qqVar.f50714c.getAdapter();
            mq mqVar = qqVar.f50708a;
            if (adapter == mqVar) {
                return qqVar.m0(mqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        qq.a0(this.f50323b, view, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50322a) {
            case 1:
                this.f50323b.z0();
                return;
            default:
                this.f50323b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j3) {
        qq.Z(this.f50323b, j3);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
