package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ea extends org.telegram.ui.Components.oj0 {
    public final la f45248c;

    public ea(la laVar) {
        this.f45248c = laVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56956f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i7;
        la laVar = this.f45248c;
        org.telegram.ui.Components.pj0 pj0Var = laVar.f47483b;
        ArrayList arrayList = laVar.f47490w;
        if (pj0Var != null) {
            ArrayList arrayList2 = pj0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                pj0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                laVar.f47483b.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(3, arrayList.size() + 3)));
            }
        }
        if (laVar.f47490w.size() > 0) {
            i7 = laVar.f47490w.size() + 2;
        } else {
            i7 = 0;
        }
        return i7 + 3;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 0;
        }
        if (i7 == b() - 1) {
            return 2;
        }
        return 4;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        boolean z9;
        la laVar = this.f45248c;
        long j3 = laVar.f47492y;
        int i12 = d1Var.f56956f;
        View view = d1Var.f56952a;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) laVar.f47490w.get(i7 - 4);
                    ia iaVar = (ia) view;
                    if (tL_username.editable) {
                        laVar.E = iaVar;
                    } else if (laVar.E == iaVar) {
                        laVar.E = null;
                    }
                    if (i7 < b() - 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    iaVar.a(tL_username, z9, false, laVar.f47492y);
                    return;
                }
                laVar.f47487n = true;
                ga gaVar = (ga) view;
                laVar.D = gaVar;
                gaVar.f45928a.setText(laVar.f47488r);
                laVar.f47487n = false;
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (j3 != 0) {
                i11 = 2131752937;
            } else {
                i11 = 2131743642;
            }
            z8Var.setText(org.telegram.messenger.hd.M0(i11, null));
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i7 == 0) {
            if (j3 != 0) {
                i10 = 2131752985;
            } else {
                i10 = 2131745499;
            }
        } else {
            i10 = 2131743643;
        }
        n4Var.setText(org.telegram.messenger.hd.M0(i10, null));
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        la laVar = this.f45248c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            return null;
                        }
                        return new v4.d1(new da(this, laVar.getParentActivity(), laVar.getResourceProvider()));
                    }
                    return new v4.d1(new ga(laVar, laVar.getParentActivity()));
                }
                return new v4.d1(new org.telegram.ui.Cells.z8(laVar.getParentActivity()));
            }
            ka kaVar = new ka(laVar, laVar.getParentActivity());
            kaVar.setTag(-33024);
            return new v4.d1(kaVar);
        }
        return new v4.d1(new org.telegram.ui.Cells.n4(laVar.getParentActivity()));
    }
}
