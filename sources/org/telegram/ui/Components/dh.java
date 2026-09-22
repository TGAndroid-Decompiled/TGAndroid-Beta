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
public final class dh implements bl, le.k, org.telegram.ui.ActionBar.a2, ol0, dh.d, org.telegram.ui.ActionBar.r0, tn, AndroidUtilities.IntColorCallback, c5, dj {
    public final int f23683a;
    public final vi f23684b;

    public dh(vi viVar, int i10) {
        this.f23683a = i10;
        this.f23684b = viVar;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        long j3;
        boolean G1;
        switch (this.f23683a) {
            case 12:
                vi viVar = this.f23684b;
                ni niVar = viVar.f29157y0;
                if (niVar != viVar.f29108j0 && niVar != viVar.f29128q0) {
                    if (!niVar.I(i10, z10, i11, viVar.s1(), 0L)) {
                        viVar.A2 = true;
                        viVar.dismiss();
                        return;
                    }
                    return;
                }
                viVar.G1(i10, z10, 0, viVar.s1(), viVar.N0);
                return;
            default:
                vi viVar2 = this.f23684b;
                mf mfVar = viVar2.f29102h0;
                if (mfVar != null) {
                    j3 = mfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                fi fiVar = viVar2.I0;
                viVar2.N0 = j10;
                fiVar.setEffect(j10);
                ni niVar2 = viVar2.f29157y0;
                if (niVar2 != viVar2.f29108j0 && niVar2 != viVar2.f29128q0) {
                    if (!niVar2.I(i10, z10, i11, viVar2.s1(), j10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = viVar2.G1(i10, z10, i11, viVar2.s1(), j10);
                }
                mf mfVar2 = viVar2.f29102h0;
                if (mfVar2 != null) {
                    mfVar2.h(!G1);
                    viVar2.f29102h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f23683a) {
            case 0:
                ((org.telegram.ui.zn) this.f23684b.f29096f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.zn) this.f23684b.f29096f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.zn) this.f23684b.f29096f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(le.l lVar) {
        this.f23684b.u1();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof oi) {
            oi oiVar = (oi) view;
            vi viVar = this.f23684b;
            if (!viVar.V && (user = oiVar.f27081b) != null) {
                viVar.w1(oiVar.f27082c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, qh.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f23683a;
        vi viVar = this.f23684b;
        switch (i11) {
            case 10:
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) viVar.f29096f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (znVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, znVar.T5, znVar.f40430n5, znVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = znVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = znVar.N8();
                    of2.suggestionParams = znVar.f40344g5;
                    znVar.getSendMessagesHelper().sendMessage(of2);
                    znVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) viVar.f29096f0;
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
                    SendMessagesHelper.prepareSendingPoll(znVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), znVar2.T5, znVar2.f40430n5, znVar2.X3, null, znVar2.f40404l5, z10, i10, znVar2.C8(), j3, znVar2.N8(), znVar2.f40344g5);
                    znVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public int f(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f23683a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.j6.f19053a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f19198i5;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19109d6, f6Var);
                vi viVar = this.f23684b;
                if (viVar.f29117m2) {
                    return i0.a.d(0.75f, v03, viVar.f29121n2);
                }
                return eh.b.n(f7, v02, v03);
            case 5:
                if (this.f23684b.f29117m2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f23684b.f29117m2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                vi viVar2 = this.f23684b;
                if (viVar2.f29117m2) {
                    if (AndroidUtilities.computePerceivedBrightness(viVar2.f29121n2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        vi viVar = this.f23684b;
        dj djVar = viVar.Y;
        if (djVar != null) {
            djVar.h(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f29096f0;
        if (n2Var != null && (n2Var instanceof org.telegram.ui.zn)) {
            org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
            if (znVar.f7()) {
                znVar.l8(charSequence, null);
                AccountInstance accountInstance = znVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, znVar.T5, znVar.f40430n5, znVar.X3, null, z10, i10, i11, znVar.p5, znVar.C8(), j3, z11, j10);
                znVar.y6();
                return;
            }
            return;
        }
        ti tiVar = viVar.Z1;
        if (tiVar != null) {
            tiVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        vi viVar = this.f23684b;
        viVar.A2 = true;
        viVar.dismiss();
    }

    @Override
    public void m(int i10) {
        this.f23684b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        vi.o(this.f23684b, i10);
    }

    @Override
    public void a() {
    }
}
