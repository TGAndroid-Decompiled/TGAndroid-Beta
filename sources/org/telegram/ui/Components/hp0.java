package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hp0 extends sk0 {
    public final Context f26791c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final op0 f26792f;

    public hp0(op0 op0Var, Context context) {
        this.f26792f = op0Var;
        this.f26791c = context;
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.e;
        hVar.b();
        op0 op0Var = this.f26792f;
        long j10 = org.telegram.messenger.d20.i(op0Var.f21583a).f15165n;
        if (op0Var.R1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f19797id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f19797id);
        }
        if (!org.telegram.messenger.vp.r1(op0Var.f21583a).D.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) org.telegram.messenger.vp.r1(op0Var.f21583a).D.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f19797id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.vp.r1(op0Var.f21583a).f18950y;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i10);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f19797id;
                if (j11 != j10 && !org.telegram.messenger.o5.C(j11)) {
                    if (org.telegram.messenger.o5.E(dialog3.f19797id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f19797id);
                    } else {
                        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(op0Var.f21583a).L0(Long.valueOf(-dialog3.f19797id));
                        if (L0 != null && !org.telegram.messenger.w3.r0(L0) && ((!L0.gigagroup || org.telegram.messenger.w3.N(L0)) && (!org.telegram.messenger.w3.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f19797id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.un unVar = op0Var.X1;
        if (unVar != null) {
            int i11 = unVar.f42178a;
            if (i11 != 1) {
                if (i11 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) i0.a.g(1, arrayList));
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
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hp0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View fp0Var;
        float f7;
        op0 op0Var = this.f26792f;
        Context context = this.f26791c;
        if (i10 != 0) {
            fp0Var = new View(context);
            if (op0Var.Z1 && op0Var.f29118g2[1] != null) {
                f7 = 109.0f;
            } else {
                f7 = 56.0f;
            }
            fp0Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(f7)));
        } else {
            fp0Var = new fp0(this, context, op0Var.I0);
            fp0Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(100.0f)));
        }
        return new s4.c1(fp0Var);
    }
}
