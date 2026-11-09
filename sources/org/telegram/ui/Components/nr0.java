package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nr0 extends pj0 {
    public final Context f36485c;
    public final ArrayList d = new ArrayList();
    public boolean f36486e;
    public boolean f36487f;
    public boolean h;
    public int f36488n;
    public final zs0 f36489r;

    public nr0(zs0 zs0Var, Context context) {
        this.f36489r = zs0Var;
        this.f36485c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 14 && i7 != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f36489r.f41127x1;
        if (!this.f36486e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser o12 = f2Var.getMessagesController().o1(F());
            tL_messages_getCommonChats.user_id = o12;
            if (o12 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            this.f36486e = true;
            f();
            this.f36488n = f2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(this, 11));
            f2Var.getConnectionsManager().bindRequestToGuid(this.f36488n, f2Var.getClassGuid());
        }
    }

    public final long F() {
        zs0 zs0Var = this.f36489r;
        if (org.telegram.messenger.m5.C(zs0Var.l1)) {
            return zs0Var.f41127x1.getMessagesController().a1(Integer.valueOf((int) (zs0Var.l1 & 4294967295L))).user_id;
        }
        return zs0Var.l1;
    }

    public final boolean G() {
        TLRPC.User a22;
        if (this.d.isEmpty() || (a22 = this.f36489r.f41127x1.getMessagesController().a2(Long.valueOf(F()))) == null || a22.bot || a22.self || org.telegram.messenger.t10.x(a22)) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f36486e) {
            return 1;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty()) {
            if (G()) {
                size++;
            }
            if (!this.h) {
                return size + 1;
            }
            return size;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f36486e) {
            return 15;
        }
        if (G()) {
            if (i7 == 0) {
                return 25;
            }
            i7--;
        }
        if (i7 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        boolean z9 = false;
        if (i10 == 14) {
            if (view instanceof org.telegram.ui.Cells.g6) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                if (G()) {
                    i7--;
                }
                ArrayList arrayList = this.d;
                g6Var.x((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
                if (i7 != arrayList.size() - 1 || !this.h) {
                    z9 = true;
                }
                g6Var.M = z9;
            }
        } else if (i10 == 25 && (view instanceof org.telegram.ui.Cells.x4)) {
            ((org.telegram.ui.Cells.x4) view).b(2131232176, 5, org.telegram.messenger.id.a0(null, null, 2131751745, org.telegram.messenger.t10.j(this.f36489r.f41127x1.getMessagesController().a2(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        zs0 zs0Var = this.f36489r;
        org.telegram.ui.ActionBar.g6 g6Var2 = zs0Var.H1;
        Context context = this.f36485c;
        if (i7 != 14) {
            if (i7 != 15) {
                if (i7 != 25) {
                    mz mzVar = new mz(context, g6Var2);
                    mzVar.setIsSingleCell(true);
                    mzVar.f36181x = false;
                    mzVar.setViewType(1);
                    g6Var = mzVar;
                } else {
                    org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                    x4Var.a(org.telegram.ui.ActionBar.l6.f28200v6, org.telegram.ui.ActionBar.l6.f28181u6);
                    x4Var.setTextLeft(org.telegram.messenger.g0.C);
                    g6Var = x4Var;
                }
            } else {
                r3 X = zs0.X(6, zs0Var.l1, context, g6Var2);
                X.setLayoutParams(new v4.o0(-1, -1));
                return new v4.d1(X);
            }
        } else {
            g6Var = new org.telegram.ui.Cells.g6(context, g6Var2);
        }
        return jg.g.r(g6Var, g6Var, -1, -2);
    }
}
