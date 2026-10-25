package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.af1;
public final class tv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, ig.z1, oe.d, GenericProvider, q90, pf0, wh.a, bm0, org.telegram.ui.ux, di.p7, MessagesStorage.StringCallback, w91, LanguageDetector.StringCallback, yw0 {
    public final int f33163a;
    public final Object f33164b;

    public tv(Object obj, int i10) {
        this.f33163a = i10;
        this.f33164b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((ta0) this.f33164b).Y();
    }

    @Override
    public boolean K(org.telegram.ui.cy cyVar) {
        return false;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public void b(boolean z10) {
        di.z6 z6Var = (di.z6) this.f33164b;
        if (z10) {
            z6Var.p(30, false);
        }
    }

    @Override
    public boolean c(int i10, View view) {
        ok0 ok0Var;
        switch (this.f33163a) {
            case 17:
                pk0 pk0Var = (pk0) this.f33164b;
                ArrayList arrayList = pk0Var.f31586n;
                if (pk0Var.f31585f.j(i10) == 0 && (ok0Var = pk0Var.F) != null) {
                    ok0Var.f(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                co0 co0Var = (co0) this.f33164b;
                bo0 bo0Var = co0Var.f27217c;
                MessageObject E = bo0Var.E(i10);
                co0 co0Var2 = bo0Var.f26921c;
                if (E == null) {
                    return false;
                }
                if (!co0Var.I.g()) {
                    co0Var.I.a();
                    bo0Var.q(0, co0Var2.f27220r);
                }
                if (co0Var.I.g()) {
                    co0Var.I.e(E, view, 0);
                    if (!co0Var.I.g()) {
                        bo0Var.q(0, co0Var2.f27220r);
                    }
                    org.telegram.ui.z00 z00Var = co0Var.J;
                    int id2 = E.getId();
                    z00Var.f46145a = E.getDialogId();
                    z00Var.f46146b = id2;
                }
                return true;
        }
    }

    @Override
    public void d() {
        ((te0) this.f33164b).p(true);
    }

    @Override
    public void f(int i10) {
        u70 u70Var = (u70) this.f33164b;
        y70 y70Var = u70Var.f33265n;
        y70Var.J(u70Var.f33264f - 1);
        if (u70Var.h == null && !u70Var.e.e() && u70Var.h() <= 2) {
            y70Var.f26781s.e(false, true);
        }
        u70Var.l();
    }

    @Override
    public void g(int i10) {
        aw.Z((aw) this.f33164b, i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f33163a) {
            case 2:
                MediaDataController.getInstance(((jz) this.f33164b).v.f32716c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.g4) this.f33164b).run();
                return;
            case 5:
                ((y20) this.f33164b).n();
                return;
            case 7:
                y70.Q((y70) this.f33164b);
                return;
            case 24:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f33164b);
                return;
            case 25:
                ez0 ez0Var = (ez0) this.f33164b;
                ez0Var.e.presentFragment(new StickersActivity(ez0Var.d, null));
                e2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((fz0) this.f33164b);
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public void i(int i10, int i11) {
        vw0 vw0Var = (vw0) this.f33164b;
        vw0Var.f34289w = i10;
        vw0Var.f34290x = i11;
        bi.cc ccVar = vw0Var.L;
        if (ccVar != null) {
            ccVar.invalidate();
        }
    }

    @Override
    public void j(int i10) {
        Utilities.Callback callback = ((t61) this.f33164b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public boolean k0(int i10) {
        return true;
    }

    @Override
    public void l(int i10, int i11) {
        eg0 eg0Var = ((dg0) this.f33164b).d;
        if (i10 == eg0Var.f27828b) {
            eg0Var.G = i11;
        } else if (i10 == eg0Var.f27847r) {
            eg0Var.P = i11;
        } else if (i10 == eg0Var.d) {
            eg0Var.I = i11;
        } else if (i10 == eg0Var.f27830c) {
            eg0Var.H = i11;
        } else if (i10 == eg0Var.f27834f) {
            eg0Var.J = i11;
        } else if (i10 == eg0Var.e) {
            eg0Var.K = i11;
        } else if (i10 == eg0Var.v) {
            eg0Var.R = i11;
        } else if (i10 == eg0Var.f27849s) {
            eg0Var.Q = i11;
        } else if (i10 == eg0Var.f27854w) {
            eg0Var.S = i11;
        } else if (i10 == eg0Var.f27856x) {
            eg0Var.U = i11;
        } else if (i10 == eg0Var.h) {
            eg0Var.L = i11;
        } else if (i10 == eg0Var.f27842n) {
            eg0Var.M = i11;
        }
        e00 e00Var = eg0Var.f27841l0;
        if (e00Var != null) {
            e00Var.d(true, false, false);
        }
        eg0Var.g();
    }

    @Override
    public void p(Canvas canvas, int i10) {
        qg0.c((qg0) this.f33164b, canvas, i10);
    }

    @Override
    public Object provide(Object obj) {
        uc0 uc0Var = (uc0) obj;
        return Float.valueOf(((ac.a) this.f33164b).f1236a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f33163a) {
            case 22:
                aw0 aw0Var = ((ys0) this.f33164b).d;
                aw0.v(aw0Var).r(aw0Var.l1, str, new rs0(aw0Var, 1));
                return;
            default:
                r51 r51Var = (r51) this.f33164b;
                r51Var.f32107e0 = str;
                r51Var.f32112j0.O(true);
                return;
        }
    }

    @Override
    public boolean v(org.telegram.ui.cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        long j10;
        ep0 ep0Var = (ep0) this.f33164b;
        int i12 = ep0Var.J0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = ep0Var.B0;
        for (org.telegram.ui.z00 z00Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(z00Var));
        }
        hashMap.clear();
        ep0Var.R(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i13 = a1.g.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else {
                if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, cyVar)) {
                    return true;
                }
            }
            org.telegram.ui.un unVar = new org.telegram.ui.un(i13);
            cyVar.presentFragment(unVar, true);
            unVar.Mb(arrayList2);
            return true;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
        }
        cyVar.finishFragment();
        return true;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void mo5run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv.mo5run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void a() {
    }

    @Override
    public void e() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }

    @Override
    public void p0(ArrayList arrayList) {
    }

    @Override
    public void z(float f7, int i10) {
    }
}
