package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class tu extends dk0 {
    public final dv f40039c;

    public tu(dv dvVar) {
        this.f40039c = dvVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i7) {
        int i10;
        dv dvVar = this.f40039c;
        pu puVar = dvVar.f34571p1;
        if (dvVar.D1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = puVar.f33892c;
            if (i11 >= arrayListArr.length || i11 == i7) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (puVar.f33892c.length > 1) {
                size = Math.min(dvVar.f34580y1.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    @Override
    public final int b() {
        ?? r22;
        int i7;
        int min;
        ArrayList arrayList;
        dv dvVar = this.f40039c;
        pu puVar = dvVar.f34571p1;
        if (!org.telegram.messenger.k10.i(dvVar.f30139a).q() && (arrayList = puVar.f33891b) != null && arrayList.size() == 1 && org.telegram.messenger.gj.V3((TLRPC.TL_messages_stickerSet) puVar.f33891b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        dvVar.D1 = r22;
        int i10 = r22 + 1;
        if (puVar.f33892c == null) {
            i7 = 0;
        } else {
            int i11 = 0;
            i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = puVar.f33892c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(puVar.f33894f.f34580y1.J * 2, arrayList2.size());
                    }
                    i7 = min + i7 + 1;
                }
                i11++;
            }
        }
        return Math.max(0, puVar.f33892c.length - 1) + i10 + i7;
    }

    @Override
    public final int d(int i7) {
        dv dvVar = this.f40039c;
        pu puVar = dvVar.f34571p1;
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = i7 - 1;
        if (dvVar.D1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i7 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = puVar.f33892c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (puVar.f33892c.length > 1) {
                size = Math.min(dvVar.f34580y1.J * 2, size);
            }
            int i13 = size + 1 + i12;
            if (i11 == i13) {
                return 4;
            }
            i12 = i13 + 1;
            i10++;
        }
    }

    @Override
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tu.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        dv dvVar = this.f40039c;
        if (i7 == 0) {
            view = dvVar.f34570o1;
        } else {
            boolean z10 = true;
            if (i7 == 1) {
                ?? view3 = new View(dvVar.getContext());
                view3.f41856a = new org.telegram.messenger.hc[2];
                view2 = view3;
            } else if (i7 == 2) {
                Context context = dvVar.getContext();
                if (dvVar.f34571p1.f33892c.length > 1) {
                    z10 = false;
                }
                view2 = new zu(dvVar, context, z10);
            } else if (i7 == 3) {
                view2 = new TextView(dvVar.getContext());
            } else if (i7 == 4) {
                View view4 = new View(dvVar.getContext());
                int i10 = org.telegram.ui.ActionBar.m6.Cf;
                Pattern pattern = dv.Q1;
                org.telegram.ui.ActionBar.t6.h(i10, view4, dvVar.J0);
                v4.p0 p0Var = new v4.p0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                view4.setLayoutParams(p0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new v4.e1(view);
    }
}
