package org.telegram.ui.Components;

import java.util.ArrayList;
public final class n01 extends v4.o {
    public final int f36187b = 1;
    public ArrayList f36188c;
    public ArrayList d;

    public n01() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f36187b) {
            case 0:
                p01 p01Var = (p01) this.f36188c.get(i7);
                throw null;
            default:
                rg.a aVar = (rg.a) this.f36188c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f54544a != aVar2.f54544a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f36187b) {
            case 0:
                p01 p01Var = (p01) this.f36188c.get(i7);
                throw null;
            default:
                rg.a aVar = (rg.a) this.f36188c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f54544a != aVar2.f54544a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f36187b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f36187b) {
            case 0:
                return this.f36188c.size();
            default:
                return this.f36188c.size();
        }
    }

    public n01(ArrayList arrayList, ArrayList arrayList2) {
        this.f36188c = arrayList;
        this.d = arrayList2;
    }
}
