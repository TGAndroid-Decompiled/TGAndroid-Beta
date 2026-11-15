package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mr0 extends tj0 {
    public final Context f37364c;
    public final ArrayList d = new ArrayList();
    public boolean f37365e;
    public boolean f37366f;
    public boolean h;
    public int f37367n;
    public final ys0 f37368r;

    public mr0(ys0 ys0Var, Context context) {
        this.f37368r = ys0Var;
        this.f37364c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 14 && i7 != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f37368r.f42150y1;
        if (!this.f37365e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser o12 = e2Var.getMessagesController().o1(F());
            tL_messages_getCommonChats.user_id = o12;
            if (o12 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            this.f37365e = true;
            f();
            this.f37367n = e2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new v1(this, 11));
            e2Var.getConnectionsManager().bindRequestToGuid(this.f37367n, e2Var.getClassGuid());
        }
    }

    public final long F() {
        ys0 ys0Var = this.f37368r;
        if (org.telegram.messenger.m5.C(ys0Var.f42114m1)) {
            return ys0Var.f42150y1.getMessagesController().a1(Integer.valueOf((int) (ys0Var.f42114m1 & 4294967295L))).user_id;
        }
        return ys0Var.f42114m1;
    }

    public final boolean G() {
        TLRPC.User a22;
        if (this.d.isEmpty() || (a22 = this.f37368r.f42150y1.getMessagesController().a2(Long.valueOf(F()))) == null || a22.bot || a22.self || org.telegram.messenger.q10.x(a22)) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f37365e) {
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
        if (arrayList.isEmpty() && !this.f37365e) {
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
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z10 = false;
        if (i10 == 14) {
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                if (G()) {
                    i7--;
                }
                ArrayList arrayList = this.d;
                f6Var.x((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
                if (i7 != arrayList.size() - 1 || !this.h) {
                    z10 = true;
                }
                f6Var.N = z10;
            }
        } else if (i10 == 25 && (view instanceof org.telegram.ui.Cells.x4)) {
            ((org.telegram.ui.Cells.x4) view).b(2131232177, 5, org.telegram.messenger.hd.a0(null, null, 2131751745, org.telegram.messenger.q10.j(this.f37368r.f42150y1.getMessagesController().a2(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.f6 f6Var;
        ys0 ys0Var = this.f37368r;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.f37364c;
        if (i7 != 14) {
            if (i7 != 15) {
                if (i7 != 25) {
                    pz pzVar = new pz(context, e6Var);
                    pzVar.setIsSingleCell(true);
                    pzVar.f38448x = false;
                    pzVar.setViewType(1);
                    f6Var = pzVar;
                } else {
                    org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                    x4Var.a(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                    x4Var.setTextLeft(org.telegram.messenger.g0.C);
                    f6Var = x4Var;
                }
            } else {
                p3 X = ys0.X(6, ys0Var.f42114m1, context, e6Var);
                X.setLayoutParams(new v4.p0(-1, -1));
                return new v4.e1(X);
            }
        } else {
            f6Var = new org.telegram.ui.Cells.f6(context, e6Var);
        }
        return i5.c.q(f6Var, f6Var, -1, -2);
    }
}
