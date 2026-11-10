package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fo0 extends oj0 {
    public final Context f33617c;
    public final ArrayList d = new ArrayList();
    public final a0.h f33618e = new a0.h();
    public final mo0 f33619f;

    public fo0(mo0 mo0Var, Context context) {
        this.f33619f = mo0Var;
        this.f33617c = context;
        E();
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.f33618e;
        hVar.b();
        mo0 mo0Var = this.f33619f;
        long j3 = org.telegram.messenger.p10.i(mo0Var.f28669a).f24493n;
        if (mo0Var.U1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f26964id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f26964id);
        }
        if (!org.telegram.messenger.qp.s1(mo0Var.f28669a).D.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) org.telegram.messenger.qp.s1(mo0Var.f28669a).D.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f26964id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.qp.s1(mo0Var.f28669a).f24948y;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i7);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j10 = dialog3.f26964id;
                if (j10 != j3 && !org.telegram.messenger.m5.C(j10)) {
                    if (org.telegram.messenger.m5.E(dialog3.f26964id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f26964id);
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(mo0Var.f28669a).M0(Long.valueOf(-dialog3.f26964id));
                        if (M0 != null && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f26964id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.cn cnVar = mo0Var.f36027a2;
        if (cnVar != null) {
            int i10 = cnVar.f44417a;
            if (i10 != 1) {
                if (i10 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) jg.g.i(1, arrayList));
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
    public final void t(v4.d1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fo0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View do0Var;
        float f10;
        mo0 mo0Var = this.f33619f;
        Context context = this.f33617c;
        if (i7 != 0) {
            do0Var = new View(context);
            if (mo0Var.f36029c2 && mo0Var.f36035j2[1] != null) {
                f10 = 109.0f;
            } else {
                f10 = 56.0f;
            }
            do0Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(f10)));
        } else {
            do0Var = new do0(this, context, mo0Var.I0);
            do0Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new v4.d1(do0Var);
    }
}
