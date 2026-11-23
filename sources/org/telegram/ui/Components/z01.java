package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
public final class z01 extends v4.p {
    public final int f42614b = 1;
    public ArrayList f42615c;
    public ArrayList d;

    public z01() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f42614b) {
            case 0:
                return true;
            default:
                rg.a aVar = (rg.a) this.f42615c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56712a != aVar2.f56712a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f42614b) {
            case 0:
                c11 c11Var = (c11) this.f42615c.get(i7);
                c11 c11Var2 = (c11) this.d.get(i10);
                if (c11Var.f33888a == c11Var2.f33888a && Objects.equals(c11Var.f33889b, c11Var2.f33889b)) {
                    return true;
                }
                return false;
            default:
                rg.a aVar = (rg.a) this.f42615c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56712a != aVar2.f56712a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f42614b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f42614b) {
            case 0:
                return this.f42615c.size();
            default:
                return this.f42615c.size();
        }
    }

    public z01(ArrayList arrayList, ArrayList arrayList2) {
        this.f42615c = arrayList;
        this.d = arrayList2;
    }
}
