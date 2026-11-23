package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ea extends org.telegram.ui.Components.dk0 {
    public final la f47214c;

    public ea(la laVar) {
        this.f47214c = laVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i7;
        la laVar = this.f47214c;
        org.telegram.ui.Components.ek0 ek0Var = laVar.f49532b;
        ArrayList arrayList = laVar.f49539w;
        if (ek0Var != null) {
            ArrayList arrayList2 = ek0Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                ek0Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                laVar.f49532b.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(3, arrayList.size() + 3)));
            }
        }
        if (laVar.f49539w.size() > 0) {
            i7 = laVar.f49539w.size() + 2;
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        boolean z10;
        la laVar = this.f47214c;
        long j3 = laVar.f49541y;
        int i12 = f1Var.f59169f;
        View view = f1Var.f59165a;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) laVar.f49539w.get(i7 - 4);
                    ia iaVar = (ia) view;
                    if (tL_username.editable) {
                        laVar.F = iaVar;
                    } else if (laVar.F == iaVar) {
                        laVar.F = null;
                    }
                    if (i7 < b() - 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    iaVar.a(tL_username, z10, false, laVar.f49541y);
                    return;
                }
                laVar.f49536n = true;
                ga gaVar = (ga) view;
                laVar.E = gaVar;
                gaVar.f48020a.setText(laVar.f49537r);
                laVar.f49536n = false;
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (j3 != 0) {
                i11 = 2131752925;
            } else {
                i11 = 2131743396;
            }
            a9Var.setText(org.telegram.messenger.hd.N0(i11, null));
            return;
        }
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
        if (i7 == 0) {
            if (j3 != 0) {
                i10 = 2131752973;
            } else {
                i10 = 2131745302;
            }
        } else {
            i10 = 2131743397;
        }
        o4Var.setText(org.telegram.messenger.hd.N0(i10, null));
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        la laVar = this.f47214c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            return null;
                        }
                        return new v4.f1(new da(this, laVar.getParentActivity(), laVar.getResourceProvider()));
                    }
                    return new v4.f1(new ga(laVar, laVar.getParentActivity()));
                }
                return new v4.f1(new org.telegram.ui.Cells.a9(laVar.getParentActivity()));
            }
            ka kaVar = new ka(laVar, laVar.getParentActivity());
            kaVar.setTag(-33024);
            return new v4.f1(kaVar);
        }
        return new v4.f1(new org.telegram.ui.Cells.o4(laVar.getParentActivity()));
    }
}
