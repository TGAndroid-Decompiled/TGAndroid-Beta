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
import org.telegram.ui.cf1;
public final class tv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, ig.z1, oe.d, GenericProvider, r90, qf0, wh.a, cm0, org.telegram.ui.xx, di.p7, MessagesStorage.StringCallback, x91, LanguageDetector.StringCallback, zw0 {
    public final int f33155a;
    public final Object f33156b;

    public tv(Object obj, int i10) {
        this.f33155a = i10;
        this.f33156b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        ((ua0) this.f33156b).Y();
    }

    @Override
    public boolean K(org.telegram.ui.ey eyVar) {
        return false;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public void b(boolean z10) {
        di.z6 z6Var = (di.z6) this.f33156b;
        if (z10) {
            z6Var.p(30, false);
        }
    }

    @Override
    public boolean c(int i10, View view) {
        pk0 pk0Var;
        switch (this.f33155a) {
            case 17:
                qk0 qk0Var = (qk0) this.f33156b;
                ArrayList arrayList = qk0Var.f31924n;
                if (qk0Var.f31923f.j(i10) == 0 && (pk0Var = qk0Var.F) != null) {
                    pk0Var.f(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                do0 do0Var = (do0) this.f33156b;
                co0 co0Var = do0Var.f27502c;
                MessageObject E = co0Var.E(i10);
                do0 do0Var2 = co0Var.f27219c;
                if (E == null) {
                    return false;
                }
                if (!do0Var.I.g()) {
                    do0Var.I.a();
                    co0Var.q(0, do0Var2.f27505r);
                }
                if (do0Var.I.g()) {
                    do0Var.I.e(E, view, 0);
                    if (!do0Var.I.g()) {
                        co0Var.q(0, do0Var2.f27505r);
                    }
                    org.telegram.ui.b10 b10Var = do0Var.J;
                    int id2 = E.getId();
                    b10Var.f37862a = E.getDialogId();
                    b10Var.f37863b = id2;
                }
                return true;
        }
    }

    @Override
    public void d() {
        ((ue0) this.f33156b).p(true);
    }

    @Override
    public void f(int i10) {
        v70 v70Var = (v70) this.f33156b;
        z70 z70Var = v70Var.f33582n;
        z70Var.J(v70Var.f33581f - 1);
        if (v70Var.h == null && !v70Var.e.e() && v70Var.h() <= 2) {
            z70Var.f27096s.e(false, true);
        }
        v70Var.l();
    }

    @Override
    public void g(int i10) {
        aw.Z((aw) this.f33156b, i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f33155a) {
            case 2:
                MediaDataController.getInstance(((jz) this.f33156b).v.f32713c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.g4) this.f33156b).run();
                return;
            case 5:
                ((y20) this.f33156b).n();
                return;
            case 7:
                z70.Q((z70) this.f33156b);
                return;
            case 24:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f33156b);
                return;
            case 25:
                fz0 fz0Var = (fz0) this.f33156b;
                fz0Var.e.presentFragment(new StickersActivity(fz0Var.d, null));
                e2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((gz0) this.f33156b);
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public void i(int i10, int i11) {
        ww0 ww0Var = (ww0) this.f33156b;
        ww0Var.f34597w = i10;
        ww0Var.f34598x = i11;
        bi.cc ccVar = ww0Var.L;
        if (ccVar != null) {
            ccVar.invalidate();
        }
    }

    @Override
    public void j(int i10) {
        Utilities.Callback callback = ((u61) this.f33156b).C;
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
        fg0 fg0Var = ((eg0) this.f33156b).d;
        if (i10 == fg0Var.f28123b) {
            fg0Var.G = i11;
        } else if (i10 == fg0Var.f28142r) {
            fg0Var.P = i11;
        } else if (i10 == fg0Var.d) {
            fg0Var.I = i11;
        } else if (i10 == fg0Var.f28125c) {
            fg0Var.H = i11;
        } else if (i10 == fg0Var.f28129f) {
            fg0Var.J = i11;
        } else if (i10 == fg0Var.e) {
            fg0Var.K = i11;
        } else if (i10 == fg0Var.v) {
            fg0Var.R = i11;
        } else if (i10 == fg0Var.f28144s) {
            fg0Var.Q = i11;
        } else if (i10 == fg0Var.f28149w) {
            fg0Var.S = i11;
        } else if (i10 == fg0Var.f28151x) {
            fg0Var.U = i11;
        } else if (i10 == fg0Var.h) {
            fg0Var.L = i11;
        } else if (i10 == fg0Var.f28137n) {
            fg0Var.M = i11;
        }
        e00 e00Var = fg0Var.f28136l0;
        if (e00Var != null) {
            e00Var.d(true, false, false);
        }
        fg0Var.g();
    }

    @Override
    public void p(Canvas canvas, int i10) {
        rg0.c((rg0) this.f33156b, canvas, i10);
    }

    @Override
    public Object provide(Object obj) {
        vc0 vc0Var = (vc0) obj;
        return Float.valueOf(((ac.a) this.f33156b).f1236a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f33155a) {
            case 22:
                bw0 bw0Var = ((zs0) this.f33156b).d;
                bw0.v(bw0Var).r(bw0Var.l1, str, new ss0(bw0Var, 1));
                return;
            default:
                s51 s51Var = (s51) this.f33156b;
                s51Var.f32479e0 = str;
                s51Var.f32484j0.O(true);
                return;
        }
    }

    @Override
    public boolean v(org.telegram.ui.ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        long j10;
        fp0 fp0Var = (fp0) this.f33156b;
        int i12 = fp0Var.J0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = fp0Var.B0;
        for (org.telegram.ui.b10 b10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(b10Var));
        }
        hashMap.clear();
        fp0Var.R(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, eyVar)) {
                    return true;
                }
            }
            org.telegram.ui.wn wnVar = new org.telegram.ui.wn(i13);
            eyVar.presentFragment(wnVar, true);
            wnVar.Qb(arrayList2);
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
        eyVar.finishFragment();
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
