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
public final class nv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, gg.b2, GenericProvider, g90, gf0, nl0, org.telegram.ui.ky, ai.t9, MessagesStorage.StringCallback, z81, LanguageDetector.StringCallback, ew0 {
    public final int f26879a;
    public final Object f26880b;

    public nv(Object obj, int i10) {
        this.f26879a = i10;
        this.f26880b = obj;
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
        j70 j70Var = (j70) this.f26880b;
        n70 n70Var = j70Var.f25277n;
        n70Var.J(j70Var.f25276f - 1);
        if (j70Var.h == null && !j70Var.e.e() && j70Var.h() <= 2) {
            n70Var.f23262s.e(false, true);
        }
        j70Var.l();
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f26880b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        ak0 ak0Var;
        switch (this.f26879a) {
            case 15:
                bk0 bk0Var = (bk0) this.f26880b;
                ArrayList arrayList = bk0Var.f23050n;
                if (bk0Var.f23049f.j(i10) == 0 && (ak0Var = bk0Var.F) != null) {
                    ak0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                jn0 jn0Var = (jn0) this.f26880b;
                in0 in0Var = jn0Var.f25475c;
                MessageObject E = in0Var.E(i10);
                jn0 jn0Var2 = in0Var.f25165c;
                if (E == null) {
                    return false;
                }
                if (!jn0Var.I.g()) {
                    jn0Var.I.a();
                    in0Var.q(0, jn0Var2.f25478r);
                }
                if (jn0Var.I.g()) {
                    jn0Var.I.e(E, view, 0);
                    if (!jn0Var.I.g()) {
                        in0Var.q(0, jn0Var2.f25478r);
                    }
                    org.telegram.ui.l10 l10Var = jn0Var.J;
                    int id2 = E.getId();
                    l10Var.f35204a = E.getDialogId();
                    l10Var.f35205b = id2;
                }
                return true;
        }
    }

    @Override
    public void e() {
        ((le0) this.f26880b).p(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f26879a) {
            case 2:
                MediaDataController.getInstance(((dz) this.f26880b).v.f26548c1).clearRecentStickers();
                return;
            case 4:
                ((ym) this.f26880b).run();
                return;
            case 5:
                ((p20) this.f26880b).n();
                return;
            case 7:
                n70.Q((n70) this.f26880b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f26880b);
                return;
            case 24:
                iy0 iy0Var = (iy0) this.f26880b;
                iy0Var.e.presentFragment(new StickersActivity(iy0Var.d, null));
                a2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ky0) this.f26880b);
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        bw0 bw0Var = (bw0) this.f26880b;
        bw0Var.f23145w = i10;
        bw0Var.f23146x = i11;
        ci.bb bbVar = bw0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((w51) this.f26880b).C;
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
        uf0 uf0Var = ((tf0) this.f26880b).d;
        if (i10 == uf0Var.f28772b) {
            uf0Var.G = i11;
        } else if (i10 == uf0Var.f28791r) {
            uf0Var.P = i11;
        } else if (i10 == uf0Var.d) {
            uf0Var.I = i11;
        } else if (i10 == uf0Var.f28774c) {
            uf0Var.H = i11;
        } else if (i10 == uf0Var.f28778f) {
            uf0Var.J = i11;
        } else if (i10 == uf0Var.e) {
            uf0Var.K = i11;
        } else if (i10 == uf0Var.v) {
            uf0Var.R = i11;
        } else if (i10 == uf0Var.f28793s) {
            uf0Var.Q = i11;
        } else if (i10 == uf0Var.f28798w) {
            uf0Var.S = i11;
        } else if (i10 == uf0Var.f28800x) {
            uf0Var.U = i11;
        } else if (i10 == uf0Var.h) {
            uf0Var.L = i11;
        } else if (i10 == uf0Var.f28786n) {
            uf0Var.M = i11;
        }
        xz xzVar = uf0Var.f28785l0;
        if (xzVar != null) {
            xzVar.e(true, false, false);
        }
        uf0Var.g();
    }

    @Override
    public void m(int i10) {
        uv.P((uv) this.f26880b, i10);
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public Object provide(Object obj) {
        nc0 nc0Var = (nc0) obj;
        return Float.valueOf(((o1.j) this.f26880b).f15532a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f26879a) {
            case 20:
                final kv0 kv0Var = ((es0) this.f26880b).d;
                kv0.r(kv0Var).r(kv0Var.f25841j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        kv0 kv0Var2 = kv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = kv0.f25814d2;
                                AndroidUtilities.runOnUIThread(new xn0(6, kv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = kv0.f25814d2;
                                AndroidUtilities.runOnUIThread(new xn0(6, kv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final kv0 kv0Var2 = ((ot0) this.f26880b).d;
                kv0.r(kv0Var2).r(kv0Var2.f25841j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        kv0 kv0Var22 = kv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = kv0.f25814d2;
                                AndroidUtilities.runOnUIThread(new xn0(6, kv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = kv0.f25814d2;
                                AndroidUtilities.runOnUIThread(new xn0(6, kv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                u41 u41Var = (u41) this.f26880b;
                u41Var.f28699e0 = str;
                u41Var.f28704j0.N(true);
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
        mo0 mo0Var = (mo0) this.f26880b;
        int i12 = mo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = mo0Var.f26486z0;
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(l10Var));
        }
        hashMap.clear();
        mo0Var.Q(false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
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
