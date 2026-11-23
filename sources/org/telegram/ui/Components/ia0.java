package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class ia0 extends v4.u {
    public final int S;
    public final KeyEvent.Callback T;

    public ia0(KeyEvent.Callback callback, int i7) {
        super(true);
        this.S = i7;
        this.T = callback;
    }

    @Override
    public final boolean B1(int i7) {
        byte b10;
        byte b11;
        org.telegram.messenger.yi d;
        byte b12;
        switch (this.S) {
            case 0:
                qa0 qa0Var = (qa0) this.T;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) qa0Var.f38861r.f24737f.get(i7);
                org.telegram.messenger.bj a10 = qa0.a(qa0Var, gjVar);
                if (a10 == null) {
                    return false;
                }
                ArrayList arrayList = a10.f23113e;
                org.telegram.messenger.yi d2 = a10.d(gjVar);
                if (d2.f28092a == d2.f28093b || (b10 = d2.f28094c) != d2.d || b10 == 0) {
                    return false;
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.yi yiVar = (org.telegram.messenger.yi) arrayList.get(i10);
                    if (yiVar != d2) {
                        byte b13 = yiVar.f28094c;
                        byte b14 = d2.f28094c;
                        if (b13 <= b14 && yiVar.d >= b14) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                org.telegram.ui.eg0 eg0Var = (org.telegram.ui.eg0) this.T;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) eg0Var.N.get((B() - 1) - i7);
                org.telegram.messenger.bj l10 = eg0Var.l(gjVar2);
                if (l10 != null) {
                    ArrayList arrayList2 = l10.f23113e;
                    org.telegram.messenger.yi d10 = l10.d(gjVar2);
                    if (d10.f28092a != d10.f28093b && (b11 = d10.f28094c) == d10.d && b11 != 0) {
                        int size2 = arrayList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            org.telegram.messenger.yi yiVar2 = (org.telegram.messenger.yi) arrayList2.get(i11);
                            if (yiVar2 != d10) {
                                byte b15 = yiVar2.f28094c;
                                byte b16 = d10.f28094c;
                                if (b15 <= b16 && yiVar2.d >= b16) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            default:
                hi.a5 a5Var = (hi.a5) this.T;
                ArrayList arrayList3 = a5Var.f58202t0;
                int size3 = (arrayList3.size() - 1) - i7;
                org.telegram.messenger.bj bjVar = a5Var.f58203u0;
                if (bjVar != null && size3 >= 0 && size3 < arrayList3.size() && (d = bjVar.d((org.telegram.messenger.gj) arrayList3.get(size3))) != null && d.f28092a != d.f28093b && (b12 = d.f28094c) == d.d && b12 != 0) {
                    int size4 = bjVar.f23113e.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        org.telegram.messenger.yi yiVar3 = (org.telegram.messenger.yi) bjVar.f23113e.get(i12);
                        if (yiVar3 != d) {
                            byte b17 = yiVar3.f28094c;
                            byte b18 = d.f28094c;
                            if (b17 <= b18 && yiVar3.d >= b18) {
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
                boolean z10 = org.telegram.messenger.s2.f26730a;
                try {
                    super.b0(x0Var, c1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new oo(this, 28));
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
