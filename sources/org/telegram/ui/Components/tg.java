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
public final class tg implements uk, xd.i, org.telegram.ui.ActionBar.c2, jl0, qg.c, org.telegram.ui.ActionBar.s0, on, AndroidUtilities.IntColorCallback, y4, ti {
    public final int f28985a;
    public final li f28986b;

    public tg(li liVar, int i10) {
        this.f28985a = i10;
        this.f28986b = liVar;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        long j10;
        boolean G1;
        switch (this.f28985a) {
            case 12:
                li liVar = this.f28986b;
                di diVar = liVar.f26744v0;
                if (diVar != liVar.f26698g0 && diVar != liVar.f26718n0) {
                    if (!diVar.H(i10, z4, i11, liVar.s1(), 0L)) {
                        liVar.f26754x2 = true;
                        liVar.dismiss();
                        return;
                    }
                    return;
                }
                liVar.G1(i10, z4, 0, liVar.s1(), liVar.K0);
                return;
            default:
                li liVar2 = this.f28986b;
                cf cfVar = liVar2.f26691e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                vh vhVar = liVar2.F0;
                liVar2.K0 = j11;
                vhVar.setEffect(j11);
                di diVar2 = liVar2.f26744v0;
                if (diVar2 != liVar2.f26698g0 && diVar2 != liVar2.f26718n0) {
                    if (!diVar2.H(i10, z4, i11, liVar2.s1(), j11)) {
                        liVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = liVar2.G1(i10, z4, i11, liVar2.s1(), j11);
                }
                cf cfVar2 = liVar2.f26691e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    liVar2.f26691e0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        switch (this.f28985a) {
            case 0:
                ((org.telegram.ui.zn) this.f28986b.f26685c0).b(messageMedia, i10, z4, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.zn) this.f28986b.f26685c0).b(messageMedia, i10, z4, i11, j10);
                return;
            default:
                ((org.telegram.ui.zn) this.f28986b.f26685c0).b(messageMedia, i10, z4, i11, j10);
                return;
        }
    }

    @Override
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, dh.i iVar, ArrayList arrayList, boolean z4, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f28985a;
        li liVar = this.f28986b;
        switch (i11) {
            case 10:
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) liVar.f26685c0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (znVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, znVar.Q5, znVar.f40642k5, znVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = znVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = znVar.N8();
                    of2.suggestionParams = znVar.f40555d5;
                    znVar.getSendMessagesHelper().sendMessage(of2);
                    znVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) liVar.f26685c0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (znVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = znVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(znVar2.getAccountInstance(), new dh.k(iVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), znVar2.Q5, znVar2.f40642k5, znVar2.U3, null, znVar2.f40618i5, z4, i10, znVar2.C8(), j10, znVar2.N8(), znVar2.f40555d5);
                    znVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof ei) {
            ei eiVar = (ei) view;
            li liVar = this.f28986b;
            if (!liVar.S && (user = eiVar.f24619b) != null) {
                liVar.w1(eiVar.f24620c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void e(xd.j jVar) {
        this.f28986b.u1();
    }

    @Override
    public int f(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        float f10;
        int i10;
        switch (this.f28985a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                if (z4) {
                    i10 = org.telegram.ui.ActionBar.j6.f19827a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19970i5;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var);
                li liVar = this.f28986b;
                if (liVar.f26709j2) {
                    return i0.a.d(0.75f, v03, liVar.f26712k2);
                }
                return rg.b.m(f10, v02, v03);
            case 5:
                if (this.f28986b.f26709j2) {
                    return 0;
                }
                if (z4) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f28986b.f26709j2) {
                    return 0;
                }
                if (z4) {
                    return 352321535;
                }
                return -1;
            default:
                li liVar2 = this.f28986b;
                if (liVar2.f26709j2) {
                    if (AndroidUtilities.computePerceivedBrightness(liVar2.f26712k2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z4) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        CharSequence charSequence2;
        li liVar = this.f28986b;
        ti tiVar = liVar.V;
        if (tiVar != null) {
            tiVar.g(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
        if (p2Var != null && (p2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var;
            if (znVar.f7()) {
                znVar.l8(charSequence, null);
                AccountInstance accountInstance = znVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, znVar.Q5, znVar.f40642k5, znVar.U3, null, z4, i10, i11, znVar.f40666m5, znVar.C8(), j10, z10, j11);
                znVar.y6();
                return;
            }
            return;
        }
        ji jiVar = liVar.W1;
        if (jiVar != null) {
            jiVar.b2(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        li liVar = this.f28986b;
        liVar.f26754x2 = true;
        liVar.dismiss();
    }

    @Override
    public void m(int i10) {
        this.f28986b.U0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        li.o(this.f28986b, i10);
    }

    @Override
    public void a() {
    }
}
