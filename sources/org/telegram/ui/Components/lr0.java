package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lr0 extends oj0 {
    public final Context f35769c;
    public final ArrayList d = new ArrayList();
    public boolean f35770e;
    public boolean f35771f;
    public boolean h;
    public final xs0 f35772n;

    public lr0(xs0 xs0Var, Context context) {
        this.f35772n = xs0Var;
        this.f35769c = context;
    }

    public static void E(lr0 lr0Var, long j3) {
        xs0 xs0Var = lr0Var.f35772n;
        if (!lr0Var.f35770e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = xs0Var.l1;
            org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40461x1;
            if (org.telegram.messenger.m5.C(j10)) {
                j10 = f2Var.getMessagesController().a1(Integer.valueOf((int) (j10 & 4294967295L))).user_id;
            }
            TLRPC.InputUser o12 = f2Var.getMessagesController().o1(j10);
            tL_messages_getCommonChats.user_id = o12;
            if (o12 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            lr0Var.f35770e = true;
            lr0Var.f();
            f2Var.getConnectionsManager().bindRequestToGuid(f2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(lr0Var, 11)), f2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.b() != this.d.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f35770e) {
            return 1;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !this.h) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f35770e) {
            return 15;
        }
        if (i7 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f57048f == 14) {
            View view = d1Var.f57044a;
            if (view instanceof org.telegram.ui.Cells.g6) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                ArrayList arrayList = this.d;
                g6Var.x((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
                boolean z9 = true;
                if (i7 == arrayList.size() - 1 && this.h) {
                    z9 = false;
                }
                g6Var.M = z9;
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        xs0 xs0Var = this.f35772n;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.f35769c;
        if (i7 != 14) {
            if (i7 != 15) {
                mz mzVar = new mz(context, f6Var);
                mzVar.setIsSingleCell(true);
                mzVar.f36172x = false;
                mzVar.setViewType(1);
                g6Var = mzVar;
            } else {
                r3 X = xs0.X(6, xs0Var.l1, context, f6Var);
                X.setLayoutParams(new v4.o0(-1, -1));
                return new v4.d1(X);
            }
        } else {
            g6Var = new org.telegram.ui.Cells.g6(context, f6Var);
        }
        return jg.g.r(g6Var, g6Var, -1, -2);
    }
}
