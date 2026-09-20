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
import org.telegram.ui.fg1;
public final class mv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.b2, GenericProvider, c90, df0, ll0, org.telegram.ui.oy, ai.t9, MessagesStorage.StringCallback, z81, LanguageDetector.StringCallback, dw0 {
    public final int f26496a;
    public final Object f26497b;

    public mv(Object obj, int i10) {
        this.f26496a = i10;
        this.f26497b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean F(int i10) {
        return true;
    }

    @Override
    public boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override
    public void a(int i10) {
        f70 f70Var = (f70) this.f26497b;
        j70 j70Var = f70Var.f24020n;
        j70Var.J(f70Var.f24019f - 1);
        if (f70Var.h == null && !f70Var.e.e() && f70Var.h() <= 2) {
            j70Var.f23189s.e(false, true);
        }
        f70Var.l();
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f26497b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        yj0 yj0Var;
        switch (this.f26496a) {
            case 15:
                zj0 zj0Var = (zj0) this.f26497b;
                ArrayList arrayList = zj0Var.f30844n;
                if (zj0Var.f30843f.j(i10) == 0 && (yj0Var = zj0Var.F) != null) {
                    yj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                in0 in0Var = (in0) this.f26497b;
                hn0 hn0Var = in0Var.f25088c;
                MessageObject E = hn0Var.E(i10);
                in0 in0Var2 = hn0Var.f24726c;
                if (E == null) {
                    return false;
                }
                if (!in0Var.I.g()) {
                    in0Var.I.a();
                    hn0Var.q(0, in0Var2.f25091r);
                }
                if (in0Var.I.g()) {
                    in0Var.I.e(E, view, 0);
                    if (!in0Var.I.g()) {
                        hn0Var.q(0, in0Var2.f25091r);
                    }
                    org.telegram.ui.p10 p10Var = in0Var.J;
                    int id2 = E.getId();
                    p10Var.f36423a = E.getDialogId();
                    p10Var.f36424b = id2;
                }
                return true;
        }
    }

    @Override
    public void e() {
        ((ie0) this.f26497b).p(true);
    }

    @Override
    public void f(int i10, int i11) {
        aw0 aw0Var = (aw0) this.f26497b;
        aw0Var.f22807w = i10;
        aw0Var.f22808x = i11;
        ci.eb ebVar = aw0Var.L;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((w51) this.f26497b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void j(int i10, int i11) {
        rf0 rf0Var = ((qf0) this.f26497b).d;
        if (i10 == rf0Var.f27858b) {
            rf0Var.G = i11;
        } else if (i10 == rf0Var.f27877r) {
            rf0Var.P = i11;
        } else if (i10 == rf0Var.d) {
            rf0Var.I = i11;
        } else if (i10 == rf0Var.f27860c) {
            rf0Var.H = i11;
        } else if (i10 == rf0Var.f27864f) {
            rf0Var.J = i11;
        } else if (i10 == rf0Var.e) {
            rf0Var.K = i11;
        } else if (i10 == rf0Var.v) {
            rf0Var.R = i11;
        } else if (i10 == rf0Var.f27879s) {
            rf0Var.Q = i11;
        } else if (i10 == rf0Var.f27884w) {
            rf0Var.S = i11;
        } else if (i10 == rf0Var.f27886x) {
            rf0Var.U = i11;
        } else if (i10 == rf0Var.h) {
            rf0Var.L = i11;
        } else if (i10 == rf0Var.f27872n) {
            rf0Var.M = i11;
        }
        vz vzVar = rf0Var.f27871l0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        rf0Var.g();
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26496a) {
            case 2:
                MediaDataController.getInstance(((bz) this.f26497b).v.f25898c1).clearRecentStickers();
                return;
            case 4:
                ((wm) this.f26497b).run();
                return;
            case 5:
                ((n20) this.f26497b).n();
                return;
            case 7:
                j70.Q((j70) this.f26497b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f26497b);
                return;
            case 24:
                iy0 iy0Var = (iy0) this.f26497b;
                iy0Var.e.presentFragment(new StickersActivity(iy0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ky0) this.f26497b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public a0.i l() {
        return null;
    }

    @Override
    public void m(int i10) {
        tv.P((tv) this.f26497b, i10);
    }

    @Override
    public Object provide(Object obj) {
        kc0 kc0Var = (kc0) obj;
        return Float.valueOf(((o1.j) this.f26497b).f15521a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f26496a) {
            case 20:
                final jv0 jv0Var = ((cs0) this.f26497b).d;
                jv0.r(jv0Var).r(jv0Var.f25503j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        jv0 jv0Var2 = jv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = jv0.f25476d2;
                                AndroidUtilities.runOnUIThread(new wn0(7, jv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = jv0.f25476d2;
                                AndroidUtilities.runOnUIThread(new wn0(7, jv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final jv0 jv0Var2 = ((nt0) this.f26497b).d;
                jv0.r(jv0Var2).r(jv0Var2.f25503j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        jv0 jv0Var22 = jv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = jv0.f25476d2;
                                AndroidUtilities.runOnUIThread(new wn0(7, jv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = jv0.f25476d2;
                                AndroidUtilities.runOnUIThread(new wn0(7, jv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                u41 u41Var = (u41) this.f26497b;
                u41Var.f28545e0 = str;
                u41Var.f28550j0.N(true);
                return;
        }
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        long j3;
        lo0 lo0Var = (lo0) this.f26497b;
        int i12 = lo0Var.I0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = lo0Var.A0;
        for (org.telegram.ui.p10 p10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(p10Var));
        }
        hashMap.clear();
        lo0Var.R(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, uyVar)) {
                    return true;
                }
            }
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i13);
            uyVar.presentFragment(znVar, true);
            znVar.Ab(arrayList2);
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
        uyVar.finishFragment();
        return true;
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void G(ArrayList arrayList) {
    }

    @Override
    public void c() {
    }

    @Override
    public void h() {
    }

    @Override
    public void i() {
    }

    @Override
    public void n() {
    }
}
