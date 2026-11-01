package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zl implements Runnable {
    public final int f19731a;
    public final wp f19732b;
    public final long f19733c;
    public final long d;
    public final int e;
    public final ArrayList f19734f;

    public zl(wp wpVar, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.f19731a = i11;
        this.f19732b = wpVar;
        this.f19733c = j10;
        this.e = i10;
        this.d = j11;
        this.f19734f = arrayList;
    }

    @Override
    public final void run() {
        int i10 = this.f19731a;
        ArrayList arrayList = this.f19734f;
        wp wpVar = this.f19732b;
        switch (i10) {
            case 0:
                long j10 = this.f19733c;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                long j11 = this.d;
                int i12 = this.e;
                if (i11 == 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) wpVar.Q.f(j11);
                    if (dialog == null) {
                        wpVar.getMessagesStorage().Q1(j11, i12, true, false);
                        return;
                    }
                    int i13 = dialog.unread_poll_votes_count + i12;
                    dialog.unread_poll_votes_count = i13;
                    if (i13 < 0) {
                        dialog.unread_poll_votes_count = 0;
                    }
                    wpVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j11, 0L, false);
                    wpVar.getNotificationCenter().k(302, Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                    return;
                }
                int B = wpVar.getMessagesController().f19234r7.B(i12, j11, j10, true);
                if (B >= 0) {
                    wpVar.getMessagesStorage().h2(B, j11, j10, true);
                    wpVar.getNotificationCenter().k(302, Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(B), arrayList);
                    return;
                }
                return;
            case 1:
                long j12 = this.f19733c;
                int i14 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                long j13 = this.d;
                int i15 = this.e;
                if (i14 == 0) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar.Q.f(j13);
                    if (dialog2 == null) {
                        wpVar.getMessagesStorage().Q1(j13, i15, true, true);
                        return;
                    }
                    int i16 = dialog2.unread_reactions_count + i15;
                    dialog2.unread_reactions_count = i16;
                    if (i16 < 0) {
                        dialog2.unread_reactions_count = 0;
                    }
                    wpVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j13, 0L, false);
                    if (wpVar.s2(j13) || wpVar.x2(j13) || j13 > 0) {
                        wpVar.getNotificationCenter().k(301, Long.valueOf(j13), Long.valueOf(j12), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                        return;
                    }
                    return;
                }
                int C = wpVar.getMessagesController().f19234r7.C(i15, j13, j12, true);
                if (C >= 0) {
                    wpVar.getMessagesStorage().i2(C, j13, j12, true);
                    if (wpVar.s2(j13) || wpVar.x2(j13) || j13 > 0) {
                        wpVar.getNotificationCenter().k(301, Long.valueOf(j13), Long.valueOf(j12), Integer.valueOf(C), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                y00 y00Var = wpVar.getMessagesController().f19234r7;
                int i17 = this.e;
                long j14 = this.f19733c;
                long j15 = this.d;
                y00Var.C(i17, j14, j15, false);
                wpVar.getMessagesStorage().i2(i17, j14, j15, false);
                wpVar.getNotificationCenter().k(301, Long.valueOf(j14), Long.valueOf(j15), Integer.valueOf(i17), arrayList);
                return;
            case 3:
                y00 y00Var2 = wpVar.getMessagesController().f19234r7;
                int i18 = this.e;
                long j16 = this.f19733c;
                long j17 = this.d;
                y00Var2.C(i18, j16, j17, false);
                wpVar.getMessagesStorage().i2(i18, j16, j17, false);
                wpVar.getNotificationCenter().k(301, Long.valueOf(j16), Long.valueOf(j17), Integer.valueOf(i18), arrayList);
                return;
            case 4:
                y00 y00Var3 = wpVar.getMessagesController().f19234r7;
                int i19 = this.e;
                long j18 = this.f19733c;
                long j19 = this.d;
                y00Var3.B(i19, j18, j19, false);
                wpVar.getMessagesStorage().h2(i19, j18, j19, false);
                wpVar.getNotificationCenter().k(302, Long.valueOf(j18), Long.valueOf(j19), Integer.valueOf(i19), arrayList);
                return;
            case 5:
                a0.h hVar = wpVar.Q;
                long j20 = this.f19733c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j20);
                int i20 = this.e;
                if (dialog3 == null) {
                    wpVar.getMessagesStorage().Q1(j20, i20, false, true);
                    return;
                }
                dialog3.unread_reactions_count = i20;
                is messagesStorage = wpVar.getMessagesStorage();
                long j21 = this.d;
                messagesStorage.i2(i20, j20, j21, false);
                wpVar.getNotificationCenter().k(301, Long.valueOf(j20), Long.valueOf(j21), Integer.valueOf(i20), arrayList);
                return;
            default:
                a0.h hVar2 = wpVar.Q;
                long j22 = this.f19733c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j22);
                int i21 = this.e;
                if (dialog4 == null) {
                    wpVar.getMessagesStorage().Q1(j22, i21, false, false);
                    return;
                }
                dialog4.unread_poll_votes_count = i21;
                is messagesStorage2 = wpVar.getMessagesStorage();
                long j23 = this.d;
                messagesStorage2.h2(i21, j22, j23, false);
                wpVar.getNotificationCenter().k(302, Long.valueOf(j22), Long.valueOf(j23), Integer.valueOf(i21), arrayList);
                return;
        }
    }

    public zl(wp wpVar, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.f19731a = i11;
        this.f19732b = wpVar;
        this.f19733c = j10;
        this.d = j11;
        this.e = i10;
        this.f19734f = arrayList;
    }
}
