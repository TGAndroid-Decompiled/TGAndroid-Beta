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
import org.telegram.ui.wf1;
public final class mv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.b2, GenericProvider, f90, ff0, ml0, org.telegram.ui.ky, ai.t9, MessagesStorage.StringCallback, y81, LanguageDetector.StringCallback, dw0 {
    public final int f26583a;
    public final Object f26584b;

    public mv(Object obj, int i10) {
        this.f26583a = i10;
        this.f26584b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override
    public void a(int i10) {
        i70 i70Var = (i70) this.f26584b;
        m70 m70Var = i70Var.f24959n;
        m70Var.J(i70Var.f24958f - 1);
        if (i70Var.h == null && !i70Var.e.e() && i70Var.h() <= 2) {
            m70Var.f22918s.e(false, true);
        }
        i70Var.l();
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f26584b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        zj0 zj0Var;
        switch (this.f26583a) {
            case 15:
                ak0 ak0Var = (ak0) this.f26584b;
                ArrayList arrayList = ak0Var.f22717n;
                if (ak0Var.f22716f.j(i10) == 0 && (zj0Var = ak0Var.F) != null) {
                    zj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                in0 in0Var = (in0) this.f26584b;
                hn0 hn0Var = in0Var.f25121c;
                MessageObject E = hn0Var.E(i10);
                in0 in0Var2 = hn0Var.f24842c;
                if (E == null) {
                    return false;
                }
                if (!in0Var.I.g()) {
                    in0Var.I.a();
                    hn0Var.q(0, in0Var2.f25124r);
                }
                if (in0Var.I.g()) {
                    in0Var.I.e(E, view, 0);
                    if (!in0Var.I.g()) {
                        hn0Var.q(0, in0Var2.f25124r);
                    }
                    org.telegram.ui.l10 l10Var = in0Var.J;
                    int id2 = E.getId();
                    l10Var.f35205a = E.getDialogId();
                    l10Var.f35206b = id2;
                }
                return true;
        }
    }

    @Override
    public void e() {
        ((ke0) this.f26584b).p(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f26583a) {
            case 2:
                MediaDataController.getInstance(((cz) this.f26584b).v.f26236c1).clearRecentStickers();
                return;
            case 4:
                ((xm) this.f26584b).run();
                return;
            case 5:
                ((o20) this.f26584b).n();
                return;
            case 7:
                m70.Q((m70) this.f26584b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f26584b);
                return;
            case 24:
                hy0 hy0Var = (hy0) this.f26584b;
                hy0Var.e.presentFragment(new StickersActivity(hy0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((jy0) this.f26584b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        aw0 aw0Var = (aw0) this.f26584b;
        aw0Var.f22812w = i10;
        aw0Var.f22813x = i11;
        ci.bb bbVar = aw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((v51) this.f26584b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public a0.i i() {
        return null;
    }

    @Override
    public void l(int i10, int i11) {
        tf0 tf0Var = ((sf0) this.f26584b).d;
        if (i10 == tf0Var.f28483b) {
            tf0Var.G = i11;
        } else if (i10 == tf0Var.f28502r) {
            tf0Var.P = i11;
        } else if (i10 == tf0Var.d) {
            tf0Var.I = i11;
        } else if (i10 == tf0Var.f28485c) {
            tf0Var.H = i11;
        } else if (i10 == tf0Var.f28489f) {
            tf0Var.J = i11;
        } else if (i10 == tf0Var.e) {
            tf0Var.K = i11;
        } else if (i10 == tf0Var.v) {
            tf0Var.R = i11;
        } else if (i10 == tf0Var.f28504s) {
            tf0Var.Q = i11;
        } else if (i10 == tf0Var.f28509w) {
            tf0Var.S = i11;
        } else if (i10 == tf0Var.f28511x) {
            tf0Var.U = i11;
        } else if (i10 == tf0Var.h) {
            tf0Var.L = i11;
        } else if (i10 == tf0Var.f28497n) {
            tf0Var.M = i11;
        }
        wz wzVar = tf0Var.f28496l0;
        if (wzVar != null) {
            wzVar.e(true, false, false);
        }
        tf0Var.g();
    }

    @Override
    public void m(int i10) {
        tv.P((tv) this.f26584b, i10);
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public Object provide(Object obj) {
        mc0 mc0Var = (mc0) obj;
        return Float.valueOf(((o1.j) this.f26584b).f15532a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f26583a) {
            case 20:
                final jv0 jv0Var = ((ds0) this.f26584b).d;
                jv0.r(jv0Var).r(jv0Var.f25534j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        jv0 jv0Var2 = jv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = jv0.f25507d2;
                                AndroidUtilities.runOnUIThread(new wn0(6, jv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = jv0.f25507d2;
                                AndroidUtilities.runOnUIThread(new wn0(6, jv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final jv0 jv0Var2 = ((nt0) this.f26584b).d;
                jv0.r(jv0Var2).r(jv0Var2.f25534j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        jv0 jv0Var22 = jv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = jv0.f25507d2;
                                AndroidUtilities.runOnUIThread(new wn0(6, jv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = jv0.f25507d2;
                                AndroidUtilities.runOnUIThread(new wn0(6, jv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                t41 t41Var = (t41) this.f26584b;
                t41Var.f28410e0 = str;
                t41Var.f28415j0.N(true);
                return;
        }
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public boolean u(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        lo0 lo0Var = (lo0) this.f26584b;
        int i12 = lo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = lo0Var.f26174z0;
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(l10Var));
        }
        hashMap.clear();
        lo0Var.Q(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i13 = a4.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i13.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    i13.putLong("user_id", j10);
                } else {
                    i13.putLong("chat_id", -j10);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, qyVar)) {
                    return true;
                }
            }
            org.telegram.ui.wn wnVar = new org.telegram.ui.wn(i13);
            qyVar.presentFragment(wnVar, true);
            wnVar.Ab(arrayList2);
            return true;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
            if (charSequence != null) {
                j3 = j11;
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j3, false, false, true, 0, 0L);
        }
        qyVar.finishFragment();
        return true;
    }

    @Override
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void F(ArrayList arrayList) {
    }

    @Override
    public void c() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void n() {
    }
}
