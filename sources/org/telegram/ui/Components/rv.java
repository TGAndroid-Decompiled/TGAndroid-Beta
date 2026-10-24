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
import org.telegram.ui.xe1;
public final class rv implements org.telegram.ui.ActionBar.q0, Utilities.Callback5, org.telegram.ui.ActionBar.z1, hg.z1, GenericProvider, o90, rf0, bm0, org.telegram.ui.xx, ci.p7, MessagesStorage.StringCallback, n91, LanguageDetector.StringCallback, qw0 {
    public final int f30276a;
    public final Object f30277b;

    public rv(Object obj, int i10) {
        this.f30276a = i10;
        this.f30277b = obj;
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
    public boolean J(org.telegram.ui.ey eyVar) {
        return false;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public void b(boolean z10) {
        ci.z6 z6Var = (ci.z6) this.f30277b;
        if (z10) {
            z6Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((ve0) this.f30277b).q(true);
    }

    @Override
    public boolean d(int i10, View view) {
        ok0 ok0Var;
        switch (this.f30276a) {
            case 15:
                pk0 pk0Var = (pk0) this.f30277b;
                ArrayList arrayList = pk0Var.f29582n;
                if (pk0Var.f29581f.j(i10) == 0 && (ok0Var = pk0Var.F) != null) {
                    ok0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                wn0 wn0Var = (wn0) this.f30277b;
                vn0 vn0Var = wn0Var.f32304c;
                MessageObject E = vn0Var.E(i10);
                wn0 wn0Var2 = vn0Var.f31479c;
                if (E == null) {
                    return false;
                }
                if (!wn0Var.I.g()) {
                    wn0Var.I.a();
                    vn0Var.q(0, wn0Var2.f32307r);
                }
                if (wn0Var.I.g()) {
                    wn0Var.I.d(E, view, 0);
                    if (!wn0Var.I.g()) {
                        vn0Var.q(0, wn0Var2.f32307r);
                    }
                    org.telegram.ui.a10 a10Var = wn0Var.J;
                    int id2 = E.getId();
                    a10Var.f35547a = E.getDialogId();
                    a10Var.f35548b = id2;
                }
                return true;
        }
    }

    @Override
    public void e(int i10, int i11) {
        nw0 nw0Var = (nw0) this.f30277b;
        nw0Var.f29072w = i10;
        nw0Var.f29073x = i11;
        ai.jc jcVar = nw0Var.L;
        if (jcVar != null) {
            jcVar.invalidate();
        }
    }

    @Override
    public void f(int i10) {
        r70 r70Var = (r70) this.f30277b;
        v70 v70Var = r70Var.f30087n;
        v70Var.J(r70Var.f30086f - 1);
        if (r70Var.h == null && !r70Var.e.e() && r70Var.h() <= 2) {
            v70Var.f30093s.e(false, true);
        }
        r70Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f30276a) {
            case 2:
                MediaDataController.getInstance(((iz) this.f30277b).v.f30310c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.h4) this.f30277b).run();
                return;
            case 5:
                ((u20) this.f30277b).n();
                return;
            case 7:
                v70.Q((v70) this.f30277b);
                return;
            case 23:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f30277b);
                return;
            case 24:
                uy0 uy0Var = (uy0) this.f30277b;
                uy0Var.e.presentFragment(new StickersActivity(uy0Var.d, null));
                c2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((vy0) this.f30277b);
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        yv.Z((yv) this.f30277b, i10);
    }

    @Override
    public void i(int i10) {
        Utilities.Callback callback = ((l61) this.f30277b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void l(int i10, int i11) {
        gg0 gg0Var = ((fg0) this.f30277b).d;
        if (i10 == gg0Var.f26657b) {
            gg0Var.G = i11;
        } else if (i10 == gg0Var.f26676r) {
            gg0Var.P = i11;
        } else if (i10 == gg0Var.d) {
            gg0Var.I = i11;
        } else if (i10 == gg0Var.f26659c) {
            gg0Var.H = i11;
        } else if (i10 == gg0Var.f26663f) {
            gg0Var.J = i11;
        } else if (i10 == gg0Var.e) {
            gg0Var.K = i11;
        } else if (i10 == gg0Var.v) {
            gg0Var.R = i11;
        } else if (i10 == gg0Var.f26678s) {
            gg0Var.Q = i11;
        } else if (i10 == gg0Var.f26683w) {
            gg0Var.S = i11;
        } else if (i10 == gg0Var.f26685x) {
            gg0Var.U = i11;
        } else if (i10 == gg0Var.h) {
            gg0Var.L = i11;
        } else if (i10 == gg0Var.f26671n) {
            gg0Var.M = i11;
        }
        c00 c00Var = gg0Var.f26670l0;
        if (c00Var != null) {
            c00Var.d(true, false, false);
        }
        gg0Var.g();
    }

    @Override
    public Object provide(Object obj) {
        wc0 wc0Var = (wc0) obj;
        return Float.valueOf(((o1.j) this.f30277b).f17621a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f30276a) {
            case 20:
                final wv0 wv0Var = ((qs0) this.f30277b).d;
                wv0.s(wv0Var).r(wv0Var.f32385j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        wv0 wv0Var2 = wv0Var;
                        ci.a7 a7Var = (ci.a7) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = wv0.f32355g2;
                                AndroidUtilities.runOnUIThread(new jo0(7, wv0Var2, a7Var), 100L);
                                return;
                            default:
                                int[] iArr2 = wv0.f32355g2;
                                AndroidUtilities.runOnUIThread(new jo0(7, wv0Var2, a7Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 21:
                final wv0 wv0Var2 = ((au0) this.f30277b).d;
                wv0.s(wv0Var2).r(wv0Var2.f32385j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        wv0 wv0Var22 = wv0Var2;
                        ci.a7 a7Var = (ci.a7) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = wv0.f32355g2;
                                AndroidUtilities.runOnUIThread(new jo0(7, wv0Var22, a7Var), 100L);
                                return;
                            default:
                                int[] iArr2 = wv0.f32355g2;
                                AndroidUtilities.runOnUIThread(new jo0(7, wv0Var22, a7Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                j51 j51Var = (j51) this.f30277b;
                j51Var.f27568e0 = str;
                j51Var.f27573j0.N(true);
                return;
        }
    }

    @Override
    public boolean w(org.telegram.ui.ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, xe1 xe1Var) {
        long j10;
        zo0 zo0Var = (zo0) this.f30277b;
        int i12 = zo0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = zo0Var.f33326z0;
        for (org.telegram.ui.a10 a10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(a10Var));
        }
        hashMap.clear();
        zo0Var.P(false);
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
            snVar.Gb(arrayList2);
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
    public a0.h x() {
        return null;
    }

    @Override
    public void mo0run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rv.mo0run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void S(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }
}
