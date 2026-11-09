package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class lm0 implements ym0 {
    public final int f47647a;
    public final HashMap f47648b;
    public final ArrayList f47649c;
    public final om0 d;

    public lm0(om0 om0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f47647a = i7;
        this.d = om0Var;
        this.f47648b = hashMap;
        this.f47649c = arrayList;
    }

    @Override
    public final void A() {
        int i7 = this.f47647a;
    }

    @Override
    public final void B(Editable editable) {
        switch (this.f47647a) {
            case 0:
                om0 om0Var = this.d;
                org.telegram.ui.Components.lt ltVar = om0Var.M;
                om0Var.f48475a = editable;
                ltVar.setText(editable);
                return;
            default:
                om0 om0Var2 = this.d;
                org.telegram.ui.Components.lt ltVar2 = om0Var2.M;
                om0Var2.f48475a = editable;
                ltVar2.setText(editable);
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f47647a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void f0() {
        int i7 = this.f47647a;
    }

    @Override
    public final void v0(int i7, boolean z9, boolean z10) {
        switch (this.f47647a) {
            case 0:
                om0 om0Var = this.d;
                om0Var.removeSelfFromStack();
                if (!z9) {
                    om0Var.a0(this.f47648b, this.f47649c, z10, i7);
                    return;
                }
                return;
            default:
                om0 om0Var2 = this.d;
                om0Var2.removeSelfFromStack();
                if (!z9) {
                    om0Var2.a0(this.f47648b, this.f47649c, z10, i7);
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
