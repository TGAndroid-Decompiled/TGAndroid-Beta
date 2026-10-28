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
public final class dh implements nl, org.telegram.ui.ActionBar.b2, oe.k, cm0, oi.n, fh.d, oi.m, org.telegram.ui.ActionBar.r0, AndroidUtilities.IntColorCallback, fo, e5, cj {
    public final int f27440a;
    public final ti f27441b;

    public dh(ti tiVar, int i10) {
        this.f27440a = i10;
        this.f27441b = tiVar;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        long j10;
        boolean N1;
        switch (this.f27440a) {
            case 14:
                ti tiVar = this.f27441b;
                li liVar = tiVar.B0;
                if (liVar != tiVar.f33002j0 && liVar != tiVar.f33022q0) {
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
                ti tiVar2 = this.f27441b;
                mf mfVar = tiVar2.f32996h0;
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
                if (liVar2 != tiVar2.f33002j0 && liVar2 != tiVar2.f33022q0) {
                    if (!liVar2.K(i10, z10, i11, tiVar2.x1(), j11)) {
                        tiVar2.dismiss();
                    }
                    N1 = false;
                } else {
                    N1 = tiVar2.N1(i10, z10, i11, tiVar2.x1(), j11);
                }
                mf mfVar2 = tiVar2.f32996h0;
                if (mfVar2 != null) {
                    mfVar2.g(!N1);
                    tiVar2.f32996h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(oe.l lVar) {
        this.f27441b.A1();
    }

    @Override
    public boolean c(int i10, View view) {
        TLRPC.User user;
        if (view instanceof mi) {
            mi miVar = (mi) view;
            ti tiVar = this.f27441b;
            if (!tiVar.V && (user = miVar.f30543b) != null) {
                tiVar.C1(miVar.f30544c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f27440a) {
            case 0:
                ((org.telegram.ui.wn) this.f27441b.f32990f0).d(messageMedia, i10, z10, i11, 0L);
                return;
            case 12:
                ((org.telegram.ui.wn) this.f27441b.f32990f0).d(messageMedia, i10, z10, i11, j10);
                return;
            default:
                ((org.telegram.ui.wn) this.f27441b.f32990f0).d(messageMedia, i10, z10, i11, j10);
                return;
        }
    }

    @Override
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, sh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f27440a;
        ti tiVar = this.f27441b;
        switch (i11) {
            case 13:
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) tiVar.f32990f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (wnVar.o7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, wnVar.f45168j6, wnVar.D5, wnVar.f45166j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = wnVar.O8();
                    of2.payStars = j10;
                    of2.monoForumPeer = wnVar.a9();
                    of2.suggestionParams = wnVar.f45330w5;
                    wnVar.getSendMessagesHelper().sendMessage(of2);
                    wnVar.E6();
                    return;
                }
                return;
            default:
                org.telegram.ui.wn wnVar2 = (org.telegram.ui.wn) tiVar.f32990f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (wnVar2.o7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = wnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(wnVar2.getAccountInstance(), new sh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), wnVar2.f45168j6, wnVar2.D5, wnVar2.f45166j4, null, wnVar2.B5, z10, i10, wnVar2.O8(), j10, wnVar2.a9(), wnVar2.f45330w5);
                    wnVar2.E6();
                    return;
                }
                return;
        }
    }

    @Override
    public int f() {
        ti tiVar = this.f27441b;
        tiVar.getClass();
        return tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6);
    }

    @Override
    public void g(int i10) {
        this.f27441b.f32974a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ti tiVar = this.f27441b;
        tiVar.G2 = true;
        tiVar.dismiss();
    }

    @Override
    public int i(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f27440a) {
            case 5:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.y6.f23300a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.f23448i5;
                }
                int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, u6Var);
                ti tiVar = this.f27441b;
                if (tiVar.f33021p2) {
                    return i0.a.f(0.75f, w03, tiVar.f33024q2);
                }
                return gh.c.n(f7, w02, w03);
            case 6:
                if (this.f27441b.f33021p2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f27441b.f33021p2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                ti tiVar2 = this.f27441b;
                if (tiVar2.f33021p2) {
                    if (AndroidUtilities.computePerceivedBrightness(tiVar2.f33024q2) <= 0.72f) {
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
        ti tiVar = this.f27441b;
        cj cjVar = tiVar.Y;
        if (cjVar != null) {
            cjVar.j(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
        if (r2Var != null && (r2Var instanceof org.telegram.ui.wn)) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var;
            if (wnVar.o7()) {
                wnVar.u8(charSequence, null);
                AccountInstance accountInstance = wnVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, wnVar.f45168j6, wnVar.D5, wnVar.f45166j4, null, z10, i10, i11, wnVar.F5, wnVar.O8(), j10, z11, j11);
                wnVar.E6();
                return;
            }
            return;
        }
        ri riVar = tiVar.f32982c2;
        if (riVar != null) {
            riVar.z0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
        }
    }

    @Override
    public void k(int i10) {
        ti.s(this.f27441b, i10);
    }

    @Override
    public void run(int i10) {
        ti.v(this.f27441b, i10);
    }

    @Override
    public void a() {
    }
}
