package org.telegram.ui.Components;

import java.util.ArrayList;
public final class p01 extends v4.o {
    public final int f38138b = 1;
    public ArrayList f38139c;
    public ArrayList d;

    public p01() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f38138b) {
            case 0:
                r01 r01Var = (r01) this.f38139c.get(i7);
                throw null;
            default:
                rg.a aVar = (rg.a) this.f38139c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56015a != aVar2.f56015a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f38138b) {
            case 0:
                r01 r01Var = (r01) this.f38139c.get(i7);
                throw null;
            default:
                rg.a aVar = (rg.a) this.f38139c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56015a != aVar2.f56015a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f38138b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f38138b) {
            case 0:
                return this.f38139c.size();
            default:
                return this.f38139c.size();
        }
    }

    public p01(ArrayList arrayList, ArrayList arrayList2) {
        this.f38139c = arrayList;
        this.d = arrayList2;
    }
}
