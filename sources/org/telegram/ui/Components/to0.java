package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class to0 extends dk0 {
    public final Context f40008c;
    public final ArrayList d = new ArrayList();
    public final a0.h f40009e = new a0.h();
    public final ap0 f40010f;

    public to0(ap0 ap0Var, Context context) {
        this.f40010f = ap0Var;
        this.f40008c = context;
        E();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59165f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.f40009e;
        hVar.b();
        ap0 ap0Var = this.f40010f;
        long j3 = org.telegram.messenger.j10.i(ap0Var.f30170a).f24817n;
        if (ap0Var.V1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f28435id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f28435id);
        }
        if (!org.telegram.messenger.mp.u1(ap0Var.f30170a).E.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) org.telegram.messenger.mp.u1(ap0Var.f30170a).E.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f28435id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.mp.u1(ap0Var.f30170a).f25837y;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i7);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j10 = dialog3.f28435id;
                if (j10 != j3 && !org.telegram.messenger.n5.C(j10)) {
                    if (org.telegram.messenger.n5.E(dialog3.f28435id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f28435id);
                    } else {
                        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(ap0Var.f30170a).O0(Long.valueOf(-dialog3.f28435id));
                        if (O0 != null && !org.telegram.messenger.v3.r0(O0) && ((!O0.gigagroup || org.telegram.messenger.v3.N(O0)) && (!org.telegram.messenger.v3.T(O0) || O0.creator || (((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages) || O0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f28435id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.bn bnVar = ap0Var.f33550b2;
        if (bnVar != null) {
            int i10 = bnVar.f45945a;
            if (i10 != 1) {
                if (i10 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) i5.c.h(1, arrayList));
                    }
                }
            } else {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            }
        }
        f();
    }

    @Override
    public final int b() {
        int size = this.d.size();
        if (size != 0) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.to0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View ro0Var;
        float f10;
        ap0 ap0Var = this.f40010f;
        Context context = this.f40008c;
        if (i7 != 0) {
            ro0Var = new View(context);
            if (ap0Var.d2 && ap0Var.f33558k2[1] != null) {
                f10 = 109.0f;
            } else {
                f10 = 56.0f;
            }
            ro0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(f10)));
        } else {
            ro0Var = new ro0(this, context, ap0Var.J0);
            ro0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new v4.f1(ro0Var);
    }
}
