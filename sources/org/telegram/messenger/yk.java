package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yk implements Runnable {
    public final int f26595a;
    public final cs f26596b;
    public final long f26597c;
    public final int d;
    public final int f26598e;
    public final boolean f26599f;

    public yk(hp hpVar, long j10, int i3, int i10, boolean z10, int i11) {
        this.f26595a = i11;
        this.f26596b = hpVar;
        this.f26597c = j10;
        this.d = i3;
        this.f26598e = i10;
        this.f26599f = z10;
    }

    @Override
    public final void run() {
        long j10;
        int i3;
        int i10 = this.f26595a;
        cs csVar = this.f26596b;
        switch (i10) {
            case 0:
                hp hpVar = (hp) csVar;
                a0.h hVar = hpVar.R;
                long j11 = this.f26597c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                int i11 = this.f26598e;
                if (dialog != null) {
                    int i12 = dialog.unread_count;
                    int i13 = this.d;
                    if (i13 != 0 && i11 < dialog.top_message) {
                        int max = Math.max(i12 - i13, 0);
                        dialog.unread_count = max;
                        if (i11 != Integer.MIN_VALUE && max > (i3 = dialog.top_message - i11)) {
                            dialog.unread_count = i3;
                        }
                    } else {
                        dialog.unread_count = 0;
                    }
                    boolean z10 = dialog.unread_mark;
                    if (z10) {
                        dialog.unread_mark = false;
                        hpVar.getMessagesStorage().F1(dialog.f27005id, false);
                    }
                    if ((i12 == 0 && !z10) || dialog.unread_count != 0) {
                        j10 = j11;
                    } else {
                        j10 = j11;
                        hpVar.r2(j10, 0L, null);
                        int i14 = 0;
                        while (true) {
                            mo[] moVarArr = hpVar.N;
                            if (i14 < moVarArr.length) {
                                mo moVar = moVarArr[i14];
                                if (moVar != null && (moVar.f24242g & 64) != 0) {
                                    hpVar.T4(null);
                                    hpVar.getNotificationCenter().k(3, new Object[0]);
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    hpVar.getNotificationCenter().k(2, 256);
                } else {
                    j10 = j11;
                }
                if (!this.f26599f) {
                    long j12 = j10;
                    hpVar.getNotificationsController().L(null, j12, 0, i11, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j12, 0);
                    hpVar.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                long j13 = j10;
                hpVar.getNotificationsController().L(null, j13, 0, i11, true);
                LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                longSparseIntArray2.put(j13, -1);
                hpVar.getNotificationsController().J(longSparseIntArray2);
                return;
            case 1:
                g0.h3(new yk((hp) csVar, this.f26597c, this.d, this.f26598e, this.f26599f, 0));
                return;
            default:
                int i15 = ChatActivityEnterView.f31082t5;
                ((ChatActivityEnterView) csVar).S0(this.f26599f, this.d, this.f26598e, this.f26597c, false);
                return;
        }
    }

    public yk(ChatActivityEnterView chatActivityEnterView, boolean z10, int i3, int i10, long j10) {
        this.f26595a = 2;
        this.f26596b = chatActivityEnterView;
        this.f26599f = z10;
        this.d = i3;
        this.f26598e = i10;
        this.f26597c = j10;
    }
}
