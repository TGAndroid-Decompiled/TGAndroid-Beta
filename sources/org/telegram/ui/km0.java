package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class km0 implements xm0 {
    public final int f48720a;
    public final HashMap f48721b;
    public final ArrayList f48722c;
    public final nm0 d;

    public km0(nm0 nm0Var, HashMap hashMap, ArrayList arrayList, int i7) {
        this.f48720a = i7;
        this.d = nm0Var;
        this.f48721b = hashMap;
        this.f48722c = arrayList;
    }

    @Override
    public final void A(Editable editable) {
        switch (this.f48720a) {
            case 0:
                nm0 nm0Var = this.d;
                org.telegram.ui.Components.rt rtVar = nm0Var.N;
                nm0Var.f49583a = editable;
                rtVar.setText(editable);
                return;
            default:
                nm0 nm0Var2 = this.d;
                org.telegram.ui.Components.rt rtVar2 = nm0Var2.N;
                nm0Var2.f49583a = editable;
                rtVar2.setText(editable);
                return;
        }
    }

    @Override
    public final void d0() {
        int i7 = this.f48720a;
    }

    @Override
    public final boolean e() {
        switch (this.f48720a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void t0(int i7, boolean z10, boolean z11) {
        switch (this.f48720a) {
            case 0:
                nm0 nm0Var = this.d;
                nm0Var.removeSelfFromStack();
                if (!z10) {
                    nm0Var.a0(this.f48721b, this.f48722c, z11, i7);
                    return;
                }
                return;
            default:
                nm0 nm0Var2 = this.d;
                nm0Var2.removeSelfFromStack();
                if (!z10) {
                    nm0Var2.a0(this.f48721b, this.f48722c, z11, i7);
                    return;
                }
                return;
        }
    }

    @Override
    public final void y() {
        int i7 = this.f48720a;
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
