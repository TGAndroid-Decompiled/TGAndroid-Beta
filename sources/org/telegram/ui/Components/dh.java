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
public final class dh implements nl, org.telegram.ui.ActionBar.b2, oe.k, bm0, oi.n, fh.d, oi.m, org.telegram.ui.ActionBar.r0, AndroidUtilities.IntColorCallback, fo, e5, cj {
    public final int f27521a;
    public final ti f27522b;

    public dh(ti tiVar, int i10) {
        this.f27521a = i10;
        this.f27522b = tiVar;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        long j10;
        boolean M1;
        switch (this.f27521a) {
            case 14:
                ti tiVar = this.f27522b;
                li liVar = tiVar.B0;
                if (liVar != tiVar.f33033j0 && liVar != tiVar.f33053q0) {
                    if (!liVar.K(i10, z10, i11, tiVar.w1(), 0L)) {
                        tiVar.G2 = true;
                        tiVar.dismiss();
                        return;
                    }
                    return;
                }
                tiVar.M1(i10, z10, 0, tiVar.w1(), tiVar.Q0);
                return;
            default:
                ti tiVar2 = this.f27522b;
                mf mfVar = tiVar2.f33027h0;
                if (mfVar != null) {
                    j10 = mfVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                bi biVar = tiVar2.L0;
                tiVar2.Q0 = j11;
                biVar.setEffect(j11);
                li liVar2 = tiVar2.B0;
                if (liVar2 != tiVar2.f33033j0 && liVar2 != tiVar2.f33053q0) {
                    if (!liVar2.K(i10, z10, i11, tiVar2.w1(), j11)) {
                        tiVar2.dismiss();
                    }
                    M1 = false;
                } else {
                    M1 = tiVar2.M1(i10, z10, i11, tiVar2.w1(), j11);
                }
                mf mfVar2 = tiVar2.f33027h0;
                if (mfVar2 != null) {
                    mfVar2.g(!M1);
                    tiVar2.f33027h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(oe.l lVar) {
        this.f27522b.z1();
    }

    @Override
    public boolean c(int i10, View view) {
        TLRPC.User user;
        if (view instanceof mi) {
            mi miVar = (mi) view;
            ti tiVar = this.f27522b;
            if (!tiVar.V && (user = miVar.f30590b) != null) {
                tiVar.B1(miVar.f30591c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f27521a) {
            case 0:
                ((org.telegram.ui.un) this.f27522b.f33021f0).d(messageMedia, i10, z10, i11, 0L);
                return;
            case 12:
                ((org.telegram.ui.un) this.f27522b.f33021f0).d(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.un) this.f27522b.f33021f0).d(messageMedia, i10, z10, i11, j10);
                return;
        }
    }

    @Override
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, sh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f27521a;
        ti tiVar = this.f27522b;
        switch (i11) {
            case 13:
                org.telegram.ui.un unVar = (org.telegram.ui.un) tiVar.f33021f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (unVar.m7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, unVar.f44252f6, unVar.f44501z5, unVar.f44298j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = unVar.L8();
                    of2.payStars = j10;
                    of2.monoForumPeer = unVar.X8();
                    of2.suggestionParams = unVar.f44410s5;
                    unVar.getSendMessagesHelper().sendMessage(of2);
                    unVar.D6();
                    return;
                }
                return;
            default:
                org.telegram.ui.un unVar2 = (org.telegram.ui.un) tiVar.f33021f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (unVar2.m7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = unVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(unVar2.getAccountInstance(), new sh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), unVar2.f44252f6, unVar2.f44501z5, unVar2.f44298j4, null, unVar2.f44476x5, z10, i10, unVar2.L8(), j10, unVar2.X8(), unVar2.f44410s5);
                    unVar2.D6();
                    return;
                }
                return;
        }
    }

    @Override
    public int f() {
        ti tiVar = this.f27522b;
        tiVar.getClass();
        return tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6);
    }

    @Override
    public void g(int i10) {
        this.f27522b.f33005a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ti tiVar = this.f27522b;
        tiVar.G2 = true;
        tiVar.dismiss();
    }

    @Override
    public int i(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f27521a) {
            case 5:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.y6.f23299a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.f23447i5;
                }
                int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, u6Var);
                ti tiVar = this.f27522b;
                if (tiVar.f33052p2) {
                    return i0.a.f(0.75f, w03, tiVar.f33055q2);
                }
                return gh.c.n(f7, w02, w03);
            case 6:
                if (this.f27522b.f33052p2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f27522b.f33052p2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ti tiVar2 = this.f27522b;
                if (tiVar2.f33052p2) {
                    if (AndroidUtilities.computePerceivedBrightness(tiVar2.f33055q2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        ti tiVar = this.f27522b;
        cj cjVar = tiVar.Y;
        if (cjVar != null) {
            cjVar.j(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33021f0;
        if (r2Var != null && (r2Var instanceof org.telegram.ui.un)) {
            org.telegram.ui.un unVar = (org.telegram.ui.un) r2Var;
            if (unVar.m7()) {
                unVar.s8(charSequence, null);
                AccountInstance accountInstance = unVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, unVar.f44252f6, unVar.f44501z5, unVar.f44298j4, null, z10, i10, i11, unVar.B5, unVar.L8(), j10, z11, j11);
                unVar.D6();
                return;
            }
            return;
        }
        ri riVar = tiVar.f33013c2;
        if (riVar != null) {
            riVar.z0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
        }
    }

    @Override
    public void k(int i10) {
        ti.u(this.f27522b, i10);
    }

    @Override
    public void run(int i10) {
        ti.q(this.f27522b, i10);
    }

    @Override
    public void a() {
    }
}
