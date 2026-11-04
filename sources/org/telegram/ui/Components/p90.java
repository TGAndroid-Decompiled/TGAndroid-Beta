package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class p90 extends u4.t {
    public final int S;
    public final KeyEvent.Callback T;

    public p90(KeyEvent.Callback callback, int i3) {
        super(true);
        this.S = i3;
        this.T = callback;
    }

    @Override
    public final boolean B1(int i3) {
        byte b10;
        byte b11;
        org.telegram.messenger.ri d;
        byte b12;
        switch (this.S) {
            case 0:
                x90 x90Var = (x90) this.T;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) x90Var.f40295r.f21842f.get(i3);
                org.telegram.messenger.ui a10 = x90.a(x90Var, ziVar);
                if (a10 == null) {
                    return false;
                }
                ArrayList arrayList = a10.f25702e;
                org.telegram.messenger.ri d10 = a10.d(ziVar);
                if (d10.f25140a == d10.f25141b || (b10 = d10.f25142c) != d10.d || b10 == 0) {
                    return false;
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.ri riVar = (org.telegram.messenger.ri) arrayList.get(i10);
                    if (riVar != d10) {
                        byte b13 = riVar.f25142c;
                        byte b14 = d10.f25142c;
                        if (b13 <= b14 && riVar.d >= b14) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                org.telegram.ui.vf0 vf0Var = (org.telegram.ui.vf0) this.T;
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) vf0Var.N.get((B() - 1) - i3);
                org.telegram.messenger.ui k10 = vf0Var.k(ziVar2);
                if (k10 != null) {
                    ArrayList arrayList2 = k10.f25702e;
                    org.telegram.messenger.ri d11 = k10.d(ziVar2);
                    if (d11.f25140a != d11.f25141b && (b11 = d11.f25142c) == d11.d && b11 != 0) {
                        int size2 = arrayList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            org.telegram.messenger.ri riVar2 = (org.telegram.messenger.ri) arrayList2.get(i11);
                            if (riVar2 != d11) {
                                byte b15 = riVar2.f25142c;
                                byte b16 = d11.f25142c;
                                if (b15 <= b16 && riVar2.d >= b16) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            default:
                gi.c5 c5Var = (gi.c5) this.T;
                ArrayList arrayList3 = c5Var.f56265t0;
                int size3 = (arrayList3.size() - 1) - i3;
                org.telegram.messenger.ui uiVar = c5Var.f56266u0;
                if (uiVar != null && size3 >= 0 && size3 < arrayList3.size() && (d = uiVar.d((org.telegram.messenger.zi) arrayList3.get(size3))) != null && d.f25140a != d.f25141b && (b12 = d.f25142c) == d.d && b12 != 0) {
                    int size4 = uiVar.f25702e.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        org.telegram.messenger.ri riVar3 = (org.telegram.messenger.ri) uiVar.f25702e.get(i12);
                        if (riVar3 != d) {
                            byte b17 = riVar3.f25142c;
                            byte b18 = d.f25142c;
                            if (b17 <= b18 && riVar3.d >= b18) {
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
                if (view instanceof org.telegram.ui.Cells.q1) {
                    return !((org.telegram.ui.Cells.q1) view).getMessageObject().Q3();
                }
                return false;
            default:
                if (view instanceof org.telegram.ui.Cells.q1) {
                    return !((org.telegram.ui.Cells.q1) view).getMessageObject().Q3();
                }
                return false;
        }
    }

    @Override
    public void b0(tf.e eVar, u4.a1 a1Var) {
        switch (this.S) {
            case 0:
                boolean z10 = org.telegram.messenger.r2.f25040a;
                try {
                    super.b0(eVar, a1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new gp(this, 26));
                    return;
                }
            default:
                super.b0(eVar, a1Var);
                return;
        }
    }

    @Override
    public int j(u4.a1 a1Var) {
        switch (this.S) {
            case 1:
                return B0(a1Var);
            default:
                return super.j(a1Var);
        }
    }

    @Override
    public int k(u4.a1 a1Var) {
        switch (this.S) {
            case 1:
                return C0(a1Var);
            default:
                return super.k(a1Var);
        }
    }

    @Override
    public int l(u4.a1 a1Var) {
        switch (this.S) {
            case 1:
                return D0(a1Var);
            default:
                return super.l(a1Var);
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
