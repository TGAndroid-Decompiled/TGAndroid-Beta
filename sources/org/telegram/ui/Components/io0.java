package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class io0 extends tj0 {
    public final Context f35687c;
    public final ArrayList d = new ArrayList();
    public final a0.h f35688e = new a0.h();
    public final po0 f35689f;

    public io0(po0 po0Var, Context context) {
        this.f35689f = po0Var;
        this.f35687c = context;
        E();
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.f35688e;
        hVar.b();
        po0 po0Var = this.f35689f;
        long j3 = org.telegram.messenger.m10.i(po0Var.f29679a).f24953n;
        if (po0Var.V1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f28055id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f28055id);
        }
        if (!org.telegram.messenger.np.s1(po0Var.f29679a).E.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) org.telegram.messenger.np.s1(po0Var.f29679a).E.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f28055id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.np.s1(po0Var.f29679a).f25440y;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i7);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j10 = dialog3.f28055id;
                if (j10 != j3 && !org.telegram.messenger.m5.C(j10)) {
                    if (org.telegram.messenger.m5.E(dialog3.f28055id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f28055id);
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.np.s1(po0Var.f29679a).M0(Long.valueOf(-dialog3.f28055id));
                        if (M0 != null && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f28055id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.an anVar = po0Var.f38341b2;
        if (anVar != null) {
            int i10 = anVar.f45117a;
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
    public final void t(v4.e1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.io0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View go0Var;
        float f10;
        po0 po0Var = this.f35689f;
        Context context = this.f35687c;
        if (i7 != 0) {
            go0Var = new View(context);
            if (po0Var.d2 && po0Var.f38349k2[1] != null) {
                f10 = 109.0f;
            } else {
                f10 = 56.0f;
            }
            go0Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(f10)));
        } else {
            go0Var = new go0(this, context, po0Var.J0);
            go0Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new v4.e1(go0Var);
    }
}
