package org.telegram.ui.Components;

import j$.util.Objects;
import java.util.ArrayList;
public final class b11 extends v4.o {
    public final int f33692b = 1;
    public ArrayList f33693c;
    public ArrayList d;

    public b11() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f33692b) {
            case 0:
                return true;
            default:
                rg.a aVar = (rg.a) this.f33693c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56630a != aVar2.f56630a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f33692b) {
            case 0:
                e11 e11Var = (e11) this.f33693c.get(i7);
                e11 e11Var2 = (e11) this.d.get(i10);
                if (e11Var.f34652a == e11Var2.f34652a && Objects.equals(e11Var.f34653b, e11Var2.f34653b)) {
                    return true;
                }
                return false;
            default:
                rg.a aVar = (rg.a) this.f33693c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f56630a != aVar2.f56630a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f33692b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f33692b) {
            case 0:
                return this.f33693c.size();
            default:
                return this.f33693c.size();
        }
    }

    public b11(ArrayList arrayList, ArrayList arrayList2) {
        this.f33693c = arrayList;
        this.d = arrayList2;
    }
}
