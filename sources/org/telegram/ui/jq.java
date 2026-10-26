package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class jq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.am0, org.telegram.ui.Components.bm0 {
    public final int f40717a;
    public final kr f40718b;

    public jq(kr krVar, int i10) {
        this.f40717a = i10;
        this.f40718b = krVar;
    }

    @Override
    public boolean c(int i10, View view) {
        kr krVar = this.f40718b;
        if (krVar.getParentActivity() != null) {
            s4.h0 adapter = krVar.f41010c.getAdapter();
            gr grVar = krVar.f41004a;
            if (adapter == grVar) {
                return krVar.i0(grVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        kr.W(this.f40718b, view, i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40717a) {
            case 1:
                this.f40718b.v0();
                return;
            default:
                this.f40718b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        kr.V(this.f40718b, j10);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
