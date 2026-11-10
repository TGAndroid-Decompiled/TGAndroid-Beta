package org.telegram.ui.Components;

import java.util.ArrayList;
public final class m01 extends v4.o {
    public final int f35780b = 1;
    public ArrayList f35781c;
    public ArrayList d;

    public m01() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f35780b) {
            case 0:
                o01 o01Var = (o01) this.f35781c.get(i7);
                throw null;
            default:
                rg.a aVar = (rg.a) this.f35781c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f54543a != aVar2.f54543a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f35780b) {
            case 0:
                o01 o01Var = (o01) this.f35781c.get(i7);
                throw null;
            default:
                rg.a aVar = (rg.a) this.f35781c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f54543a != aVar2.f54543a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f35780b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f35780b) {
            case 0:
                return this.f35781c.size();
            default:
                return this.f35781c.size();
        }
    }

    public m01(ArrayList arrayList, ArrayList arrayList2) {
        this.f35781c = arrayList;
        this.d = arrayList2;
    }
}
