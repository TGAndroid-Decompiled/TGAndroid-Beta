package org.telegram.ui.Components;

import java.util.ArrayList;
public final class l01 extends v4.o {
    public final int f35469b = 1;
    public ArrayList f35470c;
    public ArrayList d;

    public l01() {
    }

    @Override
    public final boolean a(int i7, int i10) {
        switch (this.f35469b) {
            case 0:
                if (((n01) this.f35470c.get(i7)).f36125c == ((n01) this.d.get(i10)).f36125c) {
                    return true;
                }
                return false;
            default:
                rg.a aVar = (rg.a) this.f35470c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f54440a != aVar2.f54440a) {
                    return false;
                }
                return aVar.a(aVar2);
        }
    }

    @Override
    public final boolean b(int i7, int i10) {
        switch (this.f35469b) {
            case 0:
                return ((n01) this.f35470c.get(i7)).f36123a.equals(((n01) this.d.get(i10)).f36123a);
            default:
                rg.a aVar = (rg.a) this.f35470c.get(i7);
                rg.a aVar2 = (rg.a) this.d.get(i10);
                if (aVar.f54440a != aVar2.f54440a) {
                    return false;
                }
                return aVar.equals(aVar2);
        }
    }

    @Override
    public final int d() {
        switch (this.f35469b) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override
    public final int e() {
        switch (this.f35469b) {
            case 0:
                return this.f35470c.size();
            default:
                return this.f35470c.size();
        }
    }

    public l01(ArrayList arrayList, ArrayList arrayList2) {
        this.f35470c = arrayList;
        this.d = arrayList2;
    }
}
