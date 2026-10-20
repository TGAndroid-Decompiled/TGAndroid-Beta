package org.telegram.ui.Components;

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
import org.telegram.ui.re1;
public final class tv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, hg.z1, GenericProvider, p90, pf0, zl0, org.telegram.ui.vx, ci.q7, MessagesStorage.StringCallback, g91, LanguageDetector.StringCallback, ow0 {
    public final int f30678a;
    public final Object f30679b;

    public tv(Object obj, int i10) {
        this.f30678a = i10;
        this.f30679b = obj;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean J(org.telegram.ui.cy cyVar) {
        return false;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean a(int i10, View view) {
        mk0 mk0Var;
        switch (this.f30678a) {
            case 15:
                nk0 nk0Var = (nk0) this.f30679b;
                ArrayList arrayList = nk0Var.f28831n;
                if (nk0Var.f28830f.j(i10) == 0 && (mk0Var = nk0Var.F) != null) {
                    mk0Var.c(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                un0 un0Var = (un0) this.f30679b;
                tn0 tn0Var = un0Var.f30977c;
                MessageObject E = tn0Var.E(i10);
                un0 un0Var2 = tn0Var.f30626c;
                if (E == null) {
                    return false;
                }
                if (!un0Var.I.g()) {
                    un0Var.I.a();
                    tn0Var.q(0, un0Var2.f30980r);
                }
                if (un0Var.I.g()) {
                    un0Var.I.d(E, view, 0);
                    if (!un0Var.I.g()) {
                        tn0Var.q(0, un0Var2.f30980r);
                    }
                    org.telegram.ui.w00 w00Var = un0Var.J;
                    int id2 = E.getId();
                    w00Var.f42425a = E.getDialogId();
                    w00Var.f42426b = id2;
                }
                return true;
        }
    }

    @Override
    public void b(boolean z10) {
        ci.a7 a7Var = (ci.a7) this.f30679b;
        if (z10) {
            a7Var.p(30, false);
        }
    }

    @Override
    public void d() {
        ((ue0) this.f30679b).q(true);
    }

    @Override
    public void e(int i10, int i11) {
        lw0 lw0Var = (lw0) this.f30679b;
        lw0Var.f28314w = i10;
        lw0Var.f28315x = i11;
        ai.ic icVar = lw0Var.L;
        if (icVar != null) {
            icVar.invalidate();
        }
    }

    @Override
    public void f(int i10) {
        r70 r70Var = (r70) this.f30679b;
        v70 v70Var = r70Var.f29858n;
        v70Var.K(r70Var.f29857f - 1);
        if (r70Var.h == null && !r70Var.e.e() && r70Var.h() <= 2) {
            v70Var.f28093s.e(false, true);
        }
        r70Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30678a) {
            case 2:
                MediaDataController.getInstance(((kz) this.f30679b).v.f30722c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.i4) this.f30679b).run();
                return;
            case 5:
                ((w20) this.f30679b).o();
                return;
            case 7:
                v70.R((v70) this.f30679b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f30679b);
                return;
            case 24:
                sy0 sy0Var = (sy0) this.f30679b;
                sy0Var.e.presentFragment(new StickersActivity(sy0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ty0) this.f30679b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((h61) this.f30679b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void j(int i10) {
        aw.Q((aw) this.f30679b, i10);
    }

    @Override
    public void l(int i10, int i11) {
        dg0 dg0Var = ((cg0) this.f30679b).d;
        if (i10 == dg0Var.f25466b) {
            dg0Var.G = i11;
        } else if (i10 == dg0Var.f25485r) {
            dg0Var.P = i11;
        } else if (i10 == dg0Var.d) {
            dg0Var.I = i11;
        } else if (i10 == dg0Var.f25468c) {
            dg0Var.H = i11;
        } else if (i10 == dg0Var.f25472f) {
            dg0Var.J = i11;
        } else if (i10 == dg0Var.e) {
            dg0Var.K = i11;
        } else if (i10 == dg0Var.v) {
            dg0Var.R = i11;
        } else if (i10 == dg0Var.f25487s) {
            dg0Var.Q = i11;
        } else if (i10 == dg0Var.f25492w) {
            dg0Var.S = i11;
        } else if (i10 == dg0Var.f25494x) {
            dg0Var.U = i11;
        } else if (i10 == dg0Var.h) {
            dg0Var.L = i11;
        } else if (i10 == dg0Var.f25480n) {
            dg0Var.M = i11;
        }
        e00 e00Var = dg0Var.f25479l0;
        if (e00Var != null) {
            e00Var.d(true, false, false);
        }
        dg0Var.g();
    }

    @Override
    public Object provide(Object obj) {
        wc0 wc0Var = (wc0) obj;
        return Float.valueOf(((o1.j) this.f30679b).f17558a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f30678a) {
            case 20:
                final uv0 uv0Var = ((os0) this.f30679b).d;
                uv0.s(uv0Var).r(uv0Var.f31045j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        uv0 uv0Var2 = uv0Var;
                        ci.b7 b7Var = (ci.b7) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = uv0.f31018d2;
                                AndroidUtilities.runOnUIThread(new ho0(7, uv0Var2, b7Var), 100L);
                                return;
                            default:
                                int[] iArr2 = uv0.f31018d2;
                                AndroidUtilities.runOnUIThread(new ho0(7, uv0Var2, b7Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final uv0 uv0Var2 = ((yt0) this.f30679b).d;
                uv0.s(uv0Var2).r(uv0Var2.f31045j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        uv0 uv0Var22 = uv0Var2;
                        ci.b7 b7Var = (ci.b7) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = uv0.f31018d2;
                                AndroidUtilities.runOnUIThread(new ho0(7, uv0Var22, b7Var), 100L);
                                return;
                            default:
                                int[] iArr2 = uv0.f31018d2;
                                AndroidUtilities.runOnUIThread(new ho0(7, uv0Var22, b7Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                e51 e51Var = (e51) this.f30679b;
                e51Var.f25734e0 = str;
                e51Var.f25739j0.N(true);
                return;
        }
    }

    @Override
    public boolean w(org.telegram.ui.cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        long j10;
        wo0 wo0Var = (wo0) this.f30679b;
        int i12 = wo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = wo0Var.f32201z0;
        for (org.telegram.ui.w00 w00Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(w00Var));
        }
        hashMap.clear();
        wo0Var.Q(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle h = a1.g.h("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                h.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else {
                if (DialogObject.isUserDialog(j11)) {
                    h.putLong("user_id", j11);
                } else {
                    h.putLong("chat_id", -j11);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(h, cyVar)) {
                    return true;
                }
            }
            org.telegram.ui.qn qnVar = new org.telegram.ui.qn(h);
            cyVar.presentFragment(qnVar, true);
            qnVar.Fb(arrayList2);
            return true;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
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
    public void mo0run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv.mo0run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void S(ArrayList arrayList) {
    }

    @Override
    public void c() {
    }

    @Override
    public void i() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }
}
