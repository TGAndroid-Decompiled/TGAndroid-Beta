package org.telegram.ui.Components;

import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class pg implements ok, ud.i, org.telegram.ui.ActionBar.a2, rk0, mg.c, org.telegram.ui.ActionBar.r0, hn, AndroidUtilities.IntColorCallback, x4, oi {

    public final int f31597a;

    public final gi f31598b;

    public pg(gi giVar, int i10) {
        this.f31597a = i10;
        this.f31598b = giVar;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        boolean zG1;
        switch (this.f31597a) {
            case 12:
                gi giVar = this.f31598b;
                yh yhVar = giVar.f28696u0;
                if (yhVar == giVar.f28650f0 || yhVar == giVar.m0) {
                    giVar.G1(i10, z10, 0, giVar.s1(), giVar.J0);
                } else if (!yhVar.I(i10, z10, i11, giVar.s1(), 0L)) {
                    giVar.f28705w2 = true;
                    giVar.dismiss();
                }
                break;
            default:
                gi giVar2 = this.f31598b;
                ye yeVar = giVar2.f28642d0;
                long jK = yeVar != null ? yeVar.k() : 0L;
                rh rhVar = giVar2.E0;
                giVar2.J0 = jK;
                rhVar.setEffect(jK);
                yh yhVar2 = giVar2.f28696u0;
                if (yhVar2 == giVar2.f28650f0 || yhVar2 == giVar2.m0) {
                    zG1 = giVar2.G1(i10, z10, i11, giVar2.s1(), jK);
                } else {
                    if (!yhVar2.I(i10, z10, i11, giVar2.s1(), jK)) {
                        giVar2.dismiss();
                    }
                    zG1 = false;
                }
                ye yeVar2 = giVar2.f28642d0;
                if (yeVar2 != null) {
                    yeVar2.h(!zG1);
                    giVar2.f28642d0 = null;
                }
                break;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof zh)) {
            return false;
        }
        zh zhVar = (zh) view;
        gi giVar = this.f31598b;
        if (giVar.R || (user = zhVar.f35238b) == null) {
            return false;
        }
        giVar.w1(zhVar.f35239c, user);
        return true;
    }

    @Override
    public void c(ud.j jVar) {
        this.f31598b.u1();
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.f31597a) {
            case 0:
                ((org.telegram.ui.rn) this.f31598b.f28635b0).d(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.rn) this.f31598b.f28635b0).d(messageMedia, i10, z10, i11, j10);
                break;
            default:
                ((org.telegram.ui.rn) this.f31598b.f28635b0).d(messageMedia, i10, z10, i11, j10);
                break;
        }
    }

    @Override
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, zg.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String string;
        ArrayList<TLRPC.MessageEntity> entities;
        int i11 = this.f31597a;
        gi giVar = this.f31598b;
        switch (i11) {
            case 10:
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) giVar.f28635b0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (rnVar.f7()) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, rnVar.P5, rnVar.f42095j5, rnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    sendMessageParamsOf.todo = tL_messageMediaToDo;
                    sendMessageParamsOf.sendMessageChatArguments = rnVar.C8();
                    sendMessageParamsOf.payStars = j10;
                    sendMessageParamsOf.monoForumPeer = rnVar.N8();
                    sendMessageParamsOf.suggestionParams = rnVar.f42006c5;
                    rnVar.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
                    rnVar.y6();
                }
                break;
            default:
                org.telegram.ui.rn rnVar2 = (org.telegram.ui.rn) giVar.f28635b0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (rnVar2.f7()) {
                    long jNextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        entities = rnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        string = charSequenceArr[0].toString();
                    } else {
                        string = null;
                        entities = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(rnVar2.getAccountInstance(), new zg.h(fVar, tL_messageMediaPoll, jNextLong, string, entities, arrayList), rnVar2.P5, rnVar2.f42095j5, rnVar2.T3, null, rnVar2.f42069h5, z10, i10, rnVar2.C8(), j10, rnVar2.N8(), rnVar2.f42006c5);
                    rnVar2.y6();
                }
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        gi giVar = this.f31598b;
        giVar.f28705w2 = true;
        giVar.dismiss();
    }

    @Override
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        gi giVar = this.f31598b;
        oi oiVar = giVar.U;
        if (oiVar != null) {
            oiVar.g(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.rn)) {
            ei eiVar = giVar.V1;
            if (eiVar != null) {
                eiVar.P0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
        if (rnVar.f7()) {
            rnVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(rnVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, rnVar.P5, rnVar.f42095j5, rnVar.T3, null, z10, i10, i11, rnVar.f42119l5, rnVar.C8(), j10, z11, j11);
            rnVar.y6();
        }
    }

    @Override
    public void h(int i10) {
        this.f31598b.T0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public int i(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        switch (this.f31597a) {
            case 4:
                float f10 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int iV0 = org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f22999a7 : org.telegram.ui.ActionBar.g6.f23143i5, c6Var);
                int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var);
                gi giVar = this.f31598b;
                return giVar.f28661i2 ? i0.b.d(0.75f, iV1, giVar.f28664j2) : ng.c.l(f10, iV0, iV1);
            case 5:
                if (this.f31598b.f28661i2) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 6:
                if (this.f31598b.f28661i2) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                gi giVar2 = this.f31598b;
                if (giVar2.f28661i2) {
                    if (AndroidUtilities.computePerceivedBrightness(giVar2.f28664j2) <= 0.72f) {
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
        gi.p(this.f31598b, i10);
    }

    @Override
    public void b() {
    }
}
