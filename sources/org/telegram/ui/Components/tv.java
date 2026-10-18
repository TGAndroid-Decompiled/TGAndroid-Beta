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
import org.telegram.ui.te1;
public final class tv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, hg.z1, GenericProvider, p90, of0, yl0, org.telegram.ui.xx, ci.q7, MessagesStorage.StringCallback, e91, LanguageDetector.StringCallback, mw0 {
    public final int f30723a;
    public final Object f30724b;

    public tv(Object obj, int i10) {
        this.f30723a = i10;
        this.f30724b = obj;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean K(org.telegram.ui.ey eyVar) {
        return false;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean a(int i10, View view) {
        lk0 lk0Var;
        switch (this.f30723a) {
            case 15:
                mk0 mk0Var = (mk0) this.f30724b;
                ArrayList arrayList = mk0Var.f28548n;
                if (mk0Var.f28547f.j(i10) == 0 && (lk0Var = mk0Var.F) != null) {
                    lk0Var.c(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                tn0 tn0Var = (tn0) this.f30724b;
                sn0 sn0Var = tn0Var.f30677c;
                MessageObject E = sn0Var.E(i10);
                tn0 tn0Var2 = sn0Var.f30306c;
                if (E == null) {
                    return false;
                }
                if (!tn0Var.I.g()) {
                    tn0Var.I.a();
                    sn0Var.q(0, tn0Var2.f30680r);
                }
                if (tn0Var.I.g()) {
                    tn0Var.I.d(E, view, 0);
                    if (!tn0Var.I.g()) {
                        sn0Var.q(0, tn0Var2.f30680r);
                    }
                    org.telegram.ui.y00 y00Var = tn0Var.J;
                    int id2 = E.getId();
                    y00Var.f43325a = E.getDialogId();
                    y00Var.f43326b = id2;
                }
                return true;
        }
    }

    @Override
    public void b(boolean z10) {
        ci.a7 a7Var = (ci.a7) this.f30724b;
        if (z10) {
            a7Var.p(30, false);
        }
    }

    @Override
    public void d() {
        ((te0) this.f30724b).q(true);
    }

    @Override
    public void e(int i10, int i11) {
        jw0 jw0Var = (jw0) this.f30724b;
        jw0Var.f27644w = i10;
        jw0Var.f27645x = i11;
        ai.ic icVar = jw0Var.L;
        if (icVar != null) {
            icVar.invalidate();
        }
    }

    @Override
    public void f(int i10) {
        r70 r70Var = (r70) this.f30724b;
        v70 v70Var = r70Var.f29867n;
        v70Var.K(r70Var.f29866f - 1);
        if (r70Var.h == null && !r70Var.e.e() && r70Var.h() <= 2) {
            v70Var.f27441s.e(false, true);
        }
        r70Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30723a) {
            case 2:
                MediaDataController.getInstance(((kz) this.f30724b).v.f30754c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.i4) this.f30724b).run();
                return;
            case 5:
                ((w20) this.f30724b).o();
                return;
            case 7:
                v70.R((v70) this.f30724b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f30724b);
                return;
            case 24:
                qy0 qy0Var = (qy0) this.f30724b;
                qy0Var.e.presentFragment(new StickersActivity(qy0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ry0) this.f30724b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((f61) this.f30724b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void j(int i10) {
        aw.Q((aw) this.f30724b, i10);
    }

    @Override
    public void l(int i10, int i11) {
        cg0 cg0Var = ((bg0) this.f30724b).d;
        if (i10 == cg0Var.f25213b) {
            cg0Var.G = i11;
        } else if (i10 == cg0Var.f25232r) {
            cg0Var.P = i11;
        } else if (i10 == cg0Var.d) {
            cg0Var.I = i11;
        } else if (i10 == cg0Var.f25215c) {
            cg0Var.H = i11;
        } else if (i10 == cg0Var.f25219f) {
            cg0Var.J = i11;
        } else if (i10 == cg0Var.e) {
            cg0Var.K = i11;
        } else if (i10 == cg0Var.v) {
            cg0Var.R = i11;
        } else if (i10 == cg0Var.f25234s) {
            cg0Var.Q = i11;
        } else if (i10 == cg0Var.f25239w) {
            cg0Var.S = i11;
        } else if (i10 == cg0Var.f25241x) {
            cg0Var.U = i11;
        } else if (i10 == cg0Var.h) {
            cg0Var.L = i11;
        } else if (i10 == cg0Var.f25227n) {
            cg0Var.M = i11;
        }
        e00 e00Var = cg0Var.f25226l0;
        if (e00Var != null) {
            e00Var.d(true, false, false);
        }
        cg0Var.g();
    }

    @Override
    public Object provide(Object obj) {
        wc0 wc0Var = (wc0) obj;
        return Float.valueOf(((o1.j) this.f30724b).f17561a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f30723a) {
            case 20:
                final sv0 sv0Var = ((ms0) this.f30724b).d;
                sv0.s(sv0Var).r(sv0Var.f30370j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        sv0 sv0Var2 = sv0Var;
                        ci.b7 b7Var = (ci.b7) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = sv0.f30343d2;
                                AndroidUtilities.runOnUIThread(new go0(7, sv0Var2, b7Var), 100L);
                                return;
                            default:
                                int[] iArr2 = sv0.f30343d2;
                                AndroidUtilities.runOnUIThread(new go0(7, sv0Var2, b7Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final sv0 sv0Var2 = ((wt0) this.f30724b).d;
                sv0.s(sv0Var2).r(sv0Var2.f30370j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        sv0 sv0Var22 = sv0Var2;
                        ci.b7 b7Var = (ci.b7) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = sv0.f30343d2;
                                AndroidUtilities.runOnUIThread(new go0(7, sv0Var22, b7Var), 100L);
                                return;
                            default:
                                int[] iArr2 = sv0.f30343d2;
                                AndroidUtilities.runOnUIThread(new go0(7, sv0Var22, b7Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                c51 c51Var = (c51) this.f30724b;
                c51Var.f25099e0 = str;
                c51Var.f25104j0.N(true);
                return;
        }
    }

    @Override
    public boolean w(org.telegram.ui.ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        long j10;
        vo0 vo0Var = (vo0) this.f30724b;
        int i12 = vo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = vo0Var.f31370z0;
        for (org.telegram.ui.y00 y00Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(y00Var));
        }
        hashMap.clear();
        vo0Var.Q(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(h, eyVar)) {
                    return true;
                }
            }
            org.telegram.ui.sn snVar = new org.telegram.ui.sn(h);
            eyVar.presentFragment(snVar, true);
            snVar.Eb(arrayList2);
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
        eyVar.finishFragment();
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
    public void Y(ArrayList arrayList) {
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
