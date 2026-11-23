package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class nm0 implements bn0 {
    public final int f50221a;
    public final HashMap f50222b;
    public final ArrayList f50223c;
    public final qm0 d;

    public nm0(qm0 qm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f50221a = i7;
        this.d = qm0Var;
        this.f50222b = hashMap;
        this.f50223c = arrayList;
    }

    @Override
    public final void A(Editable editable) {
        switch (this.f50221a) {
            case 0:
                qm0 qm0Var = this.d;
                org.telegram.ui.Components.yt ytVar = qm0Var.N;
                qm0Var.f51303a = editable;
                ytVar.setText(editable);
                return;
            default:
                qm0 qm0Var2 = this.d;
                org.telegram.ui.Components.yt ytVar2 = qm0Var2.N;
                qm0Var2.f51303a = editable;
                ytVar2.setText(editable);
                return;
        }
    }

    @Override
    public final void b0() {
        int i7 = this.f50221a;
    }

    @Override
    public final boolean e() {
        switch (this.f50221a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void u() {
        int i7 = this.f50221a;
    }

    @Override
    public final void v0(int i7, boolean z10, boolean z11) {
        switch (this.f50221a) {
            case 0:
                qm0 qm0Var = this.d;
                qm0Var.removeSelfFromStack();
                if (!z10) {
                    qm0Var.a0(this.f50222b, this.f50223c, z11, i7);
                    return;
                }
                return;
            default:
                qm0 qm0Var2 = this.d;
                qm0Var2.removeSelfFromStack();
                if (!z10) {
                    qm0Var2.a0(this.f50222b, this.f50223c, z11, i7);
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
