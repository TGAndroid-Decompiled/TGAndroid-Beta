package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class da extends org.telegram.ui.Components.sj0 {
    public final ka f44609c;

    public da(ka kaVar) {
        this.f44609c = kaVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i3;
        ka kaVar = this.f44609c;
        org.telegram.ui.Components.tj0 tj0Var = kaVar.f46839b;
        ArrayList arrayList = kaVar.f46846w;
        if (tj0Var != null) {
            ArrayList arrayList2 = tj0Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                tj0Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                kaVar.f46839b.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(3, arrayList.size() + 3)));
            }
        }
        if (kaVar.f46846w.size() > 0) {
            i3 = kaVar.f46846w.size() + 2;
        } else {
            i3 = 0;
        }
        return i3 + 3;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 3) {
            return 0;
        }
        if (i3 == b() - 1) {
            return 2;
        }
        return 4;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        boolean z10;
        ka kaVar = this.f44609c;
        long j10 = kaVar.f46848y;
        int i12 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) kaVar.f46846w.get(i3 - 4);
                    ha haVar = (ha) view;
                    if (tL_username.editable) {
                        kaVar.F = haVar;
                    } else if (kaVar.F == haVar) {
                        kaVar.F = null;
                    }
                    if (i3 < b() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    haVar.a(tL_username, z10, false, kaVar.f46848y);
                    return;
                }
                kaVar.f46843n = true;
                fa faVar = (fa) view;
                kaVar.E = faVar;
                faVar.f45225a.setText(kaVar.f46844r);
                kaVar.f46843n = false;
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (j10 != 0) {
                i11 = 2131752937;
            } else {
                i11 = 2131743651;
            }
            y8Var.setText(org.telegram.messenger.bd.M0(i11, null));
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i3 == 0) {
            if (j10 != 0) {
                i10 = 2131752985;
            } else {
                i10 = 2131745508;
            }
        } else {
            i10 = 2131743652;
        }
        n4Var.setText(org.telegram.messenger.bd.M0(i10, null));
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ka kaVar = this.f44609c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return null;
                        }
                        return new u4.d1(new ca(this, kaVar.getParentActivity(), kaVar.getResourceProvider()));
                    }
                    return new u4.d1(new fa(kaVar, kaVar.getParentActivity()));
                }
                return new u4.d1(new org.telegram.ui.Cells.y8(kaVar.getParentActivity()));
            }
            ja jaVar = new ja(kaVar, kaVar.getParentActivity());
            jaVar.setTag(-33024);
            return new u4.d1(jaVar);
        }
        return new u4.d1(new org.telegram.ui.Cells.n4(kaVar.getParentActivity()));
    }
}
