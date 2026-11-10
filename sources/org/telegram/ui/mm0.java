package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class mm0 implements zm0 {
    public final int f47988a;
    public final HashMap f47989b;
    public final ArrayList f47990c;
    public final pm0 d;

    public mm0(pm0 pm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f47988a = i7;
        this.d = pm0Var;
        this.f47989b = hashMap;
        this.f47990c = arrayList;
    }

    @Override
    public final void A() {
        int i7 = this.f47988a;
    }

    @Override
    public final void B(Editable editable) {
        switch (this.f47988a) {
            case 0:
                pm0 pm0Var = this.d;
                org.telegram.ui.Components.kt ktVar = pm0Var.M;
                pm0Var.f48793a = editable;
                ktVar.setText(editable);
                return;
            default:
                pm0 pm0Var2 = this.d;
                org.telegram.ui.Components.kt ktVar2 = pm0Var2.M;
                pm0Var2.f48793a = editable;
                ktVar2.setText(editable);
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f47988a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void f0() {
        int i7 = this.f47988a;
    }

    @Override
    public final void v0(int i7, boolean z9, boolean z10) {
        switch (this.f47988a) {
            case 0:
                pm0 pm0Var = this.d;
                pm0Var.removeSelfFromStack();
                if (!z9) {
                    pm0Var.a0(this.f47989b, this.f47990c, z10, i7);
                    return;
                }
                return;
            default:
                pm0 pm0Var2 = this.d;
                pm0Var2.removeSelfFromStack();
                if (!z9) {
                    pm0Var2.a0(this.f47989b, this.f47990c, z10, i7);
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
