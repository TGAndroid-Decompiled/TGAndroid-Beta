package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class lm0 implements zm0 {
    public final int f49780a;
    public final HashMap f49781b;
    public final ArrayList f49782c;
    public final om0 d;

    public lm0(om0 om0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f49780a = i7;
        this.d = om0Var;
        this.f49781b = hashMap;
        this.f49782c = arrayList;
    }

    @Override
    public final void S() {
        int i7 = this.f49780a;
    }

    @Override
    public final boolean f() {
        switch (this.f49780a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void g0(int i7, boolean z10, boolean z11) {
        switch (this.f49780a) {
            case 0:
                om0 om0Var = this.d;
                om0Var.removeSelfFromStack();
                if (!z10) {
                    om0Var.a0(this.f49781b, this.f49782c, z11, i7);
                    return;
                }
                return;
            default:
                om0 om0Var2 = this.d;
                om0Var2.removeSelfFromStack();
                if (!z10) {
                    om0Var2.a0(this.f49781b, this.f49782c, z11, i7);
                    return;
                }
                return;
        }
    }

    @Override
    public final void o() {
        int i7 = this.f49780a;
    }

    @Override
    public final void v(Editable editable) {
        switch (this.f49780a) {
            case 0:
                om0 om0Var = this.d;
                org.telegram.ui.Components.wt wtVar = om0Var.N;
                om0Var.f50717a = editable;
                wtVar.setText(editable);
                return;
            default:
                om0 om0Var2 = this.d;
                org.telegram.ui.Components.wt wtVar2 = om0Var2.N;
                om0Var2.f50717a = editable;
                wtVar2.setText(editable);
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
