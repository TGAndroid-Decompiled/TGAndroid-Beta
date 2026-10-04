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
public final class fh implements el, le.k, org.telegram.ui.ActionBar.a2, ol0, li.j, dh.d, li.i, org.telegram.ui.ActionBar.r0, AndroidUtilities.IntColorCallback, wn, d5, gj {
    public final int f26452a;
    public final xi f26453b;

    public fh(xi xiVar, int i10) {
        this.f26452a = i10;
        this.f26453b = xiVar;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        long j3;
        boolean D1;
        switch (this.f26452a) {
            case 14:
                xi xiVar = this.f26453b;
                pi piVar = xiVar.f32873y0;
                if (piVar != xiVar.f32824j0 && piVar != xiVar.f32844q0) {
                    if (!piVar.G(i10, z10, i11, xiVar.p1(), 0L)) {
                        xiVar.A2 = true;
                        xiVar.dismiss();
                        return;
                    }
                    return;
                }
                xiVar.D1(i10, z10, 0, xiVar.p1(), xiVar.N0);
                return;
            default:
                xi xiVar2 = this.f26453b;
                of ofVar = xiVar2.f32818h0;
                if (ofVar != null) {
                    j3 = ofVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ei eiVar = xiVar2.I0;
                xiVar2.N0 = j10;
                eiVar.setEffect(j10);
                pi piVar2 = xiVar2.f32873y0;
                if (piVar2 != xiVar2.f32824j0 && piVar2 != xiVar2.f32844q0) {
                    if (!piVar2.G(i10, z10, i11, xiVar2.p1(), j10)) {
                        xiVar2.dismiss();
                    }
                    D1 = false;
                } else {
                    D1 = xiVar2.D1(i10, z10, i11, xiVar2.p1(), j10);
                }
                of ofVar2 = xiVar2.f32818h0;
                if (ofVar2 != null) {
                    ofVar2.h(!D1);
                    xiVar2.f32818h0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.f26452a) {
            case 0:
                ((org.telegram.ui.yn) this.f26453b.f32812f0).b(messageMedia, i10, z10, i11, 0L);
                return;
            case 11:
                ((org.telegram.ui.yn) this.f26453b.f32812f0).b(messageMedia, i10, z10, i11, j3);
                return;
            default:
                ((org.telegram.ui.yn) this.f26453b.f32812f0).b(messageMedia, i10, z10, i11, j3);
                return;
        }
    }

    @Override
    public void c(le.l lVar) {
        this.f26453b.r1();
    }

    @Override
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (view instanceof qi) {
            qi qiVar = (qi) view;
            xi xiVar = this.f26453b;
            if (!xiVar.V && (user = qiVar.f30042b) != null) {
                xiVar.t1(qiVar.f30043c, user);
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
        int i11 = this.f26452a;
        xi xiVar = this.f26453b;
        switch (i11) {
            case 13:
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) xiVar.f32812f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (ynVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, ynVar.R5, ynVar.f43404l5, ynVar.V3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = ynVar.D8();
                    of2.payStars = j3;
                    of2.monoForumPeer = ynVar.O8();
                    of2.suggestionParams = ynVar.f43320e5;
                    ynVar.getSendMessagesHelper().sendMessage(of2);
                    ynVar.y6();
                    return;
                }
                return;
            default:
                org.telegram.ui.yn ynVar2 = (org.telegram.ui.yn) xiVar.f32812f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (ynVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = ynVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(ynVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), ynVar2.R5, ynVar2.f43404l5, ynVar2.V3, null, ynVar2.f43380j5, z10, i10, ynVar2.D8(), j3, ynVar2.O8(), ynVar2.f43320e5);
                    ynVar2.y6();
                    return;
                }
                return;
        }
    }

    @Override
    public int f() {
        xi xiVar = this.f26453b;
        xiVar.getClass();
        return xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20817d6);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xi xiVar = this.f26453b;
        xiVar.A2 = true;
        xiVar.dismiss();
    }

    @Override
    public int h(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        float f7;
        int i10;
        switch (this.f26452a) {
            case 5:
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.i6.f20761a7;
                } else {
                    i10 = org.telegram.ui.ActionBar.i6.f20907i5;
                }
                int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
                int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20817d6, d6Var);
                xi xiVar = this.f26453b;
                if (xiVar.f32833m2) {
                    return i0.a.d(0.75f, v03, xiVar.f32837n2);
                }
                return eh.b.n(f7, v02, v03);
            case 6:
                if (this.f26453b.f32833m2) {
                    return 0;
                }
                if (z10) {
                    return 687865855;
                }
                return -1;
            case 7:
                if (this.f26453b.f32833m2) {
                    return 0;
                }
                if (z10) {
                    return 352321535;
                }
                return -1;
            default:
                xi xiVar2 = this.f26453b;
                if (xiVar2.f32833m2) {
                    if (AndroidUtilities.computePerceivedBrightness(xiVar2.f32837n2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return 536870912;
        }
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        CharSequence charSequence2;
        xi xiVar = this.f26453b;
        gj gjVar = xiVar.Y;
        if (gjVar != null) {
            gjVar.j(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32812f0;
        if (n2Var != null && (n2Var instanceof org.telegram.ui.yn)) {
            org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
            if (ynVar.f7()) {
                ynVar.l8(charSequence, null);
                AccountInstance accountInstance = ynVar.getAccountInstance();
                if (charSequence != null) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence2, ynVar.R5, ynVar.f43404l5, ynVar.V3, null, z10, i10, i11, ynVar.f43430n5, ynVar.D8(), j3, z11, j10);
                ynVar.y6();
                return;
            }
            return;
        }
        vi viVar = xiVar.Z1;
        if (viVar != null) {
            viVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
        }
    }

    @Override
    public void k(int i10) {
        xi.t(this.f26453b, i10);
    }

    @Override
    public void m(int i10) {
        this.f26453b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void run(int i10) {
        xi.x(this.f26453b, i10);
    }

    @Override
    public void a() {
    }
}
