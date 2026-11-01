package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ip0 extends tk0 {
    public final Context f27141c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final pp0 f27142f;

    public ip0(pp0 pp0Var, Context context) {
        this.f27142f = pp0Var;
        this.f27141c = context;
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f != 1) {
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
        pp0 pp0Var = this.f27142f;
        long j10 = org.telegram.messenger.e20.i(pp0Var.f21584a).f15524n;
        if (pp0Var.R1) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f19798id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f19798id);
        }
        if (!org.telegram.messenger.wp.r1(pp0Var.f21584a).D.isEmpty()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) org.telegram.messenger.wp.r1(pp0Var.f21584a).D.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f19798id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.wp.r1(pp0Var.f21584a).f19293y;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayList3.get(i10);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f19798id;
                if (j11 != j10 && !org.telegram.messenger.o5.C(j11)) {
                    if (org.telegram.messenger.o5.E(dialog3.f19798id)) {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f19798id);
                    } else {
                        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(pp0Var.f21584a).L0(Long.valueOf(-dialog3.f19798id));
                        if (L0 != null && !org.telegram.messenger.w3.r0(L0) && ((!L0.gigagroup || org.telegram.messenger.w3.N(L0)) && (!org.telegram.messenger.w3.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f19798id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.un unVar = pp0Var.X1;
        if (unVar != null) {
            int i11 = unVar.f41988a;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ip0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View gp0Var;
        float f7;
        pp0 pp0Var = this.f27142f;
        Context context = this.f27141c;
        if (i10 != 0) {
            gp0Var = new View(context);
            if (pp0Var.Z1 && pp0Var.f29473g2[1] != null) {
                f7 = 109.0f;
            } else {
                f7 = 56.0f;
            }
            gp0Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(f7)));
        } else {
            gp0Var = new gp0(this, context, pp0Var.I0);
            gp0Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(100.0f)));
        }
        return new s4.c1(gp0Var);
    }
}
