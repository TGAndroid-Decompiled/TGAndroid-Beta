package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ho0 extends sj0 {
    public final Context f34464c;
    public final ArrayList d = new ArrayList();
    public final a0.h f34465e = new a0.h();
    public final oo0 f34466f;

    public ho0(oo0 oo0Var, Context context) {
        this.f34466f = oo0Var;
        this.f34464c = context;
        E();
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.f34465e;
        hVar.b();
        oo0 oo0Var = this.f34466f;
        long j10 = org.telegram.messenger.h10.i(oo0Var.f28583a).f22848n;
        if (oo0Var.S1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f27005id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f27005id);
        }
        if (!org.telegram.messenger.hp.s1(oo0Var.f28583a).E.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) org.telegram.messenger.hp.s1(oo0Var.f28583a).E.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f27005id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.hp.s1(oo0Var.f28583a).f23169y;
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i3);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f27005id;
                if (j11 != j10 && !org.telegram.messenger.m5.C(j11)) {
                    if (org.telegram.messenger.m5.E(dialog3.f27005id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f27005id);
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(oo0Var.f28583a).M0(Long.valueOf(-dialog3.f27005id));
                        if (M0 != null && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f27005id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.wm wmVar = oo0Var.Y1;
        if (wmVar != null) {
            int i10 = wmVar.f51236a;
            if (i10 != 1) {
                if (i10 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) k2.p1.h(1, arrayList));
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
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ho0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View fo0Var;
        float f10;
        oo0 oo0Var = this.f34466f;
        Context context = this.f34464c;
        if (i3 != 0) {
            fo0Var = new View(context);
            if (oo0Var.f36875a2 && oo0Var.f36881h2[1] != null) {
                f10 = 109.0f;
            } else {
                f10 = 56.0f;
            }
            fo0Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(f10)));
        } else {
            fo0Var = new fo0(this, context, oo0Var.J0);
            fo0Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new u4.d1(fo0Var);
    }
}
