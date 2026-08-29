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
public final class wg implements wk, vd.j, org.telegram.ui.ActionBar.b2, bl0, og.c, org.telegram.ui.ActionBar.s0, nn, AndroidUtilities.IntColorCallback, b5, vi {
    public final int f34397a;
    public final ni f34398b;

    public wg(ni niVar, int i10) {
        this.f34397a = i10;
        this.f34398b = niVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        long j10;
        boolean G1;
        switch (this.f34397a) {
            case 12:
                ni niVar = this.f34398b;
                fi fiVar = niVar.f31051u0;
                if (fiVar != niVar.f31005f0 && fiVar != niVar.m0) {
                    if (!fiVar.H(i10, z10, i11, niVar.s1(), 0L)) {
                        niVar.f31060w2 = true;
                        niVar.dismiss();
                        return;
                    }
                    return;
                }
                niVar.G1(i10, z10, 0, niVar.s1(), niVar.J0);
                return;
            default:
                ni niVar2 = this.f34398b;
                ff ffVar = niVar2.f30997d0;
                if (ffVar != null) {
                    j10 = ffVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                yh yhVar = niVar2.E0;
                niVar2.J0 = j11;
                yhVar.setEffect(j11);
                fi fiVar2 = niVar2.f31051u0;
                if (fiVar2 != niVar2.f31005f0 && fiVar2 != niVar2.m0) {
                    if (!fiVar2.H(i10, z10, i11, niVar2.s1(), j11)) {
                        niVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = niVar2.G1(i10, z10, i11, niVar2.s1(), j11);
                }
                ff ffVar2 = niVar2.f30997d0;
                if (ffVar2 != null) {
                    ffVar2.h(!G1);
                    niVar2.f30997d0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(vd.k kVar) {
        this.f34398b.u1();
    }

    @Override
    public boolean c(int i10, View view) {
        TLRPC.User user;
        if (view instanceof gi) {
            gi giVar = (gi) view;
            ni niVar = this.f34398b;
            if (!niVar.R && (user = giVar.f28889b) != null) {
                niVar.w1(giVar.f28890c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f34397a) {
            case 0:
                ((org.telegram.ui.tn) this.f34398b.f30990b0).d(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.tn) this.f34398b.f30990b0).d(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.tn) this.f34398b.f30990b0).d(messageMedia, i10, z10, i11, j10);
                return;
        }
    }

    @Override
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, bh.i iVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f34397a;
        ni niVar = this.f34398b;
        switch (i11) {
            case 10:
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) niVar.f30990b0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (tnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, tnVar.P5, tnVar.f42856j5, tnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = tnVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = tnVar.N8();
                    of2.suggestionParams = tnVar.f42768c5;
                    tnVar.getSendMessagesHelper().sendMessage(of2);
                    tnVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.tn tnVar2 = (org.telegram.ui.tn) niVar.f30990b0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (tnVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = tnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(tnVar2.getAccountInstance(), new bh.k(iVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), tnVar2.P5, tnVar2.f42856j5, tnVar2.T3, null, tnVar2.f42831h5, z10, i10, tnVar2.C8(), j10, tnVar2.N8(), tnVar2.f42768c5);
                    tnVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public int f(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        float f9;
        int i10;
        switch (this.f34397a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f9 = 0.85f;
                } else {
                    f9 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.g6.f23009a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.g6.f23151i5;
                }
                int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var);
                ni niVar = this.f34398b;
                if (niVar.f31016i2) {
                    return i0.a.d(0.75f, v03, niVar.f31019j2);
                }
                return pg.a.l(f9, v02, v03);
            case 5:
                if (this.f34398b.f31016i2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f34398b.f31016i2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ni niVar2 = this.f34398b;
                if (niVar2.f31016i2) {
                    if (AndroidUtilities.computePerceivedBrightness(niVar2.f31019j2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ni niVar = this.f34398b;
        niVar.f31060w2 = true;
        niVar.dismiss();
    }

    @Override
    public void i(int i10) {
        this.f34398b.T0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        ni niVar = this.f34398b;
        vi viVar = niVar.U;
        if (viVar != null) {
            viVar.j(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        if (o2Var != null && (o2Var instanceof org.telegram.ui.tn)) {
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            if (tnVar.f7()) {
                tnVar.l8(charSequence, null);
                AccountInstance accountInstance = tnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, tnVar.P5, tnVar.f42856j5, tnVar.T3, null, z10, i10, i11, tnVar.f42880l5, tnVar.C8(), j10, z11, j11);
                tnVar.y6();
                return;
            }
            return;
        }
        li liVar = niVar.V1;
        if (liVar != null) {
            liVar.X1(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
        }
    }

    @Override
    public void run(int i10) {
        ni.o(this.f34398b, i10);
    }

    @Override
    public void a() {
    }
}
