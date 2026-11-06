package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
public final class u90 extends v4.t {
    public final int S;
    public final KeyEvent.Callback T;

    public u90(KeyEvent.Callback callback, int i7) {
        super(true);
        this.S = i7;
        this.T = callback;
    }

    @Override
    public final boolean B1(int i7) {
        byte b10;
        byte b11;
        org.telegram.messenger.aj d;
        byte b12;
        switch (this.S) {
            case 0:
                ca0 ca0Var = (ca0) this.T;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) ca0Var.f32498r.f23697f.get(i7);
                org.telegram.messenger.dj a10 = ca0.a(ca0Var, ijVar);
                if (a10 == null) {
                    return false;
                }
                ArrayList arrayList = a10.f22012e;
                org.telegram.messenger.aj d2 = a10.d(ijVar);
                if (d2.f21442a == d2.f21443b || (b10 = d2.f21444c) != d2.d || b10 == 0) {
                    return false;
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) arrayList.get(i10);
                    if (ajVar != d2) {
                        byte b13 = ajVar.f21444c;
                        byte b14 = d2.f21444c;
                        if (b13 <= b14 && ajVar.d >= b14) {
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                org.telegram.ui.bg0 bg0Var = (org.telegram.ui.bg0) this.T;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) bg0Var.M.get((B() - 1) - i7);
                org.telegram.messenger.dj k10 = bg0Var.k(ijVar2);
                if (k10 != null) {
                    ArrayList arrayList2 = k10.f22012e;
                    org.telegram.messenger.aj d10 = k10.d(ijVar2);
                    if (d10.f21442a != d10.f21443b && (b11 = d10.f21444c) == d10.d && b11 != 0) {
                        int size2 = arrayList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) arrayList2.get(i11);
                            if (ajVar2 != d10) {
                                byte b15 = ajVar2.f21444c;
                                byte b16 = d10.f21444c;
                                if (b15 <= b16 && ajVar2.d >= b16) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            default:
                fi.e5 e5Var = (fi.e5) this.T;
                ArrayList arrayList3 = e5Var.f55871s0;
                int size3 = (arrayList3.size() - 1) - i7;
                org.telegram.messenger.dj djVar = e5Var.f55872t0;
                if (djVar != null && size3 >= 0 && size3 < arrayList3.size() && (d = djVar.d((org.telegram.messenger.ij) arrayList3.get(size3))) != null && d.f21442a != d.f21443b && (b12 = d.f21444c) == d.d && b12 != 0) {
                    int size4 = djVar.f22012e.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        org.telegram.messenger.aj ajVar3 = (org.telegram.messenger.aj) djVar.f22012e.get(i12);
                        if (ajVar3 != d) {
                            byte b17 = ajVar3.f21444c;
                            byte b18 = d.f21444c;
                            if (b17 <= b18 && ajVar3.d >= b18) {
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
    public void b0(v4.v0 v0Var, v4.a1 a1Var) {
        switch (this.S) {
            case 0:
                boolean z9 = org.telegram.messenger.r2.f25199a;
                try {
                    super.b0(v0Var, a1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.h3(new gp(this, 26));
                    return;
                }
            default:
                super.b0(v0Var, a1Var);
                return;
        }
    }

    @Override
    public int j(v4.a1 a1Var) {
        switch (this.S) {
            case 1:
                return B0(a1Var);
            default:
                return super.j(a1Var);
        }
    }

    @Override
    public int k(v4.a1 a1Var) {
        switch (this.S) {
            case 1:
                return C0(a1Var);
            default:
                return super.k(a1Var);
        }
    }

    @Override
    public int l(v4.a1 a1Var) {
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
