package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class ga0 extends v4.u {
    public final int S;
    public final KeyEvent.Callback T;

    public ga0(KeyEvent.Callback callback, int i7) {
        super(true);
        this.S = i7;
        this.T = callback;
    }

    @Override
    public final boolean B1(int i7) {
        byte b10;
        byte b11;
        org.telegram.messenger.xi d;
        byte b12;
        switch (this.S) {
            case 0:
                oa0 oa0Var = (oa0) this.T;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) oa0Var.f38049r.f24456f.get(i7);
                org.telegram.messenger.aj a10 = oa0.a(oa0Var, fjVar);
                if (a10 == null) {
                    return false;
                }
                ArrayList arrayList = a10.f22898e;
                org.telegram.messenger.xi d2 = a10.d(fjVar);
                if (d2.f27880a == d2.f27881b || (b10 = d2.f27882c) != d2.d || b10 == 0) {
                    return false;
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.xi xiVar = (org.telegram.messenger.xi) arrayList.get(i10);
                    if (xiVar != d2) {
                        byte b13 = xiVar.f27882c;
                        byte b14 = d2.f27882c;
                        if (b13 <= b14 && xiVar.d >= b14) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) this.T;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) fg0Var.N.get((B() - 1) - i7);
                org.telegram.messenger.aj l10 = fg0Var.l(fjVar2);
                if (l10 != null) {
                    ArrayList arrayList2 = l10.f22898e;
                    org.telegram.messenger.xi d10 = l10.d(fjVar2);
                    if (d10.f27880a != d10.f27881b && (b11 = d10.f27882c) == d10.d && b11 != 0) {
                        int size2 = arrayList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            org.telegram.messenger.xi xiVar2 = (org.telegram.messenger.xi) arrayList2.get(i11);
                            if (xiVar2 != d10) {
                                byte b15 = xiVar2.f27882c;
                                byte b16 = d10.f27882c;
                                if (b15 <= b16 && xiVar2.d >= b16) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            default:
                hi.b5 b5Var = (hi.b5) this.T;
                ArrayList arrayList3 = b5Var.f58142t0;
                int size3 = (arrayList3.size() - 1) - i7;
                org.telegram.messenger.aj ajVar = b5Var.f58143u0;
                if (ajVar != null && size3 >= 0 && size3 < arrayList3.size() && (d = ajVar.d((org.telegram.messenger.fj) arrayList3.get(size3))) != null && d.f27880a != d.f27881b && (b12 = d.f27882c) == d.d && b12 != 0) {
                    int size4 = ajVar.f22898e.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        org.telegram.messenger.xi xiVar3 = (org.telegram.messenger.xi) ajVar.f22898e.get(i12);
                        if (xiVar3 != d) {
                            byte b17 = xiVar3.f27882c;
                            byte b18 = d.f27882c;
                            if (b17 <= b18 && xiVar3.d >= b18) {
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public final boolean C1(View view) {
        switch (this.S) {
            case 0:
                return false;
            case 1:
                if (view instanceof org.telegram.ui.Cells.r1) {
                    return !((org.telegram.ui.Cells.r1) view).getMessageObject().P3();
                }
                return false;
            default:
                if (view instanceof org.telegram.ui.Cells.r1) {
                    return !((org.telegram.ui.Cells.r1) view).getMessageObject().P3();
                }
                return false;
        }
    }

    @Override
    public void b0(v4.x0 x0Var, v4.c1 c1Var) {
        switch (this.S) {
            case 0:
                boolean z10 = org.telegram.messenger.s2.f26721a;
                try {
                    super.b0(x0Var, c1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new mo(this, 28));
                    return;
                }
            default:
                super.b0(x0Var, c1Var);
                return;
        }
    }

    @Override
    public int j(v4.c1 c1Var) {
        switch (this.S) {
            case 1:
                return B0(c1Var);
            default:
                return super.j(c1Var);
        }
    }

    @Override
    public int k(v4.c1 c1Var) {
        switch (this.S) {
            case 1:
                return C0(c1Var);
            default:
                return super.k(c1Var);
        }
    }

    @Override
    public int l(v4.c1 c1Var) {
        switch (this.S) {
            case 1:
                return D0(c1Var);
            default:
                return super.l(c1Var);
        }
    }

    @Override
    public boolean y0() {
        switch (this.S) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                return super.y0();
        }
    }
}
