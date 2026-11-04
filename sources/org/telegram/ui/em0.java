package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class em0 implements rm0 {
    public final int f45003a;
    public final HashMap f45004b;
    public final ArrayList f45005c;
    public final hm0 d;

    public em0(hm0 hm0Var, HashMap hashMap, ArrayList arrayList, int i3) {
        this.f45003a = i3;
        this.d = hm0Var;
        this.f45004b = hashMap;
        this.f45005c = arrayList;
    }

    @Override
    public final void c0() {
        int i3 = this.f45003a;
    }

    @Override
    public final boolean e() {
        switch (this.f45003a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void m() {
        int i3 = this.f45003a;
    }

    @Override
    public final void u(Editable editable) {
        switch (this.f45003a) {
            case 0:
                hm0 hm0Var = this.d;
                org.telegram.ui.Components.jt jtVar = hm0Var.N;
                hm0Var.f45935a = editable;
                jtVar.setText(editable);
                return;
            default:
                hm0 hm0Var2 = this.d;
                org.telegram.ui.Components.jt jtVar2 = hm0Var2.N;
                hm0Var2.f45935a = editable;
                jtVar2.setText(editable);
                return;
        }
    }

    @Override
    public final void v0(int i3, boolean z10, boolean z11) {
        switch (this.f45003a) {
            case 0:
                hm0 hm0Var = this.d;
                hm0Var.removeSelfFromStack();
                if (!z10) {
                    hm0Var.a0(this.f45004b, this.f45005c, z11, i3);
                    return;
                }
                return;
            default:
                hm0 hm0Var2 = this.d;
                hm0Var2.removeSelfFromStack();
                if (!z10) {
                    hm0Var2.a0(this.f45004b, this.f45005c, z11, i3);
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
