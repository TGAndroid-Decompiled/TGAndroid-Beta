package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class jq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.am0, org.telegram.ui.Components.bm0 {
    public final int f40714a;
    public final kr f40715b;

    public jq(kr krVar, int i10) {
        this.f40714a = i10;
        this.f40715b = krVar;
    }

    @Override
    public boolean c(int i10, View view) {
        kr krVar = this.f40715b;
        if (krVar.getParentActivity() != null) {
            s4.h0 adapter = krVar.f41007c.getAdapter();
            gr grVar = krVar.f41001a;
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
        kr.W(this.f40715b, view, i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40714a) {
            case 1:
                this.f40715b.v0();
                return;
            default:
                this.f40715b.finishFragment();
                return;
        }
    }

    @Override
    public void run(long j10) {
        kr.V(this.f40715b, j10);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
