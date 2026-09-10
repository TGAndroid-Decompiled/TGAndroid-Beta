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
public final class gh implements gl, le.k, org.telegram.ui.ActionBar.c2, ll0, ch.d, org.telegram.ui.ActionBar.s0, yn, AndroidUtilities.IntColorCallback, c5, gj {
    public final int f23361a;
    public final yi f23362b;

    public gh(yi yiVar, int i10) {
        this.f23361a = i10;
        this.f23362b = yiVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        long j3;
        boolean G1;
        switch (this.f23361a) {
            case 12:
                yi yiVar = this.f23362b;
                qi qiVar = yiVar.f29427y0;
                if (qiVar != yiVar.f29378j0 && qiVar != yiVar.f29398q0) {
                    if (!qiVar.I(i10, z10, i11, yiVar.s1(), 0L)) {
                        yiVar.A2 = true;
                        yiVar.dismiss();
                        return;
                    }
                    return;
                }
                yiVar.G1(i10, z10, 0, yiVar.s1(), yiVar.N0);
                return;
            default:
                yi yiVar2 = this.f23362b;
                of ofVar = yiVar2.f29372h0;
                if (ofVar != null) {
                    j3 = ofVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ii iiVar = yiVar2.I0;
                yiVar2.N0 = j10;
                iiVar.setEffect(j10);
                qi qiVar2 = yiVar2.f29427y0;
                if (qiVar2 != yiVar2.f29378j0 && qiVar2 != yiVar2.f29398q0) {
                    if (!qiVar2.I(i10, z10, i11, yiVar2.s1(), j10)) {
                        yiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = yiVar2.G1(i10, z10, i11, yiVar2.s1(), j10);
                }
                of ofVar2 = yiVar2.f29372h0;
                if (ofVar2 != null) {
                    ofVar2.h(!G1);
                    yiVar2.f29372h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f23361a) {
            case 0:
                ((org.telegram.ui.eo) this.f23362b.f29366f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 9:
                ((org.telegram.ui.eo) this.f23362b.f29366f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.eo) this.f23362b.f29366f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, ph.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.f23361a;
        yi yiVar = this.f23362b;
        switch (i11) {
            case 10:
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) yiVar.f29366f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (eoVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, eoVar.T5, eoVar.f32421n5, eoVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = eoVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = eoVar.N8();
                    of2.suggestionParams = eoVar.f32336g5;
                    eoVar.getSendMessagesHelper().sendMessage(of2);
                    eoVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.eo eoVar2 = (org.telegram.ui.eo) yiVar.f29366f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (eoVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = eoVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(eoVar2.getAccountInstance(), new ph.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), eoVar2.T5, eoVar2.f32421n5, eoVar2.X3, null, eoVar2.f32395l5, z10, i10, eoVar2.C8(), j3, eoVar2.N8(), eoVar2.f32336g5);
                    eoVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof ri) {
            ri riVar = (ri) view;
            yi yiVar = this.f23362b;
            if (!yiVar.V && (user = riVar.f26671b) != null) {
                yiVar.w1(riVar.f26672c, user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void e(le.l lVar) {
        this.f23362b.u1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        yi yiVar = this.f23362b;
        yiVar.A2 = true;
        yiVar.dismiss();
    }

    @Override
    public int g(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f23361a) {
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.j6.f17872a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f18016i5;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var);
                yi yiVar = this.f23362b;
                if (yiVar.f29387m2) {
                    return i0.a.d(0.75f, v03, yiVar.f29391n2);
                }
                return dh.c.m(f7, v02, v03);
            case 5:
                if (this.f23362b.f29387m2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 6:
                if (this.f23362b.f29387m2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                yi yiVar2 = this.f23362b;
                if (yiVar2.f29387m2) {
                    if (AndroidUtilities.computePerceivedBrightness(yiVar2.f29391n2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        yi yiVar = this.f23362b;
        gj gjVar = yiVar.Y;
        if (gjVar != null) {
            gjVar.i(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        if (p2Var != null && (p2Var instanceof org.telegram.ui.eo)) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
            if (eoVar.f7()) {
                eoVar.l8(charSequence, null);
                AccountInstance accountInstance = eoVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, eoVar.T5, eoVar.f32421n5, eoVar.X3, null, z10, i10, i11, eoVar.p5, eoVar.C8(), j3, z11, j10);
                eoVar.y6();
                return;
            }
            return;
        }
        wi wiVar = yiVar.Z1;
        if (wiVar != null) {
            wiVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void m(int i10) {
        this.f23362b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        yi.o(this.f23362b, i10);
    }

    @Override
    public void a() {
    }
}
