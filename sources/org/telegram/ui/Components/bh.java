package org.telegram.ui.Components;

import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bh implements kl, org.telegram.ui.ActionBar.z1, ne.k, bm0, eh.d, org.telegram.ui.ActionBar.q0, bo, AndroidUtilities.IntColorCallback, b5, aj {
    public final int f25000a;
    public final ri f25001b;

    public bh(ri riVar, int i10) {
        this.f25000a = i10;
        this.f25001b = riVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        long j10;
        boolean N1;
        switch (this.f25000a) {
            case 12:
                ri riVar = this.f25001b;
                ji jiVar = riVar.B0;
                if (jiVar != riVar.f30158j0 && jiVar != riVar.f30178q0) {
                    if (!jiVar.K(i10, z10, i11, riVar.x1(), 0L)) {
                        riVar.G2 = true;
                        riVar.dismiss();
                        return;
                    }
                    return;
                }
                riVar.N1(i10, z10, 0, riVar.x1(), riVar.Q0);
                return;
            default:
                ri riVar2 = this.f25001b;
                kf kfVar = riVar2.f30152h0;
                if (kfVar != null) {
                    j10 = kfVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ci ciVar = riVar2.L0;
                riVar2.Q0 = j11;
                ciVar.setEffect(j11);
                ji jiVar2 = riVar2.B0;
                if (jiVar2 != riVar2.f30158j0 && jiVar2 != riVar2.f30178q0) {
                    if (!jiVar2.K(i10, z10, i11, riVar2.x1(), j11)) {
                        riVar2.dismiss();
                    }
                    N1 = false;
                } else {
                    N1 = riVar2.N1(i10, z10, i11, riVar2.x1(), j11);
                }
                kf kfVar2 = riVar2.f30152h0;
                if (kfVar2 != null) {
                    kfVar2.g(!N1);
                    riVar2.f30152h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f25000a) {
            case 0:
                ((org.telegram.ui.sn) this.f25001b.f30146f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.sn) this.f25001b.f30146f0).b(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.sn) this.f25001b.f30146f0).b(messageMedia, i10, z10, i11, j10);
                return;
        }
    }

    @Override
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, rh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f25000a;
        ri riVar = this.f25001b;
        switch (i11) {
            case 10:
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) riVar.f30146f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (snVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, snVar.f41516f6, snVar.f41764z5, snVar.f41561j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = snVar.H8();
                    of2.payStars = j10;
                    of2.monoForumPeer = snVar.S8();
                    of2.suggestionParams = snVar.f41674s5;
                    snVar.getSendMessagesHelper().sendMessage(of2);
                    snVar.B6();
                    return;
                }
                return;
            default:
                org.telegram.ui.sn snVar2 = (org.telegram.ui.sn) riVar.f30146f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (snVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = snVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(snVar2.getAccountInstance(), new rh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), snVar2.f41516f6, snVar2.f41764z5, snVar2.f41561j4, null, snVar2.f41739x5, z10, i10, snVar2.H8(), j10, snVar2.S8(), snVar2.f41674s5);
                    snVar2.B6();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof ki) {
            ki kiVar = (ki) view;
            ri riVar = this.f25001b;
            if (!riVar.V && (user = kiVar.f28020b) != null) {
                riVar.C1(kiVar.f28021c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void e(ne.l lVar) {
        this.f25001b.A1();
    }

    @Override
    public void f(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        ri riVar = this.f25001b;
        aj ajVar = riVar.Y;
        if (ajVar != null) {
            ajVar.f(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
        if (o2Var != null && (o2Var instanceof org.telegram.ui.sn)) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
            if (snVar.i7()) {
                snVar.o8(charSequence, null);
                AccountInstance accountInstance = snVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, snVar.f41516f6, snVar.f41764z5, snVar.f41561j4, null, z10, i10, i11, snVar.B5, snVar.H8(), j10, z11, j11);
                snVar.B6();
                return;
            }
            return;
        }
        pi piVar = riVar.f30138c2;
        if (piVar != null) {
            piVar.r0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ri riVar = this.f25001b;
        riVar.G2 = true;
        riVar.dismiss();
    }

    @Override
    public void h(int i10) {
        this.f25001b.f30130a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public int i(org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f25000a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.k6.f21126a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21272i5;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, g6Var);
                ri riVar = this.f25001b;
                if (riVar.f30177p2) {
                    return i0.a.f(0.75f, w03, riVar.f30180q2);
                }
                return fh.c.m(f7, w02, w03);
            case 5:
                if (this.f25001b.f30177p2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f25001b.f30177p2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ri riVar2 = this.f25001b;
                if (riVar2.f30177p2) {
                    if (AndroidUtilities.computePerceivedBrightness(riVar2.f30180q2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void run(int i10) {
        ri.t(this.f25001b, i10);
    }

    @Override
    public void a() {
    }
}
