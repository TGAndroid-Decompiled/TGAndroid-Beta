package org.telegram.ui.Components;

import java.util.ArrayList;
public final class m01 extends v4.o {
    public final int f35836b = 1;
    public ArrayList f35837c;
    public ArrayList d;

    public m01() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f35836b) {
            case 0:
                o01 o01Var = (o01) this.f35837c.get(i7);
                throw null;
            default:
                rg.a aVar = (rg.a) this.f35837c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f54532a != aVar2.f54532a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f35836b) {
            case 0:
                o01 o01Var = (o01) this.f35837c.get(i7);
                throw null;
            default:
                rg.a aVar = (rg.a) this.f35837c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f54532a != aVar2.f54532a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f35836b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f35836b) {
            case 0:
                return this.f35837c.size();
            default:
                return this.f35837c.size();
        }
    }

    public m01(ArrayList arrayList, ArrayList arrayList2) {
        this.f35837c = arrayList;
        this.d = arrayList2;
    }
}
