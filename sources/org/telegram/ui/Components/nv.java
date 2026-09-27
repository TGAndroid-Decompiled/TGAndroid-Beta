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
public final class nv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, gg.b2, GenericProvider, h90, ff0, ol0, org.telegram.ui.ny, ai.t9, MessagesStorage.StringCallback, a91, LanguageDetector.StringCallback, fw0 {
    public final int f26897a;
    public final Object f26898b;

    public nv(Object obj, int i10) {
        this.f26897a = i10;
        this.f26898b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.ty tyVar) {
        return false;
    }

    @Override
    public void a(int i10) {
        k70 k70Var = (k70) this.f26898b;
        o70 o70Var = k70Var.f25644n;
        o70Var.J(k70Var.f25643f - 1);
        if (k70Var.h == null && !k70Var.e.e() && k70Var.h() <= 2) {
            o70Var.f23965s.e(false, true);
        }
        k70Var.l();
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f26898b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        bk0 bk0Var;
        switch (this.f26897a) {
            case 15:
                ck0 ck0Var = (ck0) this.f26898b;
                ArrayList arrayList = ck0Var.f23351n;
                if (ck0Var.f23350f.j(i10) == 0 && (bk0Var = ck0Var.F) != null) {
                    bk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                kn0 kn0Var = (kn0) this.f26898b;
                jn0 jn0Var = kn0Var.f25799c;
                MessageObject E = jn0Var.E(i10);
                kn0 kn0Var2 = jn0Var.f25513c;
                if (E == null) {
                    return false;
                }
                if (!kn0Var.I.g()) {
                    kn0Var.I.a();
                    jn0Var.q(0, kn0Var2.f25802r);
                }
                if (kn0Var.I.g()) {
                    kn0Var.I.e(E, view, 0);
                    if (!kn0Var.I.g()) {
                        jn0Var.q(0, kn0Var2.f25802r);
                    }
                    org.telegram.ui.o10 o10Var = kn0Var.J;
                    int id2 = E.getId();
                    o10Var.f36121a = E.getDialogId();
                    o10Var.f36122b = id2;
                }
                return true;
        }
    }

    @Override
    public void e() {
        ((ke0) this.f26898b).p(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f26897a) {
            case 2:
                MediaDataController.getInstance(((dz) this.f26898b).v.f26574c1).clearRecentStickers();
                return;
            case 4:
                ((ym) this.f26898b).run();
                return;
            case 5:
                ((q20) this.f26898b).n();
                return;
            case 7:
                o70.Q((o70) this.f26898b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f26898b);
                return;
            case 24:
                jy0 jy0Var = (jy0) this.f26898b;
                jy0Var.e.presentFragment(new StickersActivity(jy0Var.d, null));
                c2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ly0) this.f26898b);
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        cw0 cw0Var = (cw0) this.f26898b;
        cw0Var.f23451w = i10;
        cw0Var.f23452x = i11;
        ci.ab abVar = cw0Var.L;
        if (abVar != null) {
            abVar.invalidate();
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((x51) this.f26898b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void k(int i10, int i11) {
        tf0 tf0Var = ((sf0) this.f26898b).d;
        if (i10 == tf0Var.f28558b) {
            tf0Var.G = i11;
        } else if (i10 == tf0Var.f28577r) {
            tf0Var.P = i11;
        } else if (i10 == tf0Var.d) {
            tf0Var.I = i11;
        } else if (i10 == tf0Var.f28560c) {
            tf0Var.H = i11;
        } else if (i10 == tf0Var.f28564f) {
            tf0Var.J = i11;
        } else if (i10 == tf0Var.e) {
            tf0Var.K = i11;
        } else if (i10 == tf0Var.v) {
            tf0Var.R = i11;
        } else if (i10 == tf0Var.f28579s) {
            tf0Var.Q = i11;
        } else if (i10 == tf0Var.f28584w) {
            tf0Var.S = i11;
        } else if (i10 == tf0Var.f28586x) {
            tf0Var.U = i11;
        } else if (i10 == tf0Var.h) {
            tf0Var.L = i11;
        } else if (i10 == tf0Var.f28572n) {
            tf0Var.M = i11;
        }
        xz xzVar = tf0Var.f28571l0;
        if (xzVar != null) {
            xzVar.e(true, false, false);
        }
        tf0Var.g();
    }

    @Override
    public a0.i l() {
        return null;
    }

    @Override
    public void m(int i10) {
        uv.P((uv) this.f26898b, i10);
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public Object provide(Object obj) {
        nc0 nc0Var = (nc0) obj;
        return Float.valueOf(((o1.j) this.f26898b).f15571a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f26897a) {
            case 20:
                final lv0 lv0Var = ((fs0) this.f26898b).d;
                lv0.r(lv0Var).r(lv0Var.f26187j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        lv0 lv0Var2 = lv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = lv0.f26160d2;
                                AndroidUtilities.runOnUIThread(new dp0(3, lv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = lv0.f26160d2;
                                AndroidUtilities.runOnUIThread(new dp0(3, lv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final lv0 lv0Var2 = ((pt0) this.f26898b).d;
                lv0.r(lv0Var2).r(lv0Var2.f26187j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        lv0 lv0Var22 = lv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = lv0.f26160d2;
                                AndroidUtilities.runOnUIThread(new dp0(3, lv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = lv0.f26160d2;
                                AndroidUtilities.runOnUIThread(new dp0(3, lv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                v41 v41Var = (v41) this.f26898b;
                v41Var.f29034e0 = str;
                v41Var.f29039j0.N(true);
                return;
        }
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public boolean u(org.telegram.ui.ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        mo0 mo0Var = (mo0) this.f26898b;
        int i12 = mo0Var.I0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = mo0Var.A0;
        for (org.telegram.ui.o10 o10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(o10Var));
        }
        hashMap.clear();
        mo0Var.R(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, tyVar)) {
                    return true;
                }
            }
            org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i13);
            tyVar.presentFragment(xnVar, true);
            xnVar.Ab(arrayList2);
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
        tyVar.finishFragment();
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
    public void i() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n() {
    }
}
