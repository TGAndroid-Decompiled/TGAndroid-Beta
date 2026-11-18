package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
public final class z01 extends v4.o {
    public final int f42706b = 1;
    public ArrayList f42707c;
    public ArrayList d;

    public z01() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f42706b) {
            case 0:
                return true;
            default:
                rg.a aVar = (rg.a) this.f42707c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56589a != aVar2.f56589a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f42706b) {
            case 0:
                c11 c11Var = (c11) this.f42707c.get(i7);
                c11 c11Var2 = (c11) this.d.get(i10);
                if (c11Var.f33850a == c11Var2.f33850a && Objects.equals(c11Var.f33851b, c11Var2.f33851b)) {
                    return true;
                }
                return false;
            default:
                rg.a aVar = (rg.a) this.f42707c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56589a != aVar2.f56589a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f42706b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f42706b) {
            case 0:
                return this.f42707c.size();
            default:
                return this.f42707c.size();
        }
    }

    public z01(ArrayList arrayList, ArrayList arrayList2) {
        this.f42707c = arrayList;
        this.d = arrayList2;
    }
}
