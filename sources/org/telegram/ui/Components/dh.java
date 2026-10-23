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
public final class dh implements ml, org.telegram.ui.ActionBar.z1, ne.k, cm0, eh.d, org.telegram.ui.ActionBar.q0, eo, AndroidUtilities.IntColorCallback, d5, cj {
    public final int f25627a;
    public final ti f25628b;

    public dh(ti tiVar, int i10) {
        this.f25627a = i10;
        this.f25628b = tiVar;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        long j10;
        boolean N1;
        switch (this.f25627a) {
            case 12:
                ti tiVar = this.f25628b;
                li liVar = tiVar.B0;
                if (liVar != tiVar.f30742j0 && liVar != tiVar.f30762q0) {
                    if (!liVar.K(i10, z10, i11, tiVar.x1(), 0L)) {
                        tiVar.G2 = true;
                        tiVar.dismiss();
                        return;
                    }
                    return;
                }
                tiVar.N1(i10, z10, 0, tiVar.x1(), tiVar.Q0);
                return;
            default:
                ti tiVar2 = this.f25628b;
                mf mfVar = tiVar2.f30736h0;
                if (mfVar != null) {
                    j10 = mfVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ei eiVar = tiVar2.L0;
                tiVar2.Q0 = j11;
                eiVar.setEffect(j11);
                li liVar2 = tiVar2.B0;
                if (liVar2 != tiVar2.f30742j0 && liVar2 != tiVar2.f30762q0) {
                    if (!liVar2.K(i10, z10, i11, tiVar2.x1(), j11)) {
                        tiVar2.dismiss();
                    }
                    N1 = false;
                } else {
                    N1 = tiVar2.N1(i10, z10, i11, tiVar2.x1(), j11);
                }
                mf mfVar2 = tiVar2.f30736h0;
                if (mfVar2 != null) {
                    mfVar2.g(!N1);
                    tiVar2.f30736h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f25627a) {
            case 0:
                ((org.telegram.ui.sn) this.f25628b.f30730f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.sn) this.f25628b.f30730f0).b(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.sn) this.f25628b.f30730f0).b(messageMedia, i10, z10, i11, j10);
                return;
        }
    }

    @Override
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, rh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f25627a;
        ti tiVar = this.f25628b;
        switch (i11) {
            case 10:
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) tiVar.f30730f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (snVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, snVar.f41519f6, snVar.f41767z5, snVar.f41564j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = snVar.H8();
                    of2.payStars = j10;
                    of2.monoForumPeer = snVar.S8();
                    of2.suggestionParams = snVar.f41677s5;
                    snVar.getSendMessagesHelper().sendMessage(of2);
                    snVar.B6();
                    return;
                }
                return;
            default:
                org.telegram.ui.sn snVar2 = (org.telegram.ui.sn) tiVar.f30730f0;
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
                    SendMessagesHelper.prepareSendingPoll(snVar2.getAccountInstance(), new rh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), snVar2.f41519f6, snVar2.f41767z5, snVar2.f41564j4, null, snVar2.f41742x5, z10, i10, snVar2.H8(), j10, snVar2.S8(), snVar2.f41677s5);
                    snVar2.B6();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof mi) {
            mi miVar = (mi) view;
            ti tiVar = this.f25628b;
            if (!tiVar.V && (user = miVar.f28662b) != null) {
                tiVar.C1(miVar.f28663c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void e(ne.l lVar) {
        this.f25628b.A1();
    }

    @Override
    public void f(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        ti tiVar = this.f25628b;
        cj cjVar = tiVar.Y;
        if (cjVar != null) {
            cjVar.f(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
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
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, snVar.f41519f6, snVar.f41767z5, snVar.f41564j4, null, z10, i10, i11, snVar.B5, snVar.H8(), j10, z11, j11);
                snVar.B6();
                return;
            }
            return;
        }
        ri riVar = tiVar.f30722c2;
        if (riVar != null) {
            riVar.r0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ti tiVar = this.f25628b;
        tiVar.G2 = true;
        tiVar.dismiss();
    }

    @Override
    public void h(int i10) {
        this.f25628b.f30714a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public int i(org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f25627a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.k6.f21125a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21271i5;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, g6Var);
                ti tiVar = this.f25628b;
                if (tiVar.f30761p2) {
                    return i0.a.f(0.75f, w03, tiVar.f30764q2);
                }
                return fh.c.m(f7, w02, w03);
            case 5:
                if (this.f25628b.f30761p2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f25628b.f30761p2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ti tiVar2 = this.f25628b;
                if (tiVar2.f30761p2) {
                    if (AndroidUtilities.computePerceivedBrightness(tiVar2.f30764q2) <= 0.72f) {
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
        ti.t(this.f25628b, i10);
    }

    @Override
    public void a() {
    }
}
