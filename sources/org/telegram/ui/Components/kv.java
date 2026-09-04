package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.eg1;
public final class kv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, hg.a2, GenericProvider, v80, ve0, bl0, org.telegram.ui.oy, bi.c9, MessagesStorage.StringCallback, k81, LanguageDetector.StringCallback, rv0, ImageReceiver.ImageReceiverDelegate {
    public final int f27907a;
    public final Object f27908b;

    public kv(Object obj, int i10) {
        this.f27907a = i10;
        this.f27908b = obj;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override
    public boolean Q(int i10) {
        return true;
    }

    @Override
    public boolean a(int i10, View view) {
        oj0 oj0Var;
        switch (this.f27907a) {
            case 14:
                pj0 pj0Var = (pj0) this.f27908b;
                ArrayList arrayList = pj0Var.f29402n;
                if (pj0Var.f29401f.j(i10) == 0 && (oj0Var = pj0Var.F) != null) {
                    oj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                vm0 vm0Var = (vm0) this.f27908b;
                um0 um0Var = vm0Var.f31365c;
                MessageObject E = um0Var.E(i10);
                vm0 vm0Var2 = um0Var.f30924c;
                if (E == null) {
                    return false;
                }
                if (!vm0Var.I.g()) {
                    vm0Var.I.a();
                    um0Var.q(0, vm0Var2.f31369r);
                }
                if (vm0Var.I.g()) {
                    vm0Var.I.d(E, view, 0);
                    if (!vm0Var.I.g()) {
                        um0Var.q(0, vm0Var2.f31369r);
                    }
                    org.telegram.ui.p10 p10Var = vm0Var.J;
                    int id2 = E.getId();
                    p10Var.f39381a = E.getDialogId();
                    p10Var.f39382b = id2;
                }
                return true;
        }
    }

    @Override
    public void c() {
        ((ae0) this.f27908b).p(true);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m71 m71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        n71 n71Var = (n71) this.f27908b;
        ImageReceiver imageReceiver2 = n71Var.Q;
        if (z10) {
            if (n71Var.N != null || n71Var.f28673d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.hu0 hu0Var = n71Var.N;
                if (hu0Var != null) {
                    ArrayList arrayList = hu0Var.v;
                    int indexOf = arrayList.indexOf(hu0Var.c((int) n71Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = hu0Var.getVideoDuration() / 1000;
                            if (videoDuration <= 100) {
                                ceil2 = Math.ceil(videoDuration);
                            } else if (videoDuration <= 250) {
                                ceil2 = Math.ceil(videoDuration / 2.0f);
                            } else if (videoDuration <= 500) {
                                ceil2 = Math.ceil(videoDuration / 4.0f);
                            } else if (videoDuration <= 1000) {
                                ceil2 = Math.ceil(videoDuration / 5.0f);
                            } else {
                                ceil2 = Math.ceil(videoDuration / 10.0f);
                            }
                            i11 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                        } else {
                            i11 = 25;
                        }
                    } else {
                        i11 = 0;
                    }
                    float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                    float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                    org.telegram.ui.hu0 hu0Var2 = n71Var.N;
                    int i12 = (int) n71Var.O;
                    int videoDuration2 = hu0Var2.getVideoDuration() / 1000;
                    if (videoDuration2 <= 100) {
                        ceil = ((int) Math.ceil(i12)) % 25;
                    } else if (videoDuration2 <= 250) {
                        ceil = ((int) Math.ceil(i12 / 2.0f)) % 25;
                    } else if (videoDuration2 <= 500) {
                        ceil = ((int) Math.ceil(i12 / 4.0f)) % 25;
                    } else if (videoDuration2 <= 1000) {
                        ceil = ((int) Math.ceil(i12 / 5.0f)) % 25;
                    } else {
                        ceil = ((int) Math.ceil(i12 / 10.0f)) % 25;
                    }
                    int min = Math.min(ceil, i11 - 1);
                    n71Var.R = (int) ((min % 5) * bitmapWidth);
                    n71Var.S = (int) ((min / 5) * bitmapHeight);
                    n71Var.T = (int) bitmapWidth;
                    n71Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < n71Var.f28673d0.size()) {
                            m71Var = (m71) n71Var.f28673d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = m71Var.f28400a;
                            }
                            if (i13 == n71Var.f28673d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((m71) n71Var.f28673d0.get(i13 + 1)).f28400a;
                            }
                            double d11 = n71Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            m71Var = null;
                            break;
                        }
                    }
                    if (m71Var != null) {
                        n71Var.R = m71Var.f28401b;
                        n71Var.S = m71Var.f28402c;
                        n71Var.T = n71Var.f28670b0;
                        n71Var.U = n71Var.f28672c0;
                    } else {
                        return;
                    }
                }
                n71Var.P = true;
                float f7 = n71Var.T / n71Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = n71Var.getLayoutParams();
                if (n71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    n71Var.setVisibility(0);
                    n71Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(boolean z10) {
        bi.l8 l8Var = (bi.l8) this.f27908b;
        if (z10) {
            l8Var.p(30, false);
        }
    }

    @Override
    public void f(int i10) {
        x60 x60Var = (x60) this.f27908b;
        b70 b70Var = x60Var.f32437n;
        b70Var.J(x60Var.f32436f - 1);
        if (x60Var.h == null && !x60Var.f32435e.e() && x60Var.h() <= 2) {
            b70Var.f28981s.e(false, true);
        }
        x60Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27907a) {
            case 2:
                MediaDataController.getInstance(((bz) this.f27908b).v.f27932c1).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.dm) this.f27908b).run();
                return;
            case 5:
                ((n20) this.f27908b).n();
                return;
            case 6:
                b70.Q((b70) this.f27908b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f27908b);
                return;
            case 23:
                wx0 wx0Var = (wx0) this.f27908b;
                wx0Var.f32365e.presentFragment(new StickersActivity(wx0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((yx0) this.f27908b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10, int i11) {
        ov0 ov0Var = (ov0) this.f27908b;
        ov0Var.f29224w = i10;
        ov0Var.f29225x = i11;
        di.eb ebVar = ov0Var.L;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override
    public void i(int i10) {
        Utilities.Callback callback = ((h51) this.f27908b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void k(int i10, int i11) {
        jf0 jf0Var = ((if0) this.f27908b).d;
        if (i10 == jf0Var.f27469b) {
            jf0Var.G = i11;
        } else if (i10 == jf0Var.f27489r) {
            jf0Var.P = i11;
        } else if (i10 == jf0Var.d) {
            jf0Var.I = i11;
        } else if (i10 == jf0Var.f27471c) {
            jf0Var.H = i11;
        } else if (i10 == jf0Var.f27476f) {
            jf0Var.J = i11;
        } else if (i10 == jf0Var.f27474e) {
            jf0Var.K = i11;
        } else if (i10 == jf0Var.v) {
            jf0Var.R = i11;
        } else if (i10 == jf0Var.f27491s) {
            jf0Var.Q = i11;
        } else if (i10 == jf0Var.f27496w) {
            jf0Var.S = i11;
        } else if (i10 == jf0Var.f27498x) {
            jf0Var.U = i11;
        } else if (i10 == jf0Var.h) {
            jf0Var.L = i11;
        } else if (i10 == jf0Var.f27484n) {
            jf0Var.M = i11;
        }
        vz vzVar = jf0Var.f27483l0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        jf0Var.g();
    }

    @Override
    public void m(int i10) {
        rv.P((rv) this.f27908b, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        dc0 dc0Var = (dc0) obj;
        return Float.valueOf(((o1.j) this.f27908b).f16824a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f27907a) {
            case 19:
                final xu0 xu0Var = ((rr0) this.f27908b).d;
                xu0.r(xu0Var).r(xu0Var.f32701j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        xu0 xu0Var2 = xu0Var;
                        bi.m8 m8Var = (bi.m8) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = xu0.f32673d2;
                                AndroidUtilities.runOnUIThread(new jn0(7, xu0Var2, m8Var), 100L);
                                return;
                            default:
                                int[] iArr2 = xu0.f32673d2;
                                AndroidUtilities.runOnUIThread(new jn0(7, xu0Var2, m8Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final xu0 xu0Var2 = ((bt0) this.f27908b).d;
                xu0.r(xu0Var2).r(xu0Var2.f32701j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        xu0 xu0Var22 = xu0Var2;
                        bi.m8 m8Var = (bi.m8) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = xu0.f32673d2;
                                AndroidUtilities.runOnUIThread(new jn0(7, xu0Var22, m8Var), 100L);
                                return;
                            default:
                                int[] iArr2 = xu0.f32673d2;
                                AndroidUtilities.runOnUIThread(new jn0(7, xu0Var22, m8Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                f41 f41Var = (f41) this.f27908b;
                f41Var.f25906e0 = str;
                f41Var.f25911j0.N(true);
                return;
        }
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        long j3;
        yn0 yn0Var = (yn0) this.f27908b;
        int i12 = yn0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = yn0Var.f32973z0;
        for (org.telegram.ui.p10 p10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(p10Var));
        }
        hashMap.clear();
        yn0Var.Q(false);
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
            org.telegram.ui.co coVar = new org.telegram.ui.co(i13);
            uyVar.presentFragment(coVar, true);
            coVar.Ab(arrayList2);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void Y(ArrayList arrayList) {
    }

    @Override
    public void b() {
    }

    @Override
    public void d() {
    }

    @Override
    public void j() {
    }

    @Override
    public void l() {
    }
}
