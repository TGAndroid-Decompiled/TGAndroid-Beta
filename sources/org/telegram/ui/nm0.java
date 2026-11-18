package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class nm0 implements bn0 {
    public final int f50226a;
    public final HashMap f50227b;
    public final ArrayList f50228c;
    public final qm0 d;

    public nm0(qm0 qm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f50226a = i7;
        this.d = qm0Var;
        this.f50227b = hashMap;
        this.f50228c = arrayList;
    }

    @Override
    public final void A(Editable editable) {
        switch (this.f50226a) {
            case 0:
                qm0 qm0Var = this.d;
                org.telegram.ui.Components.wt wtVar = qm0Var.N;
                qm0Var.f51285a = editable;
                wtVar.setText(editable);
                return;
            default:
                qm0 qm0Var2 = this.d;
                org.telegram.ui.Components.wt wtVar2 = qm0Var2.N;
                qm0Var2.f51285a = editable;
                wtVar2.setText(editable);
                return;
        }
    }

    @Override
    public final void b0() {
        int i7 = this.f50226a;
    }

    @Override
    public final boolean e() {
        switch (this.f50226a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void u() {
        int i7 = this.f50226a;
    }

    @Override
    public final void v0(int i7, boolean z10, boolean z11) {
        switch (this.f50226a) {
            case 0:
                qm0 qm0Var = this.d;
                qm0Var.removeSelfFromStack();
                if (!z10) {
                    qm0Var.a0(this.f50227b, this.f50228c, z11, i7);
                    return;
                }
                return;
            default:
                qm0 qm0Var2 = this.d;
                qm0Var2.removeSelfFromStack();
                if (!z10) {
                    qm0Var2.a0(this.f50227b, this.f50228c, z11, i7);
                    return;
                }
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
