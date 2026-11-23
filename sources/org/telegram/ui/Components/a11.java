package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
public final class a11 extends v4.o {
    public final int f33270b = 1;
    public ArrayList f33271c;
    public ArrayList d;

    public a11() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f33270b) {
            case 0:
                return true;
            default:
                rg.a aVar = (rg.a) this.f33271c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56634a != aVar2.f56634a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f33270b) {
            case 0:
                d11 d11Var = (d11) this.f33271c.get(i7);
                d11 d11Var2 = (d11) this.d.get(i10);
                if (d11Var.f34344a == d11Var2.f34344a && Objects.equals(d11Var.f34345b, d11Var2.f34345b)) {
                    return true;
                }
                return false;
            default:
                rg.a aVar = (rg.a) this.f33271c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56634a != aVar2.f56634a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f33270b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f33270b) {
            case 0:
                return this.f33271c.size();
            default:
                return this.f33271c.size();
        }
    }

    public a11(ArrayList arrayList, ArrayList arrayList2) {
        this.f33271c = arrayList;
        this.d = arrayList2;
    }
}
