package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class jm0 implements wm0 {
    public final int f47006a;
    public final HashMap f47007b;
    public final ArrayList f47008c;
    public final mm0 d;

    public jm0(mm0 mm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f47006a = i7;
        this.d = mm0Var;
        this.f47007b = hashMap;
        this.f47008c = arrayList;
    }

    @Override
    public final void A() {
        int i7 = this.f47006a;
    }

    @Override
    public final void B(Editable editable) {
        switch (this.f47006a) {
            case 0:
                mm0 mm0Var = this.d;
                org.telegram.ui.Components.kt ktVar = mm0Var.M;
                mm0Var.f47834a = editable;
                ktVar.setText(editable);
                return;
            default:
                mm0 mm0Var2 = this.d;
                org.telegram.ui.Components.kt ktVar2 = mm0Var2.M;
                mm0Var2.f47834a = editable;
                ktVar2.setText(editable);
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f47006a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void f0() {
        int i7 = this.f47006a;
    }

    @Override
    public final void v0(int i7, boolean z9, boolean z10) {
        switch (this.f47006a) {
            case 0:
                mm0 mm0Var = this.d;
                mm0Var.removeSelfFromStack();
                if (!z9) {
                    mm0Var.a0(this.f47007b, this.f47008c, z10, i7);
                    return;
                }
                return;
            default:
                mm0 mm0Var2 = this.d;
                mm0Var2.removeSelfFromStack();
                if (!z9) {
                    mm0Var2.a0(this.f47007b, this.f47008c, z10, i7);
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
