package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ga extends org.telegram.ui.Components.tk0 {
    public final oa f37437c;

    public ga(oa oaVar) {
        this.f37437c = oaVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i10;
        oa oaVar = this.f37437c;
        org.telegram.ui.Components.uk0 uk0Var = oaVar.f40111b;
        ArrayList arrayList = oaVar.f40117w;
        if (uk0Var != null) {
            ArrayList arrayList2 = uk0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                uk0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                oaVar.f40111b.K2.add(Long.valueOf(org.telegram.messenger.i0.w2(3, arrayList.size() + 3)));
            }
        }
        if (oaVar.f40117w.size() > 0) {
            i10 = oaVar.f40117w.size() + 2;
        } else {
            i10 = 0;
        }
        return i10 + 3;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 0;
        }
        if (i10 == b() - 1) {
            return 2;
        }
        return 4;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        boolean z10;
        oa oaVar = this.f37437c;
        long j10 = oaVar.f40119y;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i13 != 0) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) oaVar.f40117w.get(i10 - 4);
                    la laVar = (la) view;
                    if (tL_username.editable) {
                        oaVar.E = laVar;
                    } else if (oaVar.E == laVar) {
                        oaVar.E = null;
                    }
                    if (i10 < b() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    laVar.a(tL_username, z10, false, oaVar.f40119y);
                    return;
                }
                oaVar.f40114n = true;
                ia iaVar = (ia) view;
                oaVar.D = iaVar;
                iaVar.f37985a.setText(oaVar.f40115r);
                oaVar.f40114n = false;
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (j10 != 0) {
                i12 = 2131752937;
            } else {
                i12 = 2131743667;
            }
            b9Var.setText(org.telegram.messenger.dd.L0(i12, null));
            return;
        }
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
        if (i10 == 0) {
            if (j10 != 0) {
                i11 = 2131752985;
            } else {
                i11 = 2131745515;
            }
        } else {
            i11 = 2131743668;
        }
        p4Var.setText(org.telegram.messenger.dd.L0(i11, null));
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        oa oaVar = this.f37437c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return new s4.c1(new fa(this, oaVar.getParentActivity(), oaVar.getResourceProvider()));
                    }
                    return new s4.c1(new ia(oaVar, oaVar.getParentActivity()));
                }
                return new s4.c1(new org.telegram.ui.Cells.b9(oaVar.getParentActivity()));
            }
            na naVar = new na(oaVar, oaVar.getParentActivity());
            naVar.setTag(-33024);
            return new s4.c1(naVar);
        }
        return new s4.c1(new org.telegram.ui.Cells.p4(oaVar.getParentActivity()));
    }
}
