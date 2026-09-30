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
public final class ov implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.b2, GenericProvider, h90, hf0, ol0, org.telegram.ui.ky, ai.t9, MessagesStorage.StringCallback, a91, LanguageDetector.StringCallback, fw0 {
    public final int f27189a;
    public final Object f27190b;

    public ov(Object obj, int i10) {
        this.f27189a = i10;
        this.f27190b = obj;
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
        k70 k70Var = (k70) this.f27190b;
        o70 o70Var = k70Var.f25616n;
        o70Var.J(k70Var.f25615f - 1);
        if (k70Var.h == null && !k70Var.e.e() && k70Var.h() <= 2) {
            o70Var.f23573s.e(false, true);
        }
        k70Var.l();
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f27190b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        bk0 bk0Var;
        switch (this.f27189a) {
            case 15:
                ck0 ck0Var = (ck0) this.f27190b;
                ArrayList arrayList = ck0Var.f23331n;
                if (ck0Var.f23330f.j(i10) == 0 && (bk0Var = ck0Var.F) != null) {
                    bk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                kn0 kn0Var = (kn0) this.f27190b;
                jn0 jn0Var = kn0Var.f25769c;
                MessageObject E = jn0Var.E(i10);
                kn0 kn0Var2 = jn0Var.f25491c;
                if (E == null) {
                    return false;
                }
                if (!kn0Var.I.g()) {
                    kn0Var.I.a();
                    jn0Var.q(0, kn0Var2.f25772r);
                }
                if (kn0Var.I.g()) {
                    kn0Var.I.e(E, view, 0);
                    if (!kn0Var.I.g()) {
                        jn0Var.q(0, kn0Var2.f25772r);
                    }
                    org.telegram.ui.l10 l10Var = kn0Var.J;
                    int id2 = E.getId();
                    l10Var.f35188a = E.getDialogId();
                    l10Var.f35189b = id2;
                }
                return true;
        }
    }

    @Override
    public void e() {
        ((me0) this.f27190b).p(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f27189a) {
            case 2:
                MediaDataController.getInstance(((dz) this.f27190b).v.f26531c1).clearRecentStickers();
                return;
            case 4:
                ((ym) this.f27190b).run();
                return;
            case 5:
                ((q20) this.f27190b).n();
                return;
            case 7:
                o70.Q((o70) this.f27190b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f27190b);
                return;
            case 24:
                jy0 jy0Var = (jy0) this.f27190b;
                jy0Var.e.presentFragment(new StickersActivity(jy0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ly0) this.f27190b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        cw0 cw0Var = (cw0) this.f27190b;
        cw0Var.f23433w = i10;
        cw0Var.f23434x = i11;
        ci.bb bbVar = cw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((x51) this.f27190b).C;
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
        vf0 vf0Var = ((uf0) this.f27190b).d;
        if (i10 == vf0Var.f29048b) {
            vf0Var.G = i11;
        } else if (i10 == vf0Var.f29067r) {
            vf0Var.P = i11;
        } else if (i10 == vf0Var.d) {
            vf0Var.I = i11;
        } else if (i10 == vf0Var.f29050c) {
            vf0Var.H = i11;
        } else if (i10 == vf0Var.f29054f) {
            vf0Var.J = i11;
        } else if (i10 == vf0Var.e) {
            vf0Var.K = i11;
        } else if (i10 == vf0Var.v) {
            vf0Var.R = i11;
        } else if (i10 == vf0Var.f29069s) {
            vf0Var.Q = i11;
        } else if (i10 == vf0Var.f29074w) {
            vf0Var.S = i11;
        } else if (i10 == vf0Var.f29076x) {
            vf0Var.U = i11;
        } else if (i10 == vf0Var.h) {
            vf0Var.L = i11;
        } else if (i10 == vf0Var.f29062n) {
            vf0Var.M = i11;
        }
        xz xzVar = vf0Var.f29061l0;
        if (xzVar != null) {
            xzVar.e(true, false, false);
        }
        vf0Var.g();
    }

    @Override
    public void m(int i10) {
        vv.P((vv) this.f27190b, i10);
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public Object provide(Object obj) {
        oc0 oc0Var = (oc0) obj;
        return Float.valueOf(((o1.j) this.f27190b).f15533a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f27189a) {
            case 20:
                final lv0 lv0Var = ((fs0) this.f27190b).d;
                lv0.r(lv0Var).r(lv0Var.f26129j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        lv0 lv0Var2 = lv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = lv0.f26102d2;
                                AndroidUtilities.runOnUIThread(new yn0(7, lv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = lv0.f26102d2;
                                AndroidUtilities.runOnUIThread(new yn0(7, lv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final lv0 lv0Var2 = ((pt0) this.f27190b).d;
                lv0.r(lv0Var2).r(lv0Var2.f26129j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        lv0 lv0Var22 = lv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = lv0.f26102d2;
                                AndroidUtilities.runOnUIThread(new yn0(7, lv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = lv0.f26102d2;
                                AndroidUtilities.runOnUIThread(new yn0(7, lv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                v41 v41Var = (v41) this.f27190b;
                v41Var.f28969e0 = str;
                v41Var.f28974j0.N(true);
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
        no0 no0Var = (no0) this.f27190b;
        int i12 = no0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = no0Var.f26841z0;
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(l10Var));
        }
        hashMap.clear();
        no0Var.Q(false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ov.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
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
