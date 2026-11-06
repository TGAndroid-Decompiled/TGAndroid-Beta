package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class jm0 implements wm0 {
    public final int f46983a;
    public final HashMap f46984b;
    public final ArrayList f46985c;
    public final mm0 d;

    public jm0(mm0 mm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f46983a = i7;
        this.d = mm0Var;
        this.f46984b = hashMap;
        this.f46985c = arrayList;
    }

    @Override
    public final void A() {
        int i7 = this.f46983a;
    }

    @Override
    public final void B(Editable editable) {
        switch (this.f46983a) {
            case 0:
                mm0 mm0Var = this.d;
                org.telegram.ui.Components.kt ktVar = mm0Var.M;
                mm0Var.f47808a = editable;
                ktVar.setText(editable);
                return;
            default:
                mm0 mm0Var2 = this.d;
                org.telegram.ui.Components.kt ktVar2 = mm0Var2.M;
                mm0Var2.f47808a = editable;
                ktVar2.setText(editable);
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f46983a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void f0() {
        int i7 = this.f46983a;
    }

    @Override
    public final void v0(int i7, boolean z9, boolean z10) {
        switch (this.f46983a) {
            case 0:
                mm0 mm0Var = this.d;
                mm0Var.removeSelfFromStack();
                if (!z9) {
                    mm0Var.a0(this.f46984b, this.f46985c, z10, i7);
                    return;
                }
                return;
            default:
                mm0 mm0Var2 = this.d;
                mm0Var2.removeSelfFromStack();
                if (!z9) {
                    mm0Var2.a0(this.f46984b, this.f46985c, z10, i7);
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
