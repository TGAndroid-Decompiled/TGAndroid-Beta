package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class so0 extends dk0 {
    public final Context f39664c;
    public final ArrayList d = new ArrayList();
    public final a0.h f39665e = new a0.h();
    public final zo0 f39666f;

    public so0(zo0 zo0Var, Context context) {
        this.f39666f = zo0Var;
        this.f39664c = context;
        E();
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.f39665e;
        hVar.b();
        zo0 zo0Var = this.f39666f;
        long j3 = org.telegram.messenger.i10.i(zo0Var.f30223a).f24656n;
        if (zo0Var.V1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f28496id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f28496id);
        }
        if (!org.telegram.messenger.mp.u1(zo0Var.f30223a).E.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) org.telegram.messenger.mp.u1(zo0Var.f30223a).E.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f28496id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.mp.u1(zo0Var.f30223a).f25904y;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i7);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j10 = dialog3.f28496id;
                if (j10 != j3 && !org.telegram.messenger.n5.C(j10)) {
                    if (org.telegram.messenger.n5.E(dialog3.f28496id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f28496id);
                    } else {
                        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(zo0Var.f30223a).O0(Long.valueOf(-dialog3.f28496id));
                        if (O0 != null && !org.telegram.messenger.v3.r0(O0) && ((!O0.gigagroup || org.telegram.messenger.v3.N(O0)) && (!org.telegram.messenger.v3.T(O0) || O0.creator || (((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages) || O0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f28496id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.bn bnVar = zo0Var.f42971b2;
        if (bnVar != null) {
            int i10 = bnVar.f46117a;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.so0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View qo0Var;
        float f10;
        zo0 zo0Var = this.f39666f;
        Context context = this.f39664c;
        if (i7 != 0) {
            qo0Var = new View(context);
            if (zo0Var.d2 && zo0Var.f42979k2[1] != null) {
                f10 = 109.0f;
            } else {
                f10 = 56.0f;
            }
            qo0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(f10)));
        } else {
            qo0Var = new qo0(this, context, zo0Var.J0);
            qo0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new v4.f1(qo0Var);
    }
}
