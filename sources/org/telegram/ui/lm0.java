package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class lm0 implements ym0 {
    public final int f49002a;
    public final HashMap f49003b;
    public final ArrayList f49004c;
    public final om0 d;

    public lm0(om0 om0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f49002a = i7;
        this.d = om0Var;
        this.f49003b = hashMap;
        this.f49004c = arrayList;
    }

    @Override
    public final void A(Editable editable) {
        switch (this.f49002a) {
            case 0:
                om0 om0Var = this.d;
                org.telegram.ui.Components.rt rtVar = om0Var.N;
                om0Var.f49994a = editable;
                rtVar.setText(editable);
                return;
            default:
                om0 om0Var2 = this.d;
                org.telegram.ui.Components.rt rtVar2 = om0Var2.N;
                om0Var2.f49994a = editable;
                rtVar2.setText(editable);
                return;
        }
    }

    @Override
    public final void d0() {
        int i7 = this.f49002a;
    }

    @Override
    public final boolean e() {
        switch (this.f49002a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void t0(int i7, boolean z10, boolean z11) {
        switch (this.f49002a) {
            case 0:
                om0 om0Var = this.d;
                om0Var.removeSelfFromStack();
                if (!z10) {
                    om0Var.a0(this.f49003b, this.f49004c, z11, i7);
                    return;
                }
                return;
            default:
                om0 om0Var2 = this.d;
                om0Var2.removeSelfFromStack();
                if (!z10) {
                    om0Var2.a0(this.f49003b, this.f49004c, z11, i7);
                    return;
                }
                return;
        }
    }

    @Override
    public final void y() {
        int i7 = this.f49002a;
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
